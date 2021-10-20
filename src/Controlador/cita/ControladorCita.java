/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.cita;

import Controlador.cliente.ControladorCliente;
import Modelo.cita.Cita;
import Modelo.cita.ModeloCita;
import Modelo.interfaces.Validaciones;
import static Modelo.interfaces.Validaciones.clientesExistentes;
import static Modelo.interfaces.Validaciones.validaPersonasRegistrada;
import Vista.Vista_CRUD_Cita;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jhour.JTime;

/**
 *
 * @author Boxvi
 */
public class ControladorCita implements Validaciones {

    private Vista_CRUD_Cita vista;
    private Modelo.cita.ModeloCita modelo;
    private int numCita;

    public ControladorCita(Vista_CRUD_Cita vista, ModeloCita modelo) {
        this.vista = vista;
        this.modelo = modelo;

        vista.setVisible(true);
        cargarTablaCita();
    }

    public void iniciaControl() {

        PropertyChangeListener pl = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                fechaValidacion();
            }
        };

        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarRegistroSeleccionadoCita(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {

                llenarCuadrosDialogoCita(vista.getTxt_cedulaClienteCita().getText());
                llenarCuadrosDialogoCita1(vista.getTxt_cedulaClienteCita().getText());
                cargarTablaCita(vista.getTxt_filtroCita().getText());
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        //EVENTOS
        vista.getjTbl_Citas().addMouseListener(ml);
        vista.getTxt_cedulaClienteCita().addKeyListener(kl);
        vista.getTxt_filtroCita().addKeyListener(kl);

        //BOTONOES
        vista.getBtn_insertarCita().addActionListener(l -> creacionCita());
        vista.getBtn_editarCita().addActionListener(l -> modificarCliente());
        vista.getBtn_eliminarCita().addActionListener(l -> validarEliminarCita());
        vista.getBtn_refescarCita().addActionListener(l -> cargarTablaCita());

        //FECHAS
        vista.getFechaCita().addPropertyChangeListener(pl);

    }

    public void llenarCuadrosDialogoCita(String cadenaBusqueda) {
        List<Cita> listaCita = modelo.filtrarInformacionParatxtCita(cadenaBusqueda);
        listaCita.stream().forEach(ci -> {
            String[] cita = {
                ci.getNombre(), ci.getApellido()};

            vista.getTxt_nombreClienteCita().setText(cita[0]);
            vista.getTxt_apellidoClienteCita().setText(cita[1]);

        });
    }

    public void llenarCuadrosDialogoCita1(String cadenaBusqueda) {
        List<Cita> listaCita = modelo.filtrarInformacionParatxtCita1(cadenaBusqueda);
        listaCita.stream().forEach(ci -> {
            String[] cita = {
                ci.getNombre(), ci.getApellido(), ci.getFecha_c(), ci.getHora_c().toString()
            };

            String fecha = cita[2];
            Date sFecha;
            try {
                sFecha = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
                vista.getFechaCita().setDate(sFecha);
            } catch (ParseException ex) {
                Logger.getLogger(ControladorCita.class.getName()).log(Level.SEVERE, null, ex);
            }

//vista.getjHCita().setD(cita[1]);
        });
    }

    public void cargarTablaCita() {
        DefaultTableModel tblModelo = (DefaultTableModel) vista.getjTbl_Citas().getModel();
        tblModelo.setNumRows(0);
        List<Cita> lista = modelo.leerCita();
        lista.stream().forEach(ci -> {
            String[] cita = {
                ci.getNumero_c() + "", ci.getCedula(), ci.getNombre(), ci.getApellido(), ci.getFecha_c(), ci.getHora_c().toString()};
            tblModelo.addRow(cita);
        });
        limpiarCampos();
    }

    public void cargarTablaCita(String cadena) {
        DefaultTableModel tblModelo = (DefaultTableModel) vista.getjTbl_Citas().getModel();
        tblModelo.setNumRows(0);
        List<Cita> lista = modelo.leerCita(cadena);
        lista.stream().forEach(ci -> {
            String[] cita = {
                ci.getNumero_c() + "", ci.getCedula(), ci.getNombre(), ci.getApellido(), ci.getFecha_c(), ci.getHora_c().toString()};
            tblModelo.addRow(cita);
        });
    }

    private void crearCita() {
        if (!vista.getTxt_cedulaClienteCita().getText().isEmpty()) {
            ModeloCita modeloCita = new ModeloCita();
            if (modeloCita.existeRegistro(vista.getTxt_cedulaClienteCita().getText())) {
                modeloCita.setCedula(vista.getTxt_cedulaClienteCita().getText());
                modeloCita.setFecha_c(((JTextField) vista.getFechaCita().getDateEditor().getUiComponent()).getText());
                modeloCita.setHora_c(vista.getjHCita().getHora());
                if (modeloCita.crearCita()) {
                    JOptionPane.showMessageDialog(vista, "LA CITA SE CREO CORRECTAMENTE");
                    cargarTablaCita();

                } else {
                    JOptionPane.showMessageDialog(vista, "ERROR UN DATO ESTA INCORRECTO ", "Datos Erroneos", 0);
                }
            } else {
                JOptionPane.showMessageDialog(vista, "El CLIENTE NO EXISTE O NO ESTA REGISTRADO COMO PERSONA", "Sin Registros", 0);
            }
        }
    }

    public void modificarCliente() {
        if (!vista.getTxt_cedulaClienteCita().getText().isEmpty()) {
            ModeloCita modeloCita = new ModeloCita();
            if (modeloCita.existeRegistro(vista.getTxt_cedulaClienteCita().getText())) {
                modeloCita.setFecha_c(((JTextField) vista.getFechaCita().getDateEditor().getUiComponent()).getText());
                modeloCita.setHora_c(vista.getjHCita().getHora());
                if (modeloCita.modificarCita(numCita)) {
                    JOptionPane.showMessageDialog(vista, "EL DATO SE ACTUALIZO CORRECTAMENTE");
                    cargarTablaCita();
                } else {
                    JOptionPane.showMessageDialog(vista, "ERROR EN LOS DATOS", "Error!!", 0);

                }
            } else {
                JOptionPane.showMessageDialog(vista, "LA CEDULA INGRESADA NO SE ENCUENTRA EN LA BASE DE DATOS PORFAVOR INGRESAR AL NUEVO USUARIO ", "Campos Erroneos", 0);

            }
        }else {
            JOptionPane.showMessageDialog(vista, "ASEGURESE DE RELLENAR TODOS LOS CAMPOS","Campos Vacios",0);
        }
    }

    private void eliminarCita() {
        ModeloCita modelcita = new ModeloCita();
        int resultado = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO QUE DESEA ELIMINAR ESTE REGISTRO?!", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resultado == JOptionPane.YES_NO_OPTION) {
            if (modelcita.eliminarCita(numCita)) {
                cargarTablaCita();
                limpiarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(vista, "DATOS ERRONEOS", "Error!", 0);

        }
    }

    public void limpiarCampos() {
        vista.getTxt_cedulaClienteCita().setText(null);
        vista.getTxt_apellidoClienteCita().setText(null);
        vista.getTxt_nombreClienteCita().setText(null);
        vista.getTxt_apellidoClienteCita().setText(null);
        ((JTextField) vista.getFechaCita().getDateEditor().getUiComponent()).setText(null);
        //vista.getjHCita().setText(null);
    }

    public void mostrarRegistroSeleccionadoCita(MouseEvent event) {
        int seleccionaar = vista.getjTbl_Citas().rowAtPoint(event.getPoint());
        numCita = Integer.parseInt(String.valueOf(vista.getjTbl_Citas().getValueAt(seleccionaar, 0)));
        System.out.println(numCita);
        modelo.setNumero_c(numCita);
        vista.getTxt_cedulaClienteCita().setText(String.valueOf(vista.getjTbl_Citas().getValueAt(seleccionaar, 1)));
        vista.getTxt_nombreClienteCita().setText(String.valueOf(vista.getjTbl_Citas().getValueAt(seleccionaar, 2)));
        vista.getTxt_apellidoClienteCita().setText(String.valueOf(vista.getjTbl_Citas().getValueAt(seleccionaar, 3)));
        String fecha = (String) vista.getjTbl_Citas().getValueAt(seleccionaar, 4);
        Date sFecha;
        try {
            sFecha = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
            vista.getFechaCita().setDate(sFecha);
        } catch (ParseException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        String horaCita = String.valueOf(vista.getjTbl_Citas().getValueAt(seleccionaar, 5));
        JTime imprHora = new JTime();
        imprHora.setHora(ParseFecha(horaCita), vista.getjHCita());
    }

    public static Date ParseFecha(String horaEntra) {
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        Date horaSale = null;
        try {
            horaSale = formato.parse(horaEntra);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return horaSale;
    }

    private void fechaValidacion() {

        try {
            boolean bandera = false;
            Date fechSys = new Date();
            Date fechacita = vista.getFechaCita().getDate();

            ZoneId timeZone = ZoneId.systemDefault();
            LocalDate lDateSys = fechSys.toInstant().atZone(timeZone).toLocalDate();
            LocalDate lDateCita = fechacita.toInstant().atZone(timeZone).toLocalDate();

            if (lDateSys.getYear() > lDateCita.getYear() || lDateSys.getMonthValue() > lDateCita.getMonthValue() || lDateSys.getDayOfMonth() > lDateCita.getDayOfMonth()) {
                JOptionPane.showMessageDialog(null, "FECHA INCORRECTA", "ERROR", 0);
                bandera = false;
                vista.getMensajeErrorFechaCita().setForeground(Color.red);
                vista.getBtn_insertarCita().setEnabled(bandera);
                vista.getBtn_editarCita().setEnabled(bandera);
            } else {
                bandera = true;
                vista.getMensajeErrorFechaCita().setForeground(new Color(40, 40, 40));
                vista.getBtn_insertarCita().setEnabled(bandera);
                vista.getBtn_editarCita().setEnabled(bandera);
            }

        } catch (NullPointerException ex) {

        }
    }

    public void creacionCita() {

        if (clientesExistentes() == true) {
            crearCita();
        } else {
            JOptionPane.showMessageDialog(vista, "Esta cedula ya esta registrada", "Error en Cedula", 0);
        }
    }

    private void validarEliminarCita() {
        if (validaPersonasRegistrada(vista.getTxt_cedulaClienteCita().getText()) == true) {
            eliminarCita();
        } else {
            JOptionPane.showMessageDialog(vista, "Debe primero seleccionar un dato para eliminar", "Error!", 0);
        }
    }

}

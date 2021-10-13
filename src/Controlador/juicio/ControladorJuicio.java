/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.juicio;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.juicio.ModeloJuicio;
import Modelo.juicio.Juicio;
import Vista.Vista_CRUD_Juicio;

/**
 *
 * @author Boxvi
 */
public class ControladorJuicio {

    private ModeloJuicio modelo;
    private Vista_CRUD_Juicio vista;

    public ControladorJuicio(ModeloJuicio modelo, Vista_CRUD_Juicio vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.setVisible(true);
        vista.setTitle("Control juicios");

        cargarTablaJuicio();
        llenarAbogadosDisponibles();
        //System.out.println(modelo.obtenerCodEmpleado("jandry morales"));
    }

    public void iniciaControl() {
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                mostrarRegistroSeleccionado(e);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                llenarCuadrosDialogoJuicio(vista.getTxt_cedulaClienteJuicio().getText());
                cargarTablaJuicio(vista.getTxt_filtroJuicio().getText());
            }
        };

        //llena el tbl que se encuentra en vistas
        //mouseListener en la tabla
        vista.getjTbl_Juicios().addMouseListener(ml);

        //keyReleased hacer una busqueda mucho mejor
        vista.getTxt_cedulaClienteJuicio().addKeyListener(kl);
        vista.getTxt_filtroJuicio().addKeyListener(kl);

        //botones
        vista.getBtn_refescarJuicio().addActionListener(l -> cargarTablaJuicio());
        vista.getBtn_insertarJuicio().addActionListener(l -> crearJuicio());
        vista.getBtn_editarJuicio().addActionListener(l -> modificarJuicio());
        vista.getBtn_eliminarJuicio().addActionListener(l -> eliminarJuicio());

    }

    /*
     * CRUD EN PERSONA
     */
    //CREATE - CREAR
    private void crearJuicio() {

        if (!vista.getTxt_cedulaClienteJuicio().getText().isEmpty() && !vista.getCbxTipoJuicio().getSelectedItem().toString().isEmpty()
                && !vista.getCbxEstadoJuicio().getSelectedItem().toString().isEmpty() && !vista.getCbxabogadosDisponibles().getSelectedItem().toString().isEmpty()) {
            ModeloJuicio modeloJuicios = new ModeloJuicio();
            modeloJuicios.setCedula(vista.getTxt_cedulaClienteJuicio().getText());
            modeloJuicios.setTip_juicio(vista.getCbxTipoJuicio().getSelectedItem().toString());
            modeloJuicios.setEstado(vista.getCbxEstadoJuicio().getSelectedItem().toString());
            modeloJuicios.setNombre_apellido(vista.getCbxabogadosDisponibles().getSelectedItem().toString());

            int resultado = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO QUE LOS DATOS INGRESADOS SON CORRECTOS", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (resultado == JOptionPane.YES_NO_OPTION) {
                if (modeloJuicios.crearJuicios()) {
                    JOptionPane.showMessageDialog(vista, "EL DATO SE GUARDO CORRECTAMENTE DENTRO DE LA BASE DE DATOS");
                    limpiarCampos();
                    cargarTablaJuicio();
                } else {
                    JOptionPane.showMessageDialog(vista, "ALGUN DATO SE ENCUENTRA MAL REVISE NUEVAMENTE ");
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "ASEGURESE DE RELLENAR TODOS LOS CAMPOS");
        }

    }
    
    //READ - LEER
    private void cargarTablaJuicio() {
        DefaultTableModel tblModelo = (DefaultTableModel) vista.getjTbl_Juicios().getModel();

        tblModelo.setNumRows(0);
        List<Juicio> lista = modelo.Leer();
        lista.stream().forEach(j -> {
            String[] juicio = {j.getCod_juicio().toString(), j.getCedula(), j.getNombre(), j.getApellido(), j.getNombre_apellido(), j.getTip_juicio(), j.getEstado()};
            tblModelo.addRow(juicio);
        });
        limpiarCampos();
    }
    
    //UPDATE - MODIFICAR
    private void modificarJuicio() {

        if (!vista.getTxt_cedulaClienteJuicio().getText().isEmpty() && !vista.getCbxTipoJuicio().getSelectedItem().toString().isEmpty()
                && !vista.getCbxEstadoJuicio().getSelectedItem().toString().isEmpty() && !vista.getCbxabogadosDisponibles().getSelectedItem().toString().isEmpty()) {

            ModeloJuicio modeloJuicios = new ModeloJuicio();
            modeloJuicios.setCedula(vista.getTxt_cedulaClienteJuicio().getText());
            modeloJuicios.setTip_juicio(vista.getCbxTipoJuicio().getSelectedItem().toString());
            modeloJuicios.setEstado(vista.getCbxEstadoJuicio().getSelectedItem().toString());
            modeloJuicios.setNombre_apellido(vista.getCbxabogadosDisponibles().getSelectedItem().toString());

            int resultado = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO QUE LOS DATOS INGRESADOS SON CORRECTOS", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (resultado == JOptionPane.YES_NO_OPTION) {
                if (modeloJuicios.modificarJuicios(vista.getTxt_codigoJuicio().getText())) {
                    JOptionPane.showMessageDialog(vista, "EL DATO SE MODIFICO CORRECTAMENTE DENTRO DE LA BASE DE DATOS");
                    limpiarCampos();
                    cargarTablaJuicio();
                } else {
                    JOptionPane.showMessageDialog(vista, "ALGUN DATO SE ENCUENTRA MAL REVISE NUEVAMENTE ");
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "ASEGURESE DE RELLENAR TODOS LOS CAMPOS");
        }

    }
    
    //DELETE - ELIMINAR
    private void eliminarJuicio() {
        ModeloJuicio modeloJuicios = new ModeloJuicio();
        int resultado = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO QUE DESEA ELIMINAR ESTE REGISTRO?!", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resultado == JOptionPane.YES_NO_OPTION) {
            if (modeloJuicios.eliminarJuicios(vista.getTxt_codigoJuicio().getText())) {
                JOptionPane.showMessageDialog(vista, "EL DATO SE ELIMINO CON SATISFACCION");
                limpiarCampos();
                cargarTablaJuicio();
            } else {
                JOptionPane.showMessageDialog(vista, "ALGUN DATO SE ENCUENTRA MAL REVISE NUEVAMENTE ");
            }
        }
    }
    
    
    //FILTRAR LA INFORMACION EN LA TABLA
    private void cargarTablaJuicio(String busqueda) {
        DefaultTableModel tblModelo = (DefaultTableModel) vista.getjTbl_Juicios().getModel();

        tblModelo.setNumRows(0);
        List<Juicio> lista = modelo.leerJuicios(busqueda);
        lista.stream().forEach(j -> {
            String[] juicio = {j.getCod_juicio().toString(), j.getCedula(), j.getNombre(), j.getApellido(), j.getNombre_apellido(), j.getTip_juicio(), j.getEstado()};
            tblModelo.addRow(juicio);
        });
        
    }

    //metodo para rellenar los txt que se encuentran en los txt
    private void llenarCuadrosDialogoJuicio(String cadenaBusqueda) {
        List<Juicio> lista = modelo.filtrarInformacionParatxtJuicios(cadenaBusqueda);

        lista.stream().forEach(ab -> {
            String[] personaDato = {ab.getNombre(), ab.getApellido()};
            vista.getTxt_nombreClienteJuicio().setText(personaDato[0]);
            vista.getTxt_apellidoClienteJuicio().setText(personaDato[1]);
        });

    }

    //metodo para llenar combo box con los abogodos
    private void llenarAbogadosDisponibles() {
        List<Juicio> lista = modelo.obtenerNombresAbogadosComboBX();
        ///vista.getCbxabogadosDisponibles().addItem("SELECCIONAR");
        lista.stream().forEach(ab -> {
            String[] personaDato = {ab.getNombre()};
            vista.getCbxabogadosDisponibles().addItem(personaDato[0]);
        });

    }

    

    //metodo para limpiar txt
    public void limpiarCampos() {
        vista.getTxt_codigoJuicio().setText(null);
        vista.getTxt_cedulaClienteJuicio().setText(null);
        vista.getTxt_nombreClienteJuicio().setText(null);
        vista.getTxt_apellidoClienteJuicio().setText(null);
        vista.getCbxabogadosDisponibles().setSelectedIndex(0);
        vista.getCbxTipoJuicio().setSelectedIndex(0);
        vista.getCbxEstadoJuicio().setSelectedIndex(0);

    }

    //metodo para mostrar registros seleccionados
    private void mostrarRegistroSeleccionado(MouseEvent evento) {
        int seleccionar = vista.getjTbl_Juicios().rowAtPoint(evento.getPoint());
        vista.getTxt_codigoJuicio().setText(String.valueOf(vista.getjTbl_Juicios().getValueAt(seleccionar, 0)));
        vista.getTxt_cedulaClienteJuicio().setText(String.valueOf(vista.getjTbl_Juicios().getValueAt(seleccionar, 1)));
        vista.getTxt_nombreClienteJuicio().setText(String.valueOf(vista.getjTbl_Juicios().getValueAt(seleccionar, 2)));
        vista.getTxt_apellidoClienteJuicio().setText(String.valueOf(vista.getjTbl_Juicios().getValueAt(seleccionar, 3)));
        vista.getCbxabogadosDisponibles().setSelectedItem(String.valueOf(vista.getjTbl_Juicios().getValueAt(seleccionar, 4)));
        vista.getCbxTipoJuicio().setSelectedItem(String.valueOf(vista.getjTbl_Juicios().getValueAt(seleccionar, 5)));
        vista.getCbxEstadoJuicio().setSelectedItem(String.valueOf(vista.getjTbl_Juicios().getValueAt(seleccionar, 6)));
    }

}
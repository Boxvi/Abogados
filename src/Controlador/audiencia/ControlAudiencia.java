/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.audiencia;

import Controlador.persona.ControladorPersona;
import Modelo.audiencia.*;
import Modelo.interfaces.Validaciones;
import Vista.Vista_CRUD_Audiencia;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ControlAudiencia implements Validaciones {

    private ModeloAudiencia modeloAudiencia;
    private Vista_CRUD_Audiencia vistaAudiencia;

    public ControlAudiencia(ModeloAudiencia modeloAudiencia, Vista_CRUD_Audiencia vistaAudiencia) {
        this.modeloAudiencia = modeloAudiencia;
        this.vistaAudiencia = vistaAudiencia;
        vistaAudiencia.setVisible(true);
        cargarDatosTabla();

        llenarJuiciosDisponibles();

        //elegirCombo();
    }

    public void inicioControl() {
        
        
        
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == vistaAudiencia.getJtbl_Audiencia()) {
                    cargarTxtDatos(e);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

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
                cargarDatosTabla(vistaAudiencia.getTxt_filtrarAudiencia().getText());
            }
        };
        
        
        //vistaAudiencia.getCbx_informacionAudiencia().addItemListener(il);

        vistaAudiencia.getTxt_filtrarAudiencia().addKeyListener(kl);

        vistaAudiencia.getBtn_insertarAudiencia().addActionListener(l -> crearAudiencia());
        vistaAudiencia.getBtn_editarAudiencia().addActionListener(l -> editarAudiencia());
        vistaAudiencia.getBtn_eliminarAudiencia().addActionListener(l -> eliminarAudiencia());
        vistaAudiencia.getItemVaciacamposAudi().addActionListener(l -> vaciarCampos());
        vistaAudiencia.getJtbl_Audiencia().addMouseListener(ml);
        vistaAudiencia.getBtn_refescarAdiencia().addActionListener(l -> cargarDatosTabla());

    }

    public void crearAudiencia() {

        if (!vistaAudiencia.getCbx_informacionAudiencia().getSelectedItem().toString().equals("Seleccionar")
                && !((JTextField) vistaAudiencia.getJchFechaAudiencia().getDateEditor().getUiComponent()).getText().isEmpty()) {

            modeloAudiencia.setCodigo_juicio(codigoJuicio(vistaAudiencia.getCbx_informacionAudiencia().getSelectedItem().toString()));
            modeloAudiencia.setFecha_a(((JTextField) vistaAudiencia.getJchFechaAudiencia().getDateEditor().getUiComponent()).getText());

            if (modeloAudiencia.crearAudiencia()) {
                JOptionPane.showMessageDialog(vistaAudiencia, "La Audiencia se ha registrado satisfactoriamente",
                        "Perfecto", JOptionPane.PLAIN_MESSAGE,
                        new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
                cargarDatosTabla();
                vaciarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(vistaAudiencia, "No se pudo registrar la Audiencia", "Error!", 0);
        }

    }

    public void editarAudiencia() {

        if (!vistaAudiencia.getCbx_informacionAudiencia().getSelectedItem().toString().equals("Seleccionar")
                && !((JTextField) vistaAudiencia.getJchFechaAudiencia().getDateEditor().getUiComponent()).getText().isEmpty()) {

            //modeloAudiencia.setCodigo_juicio(codigoJuicio(vistaAudiencia.getCbx_informacionAudiencia().getSelectedItem().toString()));
            modeloAudiencia.setFecha_a(((JTextField) vistaAudiencia.getJchFechaAudiencia().getDateEditor().getUiComponent()).getText());

            if (modeloAudiencia.modificarAudiencia()) {
                JOptionPane.showMessageDialog(vistaAudiencia, "La Audiencia se ha registrado satisfactoriamente",
                        "Perfecto", JOptionPane.PLAIN_MESSAGE,
                        new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
                cargarDatosTabla();
                vaciarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(vistaAudiencia, "No se pudo registrar la Audiencia", "Error!", 0);
        }

    }

    public void eliminarAudiencia() {
        if (modeloAudiencia.eliminarAudiencia()) {
            JOptionPane.showMessageDialog(vistaAudiencia, "La Audiencia se ha eliminado satisfactoriamente",
                    "Perfecto", JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
            cargarDatosTabla();
        } else {
            JOptionPane.showMessageDialog(vistaAudiencia, "No se han guardado los cambios", "Error!", 0);
        }
    }

    void vaciarCampos() {
        vistaAudiencia.getCbx_informacionAudiencia().setSelectedIndex(0);
        vistaAudiencia.getJchFechaAudiencia().setDate(null);
    }

    private void llenarJuiciosDisponibles() {
        List<Audiencia> lista = modeloAudiencia.obtenerInformacionJuiciosComboBX();
        lista.stream().forEach(ab -> {
            String[] personaDato = {ab.getCodigo_juicio()};
            vistaAudiencia.getCbx_informacionAudiencia().addItem(personaDato[0]);
        });

    }

    void cargarDatosTabla() {
        DefaultTableModel tblModelo = (DefaultTableModel) vistaAudiencia.getJtbl_Audiencia().getModel();

        tblModelo.setNumRows(0);
        List<Audiencia> listaAudiencia = modeloAudiencia.leerAudiencia();

        listaAudiencia.stream().forEach(p -> {
            String[] audiencia = {p.getCodigo_juicio(), p.getFecha_a(), String.valueOf(p.getNumero_a())};
            tblModelo.addRow(audiencia);
        });
        vaciarCampos();
    }

    void cargarDatosTabla(String cadena) {
        DefaultTableModel tblModelo = (DefaultTableModel) vistaAudiencia.getJtbl_Audiencia().getModel();

        tblModelo.setNumRows(0);
        List<Audiencia> listaAudiencia = modeloAudiencia.leerAudiencia(cadena);

        listaAudiencia.stream().forEach(p -> {
            String[] audiencia = {p.getCodigo_juicio(), p.getFecha_a(), String.valueOf(p.getNumero_a())};
            tblModelo.addRow(audiencia);
        });
    }

    public String codigoJuicio(String cadena) {
        String[] matriz = cadena.split(" ");
        return matriz[0].toString();

    }

    void cargarTxtDatos(MouseEvent e) {
        System.out.println("A");
        int seleccion = vistaAudiencia.getJtbl_Audiencia().rowAtPoint(e.getPoint());
        int num_audiencia = Integer.parseInt(String.valueOf(vistaAudiencia.getJtbl_Audiencia().getValueAt(seleccion, 2)));
        modeloAudiencia.setNumero_a(num_audiencia);

        vistaAudiencia.getCbx_informacionAudiencia().setSelectedItem(String.valueOf(vistaAudiencia.getJtbl_Audiencia().getValueAt(seleccion, 0)));

        String fecha = (String) vistaAudiencia.getJtbl_Audiencia().getValueAt(seleccion, 1);
        Date sFecha;

        try {
            sFecha = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
            vistaAudiencia.getJchFechaAudiencia().setDate(sFecha);
        } catch (ParseException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("B");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.audiencia;

import Controlador.empleado.ControladorEmpleado;
import Controlador.persona.ControladorPersona;
import Modelo.audiencia.*;
import Modelo.persona.Persona;
import Vista.Vista_CRUD_Audiencia;
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

public class ControlAudiencia {

    private ModeloAudiencia modeloAudiencia;
    private Vista_CRUD_Audiencia vistaAudiencia;

    public ControlAudiencia(ModeloAudiencia modeloAudiencia, Vista_CRUD_Audiencia vistaAudiencia) {
        this.modeloAudiencia = modeloAudiencia;
        this.vistaAudiencia = vistaAudiencia;
        vistaAudiencia.setVisible(true);
        cargarDatosTabla();
    }

    public void inicioControl() {
        MouseListener ml= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource()== vistaAudiencia.getJtbl_Audiencia()) {
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
        vistaAudiencia.getBtn_insertarAudiencia().addActionListener(l -> insertarAudiencia());
        vistaAudiencia.getBtn_editarAudiencia().addActionListener(l -> editarAudiencia());
        vistaAudiencia.getBtn_eliminarAudiencia().addActionListener(l -> eliminarAudiencia());
        vistaAudiencia.getItemVaciacamposAudi().addActionListener(l -> vaciarCampos());
        vistaAudiencia.getJtbl_Audiencia().addMouseListener(ml);
        vistaAudiencia.getBtn_refescarAdiencia().addActionListener(l -> cargarDatosTabla());
        
    }

    void insertarAudiencia() {
        modeloAudiencia.setCodigo_juicio(vistaAudiencia.getTxtcodigojuicio().getText());
        modeloAudiencia.setFecha_a(((JTextField) vistaAudiencia.getJchFechaAudiencia().getDateEditor().getUiComponent()).getText());

        if (modeloAudiencia.crearAudiencia()) {
            JOptionPane.showMessageDialog(vistaAudiencia, "La Audiencia se ha registrado satisfactoriamente",
                    "Perfecto", JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
            cargarDatosTabla();
        } else {
            JOptionPane.showMessageDialog(vistaAudiencia, "No se pudo registrar la Audiencia", "Error!", 0);
        }
    }

    void editarAudiencia() {
        
        modeloAudiencia.setCodigo_juicio(vistaAudiencia.getTxtcodigojuicio().getText());
        modeloAudiencia.setFecha_a(((JTextField) vistaAudiencia.getJchFechaAudiencia().getDateEditor().getUiComponent()).getText());
        
        if (modeloAudiencia.modificarAudiencia()) {
            JOptionPane.showMessageDialog(vistaAudiencia, "La Audiencia se ha registrado satisfactoriamente",
                    "Perfecto", JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
            cargarDatosTabla();
        }else {
            JOptionPane.showMessageDialog(vistaAudiencia, "No se han guardado los cambios", "Error!", 0);
        }
    }
    
    void eliminarAudiencia(){
        if (modeloAudiencia.eliminarAudiencia()) {
            JOptionPane.showMessageDialog(vistaAudiencia, "La Audiencia se ha eliminado satisfactoriamente",
                    "Perfecto", JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
            cargarDatosTabla();
        }else {
            JOptionPane.showMessageDialog(vistaAudiencia, "No se han guardado los cambios", "Error!", 0);
        }
    }
    
    void cargarDatosTabla(){
        DefaultTableModel tblModelo = (DefaultTableModel) vistaAudiencia.getJtbl_Audiencia().getModel();

        tblModelo.setNumRows(0);
        List<Audiencia> listaAudiencia = modeloAudiencia.leerAudiencia();

        listaAudiencia.stream().forEach(p -> {
            String[] audiencia=  {p.getCodigo_juicio(), p.getFecha_a(), String.valueOf(p.getNumero_a())};
            tblModelo.addRow(audiencia);
        });
    }
    
    void cargarTxtDatos(MouseEvent e){
        System.out.println("A");
        int seleccion=vistaAudiencia.getJtbl_Audiencia().rowAtPoint(e.getPoint());
        int num_audiencia=Integer.parseInt(String.valueOf(vistaAudiencia.getJtbl_Audiencia().getValueAt(seleccion, 2)));
        modeloAudiencia.setNumero_a(num_audiencia);
        vistaAudiencia.getTxtcodigojuicio().setText(String.valueOf(vistaAudiencia.getJtbl_Audiencia().getValueAt(seleccion, 0)));
        
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
    
    void vaciarCampos(){
        vistaAudiencia.getTxtcodigojuicio().setText("");
        vistaAudiencia.getJchFechaAudiencia().setDate(null);
    }
}

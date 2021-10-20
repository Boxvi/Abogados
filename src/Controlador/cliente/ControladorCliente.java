/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.cliente;

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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Modelo.cliente.ModeloCliente;
import Modelo.cliente.Cliente;
import static Modelo.interfaces.Validaciones.validaPersonasRegistrada;
import Vista.Vista_CRUD_Cliente;
import Modelo.interfaces.Validaciones;

/**
 *
 * @author Boxvi
 */
public class ControladorCliente implements Validaciones {
    
    private ModeloCliente modelo;
    private Vista_CRUD_Cliente vista;
    
    public ControladorCliente(ModeloCliente modelo, Vista_CRUD_Cliente vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setVisible(true);
        cargarTablaCliente();
        
    }
    
    public void iniciaControl() {
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarRegistroSeleccionadoCliente(e);
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
                if (e.getSource() == vista.getTxt_cedulaCliente()) {
                    creacionCliente(2);
                }
                
                if (e.getSource() == vista.getTxt_filtroCliente()) {
                    cargarTablaCliente(vista.getTxt_filtroCliente().getText());
                }
            }
        };
        
        vista.getTbl_Cliente().addMouseListener(ml);

        //AGREGAR KEY LISTENER PARA USAR METODOS DE BUSQUEDA INTELIGENTE
        vista.getTxt_cedulaCliente().addKeyListener(kl);
        vista.getTxt_filtroCliente().addKeyListener(kl);

        //BOTONES PRINCIPALES 
        vista.getBtn_insertarCliente().addActionListener(l -> creacionCliente(1));
        vista.getBtn_refescarCliente().addActionListener(l -> cargarTablaCliente());
        vista.getBtn_editarCliente().addActionListener(l -> modificarCliente());
        vista.getBtn_eliminarCliente().addActionListener(l -> validarEliminarEmpleado());
        
    }

    /*
    
     * CRUD EN PERSONA
     */
    //CREATE - CREAR
    private void crearCliente() {
        if (!vista.getTxt_cedulaCliente().getText().isEmpty() && !vista.getjCbxEcivil().getSelectedItem().toString().equals("Seleccionar")) {
            ModeloCliente modeloCliente = new ModeloCliente();
            modeloCliente.setCod_cliente(modeloCliente.asignarCodigoCliente());
            modeloCliente.setCedula(vista.getTxt_cedulaCliente().getText());
            modeloCliente.setEstado_civil(vista.getjCbxEcivil().getSelectedItem().toString());
            
            if (modeloCliente.crearCliente()) {
                JOptionPane.showMessageDialog(vista, "Los Datos se Guardaron satisfactoriamente");
                cargarTablaCliente();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(vista, "Hubo un error al tratar de registrar al Cliente", "Error en Registro de Cliente", 0);
            }
            
        } else {
            JOptionPane.showMessageDialog(vista, "Todos los campos deben ser llenados", "Campos Vacios", 2);
            
        }
    }

    //READ - LEER
    private void cargarTablaCliente() {
        DefaultTableModel tblModelo = (DefaultTableModel) vista.getTbl_Cliente().getModel();
        
        tblModelo.setNumRows(0);
        List<Cliente> lista = modelo.leerCliente();
        
        lista.stream().forEach(c -> {
            
            String[] clientes = {c.getCedula(), c.getNombre(), c.getApellido(),
                c.getCorreo(), c.getDireccion(), c.getFecha_nac(), c.getEdad().toString(),
                c.getTelefono(), c.getGenero(), c.getEstado_civil()};
            tblModelo.addRow(clientes);
        });
        limpiarCampos();
    }

    //UPDATE - MODIFICAR
    private void modificarCliente() {
        if (!vista.getTxt_cedulaCliente().getText().isEmpty() && !vista.getjCbxEcivil().getSelectedItem().toString().equals("Seleccionar")) {
            
            ModeloCliente modeloCliente = new ModeloCliente();
            modeloCliente.setEstado_civil(vista.getjCbxEcivil().getSelectedItem().toString());
            
            if (modeloCliente.modificarCliente("" + modeloCliente.obtenerCodigoCliente(vista.getTxt_cedulaCliente().getText()))) {
                JOptionPane.showMessageDialog(vista, "Los Datos se Modificaron satisfactoriamente");
                cargarTablaCliente();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(vista, "Hubo un error al tratar de modificar al Cliente", "Error en Modificar al Cliente", 0);
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Todos los campos deben ser llenados", "Campos Vacios", 2);
            
        }
    }

    //DELETE - ELIMINAR
    private void eliminarCliente() {
        ModeloCliente modeloCliente = new ModeloCliente();
        int resultado = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO QUE DESEA ELIMINAR ESTE REGISTRO?!", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (resultado == JOptionPane.YES_NO_OPTION) {
            if (modeloCliente.eliminarCliente("" + modeloCliente.obtenerCodigoCliente(vista.getTxt_cedulaCliente().getText()))) {
                JOptionPane.showMessageDialog(vista, "El Dato se Elimino satisfactoriamente");
                limpiarCampos();
                cargarTablaCliente();
            } else {
                JOptionPane.showMessageDialog(vista, "Hubo un error al tratar de Eliminar al Cliente", "Error al eliminar al Cliente", 0);
            }
        }
    }

    //FILTRAR LA INFORMACION EN LA TABLA
    private void cargarTablaCliente(String cadenaBusqueda) {
        DefaultTableModel tblModelo = (DefaultTableModel) vista.getTbl_Cliente().getModel();
        
        tblModelo.setNumRows(0);
        List<Cliente> lista = modelo.leerCliente(cadenaBusqueda);
        
        lista.stream().forEach(c -> {
            String[] clientes = {c.getCedula(), c.getNombre(), c.getApellido(),
                c.getCorreo(), c.getDireccion(), c.getFecha_nac(), c.getEdad().toString(),
                c.getTelefono(), c.getGenero(), c.getEstado_civil()};
            tblModelo.addRow(clientes);
        });
    }

    //FILTRAR INFORMACION EN LOS CUADROS DE DIALOGO
    private void llenarCuadrosDialogoCliente(String cadenaBusqueda) {
        List<Cliente> listaCliente = modelo.filtrarInformacionParatxtPersona(cadenaBusqueda);
        
        listaCliente.stream().forEach(c -> {
            String[] cliente = {c.getCedula(), c.getNombre(), c.getApellido(),
                c.getCorreo(), c.getDireccion(), c.getFecha_nac(), c.getEdad().toString(),
                c.getTelefono(), c.getGenero()};
            
            vista.getTxt_nombreCliente().setText(cliente[1]);
            vista.getTxt_apellidoCliente().setText(cliente[2]);
            vista.getTxt_correoCliente().setText(cliente[3]);
            vista.getTxt_direccionCliente().setText(cliente[4]);
            String fecha = cliente[5];
            Date sFecha;
            try {
                sFecha = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
                vista.getJc_fecha_nacCliente().setDate(sFecha);
            } catch (ParseException ex) {
                Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.getTxt_edadCliente().setText(cliente[6]);
            vista.getTxt_telefonoCliente().setText(cliente[7]);
        });
    }

    //LIMPIAR CAMPOS DE Cliente
    public void limpiarCampos() {
        vista.getTxt_cedulaCliente().setText(null);
        vista.getTxt_nombreCliente().setText(null);
        vista.getTxt_apellidoCliente().setText(null);
        vista.getTxt_correoCliente().setText(null);
        vista.getTxt_direccionCliente().setText(null);
        ((JTextField) vista.getJc_fecha_nacCliente().getDateEditor().getUiComponent()).setText(null);
        vista.getTxt_edadCliente().setText(null);
        vista.getTxt_telefonoCliente().setText(null);
        vista.getjCbxEcivil().setSelectedIndex(0);
        vista.getTxt_filtroCliente().setText(null);
        
    }

    //MOSTAR LOS REGISTROS SELECCIONADOS DE LAS PERSONAS SELECCIONADAS DE LA TABLA
    public void mostrarRegistroSeleccionadoCliente(MouseEvent event) {
        int seleccionaar = vista.getTbl_Cliente().rowAtPoint(event.getPoint());
        vista.getTxt_cedulaCliente().setText(String.valueOf(vista.getTbl_Cliente().getValueAt(seleccionaar, 0)));
        vista.getTxt_nombreCliente().setText(String.valueOf(vista.getTbl_Cliente().getValueAt(seleccionaar, 1)));
        vista.getTxt_apellidoCliente().setText(String.valueOf(vista.getTbl_Cliente().getValueAt(seleccionaar, 2)));
        vista.getTxt_correoCliente().setText(String.valueOf(vista.getTbl_Cliente().getValueAt(seleccionaar, 3)));
        vista.getTxt_direccionCliente().setText(String.valueOf(vista.getTbl_Cliente().getValueAt(seleccionaar, 4)));
        String fecha = (String) vista.getTbl_Cliente().getValueAt(seleccionaar, 5);
        Date sFecha;
        try {
            sFecha = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
            vista.getJc_fecha_nacCliente().setDate(sFecha);
        } catch (ParseException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        vista.getTxt_edadCliente().setText(String.valueOf(vista.getTbl_Cliente().getValueAt(seleccionaar, 6)));
        vista.getTxt_telefonoCliente().setText(String.valueOf(vista.getTbl_Cliente().getValueAt(seleccionaar, 7)));
        
        vista.getjCbxEcivil().setSelectedItem(String.valueOf(vista.getTbl_Cliente().getValueAt(seleccionaar, 9)));
        
    }

    //Validar Cedulas Repetidas
    private boolean validarCedulasRepetidasCliente(String cedula) {
        List<Cliente> listaPersona = modelo.validarCedulasRepetidas();
        for (int i = 0; i < listaPersona.size(); i++) {
            if (listaPersona.get(i).getCedula().equalsIgnoreCase(cedula)) {
                return false;
            }
        }
        return true;
    }
    
    
    public void creacionCliente(int aguja) {

        if (aguja == 1) {
            if (validarCedulasRepetidasCliente(vista.getTxt_cedulaCliente().getText()) == true) {
                crearCliente();
            } else {
                JOptionPane.showMessageDialog(vista, "Esta cedula ya esta registrada", "Error en Cedula", 0);
            }
        }

        if (aguja == 2) {
            if (vista.getTxt_cedulaCliente().getText().length() == 10) {
                System.out.println("B");
                if (validaPersonasRegistrada(vista.getTxt_cedulaCliente().getText()) == true) {
                    llenarCuadrosDialogoCliente(vista.getTxt_cedulaCliente().getText());
                    vista.getBtn_insertarCliente().setEnabled(true);
                    System.out.println("C");
                } else {
                    System.out.println("D");
                    JOptionPane.showMessageDialog(vista, "UPS! Parece que esta cedula no se encuentra registrada en Persona." + "\nPor favor resgistre primero una Persona.", "Cedula no Existe", 2);
                    vista.getBtn_insertarCliente().setEnabled(false);
                    limpiarCampos();
                }
            }
        }
    }
    
    private void validarEliminarEmpleado(){
        if (validaPersonasRegistrada(vista.getTxt_cedulaCliente().getText())==true) {
            eliminarCliente();
        }else{
            JOptionPane.showMessageDialog(vista, "Debe primero seleccionar un dato para eliminar", "Error!", 0);
        }
    }
}
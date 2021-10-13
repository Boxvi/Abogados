/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.empleado;

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
import Modelo.empleado.Empleado;
import Modelo.empleado.ModeloEmpleado;
import Modelo.persona.Persona;
import Modelo.rol.Rol;
import Vista.Vista_CRUD_Empleado;

/**
 *
 * @author Boxvi
 */
public class ControladorEmpleado {

    private ModeloEmpleado modelo;
    private Vista_CRUD_Empleado vista_Empleado;

    public ControladorEmpleado(ModeloEmpleado modelo, Vista_CRUD_Empleado vista) {
        this.modelo = modelo;
        this.vista_Empleado = vista;

        vista.setVisible(true);
        vista.setTitle("Control Empleado");
        cargarTablaEmpleado();
        llenarRolesDisponibles();

    }

    public void iniciaControlEmpleado() {
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarRegistroSeleccionadoEmpleado(e);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                llenarCuadrosDialogoPersona(vista_Empleado.getTxt_cedulaEmpleado().getText());
                cargarTablaEmpleado(vista_Empleado.getTxt_filtroEmpleado().getText());
            }
        };

        vista_Empleado.getTbl_Empleado().addMouseListener(ml);

        vista_Empleado.getTxt_cedulaEmpleado().addKeyListener(kl);
        vista_Empleado.getTxt_filtroEmpleado().addKeyListener(kl);

        //BOTONES PRINCIPALES 
        vista_Empleado.getBtn_refescarEmpleado().addActionListener(l -> cargarTablaEmpleado());
        vista_Empleado.getBtn_insertarEmpleado().addActionListener(l -> crearEmpleado());
        vista_Empleado.getBtn_editarEmpleado().addActionListener(l -> modificarEmpleado());
        vista_Empleado.getBtn_eliminarEmpleado().addActionListener(l -> eliminarEmpleado());
    }

    /*
     * CRUD EN PERSONA
     */
    //CREATE - CREAR
    private void crearEmpleado() {
        if (!vista_Empleado.getTxt_cedulaEmpleado().getText().isEmpty() && !vista_Empleado.getTxt_sueldoEmpleado().getText().isEmpty()
                && !vista_Empleado.getjCmb_estadoEmpleado().getSelectedItem().toString().isEmpty() && !vista_Empleado.getjCmb_rolEmpleado().getSelectedItem().toString().isEmpty()) {

            ModeloEmpleado modeloEmpleado = new ModeloEmpleado();
            modeloEmpleado.setCod_empleado(modeloEmpleado.contarCodigoEmpleados());
            modeloEmpleado.setCedula(vista_Empleado.getTxt_cedulaEmpleado().getText());
            modeloEmpleado.setSueldo(vista_Empleado.getTxt_sueldoEmpleado().getText());
            modeloEmpleado.setEstado(estadosEmpleado(vista_Empleado.getjCmb_estadoEmpleado().getSelectedItem().toString()));
            modeloEmpleado.setCod_rol(modelo.dameCodigoRol(vista_Empleado.getjCmb_rolEmpleado().getSelectedItem().toString()));

            if (modeloEmpleado.crearEmpleado()) {
                JOptionPane.showMessageDialog(vista_Empleado, "EL DATO SE GUARDO CORRECTAMENTE DENTRO DE LA BASE DE DATOS");
                limpiarCamposEmpleado();
                cargarTablaEmpleado();
            } else {
                JOptionPane.showMessageDialog(vista_Empleado, "OCURRIO UN PROBLEMA NO SE PUEDE GUARDAR");
            }
        } else {
            JOptionPane.showMessageDialog(vista_Empleado, "TODOS LOS CAMPOS DEBEN DE ESTAR LLENOS PARA REGISTAR AL EMPLEADO");
        }
    }

    //READ - LEER
    private void cargarTablaEmpleado() {
        DefaultTableModel tblModelo = (DefaultTableModel) vista_Empleado.getTbl_Empleado().getModel();
        tblModelo.setNumRows(0);
        List<Empleado> listaEmpleado = modelo.leerEmpleado();

        listaEmpleado.stream().forEach(e -> {
            String[] empleado = {e.getCedula(), e.getNombre(), e.getApellido(), e.getCorreo(), e.getDireccion(), e.getFecha_nac(),
                e.getEdad().toString(), e.getTelefono(), e.getSueldo(), e.getEstados(), e.getTipo_rol()};

            tblModelo.addRow(empleado);
        });
        limpiarCamposEmpleado();
    }

    //UPDATE - MODIFICAR
    private void modificarEmpleado() {
        if (!vista_Empleado.getTxt_cedulaEmpleado().getText().isEmpty() && !vista_Empleado.getTxt_sueldoEmpleado().getText().isEmpty()
                && !vista_Empleado.getjCmb_estadoEmpleado().getSelectedItem().toString().isEmpty() && !vista_Empleado.getjCmb_rolEmpleado().getSelectedItem().toString().isEmpty()) {

            ModeloEmpleado modeloEmpleado = new ModeloEmpleado();
            //modeloEmpleado.setCod_empleado(modeloEmpleado.ContarCodigoEmpleados());
            //modeloEmpleado.setCedula(vista.getTxt_cedulaEmpleado().getText());
            modeloEmpleado.setSueldo(vista_Empleado.getTxt_sueldoEmpleado().getText());
            modeloEmpleado.setEstado(estadosEmpleado(vista_Empleado.getjCmb_estadoEmpleado().getSelectedItem().toString()));
            modeloEmpleado.setCod_rol(modelo.dameCodigoRol(vista_Empleado.getjCmb_rolEmpleado().getSelectedItem().toString()));

            if (modeloEmpleado.modificarEmpleado(modeloEmpleado.ObtenerCodCliente(vista_Empleado.getTxt_cedulaEmpleado().getText()))) {
                JOptionPane.showMessageDialog(vista_Empleado, "EL DATO SE modifico CORRECTAMENTE DENTRO DE LA BASE DE DATOS");
                limpiarCamposEmpleado();
                cargarTablaEmpleado();
            } else {
                JOptionPane.showMessageDialog(vista_Empleado, "OCURRIO UN PROBLEMA NO SE PUEDE GUARDAR");
            }
        } else {
            JOptionPane.showMessageDialog(vista_Empleado, "TODOS LOS CAMPOS DEBEN DE ESTAR LLENOS PARA REGISTAR AL EMPLEADO");
        }
    }

    //DELETE - ELIMINAR
    private void eliminarEmpleado() {
        ModeloEmpleado modeloEmpleado = new ModeloEmpleado();
        int resultado = JOptionPane.showConfirmDialog(vista_Empleado, "ESTA SEGURO QUE DESEA ELIMINAR ESTE REGISTRO?!", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resultado == JOptionPane.YES_NO_OPTION) {
            if (modeloEmpleado.eliminarEmpleado(modeloEmpleado.ObtenerCodCliente(vista_Empleado.getTxt_cedulaEmpleado().getText()))) {
                JOptionPane.showMessageDialog(vista_Empleado, "EL DATO SE ELIMINO CON SATISFACCION");
                limpiarCamposEmpleado();
                cargarTablaEmpleado();
            } else {
                JOptionPane.showMessageDialog(vista_Empleado, "ALGUN DATO SE ENCUENTRA MAL REVISE NUEVAMENTE ");
            }
        }
    }

    //FILTRAR LA INFORMACION EN LA TABLA
    private void cargarTablaEmpleado(String cadenaBusqueda) {
        DefaultTableModel tblModelo = (DefaultTableModel) vista_Empleado.getTbl_Empleado().getModel();
        tblModelo.setNumRows(0);
        List<Empleado> listaEmpleado = modelo.leerEmpleado(cadenaBusqueda);
        listaEmpleado.stream().forEach(e -> {
            String[] empleado = {e.getCedula(), e.getNombre(), e.getApellido(), e.getCorreo(), e.getDireccion(), e.getFecha_nac(),
                e.getEdad().toString(), e.getTelefono(), e.getSueldo(), e.getEstados(), e.getTipo_rol()};

            tblModelo.addRow(empleado);
        });
    }
    
    //FILTRAR INFORMACION EN LOS CUADROS DE DIALOGO
    private void llenarCuadrosDialogoPersona(String cadenaBusqueda) {
        List<Persona> listaPersona = modelo.filtrarInformacionParatxtCliente(cadenaBusqueda);

        listaPersona.stream().forEach(p -> {
            String[] persona = {p.getCedula(), p.getNombre(), p.getApellido(),
                p.getCorreo(), p.getDireccion(), p.getFecha_nac(), p.getEdad().toString(),
                p.getTelefono(), p.getGenero()};

            vista_Empleado.getTxt_nombreEmpleado().setText(persona[1]);
            vista_Empleado.getTxt_apellidoEmpleado().setText(persona[2]);
            vista_Empleado.getTxt_correoEmpleado().setText(persona[3]);
            vista_Empleado.getTxt_direccionEmpleado().setText(persona[4]);
            String fecha = persona[5];
            Date sFecha;
            try {
                sFecha = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
                vista_Empleado.getJc_fecha_nacEmpleado().setDate(sFecha);
            } catch (ParseException ex) {
                Logger.getLogger(ControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
            //vista.getTxt_edadPersona().setText(persona[6]);
            vista_Empleado.getTxt_telefonoEmpleado().setText(persona[7]);
            //vista.getjCmb_generoPresona().setSelectedItem(persona[8]);

        });
    }
    
    
    
    //Llenar roles disponibles
    private void llenarRolesDisponibles() {
        List<Rol> listaRoles = new ModeloEmpleado().obtenerRolesComboBX();
        listaRoles.stream().forEach(lr -> {
            String[] rolesDatos = {lr.getTipo_rol()};
            vista_Empleado.getjCmb_rolEmpleado().addItem(rolesDatos[0]);
        });
    }

    private void mostrarRegistroSeleccionadoEmpleado(MouseEvent evento) {
        int seleccionar = vista_Empleado.getTbl_Empleado().rowAtPoint(evento.getPoint());
        //vista.getTxt_codigoJuicio().setText(String.valueOf(vista.getjTbl_Juicios().getValueAt(seleccionar, 0)));
        vista_Empleado.getTxt_cedulaEmpleado().setText(String.valueOf(vista_Empleado.getTbl_Empleado().getValueAt(seleccionar, 0)));
        vista_Empleado.getTxt_nombreEmpleado().setText(String.valueOf(vista_Empleado.getTbl_Empleado().getValueAt(seleccionar, 1)));
        vista_Empleado.getTxt_apellidoEmpleado().setText(String.valueOf(vista_Empleado.getTbl_Empleado().getValueAt(seleccionar, 2)));
        vista_Empleado.getTxt_correoEmpleado().setText(String.valueOf(vista_Empleado.getTbl_Empleado().getValueAt(seleccionar, 3)));
        vista_Empleado.getTxt_direccionEmpleado().setText(String.valueOf(vista_Empleado.getTbl_Empleado().getValueAt(seleccionar, 4)));

        String fecha = (String) vista_Empleado.getTbl_Empleado().getValueAt(seleccionar, 5);
        Date sFecha;

        try {
            sFecha = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
            vista_Empleado.getJc_fecha_nacEmpleado().setDate(sFecha);
        } catch (ParseException ex) {
            Logger.getLogger(ControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        vista_Empleado.getTxt_telefonoEmpleado().setText(String.valueOf(vista_Empleado.getTbl_Empleado().getValueAt(seleccionar, 7)));
        vista_Empleado.getTxt_sueldoEmpleado().setText(String.valueOf(vista_Empleado.getTbl_Empleado().getValueAt(seleccionar, 8)));

        vista_Empleado.getjCmb_estadoEmpleado().setSelectedItem(String.valueOf(vista_Empleado.getTbl_Empleado().getValueAt(seleccionar, 9)));
        vista_Empleado.getjCmb_rolEmpleado().setSelectedItem(String.valueOf(vista_Empleado.getTbl_Empleado().getValueAt(seleccionar, 10)));
    }

    //LIMPIAR CAMPOS DE EMPLEADO
    private void limpiarCamposEmpleado() {
        vista_Empleado.getTxt_cedulaEmpleado().setText(null);
        vista_Empleado.getTxt_nombreEmpleado().setText(null);
        vista_Empleado.getTxt_apellidoEmpleado().setText(null);
        vista_Empleado.getTxt_correoEmpleado().setText(null);
        vista_Empleado.getTxt_direccionEmpleado().setText(null);
        vista_Empleado.getTxt_telefonoEmpleado().setText(null);
        vista_Empleado.getTxt_sueldoEmpleado().setText(null);
        vista_Empleado.getjCmb_estadoEmpleado().setSelectedIndex(0); //String.valueOf(vista.getTbl_Empleado().getValueAt(seleccionar, 9)));
        vista_Empleado.getjCmb_rolEmpleado().setSelectedIndex(0);
        ((JTextField) vista_Empleado.getJc_fecha_nacEmpleado().getDateEditor().getUiComponent()).setText(null);
        vista_Empleado.getTxt_filtroEmpleado().setText(null);
    }

    //	cod_empleado, cedula, sueldo, estado, cod_rol, eliminado)
    private boolean estadosEmpleado(String estado) {
        if (estado.equalsIgnoreCase("ACTIVO")) {
            return true;
        } else if (estado.equalsIgnoreCase("INACTIVO")) {
            return false;
        }
        return false;
    }
}
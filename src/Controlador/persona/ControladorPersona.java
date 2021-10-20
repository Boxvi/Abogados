package Controlador.persona;

import static Modelo.interfaces.Validaciones.validaPersonasRegistrada;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Modelo.persona.ModeloPersona;
import Modelo.persona.Persona;
import Vista.Vista_CRUD_Persona;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ControladorPersona {

    private ModeloPersona modelo;
    private Vista_CRUD_Persona vista;
    private int edad;

    public ControladorPersona(ModeloPersona modelo, Vista_CRUD_Persona vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        cargarTablaPersona();
    }

    public void iniciaControlPersona() {

        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource()==vista.getTbl_Persona()) {
                    mostrarRegistroSeleccionadoPersona(e);
                    vista.getTxt_cedulaPersona().setEditable(false);
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

        PropertyChangeListener pl = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                try {
                    calcularEdad(((JTextField) vista.getJc_fecha_nacPersona().getDateEditor().getUiComponent()).getText());
                } catch (Exception e) {
                }
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
                if (e.getSource() == vista.getTxt_cedulaPersona()) {
                    llenarCuadrosDialogoPersona(vista.getTxt_cedulaPersona().getText());
                }
                if (e.getSource() == vista.getTxt_filtroPersona()) {
                    cargarTablaPersona(vista.getTxt_filtroPersona().getText());
                }
            }
        };

        vista.getTbl_Persona().addMouseListener(ml);

        //AGREGAR KEY LISTENER PARA USAR METODOS DE BUSQUEDA INTELIGENTE
        vista.getTxt_cedulaPersona().addKeyListener(kl);
        vista.getTxt_filtroPersona().addKeyListener(kl);

        //CALCULO DE LA EDAD AUTOMATICMANTE
        vista.getJc_fecha_nacPersona().addPropertyChangeListener(pl);

        //BOTONES PRINCIPALES 
        vista.getBtn_insertPersona().addActionListener(l -> preCreacionPersona());
        vista.getBtn_refrescarPersona().addActionListener(l -> cargarTablaPersona());
        vista.getBtn_editarPersona().addActionListener(l -> validarModificacionPersona());
        vista.getBtn_eliminarPersona().addActionListener(l -> validarEliminarPersona());
        vista.getJmenuItem_limpiarCampoPersona().addActionListener(l -> actualizarIntefaz());
    }

    public void preCreacionPersona() {
        if (validarCedulaRepetida(vista.getTxt_cedulaPersona().getText()) == true) {
            crearPersona();
        } else {
            JOptionPane.showMessageDialog(vista, "Esta cedula ya esta registrada", "Error en Cedula", 0);
        }
    }

    /*
     * CRUD EN PERSONA
     */
    //CREATE - CREAR
    private void crearPersona() {

        if (!vista.getTxt_cedulaPersona().getText().isEmpty() && !vista.getTxt_nombrePersona().getText().isEmpty()
                && !vista.getTxt_apellidoPersona().getText().isEmpty() && !vista.getjCmb_generoPresona().getSelectedItem().toString().equals("Seleccionar")
                && !vista.getTxt_telefonoPersona().getText().isEmpty() && !vista.getTxt_correoPersona().getText().isEmpty() && !vista.getTxt_direccionPersona().getText().isEmpty()
                && !((JTextField) vista.getJc_fecha_nacPersona().getDateEditor().getUiComponent()).getText().isEmpty()) {

            ModeloPersona modeloPersona = new ModeloPersona();
            modeloPersona.setCedula(vista.getTxt_cedulaPersona().getText());
            modeloPersona.setNombre(vista.getTxt_nombrePersona().getText());
            modeloPersona.setApellido(vista.getTxt_apellidoPersona().getText());

            modeloPersona.setEdad(Integer.parseInt(vista.getTxt_edadPersona().getText()));
            modeloPersona.setGenero(vista.getjCmb_generoPresona().getSelectedItem().toString());
            modeloPersona.setTelefono(vista.getTxt_telefonoPersona().getText());
            modeloPersona.setCorreo(vista.getTxt_correoPersona().getText());
            modeloPersona.setDireccion(vista.getTxt_direccionPersona().getText());
            modeloPersona.setFecha_nac(((JTextField) vista.getJc_fecha_nacPersona().getDateEditor().getUiComponent()).getText());

            if (modeloPersona.crearPersona()) {
                JOptionPane.showMessageDialog(null, "La Persona ha sido registrada satisfactoriamente", "Resgistro Completado", JOptionPane.PLAIN_MESSAGE, new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
                limpiarCamposPersona();
                cargarTablaPersona();
            } else {
                JOptionPane.showMessageDialog(vista, "Hubo un error al tratar de registrar a la persona", "Error en Registro de Persona", 0);
            }

        } else {
            JOptionPane.showMessageDialog(vista, "Todos los campos deben ser llenados", "Campos Vacios", 2);

        }

    }

    //READ - LEER
    private void cargarTablaPersona() {
        vista.getTxt_cedulaPersona().setEditable(true);
        DefaultTableModel tblModelo = (DefaultTableModel) vista.getTbl_Persona().getModel();
        
        tblModelo.setNumRows(0);
        List<Persona> listaPersona = modelo.leerPersona();

        listaPersona.stream().forEach(p -> {
            String[] persona = {p.getCedula(), p.getNombre(), p.getApellido(),
                p.getCorreo(), p.getDireccion(), p.getFecha_nac(), p.getEdad().toString(),
                p.getTelefono(), p.getGenero()};
            tblModelo.addRow(persona);
        });
        limpiarCamposPersona();
    }

    //UPDATE - MODIFICAR
    public void modificarPersona() {
        if (!vista.getTxt_cedulaPersona().getText().isEmpty() && !vista.getTxt_nombrePersona().getText().isEmpty()
                && !vista.getTxt_apellidoPersona().getText().isEmpty() && !vista.getjCmb_generoPresona().getSelectedItem().toString().equals("Seleccionar")
                && !vista.getTxt_telefonoPersona().getText().isEmpty() && !vista.getTxt_correoPersona().getText().isEmpty() && !vista.getTxt_direccionPersona().getText().isEmpty()
                && !((JTextField) vista.getJc_fecha_nacPersona().getDateEditor().getUiComponent()).getText().isEmpty()) {

            ModeloPersona modeloPersona = new ModeloPersona();
            // mPersona.setCedula(vista.getTxt_cedulaPersona().getText());
            modeloPersona.setNombre(vista.getTxt_nombrePersona().getText());
            modeloPersona.setApellido(vista.getTxt_apellidoPersona().getText());
            modeloPersona.setEdad(Integer.parseInt(vista.getTxt_edadPersona().getText()));
            modeloPersona.setGenero(vista.getjCmb_generoPresona().getSelectedItem().toString());
            modeloPersona.setTelefono(vista.getTxt_telefonoPersona().getText());
            modeloPersona.setCorreo(vista.getTxt_correoPersona().getText());
            modeloPersona.setDireccion(vista.getTxt_direccionPersona().getText());
            modeloPersona.setFecha_nac(((JTextField) vista.getJc_fecha_nacPersona().getDateEditor().getUiComponent()).getText());
            
            if (modeloPersona.modificarPersona(vista.getTxt_cedulaPersona().getText())) {
                JOptionPane.showMessageDialog(null, "Los cambios se guardaron", "Cambios Guardados", JOptionPane.PLAIN_MESSAGE, new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
                limpiarCamposPersona();
                cargarTablaPersona();
            } else {
                JOptionPane.showMessageDialog(vista, "Hubo un error al tratar de modificar a la persona", "Error al modificar a la Persona", 0);
            }
            
        } else {
            JOptionPane.showMessageDialog(vista, "Todos los campos deben ser llenados", "Campos Vacios", 2);
        }

    }

    //DELETE - ELIMINAR
    public void eliminarPersona() {
        ModeloPersona modeloPersona = new ModeloPersona();
        int resultado = JOptionPane.showConfirmDialog(vista, "¿Esta seguro que desea eliminar a esta persona?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resultado == JOptionPane.YES_NO_OPTION) {
            if (modeloPersona.eliminarPersona(vista.getTxt_cedulaPersona().getText())) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado a esta persona", "Depuracion Completada", JOptionPane.PLAIN_MESSAGE, new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
                limpiarCamposPersona();
                cargarTablaPersona();
            } else {
               JOptionPane.showMessageDialog(vista, "Hubo un error al tratar de Eliminar a la persona", "Error al eliminar a la Persona", 0);
           }
        }
    }

    //FILTRAR LA INFORMACION EN LA TABLA
    private void cargarTablaPersona(String cadenaBusqueda) {
        DefaultTableModel tblModelo = (DefaultTableModel) vista.getTbl_Persona().getModel();

        tblModelo.setNumRows(0);
        List<Persona> listaPersona = modelo.leerPersona(cadenaBusqueda);

        listaPersona.stream().forEach(p -> {
            String[] persona = {p.getCedula(), p.getNombre(), p.getApellido(),
                p.getCorreo(), p.getDireccion(), p.getFecha_nac(), p.getEdad().toString(),
                p.getTelefono(), p.getGenero()};
            tblModelo.addRow(persona);
        });

    }

    //FILTRAR INFORMACION EN LOS CUADROS DE DIALOGO
    private void llenarCuadrosDialogoPersona(String cadenaBusqueda) {
        List<Persona> listaPersona = modelo.filtrarInformacionParatxtPersona(cadenaBusqueda);

        listaPersona.stream().forEach(p -> {
            String[] persona = {p.getCedula(), p.getNombre(), p.getApellido(),
                p.getCorreo(), p.getDireccion(), p.getFecha_nac(), p.getEdad().toString(),
                p.getTelefono(), p.getGenero()};

            vista.getTxt_nombrePersona().setText(persona[1]);
            vista.getTxt_apellidoPersona().setText(persona[2]);
            vista.getTxt_correoPersona().setText(persona[3]);
            vista.getTxt_direccionPersona().setText(persona[4]);
            String fecha = persona[5];
            Date sFecha;
            try {
                sFecha = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
                vista.getJc_fecha_nacPersona().setDate(sFecha);
            } catch (ParseException ex) {
                Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.getTxt_edadPersona().setText(persona[6]);
            vista.getTxt_telefonoPersona().setText(persona[7]);
            vista.getjCmb_generoPresona().setSelectedItem(persona[8]);

        });
    }

    //LIMPIAR CAMPOS DE PERSONA
    public void limpiarCamposPersona() {

        vista.getTxt_cedulaPersona().setText(null);
        vista.getTxt_nombrePersona().setText(null);
        vista.getTxt_apellidoPersona().setText(null);
        vista.getTxt_edadPersona().setText(null);
        vista.getjCmb_generoPresona().setSelectedIndex(0);
        vista.getTxt_telefonoPersona().setText(null);
        vista.getTxt_correoPersona().setText(null);
        vista.getTxt_direccionPersona().setText(null);
        ((JTextField) vista.getJc_fecha_nacPersona().getDateEditor().getUiComponent()).setText(null);
        vista.getTxt_filtroPersona().setText(null);

    }

    //MOSTAR LOS REGISTROS SELECCIONADOS DE LAS PERSONAS SELECCIONADAS DE LA TABLA
    public void mostrarRegistroSeleccionadoPersona(MouseEvent event) {
        int seleccionaar = vista.getTbl_Persona().rowAtPoint(event.getPoint());
        vista.getTxt_cedulaPersona().setText(String.valueOf(vista.getTbl_Persona().getValueAt(seleccionaar, 0)));
        vista.getTxt_nombrePersona().setText(String.valueOf(vista.getTbl_Persona().getValueAt(seleccionaar, 1)));
        vista.getTxt_apellidoPersona().setText(String.valueOf(vista.getTbl_Persona().getValueAt(seleccionaar, 2)));
        vista.getTxt_correoPersona().setText(String.valueOf(vista.getTbl_Persona().getValueAt(seleccionaar, 3)));
        vista.getTxt_direccionPersona().setText(String.valueOf(vista.getTbl_Persona().getValueAt(seleccionaar, 4)));
        String fecha = (String) vista.getTbl_Persona().getValueAt(seleccionaar, 5);
        Date sFecha;

        try {
            sFecha = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
            vista.getJc_fecha_nacPersona().setDate(sFecha);
        } catch (ParseException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }

        vista.getTxt_edadPersona().setText(String.valueOf(vista.getTbl_Persona().getValueAt(seleccionaar, 6)));
        vista.getTxt_telefonoPersona().setText(String.valueOf(vista.getTbl_Persona().getValueAt(seleccionaar, 7)));
        vista.getjCmb_generoPresona().setSelectedItem(String.valueOf(vista.getTbl_Persona().getValueAt(seleccionaar, 8)));

    }

    //CALCULAR LA EDAD DE LA NUEVA PERSONA 
    private void calcularEdad(String cadena) {
        String[] matriz = cadena.split("-");
        Calendar hoy = Calendar.getInstance();

        int anios = hoy.get(Calendar.YEAR) - Integer.parseInt(matriz[0]);
        int meses = hoy.get(Calendar.MONTH) - Integer.parseInt(matriz[1]);
        int dias = hoy.get(Calendar.DAY_OF_MONTH) - Integer.parseInt(matriz[2]);
        if (meses < 0 || (meses == 0 && dias < 0)) {
            anios = anios - 1;
        }

        edad = anios;

        if (edad < 18 || edad > 90) {
            JOptionPane.showMessageDialog(vista, "Esta persona puede ser menor de edad, no puede ser ingresada al sistema", "Error en la Edad", 0);
            vista.getTxt_edadPersona().setForeground(Color.red);
            vista.getTxt_edadPersona().setText(String.valueOf(edad));
            vista.getBtn_insertPersona().setEnabled(false);
            vista.getBtn_editarPersona().setEnabled(false);
        } else {
            vista.getTxt_edadPersona().setForeground(Color.black);
            vista.getTxt_edadPersona().setText(String.valueOf(edad));
            vista.getBtn_insertPersona().setEnabled(true);
            vista.getBtn_editarPersona().setEnabled(true);
        }

    }
    
    private void actualizarIntefaz(){
        limpiarCamposPersona();
    }

    //VALIDAR QUE NO HAYA UNA CEDULA REPETIDA
    private boolean validarCedulaRepetida(String cedula) {
        List<Persona> listaPersona = modelo.leerPersona();

        for (int i = 0; i < listaPersona.size(); i++) {
            if (listaPersona.get(i).getCedula().equals(cedula)) {
                JOptionPane.showMessageDialog(vista, "Esta cedula pertenece a una persona que ya ha sido registrada", "Advertencia!", 2);
                return false;
            }
        }
        return true;
    }
    
    private void validarModificacionPersona(){
        if (validaPersonasRegistrada(vista.getTxt_cedulaPersona().getText())==true) {
            modificarPersona();
        }else{
            JOptionPane.showMessageDialog(vista, "Para modificar debe completar el registro", "Advertencia!", 2);
        }
    }
    
    private void validarEliminarPersona(){
        if (validaPersonasRegistrada(vista.getTxt_cedulaPersona().getText())==true) {
            eliminarPersona();
        }else{
            JOptionPane.showMessageDialog(vista, "Debe primero seleccionar un dato para eliminar", "Advertencia!", 2);
        }
    }
}

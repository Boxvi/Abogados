package Controlador.registroUsuario;

import Modelo.usuario.Modelo_Usuario;
import Modelo.*;
import Vista.*;
import Modelo.*;
import Modelo.VistasPSQL.*;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Picture.Picture;

public class Control_RegistroUsuario {

    private Vista_Registro_Usuario v_registro_Usuario;
    private Modelo_Usuario m_modeloUsuario;
    private Image foto;
    private Picture picture = new Picture();

    public Control_RegistroUsuario() {
    }

    public Control_RegistroUsuario(Vista_Registro_Usuario v_registro_Usuario, Modelo_Usuario m_modeloUsuario) {
        System.out.println("HOLA");
        this.v_registro_Usuario = v_registro_Usuario;
        this.m_modeloUsuario = m_modeloUsuario;
        v_registro_Usuario.setVisible(true);
        v_registro_Usuario.getLbl_mensajeContraseña().setVisible(false);
        v_registro_Usuario.getLbl_mensajeUsuario().setVisible(false);
        v_registro_Usuario.getLbl_mensajeContraDialog().setVisible(false);
        v_registro_Usuario.getLbl_mensajeUsuarioDialog().setVisible(false);
    }

    public void inicioControlRegistroUsuario() {
         MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource()==v_registro_Usuario.getTbl_usuarios()) {
                    cargarDatosTXT(e);
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
        
        v_registro_Usuario.getBtn_ListaUsuarios().addActionListener(l -> abrirDialogEditarUS());//AQUI ABRIMOS EL DILOG DE USUARIOS, DONDE PODREMOS VER LA TABLA DE REGISTROS        
        v_registro_Usuario.getBtn_examinarFotoEdit().addActionListener(l -> examinarFoto(v_registro_Usuario.getLbl_fotoRegistroEdit()));//AQUI ABRIMOS EL GESTOR DE ARCHIVOS DE WINDOWS PARA BUSCAR LAS FOTOS DEL USUARIO A INSETAR
        v_registro_Usuario.getBtn_examinarFoto().addActionListener(l -> examinarFoto(v_registro_Usuario.getLbl_fotoRegistro()));//AQUI ABRIMOS EL GESTOR DE ARCHIVOS DE WINDOWS PARA BUSCAR LAS FOTOS DEL USUARIO A EDITAR 
        v_registro_Usuario.getBtn_registrarUsuario().addActionListener(l -> registrarUduario());//CON ESTE BOTON INVOCAMOS AL METODO PARA REGISTRAR UN USUARIO EN LA BDD
        v_registro_Usuario.getBtn_editarUsuario().addActionListener(l -> editarUsuario());//CON ESTE BOTON INVOCAMOS AL METODO PARA EDITAR UN USUARIO 
        v_registro_Usuario.getBtn_eliminarUsuario().addActionListener(l -> eliminarUsuario(null));//CON ESTE BOTON INVOCAMOS AL METODO PARA ELIMINAR A UN USUARIO
        v_registro_Usuario.getTbl_usuarios().addMouseListener(ml);
    }

    void registrarUduario() {
        boolean bandera = true;
        if (validarCamposVacios(1)) { //PRIMER IF VALIDA QUE LOS CAMPOS ESTE LLENOS
            m_modeloUsuario.setCedula(v_registro_Usuario.getTxtCedulaEmp_Registro().getText());
            m_modeloUsuario.setUsuario(v_registro_Usuario.getTxt_NombreUsuario().getText());
            m_modeloUsuario.setContraseña(v_registro_Usuario.getTxt_Contrasenia().getText());
            m_modeloUsuario.setAcceso(v_registro_Usuario.getCmb_TipoU().getSelectedItem().toString());
            m_modeloUsuario.setFoto(foto);
            if (foto == null) { //SEGUNDO IF VALIDA QUE LA FOTO SEA NULL, EN CASO DE SERLO MANDARA UN MENSAJE DE ADVERTENCIA 
                int confirmar = JOptionPane.showOptionDialog(null, "No se ha cargado una imagen de usuario" + "\n¿Esta seguro que desea continuar?", "Confirmacion", JOptionPane.YES_NO_OPTION, 3, null,
                        new Object[]{"Si", "No"}, null);
                if (confirmar == 0) {//TERCER IF VALIDA EL MENSAJE DE CONFIRMACION, 0=SI 1=NO
                    bandera = true;
                } else {
                    bandera = false;
                }
            }
            if (m_modeloUsuario.usuarioRepetido(v_registro_Usuario.getTxt_NombreUsuario().getText())) { //CUARTO IF VALIDA QUE EL NOMBRE DE USARIO NO EXISTA YA DENTRO DE LA BDD
                if (v_registro_Usuario.getTxt_Contrasenia().getText().equals(v_registro_Usuario.getTxt_confirmarContra().getText()) && bandera == true) {
                    //QUINTO IF VALIDA LA CONFIRMACION DE LA CONTRASEÑA

                    if (m_modeloUsuario.gabarUsuario()) {//SEXTO IF VALIDA QUE EL RETORNO DEL METODO grabarUsuario() 
                        JOptionPane.showMessageDialog(v_registro_Usuario, "El usuario se ha registrado satisfactoriamente",
                                "Perfecto", JOptionPane.PLAIN_MESSAGE,
                                new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
                    } else {//SEXTO IF
                        JOptionPane.showMessageDialog(v_registro_Usuario, "Hubo un error al tratar de registrar el usuario", "Error en Registro de Usuario", 0);
                    }
                } else {//QUINTO IF
                    v_registro_Usuario.getLbl_mensajeContraseña().setVisible(true);
                }
            } else {//CUARTO IF
                v_registro_Usuario.getLbl_mensajeUsuario().setVisible(true);
            }
        } else {//PRIMER IF
            JOptionPane.showMessageDialog(v_registro_Usuario, "Todos los campos deben ser llenados", "Campos Vacios", 2);
        }
    }

    void abrirDialogEditarUS() {
        v_registro_Usuario.getVentana_EditarUsuario().setSize(1084, 449);
        v_registro_Usuario.getVentana_EditarUsuario().setLocationRelativeTo(v_registro_Usuario);
        cargarTablaUsuarios();
        v_registro_Usuario.getVentana_EditarUsuario().setVisible(true);
        v_registro_Usuario.getVentana_EditarUsuario().toFront();

    }

    void editarUsuario() {
        if (validarCamposVacios(2)) {//PRIMER IF VALIDA QUE LOS CAMPOS NO ESTE VACIOS
            m_modeloUsuario.setCedula(v_registro_Usuario.getTxtCedula_RegisEdit().getText());
            m_modeloUsuario.setUsuario(v_registro_Usuario.getTxtUsuario_RegisEdit().getText());
            m_modeloUsuario.setContraseña(v_registro_Usuario.getTxtContra_RegisEdit().getText());
            m_modeloUsuario.setAcceso(v_registro_Usuario.getCmb_TipoUedit().getSelectedItem().toString());
            m_modeloUsuario.setFoto(foto);

            if (usuarioRepetino()) {//SEFUNDO IF VALIDA QUE EL NOMBRE DE USARIO INGRESADO NO CONSTE DENTRO DE LA BDD
                if (v_registro_Usuario.getTxtContra_RegisEdit().getText().equals(v_registro_Usuario.getTxtConfirmarContra_RegisEdit().getText())) {
                    //TERCER IF VALIDA LA CONFIRMACION DE LA CONTRASEÑA

                    if (m_modeloUsuario.editar()) {//CUARTO IF VALIDA EL RETORNO DEL METODO editar()
                        JOptionPane.showMessageDialog(v_registro_Usuario, "LISTO",
                                "Perfecto", JOptionPane.PLAIN_MESSAGE,
                                new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));

                    } else {//CUARTO IF
                        JOptionPane.showMessageDialog(v_registro_Usuario, "Hubo un error al tratar de editar el usuario", "Error en Editar de Usuario", 0);
                    }
                } else {//TERCER IF
                    v_registro_Usuario.getLbl_mensajeContraDialog().setVisible(true);
                }

            } else {//SEGUNDO IF
                v_registro_Usuario.getLbl_mensajeUsuarioDialog().setVisible(true);
            }
        } else {//PRIMER IF
            JOptionPane.showMessageDialog(v_registro_Usuario, "Todos los campos deben ser llenados", "Campos Vacios", 2);
        }
    }

    void eliminarUsuario(MouseEvent e) {
        int seleccion=v_registro_Usuario.getTbl_usuarios().rowAtPoint(e.getPoint());
        String id_persona = String.valueOf(v_registro_Usuario.getTbl_usuarios().getValueAt(seleccion, 0));
        m_modeloUsuario.setCod_usu(Integer.parseInt(id_persona));

        int confirmar = JOptionPane.showOptionDialog(null, "Esta seguro que desea eliminar a este usuario", "Confirmacion", JOptionPane.YES_NO_OPTION, 3, null,
                new Object[]{"Si", "No"}, null);
        if (confirmar == 0) {
            //boolean retorno= delete.EliminarPersona();
            //System.out.println(retorno);
            if (m_modeloUsuario.eliminar()) {
                JOptionPane.showMessageDialog(v_registro_Usuario, "El usuario fue eliminado satisfactoriamente");
                cargarTablaUsuarios();
            } else {
                //System.out.println(delete.EliminarPersona());
                JOptionPane.showMessageDialog(v_registro_Usuario, "No se pudo eliminar al usuario", "Error!", 0);
            }
        }
    }

    void cargarTablaUsuarios() {

        Modelo_VistaUsuario m_vUsuario = new Modelo_VistaUsuario();

        DefaultTableModel tblModel;//Estructura JTbable
        tblModel = (DefaultTableModel) v_registro_Usuario.getTbl_usuarios().getModel();
        tblModel.setNumRows(0);
        List<VistaPSQL_Usuario> lista = null;
        lista = m_vUsuario.listarUsuartios();

        lista.stream().forEach(p -> {
            String[] persona = {String.valueOf(p.getCodUsu()),p.getCedula(), p.getNombreEmpl(), p.getNombreUsu(), p.getContraseña(), p.getTipUsu()};
            tblModel.addRow(persona);
        });
    }
    
    void cargarDatosTXT(MouseEvent e){
        int seleccion=v_registro_Usuario.getTbl_usuarios().rowAtPoint(e.getPoint());
        int cod_us=Integer.parseInt(String.valueOf(v_registro_Usuario.getTbl_usuarios().getValueAt(seleccion, 0)));
        v_registro_Usuario.getTxtCedula_RegisEdit().setText(String.valueOf(v_registro_Usuario.getTbl_usuarios().getValueAt(seleccion, 1)));
        v_registro_Usuario.getTxtUsuario_RegisEdit().setText(String.valueOf(v_registro_Usuario.getTbl_usuarios().getValueAt(seleccion, 3)));
        v_registro_Usuario.getTxtContra_RegisEdit().setText(String.valueOf(v_registro_Usuario.getTbl_usuarios().getValueAt(seleccion,  4)));
        v_registro_Usuario.getCmb_TipoUedit().setSelectedItem(String.valueOf(v_registro_Usuario.getTbl_usuarios().getValueAt(seleccion, 5)));
        picture.ParseToIco(m_modeloUsuario.obtenerFoto(cod_us), v_registro_Usuario.getLbl_fotoRegistroEdit());
    }

    void examinarFoto(JLabel label) {
        foto = picture.openPicture(label);
        picture.ParseToIco(foto, label);
    }

    //VALIDACION DEL USUARIO
    boolean usuarioRepetino() {/*METODO PARA VALIDAR QUE EL USARIO INGRESADO NO CONSTE DENTRO DE LA BDD
                                 NOTA: ESTE METODO SERA INVOCADO ANTES DE INSERTAR O EDITAR UN USUARIO
         */
        if (m_modeloUsuario.usuarioRepetido(v_registro_Usuario.getTxtUsuario_RegisEdit().getText())) {
            return true;
        } else {
            return false;
        }
    }

    boolean validarCamposVacios(int menu) {
        /*METODO PARA VALIDAR QUE NO ESTE VACIOS LOS CAMPOS
          NOTA: ESTE METODO SERA INVOCADO ANTES DE INSERTAR O EDITAR UN USUARIO
         */
        if (menu == 1) {
            if (!v_registro_Usuario.getTxtCedulaEmp_Registro().getText().isEmpty()
                    && !v_registro_Usuario.getTxt_NombreUsuario().getText().isEmpty()
                    && !v_registro_Usuario.getTxt_Contrasenia().getText().isEmpty()) {

                return true;
            } else {
                return false;
            }
        } else {
            if (!v_registro_Usuario.getTxtCedula_RegisEdit().getText().isEmpty()
                    && !v_registro_Usuario.getTxtUsuario_RegisEdit().getText().isEmpty()
                    && !v_registro_Usuario.getTxtContra_RegisEdit().getText().isEmpty()) {

                return true;
            } else {
                return false;
            }
        }
    }
}

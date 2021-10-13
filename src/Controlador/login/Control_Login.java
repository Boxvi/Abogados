package Controlador.login;

import Modelo.usuario.Modelo_Usuario;
import Controlador.menuPrincipal.Control_MenuGeneral;
import Modelo.usuario.Usuario;
import Vista.*;
import Modelo.*;
import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import picture.Picture;
/**
 *
 * @author velez
 */
public class Control_Login {

    private Vista_Login vista_login;
    private Modelo_Usuario modelo_usuario;
    private MouseListener mouse;
    private String[] datosUsuario;
    private Picture picture = new Picture();
    
    public Control_Login(Vista_Login vista_login, Modelo_Usuario modelo_usuario) {
        this.vista_login = vista_login;
        this.modelo_usuario = modelo_usuario;

        vista_login.setBackground(new Color(0, 0, 0, 0));
        vista_login.setLocationRelativeTo(null);
        vista_login.setVisible(true);
        vista_login.getBtn_verContaseña().setIcon(new ImageIcon(Vista_Login.class.getResource("/Vista/Imagenes/Icon_ocultarContraseña.png")));
    }

    public void inicioControlLogin() {
        /*Este metodo alojara todos los comportamientos 
        de nuestros botones y demas controladores*/
        mouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == vista_login.getBtn_cerrarLogin()) {
                    System.exit(0);
                }
                if (e.getSource() == vista_login.getBtn_minimizarLogin()) {
                    vista_login.setExtendedState(ICONIFIED);
                }
                if (e.getSource() == vista_login.getBtn_login()) {
                    try {
                        Logeo();
                    } catch (SQLException ex) {
                        Logger.getLogger(Control_Login.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (NullPointerException ex){
                        System.out.println("No hay Datos");
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            //Para cambiar de color al entrar en el area del bonton
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getSource() == vista_login.getBtn_cerrarLogin()) {
                    vista_login.getBtn_cerrarLogin().setContentAreaFilled(true);
                    vista_login.getBtn_cerrarLogin().setBackground(new Color(34, 34, 34));
                }
                if (e.getSource() == vista_login.getBtn_minimizarLogin()) {
                    vista_login.getBtn_minimizarLogin().setContentAreaFilled(true);
                    vista_login.getBtn_minimizarLogin().setBackground(new Color(34, 34, 34));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (e.getSource() == vista_login.getBtn_cerrarLogin()) {
                    vista_login.getBtn_cerrarLogin().setBackground(new Color(234, 234, 234));
                    vista_login.getBtn_cerrarLogin().setContentAreaFilled(false);
                }
                if (e.getSource() == vista_login.getBtn_minimizarLogin()) {
                    vista_login.getBtn_minimizarLogin().setBackground(new Color(234, 234, 234));
                    vista_login.getBtn_minimizarLogin().setContentAreaFilled(false);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }
        };

        vista_login.getBtn_cerrarLogin().addMouseListener(mouse);
        vista_login.getBtn_minimizarLogin().addMouseListener(mouse);
        vista_login.getBtn_verContaseña().addActionListener(l -> verContraseña());
        vista_login.getBtn_login().addMouseListener(mouse);

    }

    void verContraseña() {
        if (vista_login.getBtn_verContaseña().isSelected()) {
            vista_login.getBtn_verContaseña().setIcon(new ImageIcon(Vista_Login.class.getResource("/Vista/Imagenes/Icon_verContraseña.png")));
            vista_login.getTxt_passwordLogin().setEchoChar((char) 0);
        } else {
            vista_login.getBtn_verContaseña().setIcon(new ImageIcon(Vista_Login.class.getResource("/Vista/Imagenes/Icon_ocultarContraseña.png")));
            vista_login.getTxt_passwordLogin().setEchoChar('*');
        }
    }

    void Logeo() throws SQLException {
        try {
            datosUsuario = modelo_usuario.verificarLogin(vista_login.getTxtUsuarioLogin().getText(), vista_login.getTxt_passwordLogin().getText());
            if (datosUsuario[0]==null || datosUsuario[1]==null) {
                JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos o no se encuentran registrados", "ERROR AL INICIAR SESIÓN", ERROR_MESSAGE);
            }else{
                abrirMenuPrincipa();
            }
        } catch (NullPointerException ex) {
            
        }

    }
    void abrirMenuPrincipa(){
        
        //Sacamos la foto y el nombre de usario 
        System.out.println("COD: "+datosUsuario[1]);
        ArrayList<Usuario> usuario=modelo_usuario.listarUsuartios(datosUsuario[1]);
        Icon fotoLbl;
        Vista_Pagina_Principal v_menuP= new Vista_Pagina_Principal();
        Control_MenuGeneral c_menuP= new Control_MenuGeneral(v_menuP);
        c_menuP.inicioControlMenuG();
        v_menuP.getLbl_NombreUsuario().setText(usuario.get(0).getUsuario());
        picture.ParseToIco(usuario.get(0).getFoto(),v_menuP.getLbl_FotoUsuario());
        vista_login.dispose();
    }
}

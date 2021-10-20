/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.menuPrincipal;

import Controlador.registroUsuario.Control_RegistroUsuario;
import Controlador.persona.ControladorPersona;
import Controlador.empleado.ControladorEmpleado;
import Controlador.cliente.ControladorCliente;
import Controlador.juicio.ControladorJuicio;
import Controlador.cita.ControladorCita;
import Controlador.audiencia.ControlAudiencia;
import Controlador.roles.ControladorRol;
import Controlador.reportes.ControladorReportes;
import Vista.*;
import Modelo.persona.*;
import Modelo.usuario.*;
import Modelo.empleado.*;
import Modelo.cliente.*;
import Modelo.juicio.*;
import Modelo.cita.*;
import Modelo.audiencia.*;
import Modelo.rol.*;
import Modelo.ImagenFondo;
import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author velez
 */
public class Control_MenuGeneral {

    private Vista_Pagina_Principal v_MuenuGeneral;
    private MouseListener mouse;
    private ImagenFondo fondo;

    public Control_MenuGeneral() {

    }

    public Control_MenuGeneral(Vista_Pagina_Principal v_MuenuGeneral) {
        this.v_MuenuGeneral = v_MuenuGeneral;
        v_MuenuGeneral.getDesktopPrincipal().setBorder(new ImagenFondo("/Vista/Imagenes2/Imagen_Fondo.jpg"));
        //validarUsuario();
        v_MuenuGeneral.setLocationRelativeTo(null);
        
        v_MuenuGeneral.setVisible(true);

    }

    public void inicioControlMenuG() {
        mouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == v_MuenuGeneral.getBtn_Usuario()) {
                    abrirRegistroUsuario();
                }
                if (e.getSource() == v_MuenuGeneral.getBtn_Persona()) {
                    abrirCRUD_Persona();
                }
                if (e.getSource() == v_MuenuGeneral.getBtn_Empleado()) {
                    abrirCRUD_Empleado();
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Cliente()) {
                    abrirCRUD_Cliente();
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Juicios()) {
                    abririCRUD_Juicio();
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Citas()) {
                    abrirCRUD_Cita();
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Audiencias()) {
                    abrirCRUD_Audiencia();
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Roles()) {
                    abrirCRUD_Roles();
                }
                if (e.getSource() == v_MuenuGeneral.getBtn_Inicio()) {
                    v_MuenuGeneral.getDesktopPrincipal().removeAll();
                    v_MuenuGeneral.getDesktopPrincipal().updateUI();
                }
                
                if (e.getSource() == v_MuenuGeneral.getBtn_Reportes()) {
                    abrirReportes();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            //Para cambiar de color al entrar en el area del bonton
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getSource() == v_MuenuGeneral.getBtn_Usuario()) {
                    v_MuenuGeneral.getPnl_btnAddusuario().setBackground(new Color(11, 11, 11));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Persona()) {
                    v_MuenuGeneral.getPnl_btnAddpersona().setBackground(new Color(11, 11, 11));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Empleado()) {
                    v_MuenuGeneral.getPnl_btnAddempleado().setBackground(new Color(11, 11, 11));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Cliente()) {
                    v_MuenuGeneral.getBtn_Cliente().setBackground(new Color(229, 243, 255));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Juicios()) {
                    v_MuenuGeneral.getBtn_Juicios().setBackground(new Color(229, 243, 255));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Audiencias()) {
                    v_MuenuGeneral.getBtn_Audiencias().setBackground(new Color(229, 243, 255));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Citas()) {
                    v_MuenuGeneral.getBtn_Citas().setBackground(new Color(229, 243, 255));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Reportes()) {
                    v_MuenuGeneral.getBtn_Reportes().setBackground(new Color(229, 243, 255));
                }
                if (e.getSource() == v_MuenuGeneral.getBtn_Roles()) {
                    v_MuenuGeneral.getPnl_btnAddRoles().setBackground(new Color(11, 11, 11));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Inicio()) {
                    v_MuenuGeneral.getPnl_btnInicio().setBackground(new Color(11, 11, 11));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (e.getSource() == v_MuenuGeneral.getBtn_Usuario()) {
                    v_MuenuGeneral.getPnl_btnAddusuario().setBackground(new Color(40, 40, 40));
                }
                if (e.getSource() == v_MuenuGeneral.getBtn_Persona()) {
                    v_MuenuGeneral.getPnl_btnAddpersona().setBackground(new Color(40, 40, 40));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Empleado()) {
                    v_MuenuGeneral.getPnl_btnAddempleado().setBackground(new Color(40, 40, 40));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Cliente()) {
                    v_MuenuGeneral.getBtn_Cliente().setBackground(new Color(40, 40, 40));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Juicios()) {
                    v_MuenuGeneral.getBtn_Juicios().setBackground(new Color(40, 40, 40));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Audiencias()) {
                    v_MuenuGeneral.getBtn_Audiencias().setBackground(new Color(40, 40, 40));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Citas()) {
                    v_MuenuGeneral.getBtn_Citas().setBackground(new Color(40, 40, 40));
                }

                if (e.getSource() == v_MuenuGeneral.getBtn_Reportes()) {
                    v_MuenuGeneral.getBtn_Reportes().setBackground(new Color(40, 40, 40));
                }
                if (e.getSource() == v_MuenuGeneral.getBtn_Roles()) {
                    v_MuenuGeneral.getPnl_btnAddRoles().setBackground(new Color(40, 40, 40));
                }
                if (e.getSource() == v_MuenuGeneral.getBtn_Inicio()) {
                    v_MuenuGeneral.getPnl_btnInicio().setBackground(new Color(40, 40, 40));
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }
        };
        v_MuenuGeneral.getBtn_Usuario().addMouseListener(mouse);
        v_MuenuGeneral.getBtn_Persona().addMouseListener(mouse);
        v_MuenuGeneral.getBtn_Empleado().addMouseListener(mouse);
        v_MuenuGeneral.getBtn_Cliente().addMouseListener(mouse);
        v_MuenuGeneral.getBtn_Juicios().addMouseListener(mouse);
        v_MuenuGeneral.getBtn_Citas().addMouseListener(mouse);
        v_MuenuGeneral.getBtn_Audiencias().addMouseListener(mouse);
        v_MuenuGeneral.getBtn_Roles().addMouseListener(mouse);
        v_MuenuGeneral.getBtn_Inicio().addMouseListener(mouse);
        v_MuenuGeneral.getBtn_Reportes().addMouseListener(mouse);
    }

    void abrirRegistroUsuario() {

        Vista_Registro_Usuario v_registroUsuaurio = new Vista_Registro_Usuario();
        Modelo_Usuario m_modeloUsuario = new Modelo_Usuario();

        v_MuenuGeneral.getDesktopPrincipal().add(v_registroUsuaurio);
        Control_RegistroUsuario c_registroUsuario = new Control_RegistroUsuario(v_registroUsuaurio, m_modeloUsuario);
        c_registroUsuario.inicioControlRegistroUsuario();
    }

    void abrirCRUD_Persona() {
        Vista_CRUD_Persona v_CRUD_Persona = new Vista_CRUD_Persona();
        ModeloPersona m_modeloPersona = new ModeloPersona();

        v_MuenuGeneral.getDesktopPrincipal().add(v_CRUD_Persona);
        ControladorPersona c_controladorPersona = new ControladorPersona(m_modeloPersona, v_CRUD_Persona);
        c_controladorPersona.iniciaControlPersona();
    }

    void abrirCRUD_Empleado() {
        Vista_CRUD_Empleado v_CRUD_Empleado = new Vista_CRUD_Empleado();
        ModeloEmpleado m_modeloEmpleado = new ModeloEmpleado();

        v_MuenuGeneral.getDesktopPrincipal().add(v_CRUD_Empleado);
        ControladorEmpleado c_controlEmpleado = new ControladorEmpleado(m_modeloEmpleado, v_CRUD_Empleado);
        c_controlEmpleado.iniciaControlEmpleado();
    }

    void abrirCRUD_Cliente() {
        Vista_CRUD_Cliente v_CRUD_Cliente = new Vista_CRUD_Cliente();
        ModeloCliente m_modeloCliente = new ModeloCliente();

        v_MuenuGeneral.getDesktopPrincipal().add(v_CRUD_Cliente);
        ControladorCliente c_controlCliente = new ControladorCliente(m_modeloCliente, v_CRUD_Cliente);
        c_controlCliente.iniciaControl();
    }

    void abririCRUD_Juicio() {
        Vista_CRUD_Juicio v_CRUD_Juicio = new Vista_CRUD_Juicio();
        ModeloJuicio m_modeloJuicio = new ModeloJuicio();

        v_MuenuGeneral.getDesktopPrincipal().add(v_CRUD_Juicio);
        ControladorJuicio c_controlJuicio = new ControladorJuicio(m_modeloJuicio, v_CRUD_Juicio);
        c_controlJuicio.iniciaControl();
    }

    void abrirCRUD_Cita() {
        Vista_CRUD_Cita v_CRUD_Cita = new Vista_CRUD_Cita();
        ModeloCita m_modeloCita = new ModeloCita();

        v_MuenuGeneral.getDesktopPrincipal().add(v_CRUD_Cita);
        ControladorCita c_controlCita = new ControladorCita(v_CRUD_Cita, m_modeloCita);
        c_controlCita.iniciaControl();
    }

    void abrirCRUD_Audiencia() {
        Vista_CRUD_Audiencia v_CRUD_Audiencia = new Vista_CRUD_Audiencia();
        ModeloAudiencia m_modeloAudiencia = new ModeloAudiencia();

        v_MuenuGeneral.getDesktopPrincipal().add(v_CRUD_Audiencia);
        ControlAudiencia c_controlAudiencia = new ControlAudiencia(m_modeloAudiencia, v_CRUD_Audiencia);
        c_controlAudiencia.inicioControl();
    }

    void abrirCRUD_Roles() {
        Vista_CRUD_Roles v_CRUD_Roles = new Vista_CRUD_Roles();
        ModeloRol m_modeloRoles = new ModeloRol();

        v_MuenuGeneral.getDesktopPrincipal().add(v_CRUD_Roles);
        ControladorRol c_controlRoles = new ControladorRol(m_modeloRoles, v_CRUD_Roles);
        c_controlRoles.inicioControl();
    }
    
    void abrirReportes(){
        Vista_Reportes v_vistaReportes= new Vista_Reportes();
        v_MuenuGeneral.getDesktopPrincipal().add(v_vistaReportes);
        
        ControladorReportes c_controlReportes= new ControladorReportes(v_vistaReportes);
        c_controlReportes.inicioControlReporte();      
    }

    void validarUsuario() {
        if (v_MuenuGeneral.getLbl_NombreUsuario().getText().equals("Administrador") == false) {
            System.out.println("ESTRO");
            v_MuenuGeneral.getPnl_btnAddempleado().setVisible(false);
            v_MuenuGeneral.getPnl_btnAddpersona().setVisible(false);
            v_MuenuGeneral.getPnl_btnAddusuario().setVisible(false);
            v_MuenuGeneral.getPnl_btnAddRoles().setVisible(false);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.roles;

import Modelo.rol.*;
import Vista.Vista_CRUD_Roles;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author velez
 */
public class ControladorRol {

    private ModeloRol modeloRol;
    private Vista_CRUD_Roles vistaRol;

    public ControladorRol(ModeloRol modeloRol, Vista_CRUD_Roles vistaRol) {
        this.modeloRol = modeloRol;
        this.vistaRol = vistaRol;
        vistaRol.setVisible(true);
        cargarDatos_tabla();
    }

    public void inicioControl() {
        MouseListener ml = new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == vistaRol.getTbl_roles()) {
                    cargarDialogosTxt(e);
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

            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        };
        vistaRol.getBtn_insertarRol().addActionListener(l -> crearRol());
        vistaRol.getBtn_editarRol().addActionListener(l -> editarRol());
        vistaRol.getBtn_eliminarRol().addActionListener(l -> eliminarRol());
        vistaRol.getTbl_roles().addMouseListener(ml);
    }

    void cargarDatos_tabla() {

        DefaultTableModel tblModel;//Estructura JTbable
        tblModel = (DefaultTableModel) vistaRol.getTbl_roles().getModel();
        tblModel.setNumRows(0);
        List<Rol> lista = null;
        lista = modeloRol.Leer();

        lista.stream().forEach(r -> {
            String[] roles = {String.valueOf(r.getCod_rol()), r.getTipo_rol()};
            tblModel.addRow(roles);
        });
    }

    void cargarDialogosTxt(MouseEvent e) {
        int seleccion = vistaRol.getTbl_roles().rowAtPoint(e.getPoint());
        int cod_rol = Integer.parseInt(String.valueOf(vistaRol.getTbl_roles().getValueAt(seleccion, 0)));
        modeloRol.setCod_rol(cod_rol);
        vistaRol.getTxt_nombreRol().setText(String.valueOf(vistaRol.getTbl_roles().getValueAt(seleccion, 1)));
    }

    void crearRol() {
        modeloRol.setTipo_rol(vistaRol.getTxt_nombreRol().getText());
        if (!vistaRol.getTxt_nombreRol().getText().isEmpty()) {
            if (modeloRol.Crear()) {
                JOptionPane.showMessageDialog(vistaRol, "El Rol se ha registrado satisfactoriamente",
                        "Perfecto", JOptionPane.PLAIN_MESSAGE,
                        new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
                cargarDatos_tabla();
                vistaRol.getTxt_nombreRol().setText(null);
            } else {
                JOptionPane.showMessageDialog(vistaRol, "Hubo un error al tratar de registrar el Rol", "Error al Registrar", 0);
            }
        } else {
            JOptionPane.showMessageDialog(vistaRol, "Debe poner un nombre al Rol", "Campo Vacio", 2);
        }
    }

    void editarRol() {
        modeloRol.setTipo_rol(vistaRol.getTxt_nombreRol().getText());
        if (!vistaRol.getTxt_nombreRol().getText().isEmpty()) {
            int confirmar = JOptionPane.showOptionDialog(null, "Se van a realizar cambios en este Rol" + "\n¿Esta seguro que desea continuar?", "Confirmacion", JOptionPane.YES_NO_OPTION, 3, null,
                    new Object[]{"Si", "No"}, null);
            if (confirmar == 0) {
                if (modeloRol.Modificar()) {
                    JOptionPane.showMessageDialog(vistaRol, "Se han guardado los cambios satisfactoriamente",
                            "Perfecto", JOptionPane.PLAIN_MESSAGE,
                            new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
                    cargarDatos_tabla();
                    vistaRol.getTxt_nombreRol().setText(null);
                } else {
                    JOptionPane.showMessageDialog(vistaRol, "Hubo un error al tratar de guardar los cambios", "Error al Editar", 0);
                }
            }

        } else {
            JOptionPane.showMessageDialog(vistaRol, "Debe poner un nombre al Rol", "Campo Vacio", 2);
        }
    }

    void eliminarRol() {
        int confirmar = JOptionPane.showOptionDialog(null, "Se van a eleminar este Rol" + "\n¿Esta seguro que desea continuar?", "Confirmacion", JOptionPane.YES_NO_OPTION, 3, null,
                new Object[]{"Si", "No"}, null);
        if (confirmar == 0) {
            if (modeloRol.Borrar()) {
                JOptionPane.showMessageDialog(vistaRol, "El Rol de a eliminado satisfactoriamente",
                        "Perfecto", JOptionPane.PLAIN_MESSAGE,
                        new ImageIcon(getClass().getResource("/Vista/Imagenes/ico_mensajeOK.png")));
                cargarDatos_tabla();
                vistaRol.getTxt_nombreRol().setText(null);
            } else {
                JOptionPane.showMessageDialog(vistaRol, "Hubo un error al tratar de eliminar el Rol", "Error al Editar", 0);
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.VistasPSQL;

import Modelo.ConexionPG;
import Modelo.usuario.Usuario;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Picture.Picture;

/**
 *
 * @author velez
 */
public class Modelo_VistaUsuario extends VistaPSQL_Usuario {
    private ConexionPG con = new ConexionPG();
    private Picture picture = new Picture();

    public Modelo_VistaUsuario() {
    }

    public Modelo_VistaUsuario(int codUsu, String nombreEmpl, String nombreUsu, String contraseña, String tipUsu, String cedula) {
        super(codUsu, nombreEmpl, nombreUsu, contraseña, tipUsu, cedula);
    }

    public ArrayList<VistaPSQL_Usuario> listarUsuartios(){
        ArrayList<VistaPSQL_Usuario> listaUsuarios= new ArrayList<>();
        String sql= "SELECT codusu, nombreempl, cedulaempl, nombreusu, contrasenia, tipusu";
        sql+=" FROM public.vistausuario";

        ResultSet rs= con.selectConsulta(sql);
        //codUsu,nombreEmpl,nombreUsu,contraseña,tipUsu
        try {
            while(rs.next()){
                VistaPSQL_Usuario vu= new VistaPSQL_Usuario();

                vu.setCodUsu(rs.getInt("codUsu"));
                vu.setNombreEmpl(rs.getString("nombreEmpl"));
                vu.setCedula(rs.getString("cedulaempl"));
                vu.setNombreUsu(rs.getString("nombreUsu"));
                vu.setContraseña(rs.getString("contrasenia"));
                vu.setTipUsu(rs.getString("tipUsu"));
                //u.setFoto(picture.printPicture(rs.getBytes("foto")));
                
                listaUsuarios.add(vu);
            }
            System.out.println(sql);
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuarios;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.usuario;

import Modelo.ConexionPG;
import java.awt.Image;
import java.io.IOException;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.postgresql.util.Base64;
import Picture.Picture;
import Vista.*;

public class Modelo_Usuario extends Usuario {

    private ConexionPG con = new ConexionPG();
    private Picture picture = new Picture();
    private String[] verificar;

    public Modelo_Usuario() {
    }

    public Modelo_Usuario(String cedula, String usuario, String contraseña, Image foto, String acceso) {
        super(cedula, usuario, contraseña, foto, acceso);
    }

    public String[] verificarLogin(String usuario, String contrasenia) throws SQLException {
        verificar = new String[2];
        //usuario, contrasenia
        String sql = "select tip_usu, cod_usuario from usuario where usuario='" + usuario + "' and contrasenia='" + contrasenia + "'";
        System.out.println("123 "+sql);
        ResultSet rs = con.selectConsulta(sql);
        try {
            while (rs.next()) {
                verificar[0] = rs.getString("tip_usu");
                verificar[1] = String.valueOf(rs.getInt("cod_usuario"));
            }
        } catch (SQLException ex) {
            return null;
        } catch (NullPointerException ex) {
            return null;
        }
        rs.close();
        return verificar;
    }

    public boolean gabarUsuario() {
        System.out.println("ES: "+getCedula());
        int codigoEmpl = extraerCodEmpl(getCedula());
        
        String sql;
        String foto64 = null;
        if (getFoto()!=null) {
            foto64 = picture.ParseToB64(getFoto());
        }
        sql = "INSERT INTO public.usuario(cod_empleado, tip_usu, usuario, contrasenia, foto)";
        sql += " VALUES (" + codigoEmpl + ",'" + getAcceso() + "','" + getUsuario() + "','" + getContraseña() + "','" + foto64 + "')";
        System.out.println(sql);
        System.out.println("B");
        return con.insertUpdateDelete(sql);

    }

    public boolean editar() {
        String sql;
        sql = "UPDATE public.usuario";
        if (getFoto() != null) {
            System.out.println("HOLA");
            String foto64 = picture.ParseToB64(getFoto());
            sql += " SET tip_usu='" + getAcceso() + "', usuario='" + getUsuario() + "', contrasenia='" + getContraseña() + "', foto='" + foto64 + "'";
        } else {
            sql += " SET tip_usu='" + getAcceso() + "', usuario='" + getUsuario() + "', contrasenia='" + getContraseña() + "'";
        }
        
        sql += " WHERE cod_empleado=" + extraerCodEmpl(getCedula());
        System.out.println(sql);
        return con.insertUpdateDelete(sql);
    }
    
    public boolean eliminar(){
        String sql;
        sql="DELETE FROM public.usuario WHERE cod_usuario="+getCod_usu();
        return con.insertUpdateDelete(sql);
    }

    private int extraerCodEmpl(String dni) {
        int codigo = 0;
        String sql;
        sql = "SELECT cod_empleado FROM public.empleado";
        sql+=" WHERE cedula='"+dni+"'";
        ResultSet rs = con.selectConsulta(sql);
        try {
            while (rs.next()) {
                codigo = rs.getInt("cod_empleado");
            }
            //IMPORTANTISIMO CERRAR CONEXION.
            rs.close();
            return codigo;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    private String extraerCedula(int condigo_us){
        String cedula=null;
        String sql= "SELECt cedula FROM public.empleado WHERE cod_empleado="+condigo_us;
        ResultSet rs = con.selectConsulta(sql);
        try {
            while (rs.next()) {
                cedula = rs.getString("cedula");
            }
            //IMPORTANTISIMO CERRAR CONEXION.
            rs.close();
            return cedula;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public ArrayList<Usuario> listarUsuartios(String aguja){
        ArrayList<Usuario> listaUsuarios= new ArrayList<>();
        String sql= "SELECT cod_usuario, cod_empleado, tip_usu, usuario, contrasenia, foto";
        sql+=" FROM public.usuario";
        if(aguja!=null){
            sql+=" WHERE cod_usuario="+aguja;
        }
        
        ResultSet rs= con.selectConsulta(sql);
        
        try {
            while(rs.next()){
                Usuario u= new Usuario();
                u.setCod_usu(rs.getInt("cod_usuario"));
                u.setCod_emp(rs.getInt("cod_empleado"));
                u.setAcceso(rs.getString("tip_usu"));
                u.setUsuario(rs.getString("usuario"));
                u.setContraseña(rs.getString("contrasenia"));
                u.setFoto(picture.printPicture(rs.getBytes("foto")));
                
                listaUsuarios.add(u);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
           return listaUsuarios;
    }
    
    public boolean usuarioRepetido(String aguja){
        boolean bandera=false;
        String sql= "select count(nombre) from persona where nombre='"+aguja+"'";
        ResultSet rs= con.selectConsulta(sql);
        try {
            while(rs.next()){
                if (rs.getInt(1)>1) {
                    return false;
                }else{
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("ENTRO EN EXEP");
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
     public Image obtenerFoto(int cod_usuario){
        String sql= "SELECT foto FROM public.usuario WHERE cod_usuario="+cod_usuario;
        ResultSet rs= con.selectConsulta(sql);
        try {
            while(rs.next()){
               return picture.printPicture(rs.getBytes("foto"));
            }
            System.out.println(sql);
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

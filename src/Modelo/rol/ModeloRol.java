/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.rol;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.ConexionPG;

/**
 *
 * @author Boxvi
 */
public class ModeloRol extends Rol {

    ConexionPG con = new ConexionPG();

    public ModeloRol() {
    }

    public ModeloRol(Integer cod_rol, String tipo_rol) {
        super(cod_rol, tipo_rol);
    }

    public boolean Crear() {
        String sqla = "INSERT INTO public.roles(cod_rol, tipo_rol)VALUES ('" + getCod_rol() + "', '" + getTipo_rol() + "');";
        return con.insertUpdateDelete(sqla);
    }

    public List<Rol> Leer() {
        String sqlc = "SELECT * FROM public.roles;";
        ResultSet rs = con.selectConsulta(sqlc);
        List<Rol> lr = new ArrayList<>();
        try {
            while (rs.next()) {
                Rol miRol = new Rol();
                miRol.setCod_rol(rs.getInt("cod_rol"));
                miRol.setTipo_rol(rs.getString("tipo_rol"));
                lr.add(miRol);
            }
            rs.close();
            return lr;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloRol.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Modificar(String Identificador) {
        String sqla = "UPDATE public.roles SET tipo_rol='" + getTipo_rol() + "'"
                + " WHERE cod_rol = '" + Identificador + "';";
        return con.insertUpdateDelete(sqla);
    }

    public boolean Borrar(String Identificador) {
        String sqla = "DELETE FROM public.roles WHERE cod_rol = '" + Identificador + "';";
        return con.insertUpdateDelete(sqla);
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boris;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.modelo.ConexionPG;

/**
 *
 * @author Boxvi
 */
public class modeloRol extends rol {

    ConexionPG con = new ConexionPG();

    public modeloRol() {
    }

    public modeloRol(Integer cod_rol, String tipo_rol) {
        super(cod_rol, tipo_rol);
    }

    public boolean Crear() {
        String sqla = "INSERT INTO public.roles(cod_rol, tipo_rol)VALUES ('" + getCod_rol() + "', '" + getTipo_rol() + "');";
        return con.accion(sqla);
    }

    public List<rol> Leer() {
        String sqlc = "SELECT * FROM public.roles;";
        ResultSet rs = con.consulta(sqlc);
        List<rol> lr = new ArrayList<>();
        try {
            while (rs.next()) {
                rol miRol = new rol();
                miRol.setCod_rol(rs.getInt("cod_rol"));
                miRol.setTipo_rol(rs.getString("tipo_rol"));
                lr.add(miRol);
            }
            rs.close();
            return lr;
        } catch (SQLException ex) {
            Logger.getLogger(modeloRol.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Modificar(String Identificador) {
        String sqla = "UPDATE public.roles SET tipo_rol='" + getTipo_rol() + "'"
                + " WHERE cod_rol = '" + Identificador + "';";
        return con.accion(sqla);
    }

    public boolean Borrar(String Identificador) {
        String sqla = "DELETE FROM public.roles WHERE cod_rol = '" + Identificador + "';";
        return con.accion(sqla);
    }
}

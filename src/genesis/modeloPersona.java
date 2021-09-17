/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesis;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.modelo.ConexionPG;

/**
 *
 * @author Genesis
 */
public class modeloPersona extends Persona{
    ConexionPG con = new ConexionPG();

    public modeloPersona() {
    }

    public modeloPersona(String cedula, String nombre, String apellido, Integer edad, String genero, String telefono, String direccion, Date fecha) {
        super(cedula, nombre, apellido, edad, genero, telefono, direccion, fecha);
    }

    public boolean Crear(){
        String sqla ="INSERT INTO PUBLIC.PERSONA(cedula,nombre,apellido, edad,genero, telefono,direccion,fecha_nac)"
                + "VALUES ('"+ getCedula() +"','"+ getNombre() +"','"+ getApellido()+"','"+ getEdad()+"','"+ getGenero()+"','"+ getTelefono()+"','"+ getDireccion()+"','"+ getFecha_nac()+"')";
        return con.accion(sqla);
    }
    
    
    public List<Persona> Leer() {
        String sqlc = "SELECT * FROM public.Persona;";
        ResultSet rs = con.consulta(sqlc);
        List<Persona> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Persona miPersona = new Persona();
                miPersona.setCedula(rs.getString("cedula"));
                miPersona.setNombre(rs.getString("nombre"));
                miPersona.setApellido(rs.getString("apellido"));
                miPersona.setEdad(rs.getInt("edad"));
                miPersona.setGenero(rs.getString("genero"));
                miPersona.setTelefono(rs.getString("telefono"));
                miPersona.setDireccion(rs.getString("direccion"));
                miPersona.setFecha_nac(rs.getDate("fecha_nac"));
                lp.add(miPersona);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(modeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    public boolean Modificar(String Identificador) {
        String sqla = "UPDATE public.Persona"
                + "SET cedula='" + getCedula() + "', nombre='" + getNombre() + "', apellido='" + getApellido() + "', edad='" + getEdad() + "', genero='" + getGenero() + "', telefono='" + getTelefono() + "',direccion='" + getDireccion() + "',fecha_nac='" + getFecha_nac() + "'"
                + "WHERE cedula='" + Identificador + "'";
        return con.accion(sqla);
    }

    public boolean Borrar(String Identificador) {
        String sqla = "DELETE FROM public.Persona WHERE cedula='" + Identificador + "'";
        return con.accion(sqla);
    }
    
    
}

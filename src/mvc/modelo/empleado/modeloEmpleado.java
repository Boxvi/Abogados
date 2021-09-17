/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.modelo.empleado;

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
public class modeloEmpleado extends empleado{
    ConexionPG con = new ConexionPG();

    public modeloEmpleado() {
    }

    public modeloEmpleado(String codigo_empleado, String cedula, String codigo_rol, String nombre, String apellido, Integer edad, String genero, String telefono, String direccion, Date fecha_nac, double sueldo_empleado, boolean estado) {
        super(codigo_empleado, cedula, codigo_rol, nombre, apellido, edad, genero, telefono, direccion, fecha_nac, sueldo_empleado, estado);
    }
    
    
    public boolean Crear(){
        String sqla ="INSERT INTO public.empleado(codigo_empleado,cedula,codigo_rol,nombre,apellido, edad,genero, telefono,direccion,fecha_nac, sueldo_empleado, estado)"
                + "VALUES ('"+ getCodigo_empleado() +"','"+ getCedula() +"','"+ getCodigo_rol() +"','"+ getNombre() +"','"+ getApellido()+"','"+ getEdad()+"','"+ getGenero()+"','"+ getTelefono()+"','"+ getDireccion()+"','"+ getFecha_nac()+"','"+ getSueldo_empleado() +"','"+ getEstado() +"')";
        return con.accion(sqla);
    }
    
    public List<empleado> Leer() {
        String sqlc = "SELECT * FROM public.empleado;";
        ResultSet rs = con.consulta(sqlc);
        List<empleado> le = new ArrayList<>();
        try {
            while (rs.next()) {
                empleado miEmpleado = new empleado();
                miEmpleado.setCodigo_empleado(rs.getString("codigo_empleado"));
                miEmpleado.setCedula(rs.getString("cedula"));
                miEmpleado.setCodigo_rol(rs.getString("codigo_rol"));
                miEmpleado.setNombre(rs.getString("nombre"));
                miEmpleado.setApellido(rs.getString("apellido"));
                miEmpleado.setEdad(rs.getInt("edad"));
                miEmpleado.setGenero(rs.getString("genero"));
                miEmpleado.setTelefono(rs.getString("telefono"));
                miEmpleado.setDireccion(rs.getString("direccion"));
                miEmpleado.setFecha_nac(rs.getDate("fecha_nac"));
                miEmpleado.setSueldo_empleado(rs.getDouble("sueldo_empleado"));
                miEmpleado.setEstado(rs.getBoolean("estado"));
                le.add(miEmpleado);
            }
            rs.close();
            return le;
        } catch (SQLException ex) {
            Logger.getLogger(modeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public boolean Modificar(String Identificador) {
        String sqla = "UPDATE public.empleado"
                + "SET codigo_empleado='" + getCodigo_empleado() + "', cedula='" + getCedula() + "', codigo_rol='" + getCodigo_rol() + "', nombre='" + getNombre() + "', apellido='" + getApellido() + "', edad='" + getEdad() + "', genero='" + getGenero() + "', telefono='" + getTelefono() + "',direccion='" + getDireccion() + "', fecha_nac='" + getFecha_nac() + "', sueldo_empleado='" + getSueldo_empleado() + "', estado='" + getEstado() + "'"
                + "WHERE codigo_empleado='" + Identificador + "'";
        return con.accion(sqla);
    }

    public boolean Borrar(String Identificador) {
        String sqla = "DELETE FROM public.empleado WHERE codigo_empleado='" + Identificador + "'";
        return con.accion(sqla);
    }
    
    
    
}

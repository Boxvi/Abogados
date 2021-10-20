/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.empleado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.ConexionPG;
import Modelo.persona.Persona;
import Modelo.rol.Rol;

/**
 *
 * @author Boxvi
 */
public class ModeloEmpleado extends Empleado {

    //creaccion de vista
    /*
create or replace view tabla_empleado
(cedula, nombre,apellido,correo,direccion,fecha_nac,edad,telefono,sueldo,estados, tipo_rol) as
(SELECT p.cedula, nombre, apellido, correo, direccion, fecha_nac, edad,telefono, sueldo ,
 case when estado = 'true' then 'ACTIVO' WHEN estado = 'false' then 'INACTIVO' END as estados, tipo_rol 
FROM persona p, empleado e, roles r
WHERE p.cedula = e.cedula and e.cod_rol = r.cod_rol and e.eliminado = true)
     */
    ConexionPG con = new ConexionPG();

    public ModeloEmpleado() {
    }

    public ModeloEmpleado(Integer cod_empleado, String sueldo, boolean estado, Integer tipo_rol) {
        super(cod_empleado, sueldo, estado, tipo_rol);
    }

    /*
     * SENTENCIAS DML CRUD
     */
    //CREATE - CREAR
    public boolean crearEmpleado() {
        String sqla = "INSERT INTO public.empleado"
                + " (cod_empleado, cedula, sueldo, estado, cod_rol, eliminado)"
                + " VALUES ('" + getCod_empleado() + "', '" + getCedula() + "', '" + getSueldo() + "', '" + isEstado()+ "', '" + getCod_rol() + "', true);";

        return con.insertUpdateDelete(sqla);

    }

    //READ - LEER
    public List<Empleado> leerEmpleado() {
        try {
            String sqlc = "select * from tabla_empleado";
            ResultSet rs = con.selectConsulta(sqlc);
            List<Empleado> le = new ArrayList<>();

            while (rs.next()) {
                Empleado miEmpleado = new Empleado();

                miEmpleado.setCedula(rs.getString("cedula"));
                miEmpleado.setNombre(rs.getString("nombre"));
                miEmpleado.setApellido(rs.getString("apellido"));
                miEmpleado.setCorreo(rs.getString("correo"));
                miEmpleado.setDireccion(rs.getString("direccion"));
                miEmpleado.setFecha_nac(rs.getString("fecha_nac"));
                miEmpleado.setEdad(rs.getInt("edad"));
                miEmpleado.setTelefono(rs.getString("telefono"));
                miEmpleado.setSueldo(rs.getString("sueldo"));
                miEmpleado.setGenero(rs.getString("genero"));
                miEmpleado.setEstados(rs.getString("estados"));
                miEmpleado.setTipo_rol(rs.getString("tipo_rol"));
                le.add(miEmpleado);
            }
            rs.close();
            return le;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //UPDATE - MODIFICAR
    public boolean modificarEmpleado(int cod_empleado) {
        String sqla = "UPDATE public.empleado "
                + "SET sueldo='" + getSueldo() + "', estado='" + isEstado() + "', cod_rol= '" + getCod_rol() + "' "
                + "WHERE cod_empleado = '" + cod_empleado + "'";
        return con.insertUpdateDelete(sqla);

    }

    //DELETE - ELIMINAR
    public boolean eliminarEmpleado(int cod_empleado) {
        String sqla = "UPDATE public.empleado "
                + "SET eliminado=false "
                + "WHERE cod_empleado = '" + cod_empleado + "'";
        return con.insertUpdateDelete(sqla);
    }

    /*
     * FILTRO PARA LA INFORMACION
     */
    public List<Empleado> leerEmpleado(String cadenaBusqueda) {
        try {
            String sqlc = "select * from tabla_empleado where cedula like '%" + cadenaBusqueda + "%' "
                    + "or lower(nombre) like lower('%" + cadenaBusqueda + "%') or lower(apellido) like lower('%" + cadenaBusqueda + "%') "
                    + "or telefono like lower('%" + cadenaBusqueda + "%') or lower(estados) like lower ('%" + cadenaBusqueda + "%') "
                    + "or lower(correo) like lower('%" + cadenaBusqueda + "%') or lower(direccion) like lower('%" + cadenaBusqueda + "%') "
                    + "or lower(tipo_rol) like lower('%" + cadenaBusqueda + "%')or lower(genero) like lower('%"+ cadenaBusqueda + "%')";
            ResultSet rs = con.selectConsulta(sqlc);
            List<Empleado> le = new ArrayList<>();

            while (rs.next()) {
                Empleado miEmpleado = new Empleado();

                miEmpleado.setCedula(rs.getString("cedula"));
                miEmpleado.setNombre(rs.getString("nombre"));
                miEmpleado.setApellido(rs.getString("apellido"));
                miEmpleado.setCorreo(rs.getString("correo"));
                miEmpleado.setDireccion(rs.getString("direccion"));
                miEmpleado.setFecha_nac(rs.getString("fecha_nac"));
                miEmpleado.setEdad(rs.getInt("edad"));
                miEmpleado.setTelefono(rs.getString("telefono"));
                miEmpleado.setSueldo(rs.getString("sueldo"));
                miEmpleado.setGenero(rs.getString("genero"));
                miEmpleado.setEstados(rs.getString("estados"));
                miEmpleado.setTipo_rol(rs.getString("tipo_rol"));
                le.add(miEmpleado);
            }
            rs.close();
            return le;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /*
     * RELLENAR LA INFORMACION EN LOS TXT DE LA VISTA PRINCIPAL
     */
    public List<Persona> filtrarInformacionParatxtCliente(String cadenaBusqueda) {
        try {
            String sqlc = "SELECT * FROM public.persona where eliminado = true and cedula = '" + cadenaBusqueda + "' ";
            System.out.println(sqlc);
            ResultSet rs = con.selectConsulta(sqlc);
            List<Persona> lp = new ArrayList<>();

            while (rs.next()) {
                Persona miPersona = new Persona();
                miPersona.setCedula(rs.getString("cedula"));
                miPersona.setNombre(rs.getString("nombre"));
                miPersona.setApellido(rs.getString("apellido"));
                miPersona.setEdad(rs.getInt("edad"));
                miPersona.setGenero(rs.getString("genero"));
                miPersona.setTelefono(rs.getString("telefono"));
                miPersona.setCorreo(rs.getString("correo"));
                miPersona.setDireccion(rs.getString("direccion"));
                miPersona.setFecha_nac(rs.getString("fecha_nac"));
                lp.add(miPersona);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public int ObtenerCodCliente(String cedula) {
        try {
            String sqla = "select cod_empleado from empleado where cedula = '" + cedula + "'";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return rs.getInt("cod_empleado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int contarCodigoEmpleados() {
        try {
            String sqla = "select count(cod_empleado) as contador from empleado";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return rs.getInt("contador") + 1;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int dameCodigoRol(String cadenaBusqueda) {
        try {
            String sqla = "select cod_rol from roles where lower(tipo_rol) like lower('" + cadenaBusqueda + "')";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return rs.getInt("cod_rol");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Rol> obtenerRolesComboBX() {
        try {
            String sqlc = "select tipo_rol from roles";
            ResultSet rs = con.selectConsulta(sqlc);
            List<Rol> lr = new ArrayList<>();
            while (rs.next()) {
                Rol rol = new Rol();
                rol.setTipo_rol(rs.getString("tipo_rol"));
                lr.add(rol);
            }
            rs.close();
            return lr;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //VALIDACIONES
    public List<Empleado> validarCedulasRepetidas() {
        try {
            String sqlc = "SELECT cedula FROM empleado";

            System.out.println(sqlc);
            ResultSet rs = con.selectConsulta(sqlc);
            List<Empleado> lc = new ArrayList<>();

            while (rs.next()) {
                Empleado miEmpleado = new Empleado();
                miEmpleado.setCedula(rs.getString("cedula"));
                lc.add(miEmpleado);
            }
            rs.close();
            return lc;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.cita;

import Modelo.ConexionPG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloCita extends Cita {

    ConexionPG con = new ConexionPG();

    public ModeloCita() {
    }

    public ModeloCita(Integer codigo_c, Integer numero_c, String fecha_c, Date hora_c) {
        super(codigo_c, numero_c, fecha_c, hora_c);
    }

    public List<Cita> filtrarInformacionParatxtCita(String cadenaBusqueda) {
        try {
            String sqlc = "select p.nombre, p.apellido from persona p, cliente c where p.cedula = c.cedula and c.cedula = '" + cadenaBusqueda + "';";
            ResultSet rs = con.selectConsulta(sqlc);
            List<Cita> lc = new ArrayList<>();
            while (rs.next()) {
                Cita cita = new Cita();
                cita.setNombre(rs.getString("nombre"));
                cita.setApellido(rs.getString("apellido"));
                lc.add(cita);
            }
            rs.close();
            return lc;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCita.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Cita> filtrarInformacionParatxtCita1(String cadenaBusqueda) {
        try {
            String sqlc = "select * from vistacita where cedula = '" + cadenaBusqueda + "';";
            ResultSet rs = con.selectConsulta(sqlc);
            List<Cita> lc = new ArrayList<>();
            while (rs.next()) {
                Cita cita = new Cita();
                cita.setNombre(rs.getString("nombre"));
                cita.setApellido(rs.getString("apellido"));
                cita.setFecha_c(rs.getString("fecha_cita"));
                cita.setHora_c(rs.getTime("hora_cita"));
                lc.add(cita);
            }
            rs.close();
            return lc;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCita.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //LEER
    public List<Cita> leerCita() {
        try {
            String sql = "select * from vistacita";
            ResultSet rs = con.selectConsulta(sql);
            List<Cita> lcita = new ArrayList<>();
            while (rs.next()) {
                Cita miCita = new Cita();
                miCita.setNumero_c(rs.getInt("numero_cita"));
                miCita.setCedula(rs.getString("cedula"));
                miCita.setNombre(rs.getString("nombre"));
                miCita.setApellido(rs.getString("apellido"));
                miCita.setFecha_c(rs.getString("fecha_cita"));
                miCita.setHora_c(rs.getTime("hora_cita"));
                lcita.add(miCita);
            }
            rs.close();
            return lcita;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCita.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Cita> leerCita(String cadenaBusqueda ) {
        try {
            String sql = "select * from vistacita where  cedula like '%" + cadenaBusqueda + "%' "
                + "or lower(nombre) like lower('%" + cadenaBusqueda + "%') or lower(apellido) like lower('%" + cadenaBusqueda + "%') ";

            
            ResultSet rs = con.selectConsulta(sql);
            List<Cita> lcita = new ArrayList<>();
            while (rs.next()) {
                Cita miCita = new Cita();
                miCita.setNumero_c(rs.getInt("numero_cita"));
                miCita.setCedula(rs.getString("cedula"));
                miCita.setNombre(rs.getString("nombre"));
                miCita.setApellido(rs.getString("apellido"));
                miCita.setFecha_c(rs.getString("fecha_cita"));
                miCita.setHora_c(rs.getDate("hora_cita"));
                lcita.add(miCita);
            }
            rs.close();
            return lcita;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCita.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //INSERTAR
    public boolean crearCita() {
        String sql = "INSERT INTO public.a_cita"
                + "(cod_cliente, fecha_cita, hora_cita, eliminado)"
                + " VALUES ('" + obtenerCodigoCliente(getCedula()) + "', to_date('" + getFecha_c() + "','yyyy-MM-dd'), to_timestamp('"+getHora_c()+"','HH24:MI'), true);";
        System.out.println(sql);
        return con.insertUpdateDelete(sql);

    }

    //MODIFICAR
    public boolean modificarCita(int numCita) {
        String sql = "UPDATE public.a_cita "
                + "SET fecha_cita= to_date('" + getFecha_c() + "','yyyy-MM-dd'), hora_cita= to_timestamp('" + getHora_c() +"','HH24:MI')"
                + "WHERE numero_cita =" + numCita;
        System.out.println(sql);
        return con.insertUpdateDelete(sql);

    }

    public boolean eliminarCita(int numCita) {
        String sql = "UPDATE public.a_cita "
                + "SET eliminado=false "
                + "WHERE numero_cita =" + numCita;
        return con.insertUpdateDelete(sql);
    }

    public int obtenerCodigoCliente(String cedula) {

        try {
            String sqla = "select cod_cliente from cliente where cedula = '" + cedula + "';";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return rs.getInt("cod_cliente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCita.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }
    
    
    public boolean existeRegistro(String cadenaCedula) {
        try {
            String sql = "select cedula from persona where eliminado = true and cedula ='" + cadenaCedula + "'";
            ResultSet rs = con.selectConsulta(sql);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCita.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
}

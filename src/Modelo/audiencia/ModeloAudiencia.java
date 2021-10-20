/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.audiencia;

import Modelo.ConexionPG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloAudiencia extends Audiencia {

    ConexionPG con = new ConexionPG();

    public ModeloAudiencia() {
    }

    public ModeloAudiencia(String codigo_juicio, String fecha_a, Integer numero_a) {
        super(codigo_juicio, fecha_a, numero_a);
    }

    /*
      SENTENCIAS DML
     */
    //CREAR
    public boolean crearAudiencia() {
        String sql = "INSERT INTO public.audiencia(cod_juicio, fecha_audiencia, eliminado)VALUES ('" + getCodigo_juicio() + "',TO_DATE('" + getFecha_a() + "', 'yyyy-MM-dd'),TRUE)";
        System.out.println(sql);
        return con.insertUpdateDelete(sql);
    }

    public List<Audiencia> leerAudiencia() {
        try {
            String sql = "select * from tabla_audiencia";
            ResultSet rs = con.selectConsulta(sql);
            List<Audiencia> la = new ArrayList<>();
            while (rs.next()) {
                Audiencia miau = new Audiencia();
                miau.setCodigo_juicio(rs.getString("informacion"));
                miau.setFecha_a(rs.getDate("fecha_audiencia").toString());
                miau.setNumero_a(rs.getInt("numero_audiencia"));
                la.add(miau);
            }
            rs.close();
            return la;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloAudiencia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean modificarAudiencia() {
        String sql = "UPDATE public.audiencia\n"
                + "	SET cod_juicio= '" + getCodigo_juicio() + "', fecha_audiencia='" + getFecha_a() + "'\n"
                + "	WHERE numero_audiencia='" + getNumero_a() + "'";

        System.out.println(sql);
        return con.insertUpdateDelete(sql);
    }

    public boolean eliminarAudiencia() {
        if (getNumero_a() != null) {
            String sql = "UPDATE public.audiencia\n"
                    + "	SET  eliminado=false\n"
                    + "	WHERE numero_audiencia='" + getNumero_a() + "'";
            return con.insertUpdateDelete(sql);
        }
        return false;
    }

    public List<Audiencia> leerAudiencia(String cadena) {
        try {
            String sql = "select cod_juicio ||' -'||initcap(nombre)||' '||initcap(apellido)||' -'||initcap(tip_juicio)||' -'||initcap(estado) "
                    + "as informacion, fecha_audiencia, numero_audiencia "
                    + "from juicios j INNER join cliente c using(cod_cliente) "
                    + "inner join audiencia a using (cod_juicio) "
                    + "inner join persona p using(cedula) "
                    + "where j.estado = 'ACTIVO' OR j.estado = 'PASIVO' "
                    + "or lower(nombre) = lower('" + cadena + "') or lower(apellido) = lower('" + cadena + "') "
                    + "or lower(tip_juicio) = lower('" + cadena + "') or lower(estado) = lower('" + cadena + "') ";
            ResultSet rs = con.selectConsulta(sql);
            List<Audiencia> la = new ArrayList<>();
            while (rs.next()) {
                Audiencia miau = new Audiencia();
                miau.setFecha_a(rs.getDate("fecha_aud").toString());
                miau.setNumero_a(rs.getInt("numero_aud"));
                la.add(miau);
            }
            rs.close();
            return la;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloAudiencia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean existeRegistro(String cadenaJuicio) {
        try {
            String sql = "select cod_juicio from juicios where eliminado=true and cod_juicio='" + cadenaJuicio + "'";
            ResultSet rs = con.selectConsulta(sql);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloAudiencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<Audiencia> obtenerInformacionJuiciosComboBX() {
        try {
            String sqlc = "select cod_juicio ||' -'||initcap(nombre)||' '||initcap(apellido)||' -'||initcap(tip_juicio)||' -'||initcap(estado) "
                    + " as informacion from juicios j INNER join cliente c using(cod_cliente) inner join persona p using(cedula)"
                    + " where j.estado = 'ACTIVO' OR j.estado = 'PASIVO'";
            System.out.println(sqlc);
            ResultSet rs = con.selectConsulta(sqlc);
            List<Audiencia> la = new ArrayList<>();
            while (rs.next()) {
                Audiencia audiencia = new Audiencia();
                audiencia.setCodigo_juicio(rs.getString("informacion"));
                la.add(audiencia);
            }
            rs.close();
            return la;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloAudiencia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public String obtenerFechaAudiencia(String cadenaBusqueda) {
        try {
            String sqla = "select fecha_audiencia \n"
                    + "from juicios j INNER join cliente c using(cod_cliente) \n"
                    + "inner join audiencia a using (cod_juicio) \n"
                    + "inner join persona p using(cedula) \n"
                    + "where lower(cod_juicio ||' -'||initcap(nombre)||' '||initcap(apellido)||' -'||initcap(tip_juicio)||' -'||initcap(estado)) "
                    + "= lower('" + cadenaBusqueda + "')";

            //String sqla = "select fecha_audiencia from tabla_audiencia where lower(informacion) = lower('"+cadenaBusqueda+"')";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return rs.getString("fecha_audiencia");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloAudiencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

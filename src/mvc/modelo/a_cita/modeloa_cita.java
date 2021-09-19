/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.modelo.a_cita;

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
 * @author Boxvi
 */
public class modeloa_cita extends a_cita{
    
    ConexionPG con = new ConexionPG();
    
public modeloa_cita() {

    }

    public modeloa_cita(String codigo_cita, Date fecha_cita, int numero_cita) {
        super(codigo_cita, fecha_cita, numero_cita);
    }

    public boolean Crear_cita() {
        String sql = "INSERT INTO cita( cod_cliente, fecha_cita, hora_cita)VALUES ('" + getCodigo_cita() + "', ' " + getFecha_cita() + "', '" + getNumero_cita() + "')";
        return con.accion(sql);
    }

    public List<a_cita> leer() {
        String sqlc = "SELECT * FROM public.cita;";
        ResultSet rs = con.consulta(sqlc);
        List<a_cita> lc = new ArrayList<>();

        try {
            while (rs.next()) {
                a_cita micita = new a_cita();
                micita.setCodigo_cita(rs.getString("codigo_cita"));
                micita.setFecha_cita(rs.getDate("fecha_cita"));
                micita.setNumero_cita(rs.getInt("numero_cita"));
                lc.add(micita);
            }
            rs.close();
            return lc;
        } catch (SQLException ex) {
            Logger.getLogger(modeloa_cita.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Modificar(String identificador) {
        String sql = "UPDATE public.cita"
                + "SET codigo_cita='" + getCodigo_cita() + "', fecha_cita='" + getFecha_cita() + "', hora_cita='" + getNumero_cita() + "'"
                + "WHERE codigo_cita='" + identificador + "'";
        return con.accion(sql);

    }

    public boolean Borrar(String identificador) {
        String sql = "DELETE FROM public.cita WHERE codigo_cita='" + identificador + "'";
        return con.accion(sql);
    }
}

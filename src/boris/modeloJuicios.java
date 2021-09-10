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
public class modeloJuicios extends juicios {

    ConexionPG con = new ConexionPG();

    public modeloJuicios() {
    }

    public modeloJuicios(String cod_juicio, Integer cod_cliente, Integer num_juicio, String tip_juicio, String estado, Integer cod_empleado) {
        super(cod_juicio, cod_cliente, num_juicio, tip_juicio, estado, cod_empleado);
    }

    public boolean Crear() {
        String sqla = "INSERT INTO public.juicios(cod_juicio, cod_cliente, num_juicio, tip_juicio, estado, cod_empleado)VALUES ('" + getCod_juicio() + "','" + getCod_cliente() + "', '" + getNum_juicio() + "', '" + getTip_juicio() + "', '" + getEstado() + "', '" + getCod_empleado() + "')";
        return con.accion(sqla);
    }

    public List<juicios> Leer() {
        String sqlc = "SELECT * FROM public.juicios;";
        ResultSet rs = con.consulta(sqlc);
        List<juicios> lj = new ArrayList<>();

        try {
            while (rs.next()) {
                juicios miJuicio = new juicios();
                miJuicio.setCod_juicio(rs.getString("cod_juicio"));
                miJuicio.setCod_cliente(rs.getInt("con_cliente"));
                miJuicio.setNum_juicio(rs.getInt("num_juicio"));
                miJuicio.setTip_juicio(rs.getString("tip_juicio"));
                miJuicio.setEstado(rs.getString("estado"));
                miJuicio.setCod_empleado(rs.getInt("cod_empleado"));
                lj.add(miJuicio);
            }
            rs.close();
            return lj;
        } catch (SQLException ex) {
            Logger.getLogger(modeloJuicios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean Modificar(String Identificador) {
        String sqla = "UPDATE public.juicios"
                + "SET cod_juicio='" + getCod_juicio() + "', cod_cliente='" + getCod_cliente() + "', num_juicio='" + getNum_juicio() + "', tip_juicio='" + getTip_juicio() + "',, estado='" + getEstado() + "', cod_empleado='" + getCod_empleado() + "'"
                + "WHERE cod_juicio='" + Identificador + "'";
        return con.accion(sqla);
    }

    public boolean Borrar(String Identificador) {
        String sqla = "DELETE FROM public.juicios WHERE cod_juicio='" + Identificador + "'";
        return con.accion(sqla);
    }

}

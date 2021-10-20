package Modelo.interfaces;

import Modelo.ConexionPG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public interface Validaciones {

    ConexionPG con = new ConexionPG();

    public static boolean validaPersonasRegistrada(String cadenaCedula) {
        try {
            String sqla = "select cedula from persona where cedula ='" + cadenaCedula + "'";
            System.out.println(sqla);
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return true;
            }
            rs.close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Validaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean clientesExistentes() {
        try {
            Integer numeros = null;
            String sqla = "SELECT count(cod_cliente) as numero FROM cliente";
            ResultSet rs = con.selectConsulta(sqla);

            while (rs.next()) {
                numeros = rs.getInt("numero");
            }
            if (numeros == 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Validaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean audienciasExistentes(String cadenaCodJuicio) {
        try {
            String sqla = "select cod_juicio from juicios where cod_juicio= '"+cadenaCodJuicio+"'";
            System.out.println(sqla);
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return true;
            }
            rs.close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Validaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }  
}


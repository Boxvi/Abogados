/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Boxvi
 */
public class ConexionPG {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;

    private String cadenaConexion = "jdbc:postgresql://34.95.145.15:5432/postgres";
    private String usuarioPG = "postgres";
    private String contrasenia = "M3A_pf2021";

    public ConexionPG() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(cadenaConexion, usuarioPG, contrasenia);
            //JOptionPane.showMessageDialog(null, "conectamos a la bd");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet consulta(String sqlc) {
        System.out.println(sqlc);

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlc);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean accion(String sqla) {
        System.out.println(sqla);

        try {
            st = con.createStatement();
            boolean rb = st.execute(sqla);
            st.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}

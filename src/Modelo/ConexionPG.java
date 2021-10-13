/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author velez
 */
public class ConexionPG {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    //Datos de Conexion
    private String cadConexion = "jdbc:postgresql://localhost:5432/proyecto_final";
    private String usuario="postgres";
    private String contrasenia="1";
    
    public ConexionPG(){
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Se Cargo Driver.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            con = DriverManager.getConnection(cadConexion, usuario, contrasenia);
            System.out.println("Se conecto DB.");
        } catch (SQLException ex) {
             System.out.println("A1");
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public Connection getConexion()
    {
       return con;
    }
    
    
    public ResultSet selectConsulta(String sqlc){
        try {
            st = con.createStatement();
            rs = st.executeQuery(sqlc);
            return rs;
        } catch (SQLException e) {
            System.out.println("EXE");
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public boolean insertUpdateDelete(String sqla){
        try {
            st=con.createStatement();
            boolean rb=st.execute(sqla);
            st.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("EXEPCION");
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}

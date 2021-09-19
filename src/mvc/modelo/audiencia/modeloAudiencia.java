/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.modelo.audiencia;

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
public class modeloAudiencia extends audiencia{
    
    ConexionPG con = new ConexionPG();
    
    public modeloAudiencia(){
    }
    
    public modeloAudiencia(String codigo_audiencia, Date fecha_aud, String numero_aud, String juez_enca_aud){
        super(codigo_audiencia, fecha_aud, numero_aud, juez_enca_aud);
    }
    
    public boolean Crear_aud(){
        String sql = "INSERT INTO audiencia(cod_juicio, fecha_audiencia) VALUES (?, '" + getFecha_aud() + "')";
        return con.accion(sql);
        
    }
     public List<audiencia> Leer(){
         String sqla = "SELECT * FROM public.audiencia";
         ResultSet rs = con.consulta(sqla);
         List <audiencia> la = new ArrayList();
         
         try{
            while(rs.next()){
                audiencia miaudiencia = new audiencia();
                miaudiencia.setCodigo_audiencia(rs.getString("codigo_audiencia"));
                miaudiencia.setFecha_aud(rs.getDate("fecha_aud"));
                miaudiencia.setJuez_enca_aud(rs.getString("juez_enca_aud"));
                miaudiencia.setNumero_aud(rs.getString("numero_aud"));
                la.add(miaudiencia);
                
            } 
            rs.close();
            return la;
         } catch(SQLException ex){
             Logger.getLogger(modeloAudiencia.class.getName()).log(Level.SEVERE,null, ex);
             return null;
         }

     }
     
     public boolean ModificarA(String identificador){
         String sql = "UPDATE audiencia"
                 + "SET codigo_audiencia='" +getCodigo_audiencia()+"', fecha_audiencia='" +getFecha_aud() +"'"
                 + "WHERE cod_audiencia='" + identificador + "'";
         return con.accion(sql);
     }
     
     public boolean Borrar(String identificador){
         String sql= "DELETE FROM public.cita WHERE codigo_cita='" + identificador + "'";
         return con.accion(sql);
     }
     
}

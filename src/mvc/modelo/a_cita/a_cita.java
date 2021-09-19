/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.modelo.a_cita;

import java.sql.Date;

/**
 *
 * @author Boxvi
 */
public class a_cita {
    
    private String codigo_cita;
    private Date fecha_cita;
    private int numero_cita;

    public a_cita (){
        
    }
    public a_cita(String codigo_cita, Date fecha_cita, int numero_cita) {
        this.codigo_cita = codigo_cita;
        this.fecha_cita = fecha_cita;
        this.numero_cita = numero_cita;
    }

    public String getCodigo_cita() {
        return codigo_cita;
    }

    public void setCodigo_cita(String codigo_cita) {
        this.codigo_cita = codigo_cita;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public int getNumero_cita() {
        return numero_cita;
    }

    public void setNumero_cita(int numero_cita) {
        this.numero_cita = numero_cita;
    }
    
}

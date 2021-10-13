
package Modelo.cita;

import Modelo.persona.Persona;
import java.util.Date;

public class Cita extends Persona{
    
    
    private Integer codigo_c,numero_c;
    private String fecha_c;
    private Date hora_c;

    public Cita() {
    }
    
    public Cita(Integer codigo_c, Integer numero_c, String fecha_c, Date hora_c) {
        this.codigo_c = codigo_c;
        this.numero_c = numero_c;
        this.fecha_c = fecha_c;
        this.hora_c = hora_c;
    }

    public Integer getCodigo_c() {
        return codigo_c;
    }

    public void setCodigo_c(Integer codigo_c) {
        this.codigo_c = codigo_c;
    }

    public Integer getNumero_c() {
        return numero_c;
    }

    public void setNumero_c(Integer numero_c) {
        this.numero_c = numero_c;
    }

    public String getFecha_c() {
        return fecha_c;
    }

    public void setFecha_c(String fecha_c) {
        this.fecha_c = fecha_c;
    }

    public Date getHora_c() {
        return hora_c;
    }

    public void setHora_c(Date hora_c) {
        this.hora_c = hora_c;
    }

    
}


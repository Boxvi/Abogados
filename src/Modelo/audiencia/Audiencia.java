/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.audiencia;

import Modelo.juicio.Juicio;
import java.util.Date;

public class Audiencia{
    private String codigo_juicio;
    private String fecha_a;
    private Integer numero_a;

    public Audiencia() {
    }
    
    public Audiencia(String codigo_juicio, String fecha_a, Integer numero_a) {
        this.codigo_juicio = codigo_juicio;
        this.fecha_a = fecha_a;
        this.numero_a = numero_a;
    }

    public String getCodigo_juicio() {
        return codigo_juicio;
    }

    public void setCodigo_juicio(String codigo_juicio) {
        this.codigo_juicio = codigo_juicio;
    }

    public String getFecha_a() {
        return fecha_a;
    }

    public void setFecha_a(String fecha_a) {
        this.fecha_a = fecha_a;
    }

    public Integer getNumero_a() {
        return numero_a;
    }

    public void setNumero_a(Integer numero_a) {
        this.numero_a = numero_a;
    } 
}
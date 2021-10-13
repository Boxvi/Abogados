/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.juicio;

import Modelo.persona.Persona;

public class Juicio extends Persona{

    private String cod_juicio;
    private Integer cod_cliente;
    private Integer num_juicio;
    private String tip_juicio;
    private String estado;
    private Integer cod_empleado;
    
    private String nombre_apellido;

    public Juicio() {
    }

    public Juicio(String cod_juicio, Integer cod_cliente, Integer num_juicio, String tip_juicio, String estado, Integer cod_empleado) {
        this.cod_juicio = cod_juicio;
        this.cod_cliente = cod_cliente;
        this.num_juicio = num_juicio;
        this.tip_juicio = tip_juicio;
        this.estado = estado;
        this.cod_empleado = cod_empleado;
    }

    public String getCod_juicio() {
        return cod_juicio;
    }

    public void setCod_juicio(String cod_juicio) {
        this.cod_juicio = cod_juicio;
    }

    public Integer getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(Integer cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public Integer getNum_juicio() {
        return num_juicio;
    }

    public void setNum_juicio(Integer num_juicio) {
        this.num_juicio = num_juicio;
    }

    public String getTip_juicio() {
        return tip_juicio;
    }

    public void setTip_juicio(String tip_juicio) {
        this.tip_juicio = tip_juicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(Integer cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

}

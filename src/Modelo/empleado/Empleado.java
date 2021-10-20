/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.empleado;

import Modelo.persona.Persona;

public class Empleado extends Persona {

    private Integer cod_empleado;
    private String sueldo;
    private boolean estado;
    private Integer cod_rol;

    private String tipo_rol;
    private String estados;
    private String genero;

    public Empleado() {
    }

    public Empleado(Integer cod_empleado, String sueldo, boolean estado, Integer tipo_rol) {
        this.cod_empleado = cod_empleado;
        this.sueldo = sueldo;
        this.estado = estado;
        this.cod_rol = cod_rol;
    }
    
    public Integer getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(Integer cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getEstados() {
        return estados;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

    public Integer getCod_rol() {
        return cod_rol;
    }

    public void setCod_rol(Integer cod_rol) {
        this.cod_rol = cod_rol;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}

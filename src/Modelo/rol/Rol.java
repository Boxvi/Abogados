/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.rol;

public class Rol {

    private Integer cod_rol;
    private String tipo_rol;

    public Rol() {
    }

    public Rol(Integer cod_rol, String tipo_rol) {
        this.cod_rol = cod_rol;
        this.tipo_rol = tipo_rol;
    }

    public Integer getCod_rol() {
        return cod_rol;
    }

    public void setCod_rol(Integer cod_rol) {
        this.cod_rol = cod_rol;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

}
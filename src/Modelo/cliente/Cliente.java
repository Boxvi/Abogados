/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.cliente;

import Modelo.persona.Persona;

public class Cliente extends Persona {

    private Integer cod_cliente;
    private String estado_civil;

    public Cliente() {
    }

    public Cliente(Integer cod_cliente, String estado_civil) {
        this.cod_cliente = cod_cliente;
        this.estado_civil = estado_civil;
    }

    public Integer getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(Integer cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
}

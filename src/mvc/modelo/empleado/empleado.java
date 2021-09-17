/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.modelo.empleado;

import java.sql.Date;
import mvc.modelo.persona.persona;

/**
 *
 * @author Genesis
 */
public class empleado extends persona {
    private String codigo_empleado;
    private String codigo_rol;
    private double sueldo_empleado; 
    private boolean estado;

    public empleado() {
    }
    
    public empleado(String codigo_empleado, String cedula, String codigo_rol, String nombre, String apellido, Integer edad, String genero, String telefono, String direccion, Date fecha_nac,double sueldo_empleado, boolean estado ) {
        super(cedula, nombre, apellido, edad, genero, telefono, direccion, fecha_nac);
        this.codigo_empleado = codigo_empleado;
        this.codigo_rol = codigo_rol;
        this.sueldo_empleado = sueldo_empleado;
        this.estado = estado;
    }

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getCodigo_rol() {
        return codigo_rol;
    }

    public void setCodigo_rol(String codigo_rol) {
        this.codigo_rol = codigo_rol;
    }

    public double getSueldo_empleado() {
        return sueldo_empleado;
    }

    public void setSueldo_empleado(double sueldo_empleado) {
        this.sueldo_empleado = sueldo_empleado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}

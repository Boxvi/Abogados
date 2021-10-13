/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.VistasPSQL;

/**
 *
 * @author velez
 */
public class VistaPSQL_Usuario {
    
    private int codUsu;
    private String nombreEmpl,nombreUsu,contraseña,tipUsu,cedula;

    public VistaPSQL_Usuario() {
    }

    public VistaPSQL_Usuario(int codUsu, String nombreEmpl, String nombreUsu, String contraseña, String tipUsu, String cedula) {
        this.codUsu = codUsu;
        this.nombreEmpl = nombreEmpl;
        this.nombreUsu = nombreUsu;
        this.contraseña = contraseña;
        this.tipUsu = tipUsu;
        this.cedula = cedula;
    }

    public int getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(int codUsu) {
        this.codUsu = codUsu;
    }

    public String getNombreEmpl() {
        return nombreEmpl;
    }

    public void setNombreEmpl(String nombreEmpl) {
        this.nombreEmpl = nombreEmpl;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipUsu() {
        return tipUsu;
    }

    public void setTipUsu(String tipUsu) {
        this.tipUsu = tipUsu;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
      
}

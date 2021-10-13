
package Modelo.usuario;

import java.awt.Image;

/**
 *
 * @author velez
 */
public class Usuario {
    private int cod_emp, cod_usu;
    private String cedula;
    private String usuario;
    private String contraseña;
    private Image foto;
    private String acceso;

    public Usuario() {
    }

    public Usuario(String cedula, String usuario, String contraseña, Image foto, String acceso) {
        this.cedula = cedula;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.foto = foto;
        this.acceso = acceso;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public int getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(int cod_emp) {
        this.cod_emp = cod_emp;
    }

    public int getCod_usu() {
        return cod_usu;
    }

    public void setCod_usu(int cod_usu) {
        this.cod_usu = cod_usu;
    }
    
    
}

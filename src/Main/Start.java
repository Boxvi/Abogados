/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//import Controlador.*;

import Modelo.usuario.Modelo_Usuario;
import Controlador.login.Control_Login;
import Modelo.*;
import Vista.*;

//import Modelo.*;
//import Vista.*;

/**
 *
 * @author velez
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ConexionPG prueba= new ConexionPG();
        Vista_Login v_login= new Vista_Login();
        Modelo_Usuario m_Usiario= new Modelo_Usuario();
        Control_Login c_login= new Control_Login(v_login,m_Usiario);
        c_login.inicioControlLogin();
    }
    
}

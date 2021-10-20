
package Modelo.persona;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.ConexionPG;

/**
 *
 * @author Boxvi
 */
public class ModeloPersona extends Persona {

    ConexionPG con = new ConexionPG();

    public ModeloPersona() {
    }

    public ModeloPersona(String cedula, String nombre, String apellido, String correo, Integer edad, String genero, String telefono, String direccion, String fecha_nac) {
        super(cedula, nombre, apellido, correo, edad, genero, telefono, direccion, fecha_nac);
    }

    /*
     * SENTENCIAS DML CRUD
     */
     //CREATE - CREAR
    public boolean crearPersona() {
        String sqla = "INSERT INTO public.persona(cedula, nombre, apellido, edad, genero, telefono, correo, direccion, fecha_nac, eliminado)"
                + "VALUES ('" + getCedula() + "', '" + getNombre() + "', '" + getApellido() + "', '" + getEdad() + "', '" + getGenero() + "', '" + getTelefono() + "', '" + getCorreo() + "', '" + getDireccion() + "',to_date('" + getFecha_nac() + "','yyyy-MM-dd'), true);";
        return con.insertUpdateDelete(sqla);
    }

     //READ - LEER
    public List<Persona> leerPersona() {
        //"SELECT * FROM public.persona where eliminado = true;"
        String sqlc = "SELECT * FROM public.persona where eliminado = true;";
        ResultSet rs = con.selectConsulta(sqlc);
        List<Persona> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Persona miPersona = new Persona();
                miPersona.setCedula(rs.getString("cedula"));
                miPersona.setNombre(rs.getString("nombre"));
                miPersona.setApellido(rs.getString("apellido"));
                miPersona.setEdad(rs.getInt("edad"));
                miPersona.setGenero(rs.getString("genero"));
                miPersona.setTelefono(rs.getString("telefono"));
                miPersona.setCorreo(rs.getString("correo"));
                miPersona.setDireccion(rs.getString("direccion"));
                miPersona.setFecha_nac(rs.getString("fecha_nac"));

                lp.add(miPersona);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //UPDATE - MODIFICAR
    public boolean modificarPersona(String identificadorCedula) {

        String sqla = "UPDATE public.persona "
                + "SET nombre='" + getNombre() + "', apellido='" + getApellido() + "', edad= '" + getEdad() + "', genero='" + getGenero() + "', telefono='" + getTelefono() + "', correo='" + getCorreo() + "', direccion='" + getDireccion() + "', fecha_nac= to_date('" + getFecha_nac() + "','yyyy-MM-dd') "
                + "WHERE cedula='" + identificadorCedula + "'";
        return con.insertUpdateDelete(sqla);
    }

    //DELETE - ELIMINAR
    public boolean eliminarPersona(String identificadorCedula) {

        String sqla = "UPDATE public.persona "
                + "SET eliminado=false "
                + "WHERE cedula='" + identificadorCedula + "'";

        return con.insertUpdateDelete(sqla);
    }

    /*
     * FILTRO PARA LA INFORMACION
     */
    public List<Persona> leerPersona(String cadenaBusqueda) {
        String sqlc = "SELECT * FROM public.persona where eliminado = true and cedula like '%" + cadenaBusqueda + "%' "
                + "or lower(nombre) like lower('%" + cadenaBusqueda + "%') or lower(apellido) like lower('%" + cadenaBusqueda + "%') "
                + "or lower(genero) like lower('%" + cadenaBusqueda + "%') "
                + "or telefono like lower('%" + cadenaBusqueda + "%') or lower(correo) like lower('%" + cadenaBusqueda + "%') "
                + "or lower(direccion) like lower('%" + cadenaBusqueda + "%')";

        ResultSet rs = con.selectConsulta(sqlc);
        List<Persona> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Persona miPersona = new Persona();
                miPersona.setCedula(rs.getString("cedula"));
                miPersona.setNombre(rs.getString("nombre"));
                miPersona.setApellido(rs.getString("apellido"));
                miPersona.setEdad(rs.getInt("edad"));
                miPersona.setGenero(rs.getString("genero"));
                miPersona.setTelefono(rs.getString("telefono"));
                miPersona.setCorreo(rs.getString("correo"));
                miPersona.setDireccion(rs.getString("direccion"));
                miPersona.setFecha_nac(rs.getString("fecha_nac"));
                lp.add(miPersona);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /*
     * RELLENAR LA INFORMACION EN LOS TXT DE LA VISTA PRINCIPAL
     */
    public List<Persona> filtrarInformacionParatxtPersona(String cadenaBusqueda) {
        try {
            String sqlc = "SELECT * FROM public.persona where eliminado = true and cedula = '" + cadenaBusqueda + "' ";
            System.out.println(sqlc);
            ResultSet rs = con.selectConsulta(sqlc);
            List<Persona> lp = new ArrayList<>();

            while (rs.next()) {
                Persona miPersona = new Persona();
                miPersona.setCedula(rs.getString("cedula"));
                miPersona.setNombre(rs.getString("nombre"));
                miPersona.setApellido(rs.getString("apellido"));
                miPersona.setEdad(rs.getInt("edad"));
                miPersona.setGenero(rs.getString("genero"));
                miPersona.setTelefono(rs.getString("telefono"));
                miPersona.setCorreo(rs.getString("correo"));
                miPersona.setDireccion(rs.getString("direccion"));
                miPersona.setFecha_nac(rs.getString("fecha_nac"));
                lp.add(miPersona);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}

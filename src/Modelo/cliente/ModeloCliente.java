
package Modelo.cliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.ConexionPG;
import Modelo.persona.ModeloPersona;
import Modelo.persona.Persona;

/**
 *
 * @author Boxvi
 */
public class ModeloCliente extends Cliente {

    //Creaccion de una vista para el correcto funcionamiento
    /*
Create or replace view tabla_cliente 
(cedula, nombre, apellido, correo, direccion, fecha_nac, edad, telefono, genero, e_civil) as 
(SELECT p.cedula, nombre, apellido, correo, direccion, fecha_nac, edad, telefono,genero, e_civil 
FROM persona p, cliente c 
WHERE p.cedula = c.cedula and c.eliminado = true);
     */
    ConexionPG con = new ConexionPG();

    public ModeloCliente() {
    }

    public ModeloCliente(Integer cod_cliente, String estado_civil) {
        super(cod_cliente, estado_civil);
    }

    /*
     * SENTENCIAS DML CRUD
     */
    //CREATE - CREAR
    public boolean crearCliente() {
        String sqla = "INSERT INTO public.cliente(cod_cliente, cedula, e_civil, eliminado)"
                + " VALUES ('" + getCod_cliente() + "', '" + getCedula() + "', '" + getEstado_civil() + "', true);";
        return con.insertUpdateDelete(sqla);
    }

    //READ - LEER
    public List<Cliente> leerCliente() {
        try {
            String sqlc = "Select * from tabla_cliente";
            ResultSet rs = con.selectConsulta(sqlc);
            List<Cliente> lc = new ArrayList<>();
            while (rs.next()) {
                Cliente miCliente = new Cliente();
                miCliente.setCedula(rs.getString("cedula"));
                miCliente.setNombre(rs.getString("nombre"));
                miCliente.setApellido(rs.getString("apellido"));
                miCliente.setCorreo(rs.getString("correo"));
                miCliente.setDireccion(rs.getString("direccion"));
                miCliente.setFecha_nac(rs.getString("fecha_nac"));
                miCliente.setEdad(rs.getInt("edad"));
                miCliente.setTelefono(rs.getString("telefono"));
                miCliente.setGenero(rs.getString("genero"));
                miCliente.setEstado_civil(rs.getString("e_civil"));

                lc.add(miCliente);
            }
            rs.close();
            return lc;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //UPDATE - MODIFICAR
    public boolean modificarCliente(String cod_Cliente) {
        String sqla = "UPDATE public.cliente "
                + "SET e_civil='" + getEstado_civil() + "' "
                + "WHERE cod_cliente = '" + cod_Cliente + "'";
        return con.insertUpdateDelete(sqla);
    }

    //DELETE - ELIMINAR
    public boolean eliminarCliente(String cod_Cliente) {
        String sqla = "UPDATE public.cliente "
                + "SET eliminado= false "
                + "WHERE cod_cliente = '" + cod_Cliente + "'";
        return con.insertUpdateDelete(sqla);
    }

    /*
     * FILTRO PARA LA INFORMACION
     */
    public List<Cliente> leerCliente(String cadenaBusqueda) {
        try {

            String sqlc = "Select * from tabla_cliente where cedula = '" + cadenaBusqueda + "' "
                    + "or lower(nombre) like lower('%" + cadenaBusqueda + "%') or lower(apellido) like lower('%" + cadenaBusqueda + "%') "
                    + "or lower(genero) like lower('%" + cadenaBusqueda + "%') or telefono = '" + cadenaBusqueda + "'"
                    + "or lower(correo) like lower('%" + cadenaBusqueda + "%') or lower(direccion) like lower('%" + cadenaBusqueda + "%') "
                    + "or lower(e_civil) like lower('%" + cadenaBusqueda + "%')";
            ResultSet rs = con.selectConsulta(sqlc);
            List<Cliente> lc = new ArrayList<>();
            while (rs.next()) {
                Cliente miCliente = new Cliente();
                miCliente.setCedula(rs.getString("cedula"));
                miCliente.setNombre(rs.getString("nombre"));
                miCliente.setApellido(rs.getString("apellido"));
                miCliente.setCorreo(rs.getString("correo"));
                miCliente.setDireccion(rs.getString("direccion"));
                miCliente.setFecha_nac(rs.getString("fecha_nac"));
                miCliente.setEdad(rs.getInt("edad"));
                miCliente.setTelefono(rs.getString("telefono"));
                miCliente.setGenero(rs.getString("genero"));
                miCliente.setEstado_civil(rs.getString("e_civil"));

                lc.add(miCliente);
            }
            rs.close();
            return lc;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /*
     * RELLENAR LA INFORMACION EN LOS TXT DE LA VISTA PRINCIPAL
     */
    public List<Cliente> filtrarInformacionParatxtPersona(String cadenaBusqueda) {
        try {
            String sqlc = "SELECT * FROM public.persona where eliminado = true and cedula = '" + cadenaBusqueda + "' ";
            System.out.println(sqlc);
            ResultSet rs = con.selectConsulta(sqlc);
            List<Cliente> lp = new ArrayList<>();

            while (rs.next()) {
                Cliente miCliente = new Cliente();
                miCliente.setCedula(rs.getString("cedula"));
                miCliente.setNombre(rs.getString("nombre"));
                miCliente.setApellido(rs.getString("apellido"));
                miCliente.setEdad(rs.getInt("edad"));
                miCliente.setGenero(rs.getString("genero"));
                miCliente.setTelefono(rs.getString("telefono"));
                miCliente.setCorreo(rs.getString("correo"));
                miCliente.setDireccion(rs.getString("direccion"));
                miCliente.setFecha_nac(rs.getString("fecha_nac"));
                lp.add(miCliente);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Cliente> filtrarInformacionParaTxtCliente(String cadenaBusqueda) {

        try {
            String sqlc = "Select * from tabla_cliente where cedula ='" + cadenaBusqueda + "'";
            System.out.println(sqlc);
            ResultSet rs = con.selectConsulta(sqlc);
            List<Cliente> lc = new ArrayList<>();
            while (rs.next()) {
                Cliente miCliente = new Cliente();
                miCliente.setCedula(rs.getString("cedula"));
                miCliente.setNombre(rs.getString("nombre"));
                miCliente.setApellido(rs.getString("apellido"));
                miCliente.setEdad(rs.getInt("edad"));
                miCliente.setGenero(rs.getString("genero"));
                miCliente.setTelefono(rs.getString("telefono"));
                miCliente.setCorreo(rs.getString("correo"));
                miCliente.setDireccion(rs.getString("direccion"));
                miCliente.setFecha_nac(rs.getString("fecha_nac"));
                miCliente.setGenero(rs.getString("e_civil"));

                lc.add(miCliente);
            }
            rs.close();
            return lc;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //codigo autoincremental
    public int asignarCodigoCliente() {
        try {
            String sqla = "select count(cod_cliente) as contador from cliente";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return (rs.getInt("contador") + 1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    //MODELO PARA OBTENER EL CODIGO DE LOS CLIENTES POR LA CEDULA
    public int obtenerCodigoCliente(String cedula) {

        try {
            String sqla = "select cod_cliente from cliente where cedula = '" + cedula + "';";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return rs.getInt("cod_cliente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    //metodo para indicar si existe un registro de la cedula en la base de datos
    public boolean exiteRegistro(String cadenaCedula) {
        try {
            String sqlc = "select cedula from persona where eliminado = true and cedula ='" + cadenaCedula + "';";
            ResultSet rs = con.selectConsulta(sqlc);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
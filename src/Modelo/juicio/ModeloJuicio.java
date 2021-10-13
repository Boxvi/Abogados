
package Modelo.juicio;

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
public class ModeloJuicio extends Juicio {

    ConexionPG con = new ConexionPG();

    public ModeloJuicio() {
    }

    public ModeloJuicio(String cod_juicio, Integer cod_cliente, Integer num_juicio, String tip_juicio, String estado, Integer cod_empleado) {
        super(cod_juicio, cod_cliente, num_juicio, tip_juicio, estado, cod_empleado);
    }

    /*
     * SENTENCIAS DML CRUD
     */
    //CREATE - CREAR
    public boolean crearJuicios() {
        String sqla = "INSERT INTO public.juicios"
                + "(cod_juicio, cod_cliente, num_juicio, tip_juicio, estado, cod_empleado,eliminado)"
                + "VALUES ('" + contarCodigoJuicio() + "','" + obtenerCodigoCliente(getCedula()) + "', '" + contarNumeroJuicios() + "', '" + getTip_juicio() + "', '" + getEstado() + "','" + obtenerCodigoEmpleado(getNombre_apellido()) + "', true)";
        return con.insertUpdateDelete(sqla);
    }

    //READ - LEER
    public List<Juicio> Leer() {
        String sqlc = "select * from tabla_juicios ";

        ResultSet rs = con.selectConsulta(sqlc);
        List<Juicio> lj = new ArrayList<>();
        try {
            while (rs.next()) {
                Juicio miJuicio = new Juicio();

                miJuicio.setCod_juicio(rs.getString("cod_juicio"));
                miJuicio.setCedula(rs.getString("cedula"));
                miJuicio.setNombre(rs.getString("nombre"));
                miJuicio.setApellido(rs.getString("apellido"));
                miJuicio.setNombre_apellido(rs.getString("Nombre_abogado"));
                miJuicio.setTip_juicio(rs.getString("tip_juicio"));
                miJuicio.setEstado(rs.getString("estado"));

                lj.add(miJuicio);
            }
            rs.close();
            return lj;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloJuicio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //UPDATE - MODIFICAR
    public boolean modificarJuicios(String Identificador) {
        String sqla = "UPDATE public.juicios"
                + " SET cod_cliente='" + obtenerCodigoCliente(getCedula()) + "', tip_juicio='" + getTip_juicio() + "', estado='" + getEstado() + "', cod_empleado='" + obtenerCodigoEmpleado(getNombre_apellido()) + "'"
                + " WHERE cod_juicio='" + Identificador + "'";
        return con.insertUpdateDelete(sqla);
    }

    //DELETE - ELIMINAR
    public boolean eliminarJuicios(String Identificador) {

        String sqla = "UPDATE public.juicios"
                + " SET eliminado = false "
                + " WHERE cod_juicio='" + Identificador + "'";
        return con.insertUpdateDelete(sqla);
    }

    //MODELO PARA FILTRAR LA INFORMACION 
    public List<Juicio> leerJuicios(String cadenaBusqueda) {
        String sqlc = "select * from tabla_juicios where lower(cod_juicio) like lower('%" + cadenaBusqueda + "%') "
                + "or cedula like ('%" + cadenaBusqueda + "%') or lower(nombre) like lower('%" + cadenaBusqueda + "%') "
                + "or lower(apellido) like lower('%" + cadenaBusqueda + "%') or lower(nombre_abogado) like lower('%" + cadenaBusqueda + "%') "
                + "or lower(tip_juicio) like lower('%" + cadenaBusqueda + "%') or lower(estado) like lower('%" + cadenaBusqueda + "%')";

        ResultSet rs = con.selectConsulta(sqlc);
        List<Juicio> lj = new ArrayList<>();
        try {
            while (rs.next()) {
                Juicio miJuicio = new Juicio();

                miJuicio.setCod_juicio(rs.getString("cod_juicio"));
                miJuicio.setCedula(rs.getString("cedula"));
                miJuicio.setNombre(rs.getString("nombre"));
                miJuicio.setApellido(rs.getString("apellido"));
                miJuicio.setNombre_apellido(rs.getString("Nombre_abogado"));
                miJuicio.setTip_juicio(rs.getString("tip_juicio"));
                miJuicio.setEstado(rs.getString("estado"));

                lj.add(miJuicio);
            }
            rs.close();
            return lj;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloJuicio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //MODELO PARA RELLENAR LOS TEXTFIEL DE LA VISTA
    public List<Juicio> filtrarInformacionParatxtJuicios(String cadenaBusqueda) {
        try {
            String sqlc = "select p.nombre, p.apellido from persona p, cliente c where p.cedula = c.cedula and c.cedula = '" + cadenaBusqueda + "';";
            ResultSet rs = con.selectConsulta(sqlc);
            List<Juicio> lj = new ArrayList<>();
            while (rs.next()) {
                Juicio miJuicio = new Juicio();
                miJuicio.setNombre(rs.getString("nombre"));
                miJuicio.setApellido(rs.getString("apellido"));
                lj.add(miJuicio);
            }
            rs.close();
            return lj;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloJuicio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //MODELO QUE ES USADO PARA RELLENAR UN COMBO BOX QUE CON EL NOMBRE Y APELLIDO
    public List<Juicio> obtenerNombresAbogadosComboBX() {
        try {
            String sqlc = "select upper(p.nombre ||' '||p.apellido) as nombres from persona p, empleado e where p.cedula = e.cedula and cod_rol=1 and e.estado = true;";
            ResultSet rs = con.selectConsulta(sqlc);
            List<Juicio> lj = new ArrayList<>();
            while (rs.next()) {
                Juicio miJuicio = new Juicio();
                miJuicio.setNombre(rs.getString("nombres"));
                lj.add(miJuicio);
            }
            rs.close();
            return lj;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloJuicio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //MODELO PARA OBTENER EL CODIGO DE LOS CLIENTES POR LA CEDULA
    public int obtenerCodigoCliente(String cedula) {

        try {
            String sqla = "select cod_cliente from cliente where cedula = '" + cedula + "';";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                //int codigo_cliente = rs.getInt("cod_cliente");
                return rs.getInt("cod_cliente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloJuicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    //MODELO PARA OBTENER CODIGO DE LOS EMPLEADOS POR EL NOMBRE Y APELLIDO
    public int obtenerCodigoEmpleado(String Nombre_apellido) {

        try {
            String sqla = "select e.cod_empleado "
                    + "from empleado e, persona p "
                    + "where e.cedula = p.cedula and upper(p.nombre ||' '||p.apellido) = upper('" + Nombre_apellido + "')";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return rs.getInt("cod_empleado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloJuicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    //MODELO PARA ASIGANAR CODIGO DE ALOS JUICIOS AUTOMATICAMENTE
    public String contarCodigoJuicio() {
        try {
            String sqla = "select count(cod_juicio) as contador from juicios";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return "CJ" + (rs.getInt("contador") + 1);
            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloJuicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //MODELO PARA INCREMENTAR LOS NUMEROS DE LOS JUICIOS
    public int contarNumeroJuicios() {
        try {
            String sqla = "select count(num_juicio) as cuenta from juicios";
            ResultSet rs = con.selectConsulta(sqla);
            while (rs.next()) {
                return rs.getInt("cuenta") + 1;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloJuicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}

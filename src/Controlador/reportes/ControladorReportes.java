/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.reportes;

import Modelo.ConexionPG;
import Modelo.empleado.*;
import Modelo.cliente.*;
import Modelo.juicio.*;
import Modelo.audiencia.*;
import Modelo.cita.*;
import Vista.Vista_Reportes;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author velez
 */
public class ControladorReportes {

    private Vista_Reportes v_vistaReporte;
    private ModeloEmpleado m_Empleado = new ModeloEmpleado();
    private ModeloCliente m_Cliente = new ModeloCliente();
    private ModeloJuicio m_Juicio = new ModeloJuicio();
    private ModeloAudiencia m_Audiencia = new ModeloAudiencia();
    private ModeloCita m_Cita = new ModeloCita();
    private ConexionPG con = new ConexionPG();

    public ControladorReportes(Vista_Reportes v_vistaReporte) {
        this.v_vistaReporte = v_vistaReporte;
        v_vistaReporte.getjCalen_citaReport().setVisible(false);
        v_vistaReporte.getjTimeCitaReport().setVisible(false);
        v_vistaReporte.getLbl_tituloJC().setVisible(false);
        this.v_vistaReporte.setVisible(true);
    }

    public void inicioControlReporte() {

        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getSource() == v_vistaReporte.getTxt_filtroReportes()
                        && v_vistaReporte.getCmbx_Tablas().getSelectedItem().toString().equals("Empleado")) {
                    tablaEmpleado("1");
                }

                if (e.getSource() == v_vistaReporte.getTxt_filtroReportes()
                        && v_vistaReporte.getCmbx_Tablas().getSelectedItem().toString().equals("Cita")) {
                    tablaCitas("1");
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        v_vistaReporte.getCmbx_Tablas().addActionListener(l -> elejirTabla(v_vistaReporte.getCmbx_Tablas().getSelectedItem().toString()));
        v_vistaReporte.getTxt_filtroReportes().addKeyListener(kl);
        v_vistaReporte.getBtn_imprimirReporte().addActionListener(l -> identificaReporte(v_vistaReporte.getCmbx_Tablas().getSelectedItem().toString()));
    }

    void elejirTabla(String nombreTabla) {

        if (nombreTabla.equals("Cliente")) {
            v_vistaReporte.getjCalen_citaReport().setVisible(false);
            v_vistaReporte.getjTimeCitaReport().setVisible(false);
            v_vistaReporte.getLbl_tituloJC().setVisible(false);
            v_vistaReporte.getLbl_tituloTabla().setText("Lista de Clientes");
            tablaCliente("0");
        }

        if (nombreTabla.equals("Empleado")) {
            v_vistaReporte.getjCalen_citaReport().setVisible(false);
            v_vistaReporte.getjTimeCitaReport().setVisible(false);
            v_vistaReporte.getLbl_tituloJC().setVisible(false);
            v_vistaReporte.getLbl_tituloTabla().setText("Lista de Empleados");
            tablaEmpleado("0");
        }

        if (nombreTabla.equals("Juicio")) {
            v_vistaReporte.getjCalen_citaReport().setVisible(false);
            v_vistaReporte.getjTimeCitaReport().setVisible(false);
            v_vistaReporte.getLbl_tituloJC().setVisible(false);
            v_vistaReporte.getLbl_tituloTabla().setText("Lista de Juicios");
            tablaJuicios("0");
        }

        if (nombreTabla.equals("Audiencia")) {
            v_vistaReporte.getjCalen_citaReport().setVisible(true);
            v_vistaReporte.getjTimeCitaReport().setVisible(false);
            v_vistaReporte.getLbl_tituloJC().setVisible(false);
            v_vistaReporte.getLbl_tituloTabla().setText("Lista de Audiencias");
            tablaAudiencias("0");
        }

        if (nombreTabla.equals("Cita")) {
            v_vistaReporte.getLbl_tituloTabla().setText("Lista de Citas");
            v_vistaReporte.getjCalen_citaReport().setVisible(true);
            v_vistaReporte.getjTimeCitaReport().setVisible(true);
            v_vistaReporte.getLbl_tituloJC().setVisible(true);
            tablaCitas("0");
        }

        if (nombreTabla.equals("Seleccionar")) {
            v_vistaReporte.getjCalen_citaReport().setVisible(false);
            v_vistaReporte.getjTimeCitaReport().setVisible(false);
            v_vistaReporte.getLbl_tituloJC().setVisible(false);
            DefaultTableModel modeloTabla = new DefaultTableModel();
            v_vistaReporte.getTablaReportes().setModel(modeloTabla);
        }

    }

    void tablaEmpleado(String aguja) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        List<Empleado> listaEmpleado;

        modeloTabla.addColumn("Cedula");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Mail");
        modeloTabla.addColumn("Direccion");
        modeloTabla.addColumn("F. Nacimiento");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Sueldo");
        modeloTabla.addColumn("Genero");
        modeloTabla.addColumn("Estado");
        modeloTabla.addColumn("Rol");
        v_vistaReporte.getTablaReportes().setModel(modeloTabla);

        modeloTabla.setNumRows(0);

        if (aguja.equals("1")) {
            listaEmpleado = m_Empleado.leerEmpleado(v_vistaReporte.getTxt_filtroReportes().getText());

        } else {
            listaEmpleado = m_Empleado.leerEmpleado();
        }

        listaEmpleado.stream().forEach(e -> {
            String[] empleado = {e.getCedula(), e.getNombre(), e.getApellido(), e.getCorreo(), e.getDireccion(), e.getFecha_nac(),
                e.getEdad().toString(), e.getTelefono(), e.getSueldo(), e.getGenero(), e.getEstados(), e.getTipo_rol()};

            modeloTabla.addRow(empleado);
        });

    }

    void tablaCliente(String aguja) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        List<Cliente> listaCliente;

        modeloTabla.addColumn("Cedula");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Mail");
        modeloTabla.addColumn("Direccion");
        modeloTabla.addColumn("F. Nacimiento");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Genero");
        modeloTabla.addColumn("Estado Civil");
        v_vistaReporte.getTablaReportes().setModel(modeloTabla);

        modeloTabla.setNumRows(0);

        if (aguja.equals("1")) {
            listaCliente = m_Cliente.leerCliente(v_vistaReporte.getTxt_filtroReportes().getText());

        } else {
            listaCliente = m_Cliente.leerCliente();
        }

        listaCliente.stream().forEach(c -> {

            String[] clientes = {c.getCedula(), c.getNombre(), c.getApellido(),
                c.getCorreo(), c.getDireccion(), c.getFecha_nac(), c.getEdad().toString(),
                c.getTelefono(), c.getGenero(), c.getEstado_civil()};
            modeloTabla.addRow(clientes);
        });

    }

    void tablaJuicios(String aguja) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        List<Juicio> listaJuicio;

        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Cedula");
        modeloTabla.addColumn("Nombre Cliente");
        modeloTabla.addColumn("Apellido Cliente");
        modeloTabla.addColumn("Abogado");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("Estado");
        v_vistaReporte.getTablaReportes().setModel(modeloTabla);

        modeloTabla.setNumRows(0);

        if (aguja.equals("1")) {
            listaJuicio = m_Juicio.leerJuicios(v_vistaReporte.getTxt_filtroReportes().getText());

        } else {
            listaJuicio = m_Juicio.Leer();
        }

        modeloTabla.setNumRows(0);
        listaJuicio.stream().forEach(j -> {
            String[] juicio = {j.getCod_juicio().toString(), j.getCedula(), j.getNombre(), j.getApellido(), j.getNombre_apellido(), j.getTip_juicio(), j.getEstado()};
            modeloTabla.addRow(juicio);
        });
    }

    void tablaAudiencias(String aguja) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        List<Audiencia> listaAudiencias;

        modeloTabla.addColumn("Informacion Audiencia");
        modeloTabla.addColumn("Codigo Juicio");
        modeloTabla.addColumn("Nombre Cliente");
        v_vistaReporte.getTablaReportes().setModel(modeloTabla);

        modeloTabla.setNumRows(0);

        if (aguja.equals("1")) {
            listaAudiencias = m_Audiencia.leerAudiencia(v_vistaReporte.getTxt_filtroReportes().getText());

        } else {
            listaAudiencias = m_Audiencia.leerAudiencia();
        }

        listaAudiencias.stream().forEach(p -> {
            String[] audiencia = {p.getCodigo_juicio(), p.getFecha_a(), String.valueOf(p.getNumero_a())};
            modeloTabla.addRow(audiencia);
        });
    }

    void tablaCitas(String aguja) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        List<Cita> listaCita;

        modeloTabla.addColumn("Numero de Cita");
        modeloTabla.addColumn("Cedula Cliente");
        modeloTabla.addColumn("Nombre Cliente");
        modeloTabla.addColumn("Apellido Cliente");
        modeloTabla.addColumn("Fecha Cita");
        modeloTabla.addColumn("Hora Cita");
        v_vistaReporte.getTablaReportes().setModel(modeloTabla);

        modeloTabla.setNumRows(0);

        if (aguja.equals("1")) {
            listaCita = m_Cita.leerCita(v_vistaReporte.getTxt_filtroReportes().getText());

        } else {
            listaCita = m_Cita.leerCita();
        }

        listaCita.stream().forEach(ci -> {
            String[] cita = {
                ci.getNumero_c() + "", ci.getCedula(), ci.getNombre(), ci.getApellido(), ci.getFecha_c(), ci.getHora_c().toString()};
            modeloTabla.addRow(cita);
        });
    }

    void identificaReporte(String tabla) {

        if (tabla.equals("Empleado")) {
            reporteEmplado();
        }

        if (tabla.equals("Cita")) {
            reportCita();
        }

        if (tabla.equals("Cliente")) {
            reporteCliente();
        }

        if (tabla.equals("Audiencia")) {
            reporteAudiencia();
        }

        if (tabla.equals("Juicio")) {
            reporteJuicio();
        }
    }

    //ORDENAR DATOS TABLA
    void ordenarEmpleados() {

    }

    //IMPRIMIR REPORTE
    private void reportCita() {

        Date fecha = null;
        String formato = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // Tranformar la fecha a String
        if (v_vistaReporte.getjCalen_citaReport().getDate() != null) {
            fecha = v_vistaReporte.getjCalen_citaReport().getDate();
            formato = sdf.format(fecha);
        }
        formato = formato + " 00:00:00";
        try {

            // String path = "src\\vista\\reportes\\historial_transaccion_1.jasper";
            JasperReport ruta = (JasperReport) JRLoader.loadObject(getClass().getResource("/Modelo/reportes/lista_cita.jasper"));
            java.sql.Timestamp fc = java.sql.Timestamp.valueOf(formato);

            Map<String, Object> parametro = new HashMap<String, Object>();
            parametro.put("fecha_cita", fc);
            System.out.println("FECHA: " + fc);
            //parametro.put("nombre_cliente", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");
            //parametro.put("apellido_cliente", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");
            //parametro.put("cedula", v_vistaReporte.getTxt_filtroReportes().getText());
            JasperPrint jp = JasperFillManager.fillReport(ruta, parametro, con.getConexion());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            System.out.println(ex);
            Logger.getLogger(ControladorReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reporteEmplado() {

        try {
            JasperReport ruta = (JasperReport) JRLoader.loadObject(getClass().getResource("/Modelo/reportes/lista_empleados.jasper"));

            Map<String, Object> parametro = new HashMap<String, Object>();

            parametro.put("nombre_empleado", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");
            parametro.put("apellido_empleado", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");
            parametro.put("genero_empleado", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");
            parametro.put("rol_empleado", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");
            parametro.put("estado_empleado", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");

            try {
                parametro.put("sueldo_empleado", Double.parseDouble(v_vistaReporte.getTxt_filtroReportes().getText()));
            } catch (NumberFormatException ex) {

            }
            parametro.put("cedula_empleado", v_vistaReporte.getTxt_filtroReportes().getText());
            JasperPrint jp = JasperFillManager.fillReport(ruta, parametro, con.getConexion());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            System.out.println(ex);
            Logger.getLogger(ControladorReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reporteCliente() {

        try {
            JasperReport ruta = (JasperReport) JRLoader.loadObject(getClass().getResource("/Modelo/reportes/lista_cliente.jasper"));

            Map<String, Object> parametro = new HashMap<String, Object>();

            parametro.put("cedula_cliente", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");
            parametro.put("nombre_cliente", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");
            parametro.put("apellido_cliente", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");
            parametro.put("estado_cliente", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");

            JasperPrint jp = JasperFillManager.fillReport(ruta, parametro, con.getConexion());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            System.out.println(ex);
            Logger.getLogger(ControladorReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void extraerFechaTabla(MouseEvent event) {
        int seleccionaar = v_vistaReporte.getTablaReportes().rowAtPoint(event.getPoint());
        String.valueOf(v_vistaReporte.getTablaReportes().getValueAt(seleccionaar, 4));
    }

    private void reporteAudiencia() {

        Date fecha = null;
        String formato = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // Tranformar la fecha a String
        if (v_vistaReporte.getjCalen_citaReport().getDate() != null) {
            fecha = v_vistaReporte.getjCalen_citaReport().getDate();
            formato = sdf.format(fecha);
        }
        formato = formato + " 00:00:00";
        try {
            JasperReport ruta = (JasperReport) JRLoader.loadObject(getClass().getResource("/Modelo/reportes/lista_audiencia.jasper"));
            java.sql.Timestamp fc = java.sql.Timestamp.valueOf(formato);

            Map<String, Object> parametro = new HashMap<String, Object>();
            parametro.put("fecha_audiencia", fc);
            JasperPrint jp = JasperFillManager.fillReport(ruta, parametro, con.getConexion());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            System.out.println(ex);
            Logger.getLogger(ControladorReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reporteJuicio() {

        try {
            JasperReport ruta = (JasperReport) JRLoader.loadObject(getClass().getResource("/Modelo/reportes/juicioReporte.jasper"));

            Map<String, Object> parametro = new HashMap<String, Object>();

            parametro.put("cadenaBusqueda", "%" + v_vistaReporte.getTxt_filtroReportes().getText() + "%");

            JasperPrint jp = JasperFillManager.fillReport(ruta, parametro, con.getConexion());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            System.out.println(ex);
            Logger.getLogger(ControladorReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

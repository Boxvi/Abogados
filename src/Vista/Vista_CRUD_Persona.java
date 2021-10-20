/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.*;
import JTextField_Especial.JtxtCedula;
import JTextField_Especial.JtxtSoloLetras;
import JTextField_Especial.JtxtSoloNumeros;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author velez
 */
public class Vista_CRUD_Persona extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_CRUD_Persona
     */
    public Vista_CRUD_Persona() {
        initComponents();
    }

    public JButton getBtn_editarPersona() {
        return btn_editarPersona;
    }

    public void setBtn_editarPersona(JButton btn_editarPersona) {
        this.btn_editarPersona = btn_editarPersona;
    }

    public JButton getBtn_eliminarPersona() {
        return btn_eliminarPersona;
    }

    public void setBtn_eliminarPersona(JButton btn_eliminarPersona) {
        this.btn_eliminarPersona = btn_eliminarPersona;
    }

    public JButton getBtn_insertPersona() {
        return btn_insertPersona;
    }

    public void setBtn_insertPersona(JButton btn_insertPersona) {
        this.btn_insertPersona = btn_insertPersona;
    }

    public JButton getBtn_refrescarPersona() {
        return btn_refrescarPersona;
    }

    public void setBtn_refrescarPersona(JButton btn_refrescarPersona) {
        this.btn_refrescarPersona = btn_refrescarPersona;
    }

    public JComboBox<String> getjCmb_generoPresona() {
        return jCmb_generoPresona;
    }

    public void setjCmb_generoPresona(JComboBox<String> jCmb_generoPresona) {
        this.jCmb_generoPresona = jCmb_generoPresona;
    }

    public JDateChooser getJc_fecha_nacPersona() {
        return jc_fecha_nacPersona;
    }

    public void setJc_fecha_nacPersona(JDateChooser jc_fecha_nacPersona) {
        this.jc_fecha_nacPersona = jc_fecha_nacPersona;
    }

    public JtxtCedula getJtxtCedula1() {
        return txt_cedulaPersona;
    }

    public void setJtxtCedula1(JtxtCedula jtxtCedula1) {
        this.txt_cedulaPersona = jtxtCedula1;
    }

    public JTable getTbl_Persona() {
        return tbl_Persona;
    }

    public void setTbl_Persona(JTable tbl_Persona) {
        this.tbl_Persona = tbl_Persona;
    }

    public JtxtSoloLetras getTxt_apellidoPersona() {
        return txt_apellidoPersona;
    }

    public void setTxt_apellidoPersona(JtxtSoloLetras txt_apellidoPersona) {
        this.txt_apellidoPersona = txt_apellidoPersona;
    }

    public JtxtSoloLetras getTxt_correoPersona() {
        return txt_correoPersona;
    }

    public void setTxt_correoPersona(JtxtSoloLetras txt_correoPersona) {
        this.txt_correoPersona = txt_correoPersona;
    }

    public JtxtSoloLetras getTxt_direccionPersona() {
        return txt_direccionPersona;
    }

    public void setTxt_direccionPersona(JtxtSoloLetras txt_direccionPersona) {
        this.txt_direccionPersona = txt_direccionPersona;
    }

    public JTextField getTxt_edadPersona() {
        return txt_edadPersona;
    }

    public void setTxt_edadPersona(JTextField txt_edadPersona) {
        this.txt_edadPersona = txt_edadPersona;
    }

    public JTextField getTxt_filtroPersona() {
        return txt_filtroPersona;
    }

    public void setTxt_filtroPersona(JTextField txt_filtroPersona) {
        this.txt_filtroPersona = txt_filtroPersona;
    }

    public JtxtSoloLetras getTxt_nombrePersona() {
        return txt_nombrePersona;
    }

    public void setTxt_nombrePersona(JtxtSoloLetras txt_nombrePersona) {
        this.txt_nombrePersona = txt_nombrePersona;
    }

    public JtxtSoloNumeros getTxt_telefonoPersona() {
        return txt_telefonoPersona;
    }

    public void setTxt_telefonoPersona(JtxtSoloNumeros txt_telefonoPersona) {
        this.txt_telefonoPersona = txt_telefonoPersona;
    }

    public JtxtCedula getTxt_cedulaPersona() {
        return txt_cedulaPersona;
    }

    public void setTxt_cedulaPersona(JtxtCedula txt_cedulaPersona) {
        this.txt_cedulaPersona = txt_cedulaPersona;
    }

    public JMenuItem getJmenuItem_limpiarCampoPersona() {
        return jmenuItem_limpiarCampoPersona;
    }

    public void setJmenuItem_limpiarCampoPersona(JMenuItem jmenuItem_limpiarCampoPersona) {
        this.jmenuItem_limpiarCampoPersona = jmenuItem_limpiarCampoPersona;
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmenuItem_limpiarCampoPersona = new javax.swing.JMenuItem();
        jpnl_tabla_btns = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_filtroPersona = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Persona = new javax.swing.JTable();
        btn_refrescarPersona = new javax.swing.JButton();
        btn_insertPersona = new javax.swing.JButton();
        btn_editarPersona = new javax.swing.JButton();
        btn_eliminarPersona = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jc_fecha_nacPersona = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jCmb_generoPresona = new javax.swing.JComboBox<>();
        txt_apellidoPersona = new JTextField_Especial.JtxtSoloLetras();
        txt_correoPersona = new JTextField_Especial.JtxtSoloLetras();
        txt_direccionPersona = new JTextField_Especial.JtxtSoloLetras();
        txt_edadPersona = new javax.swing.JTextField();
        txt_telefonoPersona = new JTextField_Especial.JtxtSoloNumeros();
        txt_nombrePersona = new JTextField_Especial.JtxtSoloLetras();
        txt_cedulaPersona = new JTextField_Especial.JtxtCedula();

        jmenuItem_limpiarCampoPersona.setText("Limpiar Campos");
        jPopupMenu1.add(jmenuItem_limpiarCampoPersona);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jpnl_tabla_btns.setBackground(new java.awt.Color(255, 255, 255));
        jpnl_tabla_btns.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpnl_tabla_btns.setComponentPopupMenu(jPopupMenu1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Logo Superior.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Poiret One", 0, 48)); // NOI18N
        jLabel2.setText("C.R.U.D. Personas");

        txt_filtroPersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poiret One", 0, 24)); // NOI18N
        jLabel3.setText("Filtrar");

        tbl_Persona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Direccion", "F. de Nacimiento", "Edad", "Telefono", "Genero"
            }
        ));
        jScrollPane1.setViewportView(tbl_Persona);

        btn_refrescarPersona.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_refrescarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_refrescar.png"))); // NOI18N
        btn_refrescarPersona.setText("Refrescar");

        btn_insertPersona.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_insertPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_insertarP.png"))); // NOI18N
        btn_insertPersona.setText("Insertar");

        btn_editarPersona.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_editarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_editarP.png"))); // NOI18N
        btn_editarPersona.setText("Editar");

        btn_eliminarPersona.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_eliminarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_eliminarP.png"))); // NOI18N
        btn_eliminarPersona.setText("Eliminar");

        javax.swing.GroupLayout jpnl_tabla_btnsLayout = new javax.swing.GroupLayout(jpnl_tabla_btns);
        jpnl_tabla_btns.setLayout(jpnl_tabla_btnsLayout);
        jpnl_tabla_btnsLayout.setHorizontalGroup(
            jpnl_tabla_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_tabla_btnsLayout.createSequentialGroup()
                .addGroup(jpnl_tabla_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnl_tabla_btnsLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jpnl_tabla_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnl_tabla_btnsLayout.createSequentialGroup()
                                .addComponent(btn_refrescarPersona)
                                .addGap(21, 21, 21)
                                .addComponent(btn_insertPersona)
                                .addGap(20, 20, 20)
                                .addComponent(btn_editarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btn_eliminarPersona))))
                    .addGroup(jpnl_tabla_btnsLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnl_tabla_btnsLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txt_filtroPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpnl_tabla_btnsLayout.setVerticalGroup(
            jpnl_tabla_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_tabla_btnsLayout.createSequentialGroup()
                .addGroup(jpnl_tabla_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnl_tabla_btnsLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(jpnl_tabla_btnsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(54, 54, 54)
                .addGroup(jpnl_tabla_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtroPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(75, 75, 75)
                .addGroup(jpnl_tabla_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refrescarPersona)
                    .addComponent(btn_insertPersona)
                    .addComponent(btn_editarPersona)
                    .addComponent(btn_eliminarPersona))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setComponentPopupMenu(jPopupMenu1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Insertar o Modificar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aquí podrás insertar o editar los datos de una persona.");

        jLabel6.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido");

        jLabel8.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cedula");

        jLabel9.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo");

        jLabel10.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Direccion");

        jLabel11.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("F. de Nacimiento");

        jLabel12.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Edad");

        jLabel13.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefono/Celular");

        jc_fecha_nacPersona.setDateFormatString("yyyy-MM-dd");

        jLabel14.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Genero");

        jCmb_generoPresona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCmb_generoPresona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino", "Otros" }));

        txt_apellidoPersona.setText("");
        txt_apellidoPersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_correoPersona.setText("");
        txt_correoPersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_direccionPersona.setText("");
        txt_direccionPersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_edadPersona.setEditable(false);
        txt_edadPersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_telefonoPersona.setText("");
        txt_telefonoPersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_nombrePersona.setText("");
        txt_nombrePersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_cedulaPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_correoPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_apellidoPersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_direccionPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_nombrePersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jc_fecha_nacPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel12))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(txt_edadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_telefonoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel14))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jCmb_generoPresona, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_cedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_apellidoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_correoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_direccionPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txt_edadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jc_fecha_nacPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_telefonoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCmb_generoPresona, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnl_tabla_btns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnl_tabla_btns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editarPersona;
    private javax.swing.JButton btn_eliminarPersona;
    private javax.swing.JButton btn_insertPersona;
    private javax.swing.JButton btn_refrescarPersona;
    private javax.swing.JComboBox<String> jCmb_generoPresona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jc_fecha_nacPersona;
    private javax.swing.JMenuItem jmenuItem_limpiarCampoPersona;
    private javax.swing.JPanel jpnl_tabla_btns;
    private javax.swing.JTable tbl_Persona;
    private JTextField_Especial.JtxtSoloLetras txt_apellidoPersona;
    private JTextField_Especial.JtxtCedula txt_cedulaPersona;
    private JTextField_Especial.JtxtSoloLetras txt_correoPersona;
    private JTextField_Especial.JtxtSoloLetras txt_direccionPersona;
    private javax.swing.JTextField txt_edadPersona;
    private javax.swing.JTextField txt_filtroPersona;
    private JTextField_Especial.JtxtSoloLetras txt_nombrePersona;
    private JTextField_Especial.JtxtSoloNumeros txt_telefonoPersona;
    // End of variables declaration//GEN-END:variables
}

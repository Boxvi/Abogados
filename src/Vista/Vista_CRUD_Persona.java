/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import JTextField_Especial.JtxtCedula;
import JTextField_Especial.JtxtSoloLetras;
import JTextField_Especial.JtxtSoloNumeros;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_filtroPersona = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_refrescarPersona = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Persona = new javax.swing.JTable();
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
        txt_cedulaPersona = new JTextField_Especial.JtxtCedula();
        txt_apellidoPersona = new JTextField_Especial.JtxtSoloLetras();
        txt_nombrePersona = new JTextField_Especial.JtxtSoloLetras();
        txt_correoPersona = new JTextField_Especial.JtxtSoloLetras();
        txt_direccionPersona = new JTextField_Especial.JtxtSoloLetras();
        txt_edadPersona = new javax.swing.JTextField();
        txt_telefonoPersona = new JTextField_Especial.JtxtSoloNumeros();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Logo Superior.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Poiret One", 0, 48)); // NOI18N
        jLabel2.setText("C.R.U.D. Personas");

        txt_filtroPersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poiret One", 0, 24)); // NOI18N
        jLabel3.setText("Filtrar");

        btn_refrescarPersona.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_refrescarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_refrescar.png"))); // NOI18N
        btn_refrescarPersona.setText("Refrescar");

        tbl_Persona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula/Pasaporte", "Nombre", "Apellido", "Correo", "Direccion", "Fecha de Nacimiento", "Edad", "Telefono/Celular", "Genero"
            }
        ));
        jScrollPane1.setViewportView(tbl_Persona);

        btn_insertPersona.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_insertPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_insertarP.png"))); // NOI18N
        btn_insertPersona.setText("Insertar");

        btn_editarPersona.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_editarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_editarP_1.png"))); // NOI18N
        btn_editarPersona.setText("Editar");

        btn_eliminarPersona.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_eliminarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_eliminarP.png"))); // NOI18N
        btn_eliminarPersona.setText("Eliminar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_refrescarPersona)
                        .addGap(36, 36, 36)
                        .addComponent(btn_insertPersona)
                        .addGap(33, 33, 33)
                        .addComponent(btn_editarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_eliminarPersona)
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_filtroPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(222, 222, 222))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtroPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refrescarPersona)
                    .addComponent(btn_insertPersona)
                    .addComponent(btn_editarPersona)
                    .addComponent(btn_eliminarPersona))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Insertar o Modificar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aquí podrás insertar o editar los datos de una persona.");

        jLabel6.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido");

        jLabel8.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cedula");

        jLabel9.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo");

        jLabel10.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Direccion");

        jLabel11.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha de Nacimiento");

        jLabel12.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Edad");

        jLabel13.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefono/Celular");

        jc_fecha_nacPersona.setDateFormatString("yyyy-MM-dd");

        jLabel14.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Genero");

        jCmb_generoPresona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCmb_generoPresona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino", "Otros", " " }));

        txt_cedulaPersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_apellidoPersona.setText("");
        txt_apellidoPersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_nombrePersona.setText("");
        txt_nombrePersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_correoPersona.setText("");
        txt_correoPersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_direccionPersona.setText("");
        txt_direccionPersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_edadPersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_telefonoPersona.setText("");
        txt_telefonoPersona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_cedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txt_telefonoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCmb_generoPresona, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_apellidoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_correoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_direccionPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(2, 2, 2)))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jc_fecha_nacPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_edadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_apellidoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_correoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_direccionPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jc_fecha_nacPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_edadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefonoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCmb_generoPresona, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jc_fecha_nacPersona;
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

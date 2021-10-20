/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.*;
import JTextField_Especial.JtxtCedula;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author velez
 */
public class Vista_CRUD_Cliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_CRUD_Cliente
     */
    public Vista_CRUD_Cliente() {
        initComponents();
    }

    public JButton getBtn_editarCliente() {
        return btn_editarCliente;
    }

    public void setBtn_editarCliente(JButton btn_editarCliente) {
        this.btn_editarCliente = btn_editarCliente;
    }

    public JButton getBtn_eliminarCliente() {
        return btn_eliminarCliente;
    }

    public void setBtn_eliminarCliente(JButton btn_eliminarCliente) {
        this.btn_eliminarCliente = btn_eliminarCliente;
    }

    public JButton getBtn_insertarCliente() {
        return btn_insertarCliente;
    }

    public void setBtn_insertarCliente(JButton btn_insertarCliente) {
        this.btn_insertarCliente = btn_insertarCliente;
    }

    public JButton getBtn_refescarCliente() {
        return btn_refescarCliente;
    }

    public void setBtn_refescarCliente(JButton btn_refescarCliente) {
        this.btn_refescarCliente = btn_refescarCliente;
    }

    public JComboBox<String> getjCbxEcivil() {
        return jCbxEcivil;
    }

    public void setjCbxEcivil(JComboBox<String> jCbxEcivil) {
        this.jCbxEcivil = jCbxEcivil;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JDateChooser getJc_fecha_nacCliente() {
        return jc_fecha_nacCliente;
    }

    public void setJc_fecha_nacCliente(JDateChooser jc_fecha_nacCliente) {
        this.jc_fecha_nacCliente = jc_fecha_nacCliente;
    }

    public JTable getTbl_Cliente() {
        return tbl_Cliente;
    }

    public void setTbl_Cliente(JTable tbl_Cliente) {
        this.tbl_Cliente = tbl_Cliente;
    }

    public JTextField getTxt_apellidoCliente() {
        return txt_apellidoCliente;
    }

    public void setTxt_apellidoCliente(JTextField txt_apellidoCliente) {
        this.txt_apellidoCliente = txt_apellidoCliente;
    }

    public JtxtCedula getTxt_cedulaCliente() {
        return txt_cedulaCliente;
    }

    public void setTxt_cedulaCliente(JtxtCedula txt_cedulaCliente) {
        this.txt_cedulaCliente = txt_cedulaCliente;
    }

    public JTextField getTxt_correoCliente() {
        return txt_correoCliente;
    }

    public void setTxt_correoCliente(JTextField txt_correoCliente) {
        this.txt_correoCliente = txt_correoCliente;
    }

    public JTextField getTxt_direccionCliente() {
        return txt_direccionCliente;
    }

    public void setTxt_direccionCliente(JTextField txt_direccionCliente) {
        this.txt_direccionCliente = txt_direccionCliente;
    }

    public JTextField getTxt_edadCliente() {
        return txt_edadCliente;
    }

    public void setTxt_edadCliente(JTextField txt_edadCliente) {
        this.txt_edadCliente = txt_edadCliente;
    }

    public JTextField getTxt_filtroCliente() {
        return txt_filtroCliente;
    }

    public void setTxt_filtroCliente(JTextField txt_filtroCliente) {
        this.txt_filtroCliente = txt_filtroCliente;
    }

    public JTextField getTxt_nombreCliente() {
        return txt_nombreCliente;
    }

    public void setTxt_nombreCliente(JTextField txt_nombreCliente) {
        this.txt_nombreCliente = txt_nombreCliente;
    }

    public JTextField getTxt_telefonoCliente() {
        return txt_telefonoCliente;
    }

    public void setTxt_telefonoCliente(JTextField txt_telefonoCliente) {
        this.txt_telefonoCliente = txt_telefonoCliente;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_filtroCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Cliente = new javax.swing.JTable();
        btn_refescarCliente = new javax.swing.JButton();
        btn_insertarCliente = new javax.swing.JButton();
        btn_editarCliente = new javax.swing.JButton();
        btn_eliminarCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_apellidoCliente = new javax.swing.JTextField();
        txt_correoCliente = new javax.swing.JTextField();
        jc_fecha_nacCliente = new com.toedter.calendar.JDateChooser();
        txt_direccionCliente = new javax.swing.JTextField();
        txt_telefonoCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jCbxEcivil = new javax.swing.JComboBox<>();
        txt_edadCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_nombreCliente = new javax.swing.JTextField();
        txt_cedulaCliente = new JTextField_Especial.JtxtCedula();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Logo Superior.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Poiret One", 0, 48)); // NOI18N
        jLabel2.setText("C.R.U.D. Clientes");

        jLabel3.setFont(new java.awt.Font("Poiret One", 0, 24)); // NOI18N
        jLabel3.setText("Filtrar");

        tbl_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Direccion", "F. de Nacimiento", "Edad", "Telefono", "Sexo", "Estado Civil"
            }
        ));
        jScrollPane1.setViewportView(tbl_Cliente);

        btn_refescarCliente.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_refescarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_refrescar.png"))); // NOI18N
        btn_refescarCliente.setText("Refrescar");

        btn_insertarCliente.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_insertarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_insertarP.png"))); // NOI18N
        btn_insertarCliente.setText("Insertar");

        btn_editarCliente.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_editarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_editarP.png"))); // NOI18N
        btn_editarCliente.setText("Editar");

        btn_eliminarCliente.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_eliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_eliminarP.png"))); // NOI18N
        btn_eliminarCliente.setText("Eliminar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_refescarCliente)
                        .addGap(21, 21, 21)
                        .addComponent(btn_insertarCliente)
                        .addGap(20, 20, 20)
                        .addComponent(btn_editarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btn_eliminarCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_filtroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refescarCliente)
                    .addComponent(btn_insertarCliente)
                    .addComponent(btn_editarCliente)
                    .addComponent(btn_eliminarCliente))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Insertar o Modificar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aquí podrás insertar o editar los datos de un cliente.");

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

        jLabel13.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefono/Celular");

        txt_apellidoCliente.setEditable(false);
        txt_apellidoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_correoCliente.setEditable(false);
        txt_correoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jc_fecha_nacCliente.setEnabled(false);

        txt_direccionCliente.setEditable(false);
        txt_direccionCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_telefonoCliente.setEditable(false);
        txt_telefonoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Estado Civil");

        jCbxEcivil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCbxEcivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero(a)", "Casado(a)", "Viudo(a)", "Divorsiado(a)", "Union Libre", "Otros", " " }));

        txt_edadCliente.setEditable(false);
        txt_edadCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Edad");

        txt_nombreCliente.setEditable(false);
        txt_nombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel8)
                                    .addGap(93, 93, 93)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_cedulaCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_apellidoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(txt_nombreCliente, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(txt_edadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jLabel12)
                            .addGap(61, 61, 61)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(jCbxEcivil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jc_fecha_nacCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_direccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(txt_correoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(67, 67, 67))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_correoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txt_cedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_fecha_nacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_edadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCbxEcivil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
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
    private javax.swing.JButton btn_editarCliente;
    private javax.swing.JButton btn_eliminarCliente;
    private javax.swing.JButton btn_insertarCliente;
    private javax.swing.JButton btn_refescarCliente;
    private javax.swing.JComboBox<String> jCbxEcivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
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
    private com.toedter.calendar.JDateChooser jc_fecha_nacCliente;
    private javax.swing.JTable tbl_Cliente;
    private javax.swing.JTextField txt_apellidoCliente;
    private JTextField_Especial.JtxtCedula txt_cedulaCliente;
    private javax.swing.JTextField txt_correoCliente;
    private javax.swing.JTextField txt_direccionCliente;
    private javax.swing.JTextField txt_edadCliente;
    private javax.swing.JTextField txt_filtroCliente;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_telefonoCliente;
    // End of variables declaration//GEN-END:variables
}

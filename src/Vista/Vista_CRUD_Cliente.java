/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
        btn_refescarCliente = new javax.swing.JButton();
        btn_insertarCliente = new javax.swing.JButton();
        btn_editarCliente = new javax.swing.JButton();
        btn_eliminarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Cliente = new javax.swing.JTable();
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
        txt_cedulaCliente = new JTextField_Especial.JtxtCedula();
        txt_nombreCliente = new javax.swing.JTextField();

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

        btn_refescarCliente.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_refescarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_refrescar.png"))); // NOI18N
        btn_refescarCliente.setText("Refrescar");

        btn_insertarCliente.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_insertarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_insertarP.png"))); // NOI18N
        btn_insertarCliente.setText("Insertar");

        btn_editarCliente.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_editarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_editarP_1.png"))); // NOI18N
        btn_editarCliente.setText("Editar");

        btn_eliminarCliente.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_eliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_eliminarP.png"))); // NOI18N
        btn_eliminarCliente.setText("Eliminar");

        tbl_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula/Pasaporte", "Nombre", "Apellido", "Correo", "Direccion", "Fecha de Nacimiento", "Edad", "Telefono/Celular", "Sexo", "Estado Civil"
            }
        ));
        jScrollPane1.setViewportView(tbl_Cliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_refescarCliente)
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_insertarCliente)
                                .addGap(77, 77, 77)
                                .addComponent(btn_editarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(btn_eliminarCliente)
                                .addGap(73, 73, 73))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
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
                .addGap(103, 103, 103)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refescarCliente)
                    .addComponent(btn_insertarCliente)
                    .addComponent(btn_editarCliente)
                    .addComponent(btn_eliminarCliente))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Insertar o Modificar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aquí podrás insertar o editar los datos de un cliente.");

        jLabel6.setFont(new java.awt.Font("Poiret One", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Poiret One", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido");

        jLabel8.setFont(new java.awt.Font("Poiret One", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cedula");

        jLabel9.setFont(new java.awt.Font("Poiret One", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo");

        jLabel10.setFont(new java.awt.Font("Poiret One", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Direccion");

        jLabel11.setFont(new java.awt.Font("Poiret One", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha de Nacimiento");

        jLabel13.setFont(new java.awt.Font("Poiret One", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefono/Celular");

        txt_apellidoCliente.setEditable(false);
        txt_apellidoCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_correoCliente.setEditable(false);
        txt_correoCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jc_fecha_nacCliente.setEnabled(false);

        txt_direccionCliente.setEditable(false);
        txt_direccionCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_telefonoCliente.setEditable(false);
        txt_telefonoCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Poiret One", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Estado Civil");

        jCbxEcivil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCbxEcivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "SOLTERO(A)", "CASADO(A)", "VIUDO(A)", "DIVORCIADO(A)", "UNION LIBRE", "OTROS", " " }));

        txt_edadCliente.setEditable(false);
        txt_edadCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Poiret One", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Edad");

        txt_cedulaCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_nombreCliente.setEditable(false);
        txt_nombreCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jc_fecha_nacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_edadCliente)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCbxEcivil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel17))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombreCliente)
                            .addComponent(txt_apellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txt_correoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txt_direccionCliente)
                            .addComponent(txt_cedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_correoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_direccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_edadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jc_fecha_nacCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbxEcivil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.*;
import JTextField_Especial.JtxtCedula;
import JTextField_Especial.JtxtSoloNumeros;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author velez
 */
public class Vista_CRUD_Empleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_CRUD_Empleado
     */
    public Vista_CRUD_Empleado() {
        initComponents();
    }

    public JButton getBtn_editarEmpleado() {
        return btn_editarEmpleado;
    }

    public void setBtn_editarEmpleado(JButton btn_editarEmpleado) {
        this.btn_editarEmpleado = btn_editarEmpleado;
    }

    public JButton getBtn_eliminarEmpleado() {
        return btn_eliminarEmpleado;
    }

    public void setBtn_eliminarEmpleado(JButton btn_eliminarEmpleado) {
        this.btn_eliminarEmpleado = btn_eliminarEmpleado;
    }

    public JButton getBtn_refescarEmpleado() {
        return btn_refescarEmpleado;
    }

    public void setBtn_refescarEmpleado(JButton btn_refescarEmpleado) {
        this.btn_refescarEmpleado = btn_refescarEmpleado;
    }

    public JComboBox<String> getjCmb_generoEmpleado() {
        return jCmb_estadoEmpleado;
    }

    public void setjCmb_generoEmpleado(JComboBox<String> jCmb_generoEmpleado) {
        this.jCmb_estadoEmpleado = jCmb_generoEmpleado;
    }

    public JDateChooser getJc_fecha_nacEmpleado() {
        return jc_fecha_nacEmpleado;
    }

    public void setJc_fecha_nacEmpleado(JDateChooser jc_fecha_nacEmpleado) {
        this.jc_fecha_nacEmpleado = jc_fecha_nacEmpleado;
    }

    public JTable getTbl_Empleado() {
        return tbl_Empleado;
    }

    public void setTbl_Empleado(JTable tbl_Empleado) {
        this.tbl_Empleado = tbl_Empleado;
    }

    public JTextField getTxt_apellidoEmpleado() {
        return txt_apellidoEmpleado;
    }

    public void setTxt_apellidoEmpleado(JTextField txt_apellidoEmpleado) {
        this.txt_apellidoEmpleado = txt_apellidoEmpleado;
    }

    public JtxtCedula getTxt_cedulaEmpleado() {
        return txt_cedulaEmpleado;
    }

    public void setTxt_cedulaEmpleado(JtxtCedula txt_cedulaEmpleado) {
        this.txt_cedulaEmpleado = txt_cedulaEmpleado;
    }


    public JTextField getTxt_correoEmpleado() {
        return txt_correoEmpleado;
    }

    public void setTxt_correoEmpleado(JTextField txt_correoEmpleado) {
        this.txt_correoEmpleado = txt_correoEmpleado;
    }

    public JTextField getTxt_direccionEmpleado() {
        return txt_direccionEmpleado;
    }

    public void setTxt_direccionEmpleado(JTextField txt_direccionEmpleado) {
        this.txt_direccionEmpleado = txt_direccionEmpleado;
    }

    public JTextField getTxt_edadEmpleado() {
        return txt_sueldoEmpleado;
    }

    public JButton getBtn_insertarEmpleado() {
        return btn_insertarEmpleado;
    }

    public void setBtn_insertarEmpleado(JButton btn_insertarEmpleado) {
        this.btn_insertarEmpleado = btn_insertarEmpleado;
    }

    public JComboBox<String> getjCmb_estadoEmpleado() {
        return jCmb_estadoEmpleado;
    }

    public void setjCmb_estadoEmpleado(JComboBox<String> jCmb_estadoEmpleado) {
        this.jCmb_estadoEmpleado = jCmb_estadoEmpleado;
    }

    public JComboBox<String> getjCmb_rolEmpleado() {
        return jCmb_rolEmpleado;
    }

    public void setjCmb_rolEmpleado(JComboBox<String> jCmb_rolEmpleado) {
        this.jCmb_rolEmpleado = jCmb_rolEmpleado;
    }

    public JtxtSoloNumeros getTxt_sueldoEmpleado() {
        return txt_sueldoEmpleado;
    }

    public void setTxt_sueldoEmpleado(JtxtSoloNumeros txt_sueldoEmpleado) {
        this.txt_sueldoEmpleado = txt_sueldoEmpleado;
    }

    public JTextField getTxt_filtroEmpleado() {
        return txt_filtroEmpleado;
    }
    
    public void setTxt_filtroEmpleado(JTextField txt_filtroEmpleado) {
        this.txt_filtroEmpleado = txt_filtroEmpleado;
    }
    
    public JTextField getTxt_nombreEmpleado() {
        return txt_nombreEmpleado;
    }

    public void setTxt_nombreEmpleado(JTextField txt_nombreEmpleado) {
        this.txt_nombreEmpleado = txt_nombreEmpleado;
    }

    public JTextField getTxt_telefonoEmpleado() {
        return txt_telefonoEmpleado;
    }

    public void setTxt_telefonoEmpleado(JTextField txt_telefonoEmpleado) {
        this.txt_telefonoEmpleado = txt_telefonoEmpleado;
    }

    public JMenuItem getJmenuItemLimpiarCamposEmpl() {
        return jmenuItemLimpiarCamposEmpl;
    }

    public void setJmenuItemLimpiarCamposEmpl(JMenuItem jmenuItemLimpiarCamposEmpl) {
        this.jmenuItemLimpiarCamposEmpl = jmenuItemLimpiarCamposEmpl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmenuItemLimpiarCamposEmpl = new javax.swing.JMenuItem();
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
        txt_apellidoEmpleado = new javax.swing.JTextField();
        txt_correoEmpleado = new javax.swing.JTextField();
        jc_fecha_nacEmpleado = new com.toedter.calendar.JDateChooser();
        txt_direccionEmpleado = new javax.swing.JTextField();
        txt_telefonoEmpleado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jCmb_estadoEmpleado = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txt_sueldoEmpleado = new JTextField_Especial.JtxtSoloNumeros();
        jLabel18 = new javax.swing.JLabel();
        jCmb_rolEmpleado = new javax.swing.JComboBox<>();
        txt_nombreEmpleado = new javax.swing.JTextField();
        txt_cedulaEmpleado = new JTextField_Especial.JtxtCedula();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_filtroEmpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_refescarEmpleado = new javax.swing.JButton();
        btn_insertarEmpleado = new javax.swing.JButton();
        btn_editarEmpleado = new javax.swing.JButton();
        btn_eliminarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Empleado = new javax.swing.JTable();

        jmenuItemLimpiarCamposEmpl.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenuItemLimpiarCamposEmpl.setText("Limpiar Campos");
        jPopupMenu1.add(jmenuItemLimpiarCamposEmpl);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setComponentPopupMenu(jPopupMenu1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Insertar o Modificar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aquí podrás insertar o editar los datos de un empleado.");

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

        txt_apellidoEmpleado.setEditable(false);

        txt_correoEmpleado.setEditable(false);

        jc_fecha_nacEmpleado.setDateFormatString("yyyy-MM-dd");
        jc_fecha_nacEmpleado.setEnabled(false);

        txt_direccionEmpleado.setEditable(false);

        txt_telefonoEmpleado.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Estado");

        jCmb_estadoEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCmb_estadoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "ACTIVO", "INACTIVO" }));

        jLabel12.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sueldo");

        txt_sueldoEmpleado.setText("");

        jLabel18.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Rol");

        jCmb_rolEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCmb_rolEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        txt_nombreEmpleado.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel17)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_apellidoEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txt_nombreEmpleado, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jc_fecha_nacEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txt_telefonoEmpleado))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_cedulaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addComponent(txt_correoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jCmb_estadoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_direccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCmb_rolEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_sueldoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(94, 94, 94))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txt_correoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cedulaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jc_fecha_nacEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sueldoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmb_estadoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCmb_rolEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setComponentPopupMenu(jPopupMenu1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Logo Superior.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Poiret One", 0, 48)); // NOI18N
        jLabel2.setText("C.R.U.D. Empleado");

        jLabel3.setFont(new java.awt.Font("Poiret One", 0, 24)); // NOI18N
        jLabel3.setText("Filtrar");

        btn_refescarEmpleado.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_refescarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_refrescar.png"))); // NOI18N
        btn_refescarEmpleado.setText("Refrescar");

        btn_insertarEmpleado.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_insertarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_insertarP.png"))); // NOI18N
        btn_insertarEmpleado.setText("Insertar");

        btn_editarEmpleado.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_editarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_editarP.png"))); // NOI18N
        btn_editarEmpleado.setText("Editar");

        btn_eliminarEmpleado.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_eliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_eliminarP.png"))); // NOI18N
        btn_eliminarEmpleado.setText("Eliminar");

        tbl_Empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula/Pasaporte", "Nombre", "Apellido", "Correo", "Direccion", "F. de Nacimiento", "Edad", "Telefono/Celular", "Sueldo", "Estado", "Roles"
            }
        ));
        jScrollPane1.setViewportView(tbl_Empleado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_refescarEmpleado)
                        .addGap(21, 21, 21)
                        .addComponent(btn_insertarEmpleado)
                        .addGap(26, 26, 26)
                        .addComponent(btn_editarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminarEmpleado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(txt_filtroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_filtroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_refescarEmpleado)
                            .addComponent(btn_insertarEmpleado)
                            .addComponent(btn_editarEmpleado)
                            .addComponent(btn_eliminarEmpleado))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editarEmpleado;
    private javax.swing.JButton btn_eliminarEmpleado;
    private javax.swing.JButton btn_insertarEmpleado;
    private javax.swing.JButton btn_refescarEmpleado;
    private javax.swing.JComboBox<String> jCmb_estadoEmpleado;
    private javax.swing.JComboBox<String> jCmb_rolEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jc_fecha_nacEmpleado;
    private javax.swing.JMenuItem jmenuItemLimpiarCamposEmpl;
    private javax.swing.JTable tbl_Empleado;
    private javax.swing.JTextField txt_apellidoEmpleado;
    private JTextField_Especial.JtxtCedula txt_cedulaEmpleado;
    private javax.swing.JTextField txt_correoEmpleado;
    private javax.swing.JTextField txt_direccionEmpleado;
    private javax.swing.JTextField txt_filtroEmpleado;
    private javax.swing.JTextField txt_nombreEmpleado;
    private JTextField_Especial.JtxtSoloNumeros txt_sueldoEmpleado;
    private javax.swing.JTextField txt_telefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}

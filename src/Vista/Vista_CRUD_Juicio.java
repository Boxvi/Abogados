
package Vista;

import JTextField_Especial.JtxtCedula;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author velez
 */
public class Vista_CRUD_Juicio extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_CRUD_Juicio
     */
    public Vista_CRUD_Juicio() {
        initComponents();
    }

    public JButton getBtn_editarJuicio() {
        return btn_editarJuicio;
    }

    public void setBtn_editarJuicio(JButton btn_editarJuicio) {
        this.btn_editarJuicio = btn_editarJuicio;
    }

    public JButton getBtn_eliminarJuicio() {
        return btn_eliminarJuicio;
    }

    public void setBtn_eliminarJuicio(JButton btn_eliminarJuicio) {
        this.btn_eliminarJuicio = btn_eliminarJuicio;
    }

    public JButton getBtn_insertarJuicio() {
        return btn_insertarJuicio;
    }

    public void setBtn_insertarJuicio(JButton btn_insertarJuicio) {
        this.btn_insertarJuicio = btn_insertarJuicio;
    }

    public JButton getBtn_refescarJuicio() {
        return btn_refescarJuicio;
    }

    public void setBtn_refescarJuicio(JButton btn_refescarJuicio) {
        this.btn_refescarJuicio = btn_refescarJuicio;
    }

    public JComboBox<String> getCbxEstadoJuicio() {
        return cbxEstadoJuicio;
    }

    public void setCbxEstadoJuicio(JComboBox<String> cbxEstadoJuicio) {
        this.cbxEstadoJuicio = cbxEstadoJuicio;
    }

    public JComboBox<String> getCbxTipoJuicio() {
        return cbxTipoJuicio;
    }

    public void setCbxTipoJuicio(JComboBox<String> cbxTipoJuicio) {
        this.cbxTipoJuicio = cbxTipoJuicio;
    }

    public JComboBox<String> getCbxabogadosDisponibles() {
        return cbxabogadosDisponibles;
    }

    public void setCbxabogadosDisponibles(JComboBox<String> cbxabogadosDisponibles) {
        this.cbxabogadosDisponibles = cbxabogadosDisponibles;
    }

    public JTable getjTbl_Juicios() {
        return jTbl_Juicios;
    }

    public void setjTbl_Juicios(JTable jTbl_Juicios) {
        this.jTbl_Juicios = jTbl_Juicios;
    }

    public JTextField getTxt_apellidoClienteJuicio() {
        return txt_apellidoClienteJuicio;
    }

    public void setTxt_apellidoClienteJuicio(JTextField txt_apellidoClienteJuicio) {
        this.txt_apellidoClienteJuicio = txt_apellidoClienteJuicio;
    }

    public JtxtCedula getTxt_cedulaClienteJuicio() {
        return txt_cedulaClienteJuicio;
    }

    public void setTxt_cedulaClienteJuicio(JtxtCedula txt_cedulaClienteJuicio) {
        this.txt_cedulaClienteJuicio = txt_cedulaClienteJuicio;
    }

    public JTextField getTxt_filtroAbogado() {
        return txt_filtroAbogado;
    }

    public void setTxt_filtroAbogado(JTextField txt_filtroAbogado) {
        this.txt_filtroAbogado = txt_filtroAbogado;
    }

    public JTextField getTxt_filtroJuicio() {
        return txt_filtroJuicio;
    }

    public void setTxt_filtroJuicio(JTextField txt_filtroJuicio) {
        this.txt_filtroJuicio = txt_filtroJuicio;
    }

    public JTextField getTxt_nombreClienteJuicio() {
        return txt_nombreClienteJuicio;
    }

    public void setTxt_nombreClienteJuicio(JTextField txt_nombreClienteJuicio) {
        this.txt_nombreClienteJuicio = txt_nombreClienteJuicio;
    }

    public JTextField getTxt_codigoJuicio() {
        return txt_codigoJuicio;
    }

    public void setTxt_codigoJuicio(JTextField txt_codigoJuicio) {
        this.txt_codigoJuicio = txt_codigoJuicio;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_refescarJuicio = new javax.swing.JButton();
        btn_insertarJuicio = new javax.swing.JButton();
        btn_editarJuicio = new javax.swing.JButton();
        btn_eliminarJuicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_filtroJuicio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbl_Juicios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_apellidoClienteJuicio = new javax.swing.JTextField();
        txt_nombreClienteJuicio = new javax.swing.JTextField();
        txt_filtroAbogado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxTipoJuicio = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbxEstadoJuicio = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txt_cedulaClienteJuicio = new JTextField_Especial.JtxtCedula();
        cbxabogadosDisponibles = new javax.swing.JComboBox<>();
        txt_codigoJuicio = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Poiret One", 0, 48)); // NOI18N
        jLabel2.setText("C.R.U.D. Juicios");

        btn_refescarJuicio.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_refescarJuicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_refrescar.png"))); // NOI18N
        btn_refescarJuicio.setText("Refrescar");

        btn_insertarJuicio.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_insertarJuicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_agregarJuicio.png"))); // NOI18N
        btn_insertarJuicio.setText("Insertar");

        btn_editarJuicio.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_editarJuicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_editarJuicio.png"))); // NOI18N
        btn_editarJuicio.setText("Editar");

        btn_eliminarJuicio.setFont(new java.awt.Font("Poiret One", 0, 18)); // NOI18N
        btn_eliminarJuicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_eliminarJuicio.png"))); // NOI18N
        btn_eliminarJuicio.setText("Eliminar");

        jLabel3.setFont(new java.awt.Font("Poiret One", 0, 24)); // NOI18N
        jLabel3.setText("Filtrar");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Logo Superior.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jTbl_Juicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Juicio", "Cedula Cliente", "Nombre Cliente", "Apellido Cliente", "Nombre Abogado", "Tipo Juicio", "Estado Juicio"
            }
        ));
        jScrollPane1.setViewportView(jTbl_Juicios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtroJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_refescarJuicio)
                                .addGap(35, 35, 35)
                                .addComponent(btn_insertarJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(btn_editarJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_eliminarJuicio)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_filtroJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refescarJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_insertarJuicio)
                    .addComponent(btn_editarJuicio)
                    .addComponent(btn_eliminarJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));

        jLabel8.setFont(new java.awt.Font("Poiret One", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Datos del Juicio");

        jLabel6.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido");

        txt_apellidoClienteJuicio.setEditable(false);

        txt_nombreClienteJuicio.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre Abogado");

        jLabel10.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo Juicio");

        cbxTipoJuicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "CIVIL", "PENAL", "LABORAL", "FAMILIAR" }));

        jLabel11.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado Juicio");

        cbxEstadoJuicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ACTIVO", "PASIVO", "ARCHIVADO" }));

        jLabel12.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cedula");

        cbxabogadosDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));

        txt_codigoJuicio.setBackground(new java.awt.Color(40, 40, 40));
        txt_codigoJuicio.setForeground(new java.awt.Color(40, 40, 40));
        txt_codigoJuicio.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxTipoJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxEstadoJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel12))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nombreClienteJuicio)
                                    .addComponent(txt_apellidoClienteJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_filtroAbogado)
                                    .addComponent(txt_cedulaClienteJuicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxabogadosDisponibles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_codigoJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel8)
                .addGap(57, 57, 57)
                .addComponent(jLabel12)
                .addGap(7, 7, 7)
                .addComponent(txt_cedulaClienteJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreClienteJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_apellidoClienteJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_filtroAbogado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxabogadosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxTipoJuicio)
                    .addComponent(cbxEstadoJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_codigoJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editarJuicio;
    private javax.swing.JButton btn_eliminarJuicio;
    private javax.swing.JButton btn_insertarJuicio;
    private javax.swing.JButton btn_refescarJuicio;
    private javax.swing.JComboBox<String> cbxEstadoJuicio;
    private javax.swing.JComboBox<String> cbxTipoJuicio;
    private javax.swing.JComboBox<String> cbxabogadosDisponibles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbl_Juicios;
    private javax.swing.JTextField txt_apellidoClienteJuicio;
    private JTextField_Especial.JtxtCedula txt_cedulaClienteJuicio;
    private javax.swing.JTextField txt_codigoJuicio;
    private javax.swing.JTextField txt_filtroAbogado;
    private javax.swing.JTextField txt_filtroJuicio;
    private javax.swing.JTextField txt_nombreClienteJuicio;
    // End of variables declaration//GEN-END:variables
}

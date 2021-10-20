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
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import jhour.JTime;

/**
 *
 * @author velez
 */
public class Vista_CRUD_Cita extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_CRUD_Cita
     */
    public Vista_CRUD_Cita() {
        initComponents();
    }

    public JButton getBtn_editarCita() {
        return btn_editarCita;
    }

    public void setBtn_editarCita(JButton btn_editarCita) {
        this.btn_editarCita = btn_editarCita;
    }

    public JButton getBtn_eliminarCita() {
        return btn_eliminarCita;
    }

    public void setBtn_eliminarCita(JButton btn_eliminarCita) {
        this.btn_eliminarCita = btn_eliminarCita;
    }

    public JButton getBtn_insertarCita() {
        return btn_insertarCita;
    }

    public void setBtn_insertarCita(JButton btn_insertarCita) {
        this.btn_insertarCita = btn_insertarCita;
    }

    public JButton getBtn_refescarCita() {
        return btn_refescarCita;
    }

    public void setBtn_refescarCita(JButton btn_refescarCita) {
        this.btn_refescarCita = btn_refescarCita;
    }

    public JDateChooser getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(JDateChooser fechaCita) {
        this.fechaCita = fechaCita;
    }

    public JTime getjHCita() {
        return jHCita;
    }

    public void setjHCita(JTime jHCita) {
        this.jHCita = jHCita;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTbl_Citas() {
        return jTbl_Citas;
    }

    public void setjTbl_Citas(JTable jTbl_Citas) {
        this.jTbl_Citas = jTbl_Citas;
    }

    public JTextField getTxt_apellidoClienteCita() {
        return txt_apellidoClienteCita;
    }

    public void setTxt_apellidoClienteCita(JTextField txt_apellidoClienteCita) {
        this.txt_apellidoClienteCita = txt_apellidoClienteCita;
    }

    public JtxtCedula getTxt_cedulaClienteCita() {
        return txt_cedulaClienteCita;
    }

    public void setTxt_cedulaClienteCita(JtxtCedula txt_cedulaClienteCita) {
        this.txt_cedulaClienteCita = txt_cedulaClienteCita;
    }

    public JTextField getTxt_filtroCita() {
        return txt_filtroCita;
    }

    public void setTxt_filtroCita(JTextField txt_filtroCita) {
        this.txt_filtroCita = txt_filtroCita;
    }

    public JTextField getTxt_nombreClienteCita() {
        return txt_nombreClienteCita;
    }

    public void setTxt_nombreClienteCita(JTextField txt_nombreClienteCita) {
        this.txt_nombreClienteCita = txt_nombreClienteCita;
    }

    public JLabel getMensajeErrorFechaCita() {
        return mensajeErrorFechaCita;
    }

    public void setMensajeErrorFechaCita(JLabel mensajeErrorFechaCita) {
        this.mensajeErrorFechaCita = mensajeErrorFechaCita;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_refescarCita = new javax.swing.JButton();
        btn_insertarCita = new javax.swing.JButton();
        btn_editarCita = new javax.swing.JButton();
        btn_eliminarCita = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_filtroCita = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbl_Citas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_apellidoClienteCita = new javax.swing.JTextField();
        txt_nombreClienteCita = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fechaCita = new com.toedter.calendar.JDateChooser();
        txt_cedulaClienteCita = new JTextField_Especial.JtxtCedula();
        jHCita = new jhour.JTime();
        jLabel12 = new javax.swing.JLabel();
        mensajeErrorFechaCita = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Poiret One", 0, 48)); // NOI18N
        jLabel2.setText("C.R.U.D. CITA");

        btn_refescarCita.setFont(new java.awt.Font("Poiret One", 0, 14)); // NOI18N
        btn_refescarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_refrescar.png"))); // NOI18N
        btn_refescarCita.setText("Refrescar");

        btn_insertarCita.setFont(new java.awt.Font("Poiret One", 0, 14)); // NOI18N
        btn_insertarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_insertarCita.png"))); // NOI18N
        btn_insertarCita.setText("Insertar");

        btn_editarCita.setFont(new java.awt.Font("Poiret One", 0, 14)); // NOI18N
        btn_editarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_editarCita.png"))); // NOI18N
        btn_editarCita.setText("Editar");

        btn_eliminarCita.setFont(new java.awt.Font("Poiret One", 0, 14)); // NOI18N
        btn_eliminarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_eliminarCita.png"))); // NOI18N
        btn_eliminarCita.setText("Eliminar");

        jLabel3.setFont(new java.awt.Font("Poiret One", 0, 24)); // NOI18N
        jLabel3.setText("Filtrar");

        txt_filtroCita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Logo Superior.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jTbl_Citas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero Cita", "Cedula Cliente", "Nombre Cliente", "Apellido Cliente", "Fecha Cita", "Hora Cita"
            }
        ));
        jScrollPane1.setViewportView(jTbl_Citas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(149, 149, 149))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCita, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_refescarCita)
                        .addGap(31, 31, 31)
                        .addComponent(btn_insertarCita)
                        .addGap(30, 30, 30)
                        .addComponent(btn_editarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_eliminarCita))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_filtroCita, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_refescarCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_insertarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_editarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_eliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));

        jLabel8.setFont(new java.awt.Font("Poiret One", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Datos de la Cita");

        jLabel6.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido");

        txt_apellidoClienteCita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_nombreClienteCita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Cita");

        fechaCita.setDateFormatString("yyyy-MM-dd");
        fechaCita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_cedulaClienteCita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Poiret One", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cedula Cliente");

        mensajeErrorFechaCita.setBackground(new java.awt.Color(40, 40, 40));
        mensajeErrorFechaCita.setForeground(new java.awt.Color(40, 40, 40));
        mensajeErrorFechaCita.setText("Fecha mal ingresada");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mensajeErrorFechaCita)))
                .addGap(18, 18, 18)
                .addComponent(jHCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cedulaClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombreClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_apellidoClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel8)
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedulaClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nombreClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_apellidoClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensajeErrorFechaCita))
                    .addComponent(jHCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editarCita;
    private javax.swing.JButton btn_eliminarCita;
    private javax.swing.JButton btn_insertarCita;
    private javax.swing.JButton btn_refescarCita;
    private com.toedter.calendar.JDateChooser fechaCita;
    private jhour.JTime jHCita;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTable jTbl_Citas;
    private javax.swing.JLabel mensajeErrorFechaCita;
    private javax.swing.JTextField txt_apellidoClienteCita;
    private JTextField_Especial.JtxtCedula txt_cedulaClienteCita;
    private javax.swing.JTextField txt_filtroCita;
    private javax.swing.JTextField txt_nombreClienteCita;
    // End of variables declaration//GEN-END:variables
}

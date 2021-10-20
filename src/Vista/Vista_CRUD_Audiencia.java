/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author velez
 */
public class Vista_CRUD_Audiencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_CRUD_Audiencia
     */
    public Vista_CRUD_Audiencia() {
        initComponents();
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
        itemVaciacamposAudi = new javax.swing.JMenuItem();
        itemImprimirListAudiencia = new javax.swing.JMenuItem();
        panelAudiencia = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_Audiencia = new javax.swing.JTable();
        jLNumAu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_refescarAdiencia = new javax.swing.JButton();
        btn_eliminarAudiencia = new javax.swing.JButton();
        btn_insertarAudiencia = new javax.swing.JButton();
        btn_editarAudiencia = new javax.swing.JButton();
        txt_filtrarAudiencia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jchFechaAudiencia = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        cbx_informacionAudiencia = new javax.swing.JComboBox<>();

        itemVaciacamposAudi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemVaciacamposAudi.setText("Vaciar Campos");
        jPopupMenu1.add(itemVaciacamposAudi);

        itemImprimirListAudiencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemImprimirListAudiencia.setText("Imprimir Lista Audiencias");
        jPopupMenu1.add(itemImprimirListAudiencia);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        panelAudiencia.setBackground(new java.awt.Color(255, 255, 255));

        jtbl_Audiencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Juicio", "Fecha Audiencia", "Numero Audiencia"
            }
        ));
        jScrollPane1.setViewportView(jtbl_Audiencia);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Logo Superior.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("C.R.U.D. Audiencia");

        btn_refescarAdiencia.setFont(new java.awt.Font("Poiret One", 0, 12)); // NOI18N
        btn_refescarAdiencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_refrescarAudi.png"))); // NOI18N
        btn_refescarAdiencia.setText("Refrescar");

        btn_eliminarAudiencia.setFont(new java.awt.Font("Poiret One", 0, 12)); // NOI18N
        btn_eliminarAudiencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_eliminarAudiencia.png"))); // NOI18N
        btn_eliminarAudiencia.setText("Eliminar");

        btn_insertarAudiencia.setFont(new java.awt.Font("Poiret One", 0, 12)); // NOI18N
        btn_insertarAudiencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_agregarAudiencia.png"))); // NOI18N
        btn_insertarAudiencia.setText("Insertar");

        btn_editarAudiencia.setFont(new java.awt.Font("Poiret One", 0, 12)); // NOI18N
        btn_editarAudiencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_editarAudiencia.png"))); // NOI18N
        btn_editarAudiencia.setText("Editar");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Filtrar");

        javax.swing.GroupLayout panelAudienciaLayout = new javax.swing.GroupLayout(panelAudiencia);
        panelAudiencia.setLayout(panelAudienciaLayout);
        panelAudienciaLayout.setHorizontalGroup(
            panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAudienciaLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAudienciaLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(btn_refescarAdiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_insertarAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editarAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminarAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAudienciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAudienciaLayout.createSequentialGroup()
                        .addComponent(jLNumAu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAudienciaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtrarAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))))
        );
        panelAudienciaLayout.setVerticalGroup(
            panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAudienciaLayout.createSequentialGroup()
                .addGroup(panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNumAu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAudienciaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAudienciaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(jLabel1))))
                .addGap(31, 31, 31)
                .addGroup(panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtrarAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refescarAdiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminarAudiencia)
                    .addComponent(btn_insertarAudiencia)
                    .addComponent(btn_editarAudiencia))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setComponentPopupMenu(jPopupMenu1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CODIGO DE JUICIO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA DE AUDIENCIA");

        jchFechaAudiencia.setDateFormatString("yyyy-MM-dd");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Datos Audiencia");

        cbx_informacionAudiencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbx_informacionAudiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jchFechaAudiencia, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(cbx_informacionAudiencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(66, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(34, 34, 34)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbx_informacionAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jchFechaAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel6)
                    .addContainerGap(315, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAudiencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelAudiencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtn_editarAudiencia() {
        return btn_editarAudiencia;
    }

    public void setBtn_editarAudiencia(JButton btn_editarAudiencia) {
        this.btn_editarAudiencia = btn_editarAudiencia;
    }

    public JButton getBtn_eliminarAudiencia() {
        return btn_eliminarAudiencia;
    }

    public void setBtn_eliminarAudiencia(JButton btn_eliminarAudiencia) {
        this.btn_eliminarAudiencia = btn_eliminarAudiencia;
    }

    public JButton getBtn_insertarAudiencia() {
        return btn_insertarAudiencia;
    }

    public void setBtn_insertarAudiencia(JButton btn_insertarAudiencia) {
        this.btn_insertarAudiencia = btn_insertarAudiencia;
    }

    public JButton getBtn_refescarAdiencia() {
        return btn_refescarAdiencia;
    }

    public void setBtn_refescarAdiencia(JButton btn_refescarAdiencia) {
        this.btn_refescarAdiencia = btn_refescarAdiencia;
    }

    public JLabel getjLNumAu() {
        return jLNumAu;
    }

    public void setjLNumAu(JLabel jLNumAu) {
        this.jLNumAu = jLNumAu;
    }

    public JTable getJtbl_Audiencia() {
        return jtbl_Audiencia;
    }

    public void setJtbl_Audiencia(JTable jtbl_Audiencia) {
        this.jtbl_Audiencia = jtbl_Audiencia;
    }

    public JDateChooser getJchFechaAudiencia() {
        return jchFechaAudiencia;
    }

    public void setJchFechaAudiencia(JDateChooser jchFechaAudiencia) {
        this.jchFechaAudiencia = jchFechaAudiencia;
    }

    public JComboBox<String> getCbx_informacionAudiencia() {
        return cbx_informacionAudiencia;
    }

    public void setCbx_informacionAudiencia(JComboBox<String> cbx_informacionAudiencia) {
        this.cbx_informacionAudiencia = cbx_informacionAudiencia;
    }

    public JTextField getTxt_filtrarAudiencia() {
        return txt_filtrarAudiencia;
    }

    public void setTxt_filtrarAudiencia(JTextField txt_filtrarAudiencia) {
        this.txt_filtrarAudiencia = txt_filtrarAudiencia;
    }

    public JMenuItem getItemImprimirListAudiencia() {
        return itemImprimirListAudiencia;
    }

    public void setItemImprimirListAudiencia(JMenuItem itemImprimirListAudiencia) {
        this.itemImprimirListAudiencia = itemImprimirListAudiencia;
    }

    public JMenuItem getItemVaciacamposAudi() {
        return itemVaciacamposAudi;
    }

    public void setItemVaciacamposAudi(JMenuItem itemVaciacamposAudi) {
        this.itemVaciacamposAudi = itemVaciacamposAudi;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editarAudiencia;
    private javax.swing.JButton btn_eliminarAudiencia;
    private javax.swing.JButton btn_insertarAudiencia;
    private javax.swing.JButton btn_refescarAdiencia;
    private javax.swing.JComboBox<String> cbx_informacionAudiencia;
    private javax.swing.JMenuItem itemImprimirListAudiencia;
    private javax.swing.JMenuItem itemVaciacamposAudi;
    private javax.swing.JLabel jLNumAu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jchFechaAudiencia;
    private javax.swing.JTable jtbl_Audiencia;
    private javax.swing.JPanel panelAudiencia;
    private javax.swing.JTextField txt_filtrarAudiencia;
    // End of variables declaration//GEN-END:variables
}

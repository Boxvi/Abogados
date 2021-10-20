/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Vista.*;
import com.bolivia.label.CLabel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author velez
 */
public class Vista_Pagina_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Prueba
     */
    public Vista_Pagina_Principal() {
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

        jPanel3 = new javax.swing.JPanel();
        lbl_FotoUsuario = new com.bolivia.label.CLabel();
        lbl_NombreUsuario = new javax.swing.JLabel();
        pnl_btnAddpersona = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btn_Persona = new javax.swing.JButton();
        pnl_btnInicio = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btn_Inicio = new javax.swing.JButton();
        pnl_btnAddempleado = new javax.swing.JPanel();
        btn_Empleado = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pnl_btnAddusuario = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btn_Usuario = new javax.swing.JButton();
        pnl_btnAddRoles = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btn_Roles = new javax.swing.JButton();
        tipoTitleUs = new javax.swing.JLabel();
        desktopPrincipal = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        btn_Cliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_Juicios = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_Audiencias = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_Citas = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btn_Reportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(40, 40, 40));

        lbl_FotoUsuario.setText("");

        lbl_NombreUsuario.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        lbl_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NombreUsuario.setText("Usuario");

        pnl_btnAddpersona.setBackground(new java.awt.Color(40, 40, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/Add_persona.png"))); // NOI18N

        btn_Persona.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_Persona.setForeground(new java.awt.Color(255, 255, 255));
        btn_Persona.setText("Persona");
        btn_Persona.setBorder(null);
        btn_Persona.setBorderPainted(false);
        btn_Persona.setContentAreaFilled(false);
        btn_Persona.setFocusPainted(false);
        btn_Persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_btnAddpersonaLayout = new javax.swing.GroupLayout(pnl_btnAddpersona);
        pnl_btnAddpersona.setLayout(pnl_btnAddpersonaLayout);
        pnl_btnAddpersonaLayout.setHorizontalGroup(
            pnl_btnAddpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnAddpersonaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel17)
                .addGap(30, 30, 30)
                .addComponent(btn_Persona)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_btnAddpersonaLayout.setVerticalGroup(
            pnl_btnAddpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnAddpersonaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Persona)
                .addContainerGap())
        );

        pnl_btnInicio.setBackground(new java.awt.Color(40, 40, 40));
        pnl_btnInicio.setPreferredSize(new java.awt.Dimension(200, 51));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/Inicio.png"))); // NOI18N

        btn_Inicio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_Inicio.setText("Inicio");
        btn_Inicio.setToolTipText("");
        btn_Inicio.setBorder(null);
        btn_Inicio.setBorderPainted(false);
        btn_Inicio.setContentAreaFilled(false);
        btn_Inicio.setFocusPainted(false);

        javax.swing.GroupLayout pnl_btnInicioLayout = new javax.swing.GroupLayout(pnl_btnInicio);
        pnl_btnInicio.setLayout(pnl_btnInicioLayout);
        pnl_btnInicioLayout.setHorizontalGroup(
            pnl_btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnInicioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel21)
                .addGap(30, 30, 30)
                .addComponent(btn_Inicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_btnInicioLayout.setVerticalGroup(
            pnl_btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(btn_Inicio))
                .addGap(31, 31, 31))
        );

        pnl_btnAddempleado.setBackground(new java.awt.Color(40, 40, 40));
        pnl_btnAddempleado.setPreferredSize(new java.awt.Dimension(200, 51));

        btn_Empleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        btn_Empleado.setText("Empleado");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/Add_Trabajadores.png"))); // NOI18N

        javax.swing.GroupLayout pnl_btnAddempleadoLayout = new javax.swing.GroupLayout(pnl_btnAddempleado);
        pnl_btnAddempleado.setLayout(pnl_btnAddempleadoLayout);
        pnl_btnAddempleadoLayout.setHorizontalGroup(
            pnl_btnAddempleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnAddempleadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel23)
                .addGap(29, 29, 29)
                .addComponent(btn_Empleado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_btnAddempleadoLayout.setVerticalGroup(
            pnl_btnAddempleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnAddempleadoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_btnAddempleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(btn_Empleado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_btnAddusuario.setBackground(new java.awt.Color(40, 40, 40));
        pnl_btnAddusuario.setPreferredSize(new java.awt.Dimension(200, 51));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/Add_Usuario.png"))); // NOI18N

        btn_Usuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_Usuario.setText("Usuario");
        btn_Usuario.setBorder(null);
        btn_Usuario.setBorderPainted(false);
        btn_Usuario.setContentAreaFilled(false);
        btn_Usuario.setFocusPainted(false);

        javax.swing.GroupLayout pnl_btnAddusuarioLayout = new javax.swing.GroupLayout(pnl_btnAddusuario);
        pnl_btnAddusuario.setLayout(pnl_btnAddusuarioLayout);
        pnl_btnAddusuarioLayout.setHorizontalGroup(
            pnl_btnAddusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnAddusuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addGap(27, 27, 27)
                .addComponent(btn_Usuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_btnAddusuarioLayout.setVerticalGroup(
            pnl_btnAddusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnAddusuarioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_btnAddusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(btn_Usuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_btnAddRoles.setBackground(new java.awt.Color(40, 40, 40));
        pnl_btnAddRoles.setPreferredSize(new java.awt.Dimension(200, 51));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes2/btn_roles.png"))); // NOI18N

        btn_Roles.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_Roles.setForeground(new java.awt.Color(255, 255, 255));
        btn_Roles.setText("Roles");
        btn_Roles.setBorder(null);
        btn_Roles.setBorderPainted(false);
        btn_Roles.setContentAreaFilled(false);
        btn_Roles.setFocusPainted(false);

        javax.swing.GroupLayout pnl_btnAddRolesLayout = new javax.swing.GroupLayout(pnl_btnAddRoles);
        pnl_btnAddRoles.setLayout(pnl_btnAddRolesLayout);
        pnl_btnAddRolesLayout.setHorizontalGroup(
            pnl_btnAddRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnAddRolesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel26)
                .addGap(32, 32, 32)
                .addComponent(btn_Roles)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_btnAddRolesLayout.setVerticalGroup(
            pnl_btnAddRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnAddRolesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_btnAddRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(btn_Roles))
                .addGap(20, 20, 20))
        );

        tipoTitleUs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tipoTitleUs.setForeground(new java.awt.Color(255, 255, 255));
        tipoTitleUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoTitleUs.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_btnAddusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
            .addComponent(pnl_btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
            .addComponent(pnl_btnAddRoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
            .addComponent(pnl_btnAddempleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
            .addComponent(pnl_btnAddpersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbl_FotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lbl_NombreUsuario))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(tipoTitleUs, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_FotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_NombreUsuario)
                .addGap(66, 66, 66)
                .addComponent(pnl_btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_btnAddpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(pnl_btnAddempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pnl_btnAddusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pnl_btnAddRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(tipoTitleUs)
                .addContainerGap())
        );

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1215, Short.MAX_VALUE)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jToolBar1.setBackground(new java.awt.Color(40, 40, 40));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btn_Cliente.setBackground(new java.awt.Color(40, 40, 40));
        btn_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_cliente.png"))); // NOI18N
        btn_Cliente.setToolTipText("Agregar un Cliente");
        btn_Cliente.setBorderPainted(false);
        btn_Cliente.setFocusPainted(false);
        btn_Cliente.setFocusable(false);
        btn_Cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_Cliente);
        jToolBar1.add(jSeparator1);

        btn_Juicios.setBackground(new java.awt.Color(40, 40, 40));
        btn_Juicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_juicios.png"))); // NOI18N
        btn_Juicios.setToolTipText("Agregar un Juicio");
        btn_Juicios.setBorderPainted(false);
        btn_Juicios.setFocusPainted(false);
        btn_Juicios.setFocusable(false);
        btn_Juicios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Juicios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_Juicios);
        jToolBar1.add(jSeparator2);

        btn_Audiencias.setBackground(new java.awt.Color(40, 40, 40));
        btn_Audiencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_audiencias.png"))); // NOI18N
        btn_Audiencias.setText(" ");
        btn_Audiencias.setToolTipText("Agendar Audiencia");
        btn_Audiencias.setBorderPainted(false);
        btn_Audiencias.setFocusPainted(false);
        btn_Audiencias.setFocusable(false);
        btn_Audiencias.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_Audiencias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_Audiencias);
        jToolBar1.add(jSeparator3);

        btn_Citas.setBackground(new java.awt.Color(40, 40, 40));
        btn_Citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_citas.png"))); // NOI18N
        btn_Citas.setToolTipText("Agendar Cita");
        btn_Citas.setBorder(null);
        btn_Citas.setBorderPainted(false);
        btn_Citas.setFocusPainted(false);
        btn_Citas.setFocusable(false);
        btn_Citas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Citas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_Citas);
        jToolBar1.add(jSeparator4);

        btn_Reportes.setBackground(new java.awt.Color(40, 40, 40));
        btn_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/btn_reportes.png"))); // NOI18N
        btn_Reportes.setBorder(null);
        btn_Reportes.setBorderPainted(false);
        btn_Reportes.setFocusPainted(false);
        btn_Reportes.setFocusable(false);
        btn_Reportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Reportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_Reportes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(desktopPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(desktopPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_PersonaActionPerformed

    public JButton getBtn_Audiencias() {
        return btn_Audiencias;
    }

    public void setBtn_Audiencias(JButton btn_Audiencias) {
        this.btn_Audiencias = btn_Audiencias;
    }

    public JButton getBtn_Citas() {
        return btn_Citas;
    }

    public void setBtn_Citas(JButton btn_Citas) {
        this.btn_Citas = btn_Citas;
    }

    public JButton getBtn_Cliente() {
        return btn_Cliente;
    }

    public void setBtn_Cliente(JButton btn_Cliente) {
        this.btn_Cliente = btn_Cliente;
    }

    public JLabel getBtn_Empleado() {
        return btn_Empleado;
    }

    public void setBtn_Empleado(JLabel btn_Empleado) {
        this.btn_Empleado = btn_Empleado;
    }

    public JButton getBtn_Inicio() {
        return btn_Inicio;
    }

    public void setBtn_Inicio(JButton btn_Inicio) {
        this.btn_Inicio = btn_Inicio;
    }

    public JButton getBtn_Juicios() {
        return btn_Juicios;
    }

    public void setBtn_Juicios(JButton btn_Juicios) {
        this.btn_Juicios = btn_Juicios;
    }

    public JButton getBtn_Persona() {
        return btn_Persona;
    }

    public void setBtn_Persona(JButton btn_Persona) {
        this.btn_Persona = btn_Persona;
    }

    public JButton getBtn_Reportes() {
        return btn_Reportes;
    }

    public void setBtn_Reportes(JButton btn_Reportes) {
        this.btn_Reportes = btn_Reportes;
    }

    public JButton getBtn_Usuario() {
        return btn_Usuario;
    }

    public void setBtn_Usuario(JButton btn_Usuario) {
        this.btn_Usuario = btn_Usuario;
    }

    public JDesktopPane getDesktopPrincipal() {
        return desktopPrincipal;
    }

    public void setDesktopPrincipal(JDesktopPane desktopPrincipal) {
        this.desktopPrincipal = desktopPrincipal;
    }

    public CLabel getLbl_FotoUsuario() {
        return lbl_FotoUsuario;
    }

    public void setLbl_FotoUsuario(CLabel lbl_FotoUsuario) {
        this.lbl_FotoUsuario = lbl_FotoUsuario;
    }

    public JLabel getLbl_NombreUsuario() {
        return lbl_NombreUsuario;
    }

    public void setLbl_NombreUsuario(JLabel lbl_NombreUsuario) {
        this.lbl_NombreUsuario = lbl_NombreUsuario;
    }

    public JPanel getPnl_btnAddempleado() {
        return pnl_btnAddempleado;
    }

    public void setPnl_btnAddempleado(JPanel pnl_btnAddempleado) {
        this.pnl_btnAddempleado = pnl_btnAddempleado;
    }

    public JPanel getPnl_btnAddpersona() {
        return pnl_btnAddpersona;
    }

    public void setPnl_btnAddpersona(JPanel pnl_btnAddpersona) {
        this.pnl_btnAddpersona = pnl_btnAddpersona;
    }

    public JPanel getPnl_btnAddusuario() {
        return pnl_btnAddusuario;
    }

    public void setPnl_btnAddusuario(JPanel pnl_btnAddusuario) {
        this.pnl_btnAddusuario = pnl_btnAddusuario;
    }

    public JPanel getPnl_btnInicio() {
        return pnl_btnInicio;
    }

    public void setPnl_btnInicio(JPanel pnl_btnInicio) {
        this.pnl_btnInicio = pnl_btnInicio;
    }

    public JButton getBtn_Roles() {
        return btn_Roles;
    }

    public void setBtn_Roles(JButton btn_Roles) {
        this.btn_Roles = btn_Roles;
    }

    public JPanel getPnl_btnAddRoles() {
        return pnl_btnAddRoles;
    }

    public void setPnl_btnAddRoles(JPanel pnl_btnAddRoles) {
        this.pnl_btnAddRoles = pnl_btnAddRoles;
    }

    public JLabel getTipoTitleUs() {
        return tipoTitleUs;
    }

    public void setTipoTitleUs(JLabel tipoTitleUs) {
        this.tipoTitleUs = tipoTitleUs;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Audiencias;
    private javax.swing.JButton btn_Citas;
    private javax.swing.JButton btn_Cliente;
    private javax.swing.JLabel btn_Empleado;
    private javax.swing.JButton btn_Inicio;
    private javax.swing.JButton btn_Juicios;
    private javax.swing.JButton btn_Persona;
    private javax.swing.JButton btn_Reportes;
    private javax.swing.JButton btn_Roles;
    private javax.swing.JButton btn_Usuario;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private com.bolivia.label.CLabel lbl_FotoUsuario;
    private javax.swing.JLabel lbl_NombreUsuario;
    private javax.swing.JPanel pnl_btnAddRoles;
    private javax.swing.JPanel pnl_btnAddempleado;
    private javax.swing.JPanel pnl_btnAddpersona;
    private javax.swing.JPanel pnl_btnAddusuario;
    private javax.swing.JPanel pnl_btnInicio;
    private javax.swing.JLabel tipoTitleUs;
    // End of variables declaration//GEN-END:variables
}

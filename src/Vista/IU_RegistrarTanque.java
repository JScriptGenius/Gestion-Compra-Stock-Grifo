package Vista;

public class IU_RegistrarTanque extends javax.swing.JInternalFrame {

    public IU_RegistrarTanque() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtgGB_ESTADOS = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblTANQUES = new javax.swing.JTable();
        jbtnREFRESCAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtserie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcmbcombustible = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtxtcapacidadmax = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtcantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcmbestado = new javax.swing.JComboBox<>();
        jbtnREGISTRAR = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jrbhabilitado = new javax.swing.JRadioButton();
        jrbinhabilitado = new javax.swing.JRadioButton();
        jbtnACTUALIZAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 38, 59));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblTANQUES.setBackground(new java.awt.Color(224, 225, 221));
        jtblTANQUES.setForeground(new java.awt.Color(27, 38, 59));
        jScrollPane1.setViewportView(jtblTANQUES);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 660, 250));

        jbtnREFRESCAR.setBackground(new java.awt.Color(224, 225, 221));
        jbtnREFRESCAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnREFRESCAR.setForeground(new java.awt.Color(120, 0, 0));
        jbtnREFRESCAR.setText("REFRESCAR TABLA");
        jPanel1.add(jbtnREFRESCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 300, 40));

        jPanel2.setBackground(new java.awt.Color(224, 225, 221));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)), "INFORMACIÓN TANQUE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(27, 38, 59))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(224, 225, 221));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 38, 59));
        jLabel3.setText("Serie");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 250, -1));
        jPanel2.add(jtxtserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 250, 30));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 38, 59));
        jLabel4.setText("Combustible");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 250, -1));

        jcmbcombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jcmbcombustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 250, 30));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(27, 38, 59));
        jLabel5.setText("Capacidad Maxima");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 250, -1));
        jPanel2.add(jtxtcapacidadmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 250, 30));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(27, 38, 59));
        jLabel7.setText("Cantidad");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 250, -1));
        jPanel2.add(jtxtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 250, 30));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 38, 59));
        jLabel6.setText("Estado");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 250, -1));

        jcmbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jcmbestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 250, 30));

        jbtnREGISTRAR.setBackground(new java.awt.Color(52, 52, 52));
        jbtnREGISTRAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnREGISTRAR.setForeground(new java.awt.Color(224, 225, 221));
        jbtnREGISTRAR.setText("REGISTRAR");
        jPanel2.add(jbtnREGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 250, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 350, 460));

        jPanel3.setBackground(new java.awt.Color(41, 83, 104));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 225, 221)), "FILTRAR X ESTADO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(224, 225, 221))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(241, 250, 238));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrbhabilitado.setBackground(new java.awt.Color(41, 83, 104));
        jbtgGB_ESTADOS.add(jrbhabilitado);
        jrbhabilitado.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jrbhabilitado.setForeground(new java.awt.Color(0, 208, 24));
        jrbhabilitado.setText("HABILITADOS");
        jPanel3.add(jrbhabilitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 160, -1));

        jrbinhabilitado.setBackground(new java.awt.Color(41, 83, 104));
        jbtgGB_ESTADOS.add(jrbinhabilitado);
        jrbinhabilitado.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jrbinhabilitado.setForeground(new java.awt.Color(235, 60, 60));
        jrbinhabilitado.setText("INHABILITADOS");
        jrbinhabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbinhabilitadoActionPerformed(evt);
            }
        });
        jPanel3.add(jrbinhabilitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 170, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 440, 90));

        jbtnACTUALIZAR.setBackground(new java.awt.Color(224, 225, 221));
        jbtnACTUALIZAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnACTUALIZAR.setForeground(new java.awt.Color(120, 0, 0));
        jbtnACTUALIZAR.setText("ACTUALIZAR");
        jPanel1.add(jbtnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 300, 40));

        jLabel8.setBackground(new java.awt.Color(224, 225, 221));
        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(27, 38, 59));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TABLA TANQUES");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 225, 221)));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 660, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1160, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ENCABEZADO_COMBUSTIBLERIA.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbinhabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbinhabilitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbinhabilitadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.ButtonGroup jbtgGB_ESTADOS;
    public javax.swing.JButton jbtnACTUALIZAR;
    public javax.swing.JButton jbtnREFRESCAR;
    public javax.swing.JButton jbtnREGISTRAR;
    public javax.swing.JComboBox<String> jcmbcombustible;
    public javax.swing.JComboBox<String> jcmbestado;
    public javax.swing.JRadioButton jrbhabilitado;
    public javax.swing.JRadioButton jrbinhabilitado;
    public javax.swing.JTable jtblTANQUES;
    public javax.swing.JTextField jtxtcantidad;
    public javax.swing.JTextField jtxtcapacidadmax;
    public javax.swing.JTextField jtxtserie;
    // End of variables declaration//GEN-END:variables
}

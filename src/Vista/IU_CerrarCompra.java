package Vista;

public class IU_CerrarCompra extends javax.swing.JInternalFrame {

    public IU_CerrarCompra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblSOLICITUDES = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jcmbestadop = new javax.swing.JComboBox<>();
        jbtnACTUALIZAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbtnREFRESCAR = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jdcfecha = new com.toedter.calendar.JDateChooser();
        jbtnFILTRAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DINERO.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 260));

        jPanel1.setBackground(new java.awt.Color(121, 155, 155));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblSOLICITUDES.setBackground(new java.awt.Color(224, 225, 221));
        jtblSOLICITUDES.setForeground(new java.awt.Color(27, 38, 59));
        jScrollPane1.setViewportView(jtblSOLICITUDES);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 620, 320));

        jPanel2.setBackground(new java.awt.Color(224, 225, 221));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)), "ACTUALIZAR ESTADO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(27, 38, 59))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcmbestadop.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jcmbestadop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En proceso" }));
        jPanel2.add(jcmbestadop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 40));

        jbtnACTUALIZAR.setBackground(new java.awt.Color(27, 38, 59));
        jbtnACTUALIZAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnACTUALIZAR.setForeground(new java.awt.Color(224, 225, 221));
        jbtnACTUALIZAR.setText("ACTUALIZAR");
        jPanel2.add(jbtnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 250, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 38, 59));
        jLabel3.setText("Estado pedido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 230, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 310, 200));

        jbtnREFRESCAR.setBackground(new java.awt.Color(224, 225, 221));
        jbtnREFRESCAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnREFRESCAR.setForeground(new java.awt.Color(120, 0, 0));
        jbtnREFRESCAR.setText("REFRESCAR TABLA");
        jPanel1.add(jbtnREFRESCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 620, -1));

        jPanel3.setBackground(new java.awt.Color(121, 155, 155));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)), "FILTRAR X FECHA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(27, 38, 59))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jdcfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 40));

        jbtnFILTRAR.setBackground(new java.awt.Color(224, 225, 221));
        jbtnFILTRAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnFILTRAR.setForeground(new java.awt.Color(120, 0, 0));
        jbtnFILTRAR.setText("FILTRAR");
        jPanel3.add(jbtnFILTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 250, -1));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 38, 59));
        jLabel2.setText("Fecha");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 250, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 310, 200));

        jLabel6.setBackground(new java.awt.Color(27, 38, 59));
        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(224, 225, 221));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TABLA SOLICITUD COMPRA");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 620, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1020, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtnACTUALIZAR;
    public javax.swing.JButton jbtnFILTRAR;
    public javax.swing.JButton jbtnREFRESCAR;
    public javax.swing.JComboBox<String> jcmbestadop;
    public com.toedter.calendar.JDateChooser jdcfecha;
    public javax.swing.JTable jtblSOLICITUDES;
    // End of variables declaration//GEN-END:variables
}

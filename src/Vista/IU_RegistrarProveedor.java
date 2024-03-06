package Vista;

public class IU_RegistrarProveedor extends javax.swing.JInternalFrame {

    public IU_RegistrarProveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblPROVEEDORES = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jtxtempresa = new javax.swing.JTextField();
        jbtnREGISTRAR = new javax.swing.JButton();
        jlblID = new javax.swing.JLabel();
        jbtnELIMINAR = new javax.swing.JButton();
        jbtnACTUALIZAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(27, 38, 59));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblPROVEEDORES.setBackground(new java.awt.Color(224, 225, 221));
        jtblPROVEEDORES.setForeground(new java.awt.Color(27, 38, 59));
        jScrollPane3.setViewportView(jtblPROVEEDORES);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 280, 190));

        jPanel1.setBackground(new java.awt.Color(224, 225, 221));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)), "INFORMACIÓN PROVEEDOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(27, 38, 59))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(27, 38, 59));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Nombre de la empresa");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, -1));

        jtxtempresa.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel1.add(jtxtempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 270, 30));

        jbtnREGISTRAR.setBackground(new java.awt.Color(52, 52, 52));
        jbtnREGISTRAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnREGISTRAR.setForeground(new java.awt.Color(224, 225, 221));
        jbtnREGISTRAR.setText("REGISTRAR");
        jPanel1.add(jbtnREGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, 40));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 320, 180));

        jlblID.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jlblID.setForeground(new java.awt.Color(224, 225, 221));
        jPanel4.add(jlblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 70, 40));

        jbtnELIMINAR.setBackground(new java.awt.Color(224, 225, 221));
        jbtnELIMINAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnELIMINAR.setForeground(new java.awt.Color(120, 0, 0));
        jbtnELIMINAR.setText("ELIMINAR");
        jPanel4.add(jbtnELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 140, -1));

        jbtnACTUALIZAR.setBackground(new java.awt.Color(224, 225, 221));
        jbtnACTUALIZAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnACTUALIZAR.setForeground(new java.awt.Color(120, 0, 0));
        jbtnACTUALIZAR.setText("ACTUALIZAR");
        jPanel4.add(jbtnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, -1));

        jLabel8.setBackground(new java.awt.Color(224, 225, 221));
        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(27, 38, 59));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TABLA PROVEEDORES");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 225, 221)));
        jLabel8.setOpaque(true);
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 280, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 720, 310));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PROVEEDOR.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JButton jbtnACTUALIZAR;
    public javax.swing.JButton jbtnELIMINAR;
    public javax.swing.JButton jbtnREGISTRAR;
    public javax.swing.JLabel jlblID;
    public javax.swing.JTable jtblPROVEEDORES;
    public javax.swing.JTextField jtxtempresa;
    // End of variables declaration//GEN-END:variables
}

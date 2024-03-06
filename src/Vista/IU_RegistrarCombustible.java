package Vista;

public class IU_RegistrarCombustible extends javax.swing.JInternalFrame {

    public IU_RegistrarCombustible() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblCOMBUSTIBLES = new javax.swing.JTable();
        jbtnELIMINAR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnREGISTRAR = new javax.swing.JButton();
        jtxtnombre = new javax.swing.JTextField();
        jtxtoctanaje = new javax.swing.JTextField();
        jbtnACTUALIZAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(27, 38, 59));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblCOMBUSTIBLES.setBackground(new java.awt.Color(224, 225, 221));
        jtblCOMBUSTIBLES.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jtblCOMBUSTIBLES.setForeground(new java.awt.Color(27, 38, 59));
        jtblCOMBUSTIBLES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblCOMBUSTIBLES);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 510, 220));

        jbtnELIMINAR.setBackground(new java.awt.Color(224, 225, 221));
        jbtnELIMINAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnELIMINAR.setForeground(new java.awt.Color(120, 0, 0));
        jbtnELIMINAR.setText("ELIMINAR");
        jPanel2.add(jbtnELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 230, -1));

        jPanel1.setBackground(new java.awt.Color(224, 225, 221));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)), "INFORMACIÓN COMBUSTIBLE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(27, 38, 59))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 38, 59));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nombre Combustible");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 230, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 38, 59));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Octanaje");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 230, -1));

        jbtnREGISTRAR.setBackground(new java.awt.Color(27, 38, 59));
        jbtnREGISTRAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnREGISTRAR.setForeground(new java.awt.Color(224, 225, 221));
        jbtnREGISTRAR.setText("REGISTRAR");
        jPanel1.add(jbtnREGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, -1));
        jPanel1.add(jtxtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 30));
        jPanel1.add(jtxtoctanaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 310, 320));

        jbtnACTUALIZAR.setBackground(new java.awt.Color(224, 225, 221));
        jbtnACTUALIZAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnACTUALIZAR.setForeground(new java.awt.Color(120, 0, 0));
        jbtnACTUALIZAR.setText("ACTUALIZAR");
        jPanel2.add(jbtnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 230, -1));

        jLabel8.setBackground(new java.awt.Color(224, 225, 221));
        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(27, 38, 59));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TABLA COMBUSTIBLES");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 225, 221)));
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 510, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 910, 380));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GASOLINERIA.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, 1060, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtnACTUALIZAR;
    public javax.swing.JButton jbtnELIMINAR;
    public javax.swing.JButton jbtnREGISTRAR;
    public javax.swing.JTable jtblCOMBUSTIBLES;
    public javax.swing.JTextField jtxtnombre;
    public javax.swing.JTextField jtxtoctanaje;
    // End of variables declaration//GEN-END:variables
}

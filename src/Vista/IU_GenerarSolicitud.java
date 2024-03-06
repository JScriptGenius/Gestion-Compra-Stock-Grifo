package Vista;

public class IU_GenerarSolicitud extends javax.swing.JInternalFrame {

    public IU_GenerarSolicitud() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblSOLICITUDES = new javax.swing.JTable();
        jbtnACTUALIZAR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdcfecha = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcmbtransportista = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jcmbproveedor = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jcmbcombustible = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtxtcantidad = new javax.swing.JTextField();
        jbtnGENERAR = new javax.swing.JButton();
        jcmbtanque = new javax.swing.JComboBox<>();
        jlblID = new javax.swing.JLabel();
        jbtnCANCELAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblTANQUES = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblREPORTE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(27, 38, 59));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblSOLICITUDES.setBackground(new java.awt.Color(224, 225, 221));
        jtblSOLICITUDES.setForeground(new java.awt.Color(27, 38, 59));
        jScrollPane3.setViewportView(jtblSOLICITUDES);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 740, 220));

        jbtnACTUALIZAR.setBackground(new java.awt.Color(224, 225, 221));
        jbtnACTUALIZAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnACTUALIZAR.setForeground(new java.awt.Color(120, 0, 0));
        jbtnACTUALIZAR.setText("ACTUALIZAR");
        jPanel4.add(jbtnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 160, 40));

        jPanel1.setBackground(new java.awt.Color(224, 225, 221));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)), "INFORMACIÓN SOLICITUD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(27, 38, 59))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 38, 59));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Fecha");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 270, -1));
        jPanel1.add(jdcfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, 40));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(27, 38, 59));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Tanque");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, -1));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(27, 38, 59));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Transportista");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 140, -1));

        jcmbtransportista.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel1.add(jcmbtransportista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 270, 40));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(27, 38, 59));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Proveedor");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, -1));

        jcmbproveedor.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel1.add(jcmbproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 40));

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(27, 38, 59));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Combustible");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 270, -1));

        jcmbcombustible.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel1.add(jcmbcombustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 40));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(27, 38, 59));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Cantidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 270, -1));

        jtxtcantidad.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel1.add(jtxtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 270, 30));

        jbtnGENERAR.setBackground(new java.awt.Color(52, 52, 52));
        jbtnGENERAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnGENERAR.setForeground(new java.awt.Color(224, 225, 221));
        jbtnGENERAR.setText("GENERAR");
        jPanel1.add(jbtnGENERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 270, 40));

        jPanel1.add(jcmbtanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 270, 40));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 560));

        jlblID.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jlblID.setForeground(new java.awt.Color(224, 225, 221));
        jPanel4.add(jlblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 70, 40));

        jbtnCANCELAR.setBackground(new java.awt.Color(224, 225, 221));
        jbtnCANCELAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnCANCELAR.setForeground(new java.awt.Color(120, 0, 0));
        jbtnCANCELAR.setText("CANCELAR");
        jPanel4.add(jbtnCANCELAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 530, 160, 40));

        jPanel2.setBackground(new java.awt.Color(27, 38, 59));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 225, 221)), "INFORMACIÓN TANQUES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(224, 225, 221))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblTANQUES.setBackground(new java.awt.Color(224, 225, 221));
        jtblTANQUES.setForeground(new java.awt.Color(27, 38, 59));
        jScrollPane1.setViewportView(jtblTANQUES);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 700, 140));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 740, 200));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(224, 225, 221));
        jLabel5.setText("ID SOLICITUD:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 130, 40));

        jLabel3.setBackground(new java.awt.Color(224, 225, 221));
        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 38, 59));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TABLA SOLICITUD COMPRA");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 225, 221)));
        jLabel3.setOpaque(true);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 740, 30));

        jlblREPORTE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblREPORTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte.png"))); // NOI18N
        jPanel4.add(jlblREPORTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 510, 70, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1160, 620));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CABECERA_GRIFO.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JButton jbtnACTUALIZAR;
    public javax.swing.JButton jbtnCANCELAR;
    public javax.swing.JButton jbtnGENERAR;
    public javax.swing.JComboBox<String> jcmbcombustible;
    public javax.swing.JComboBox<String> jcmbproveedor;
    public javax.swing.JComboBox<String> jcmbtanque;
    public javax.swing.JComboBox<String> jcmbtransportista;
    public com.toedter.calendar.JDateChooser jdcfecha;
    public javax.swing.JLabel jlblID;
    public javax.swing.JLabel jlblREPORTE;
    public javax.swing.JTable jtblSOLICITUDES;
    public javax.swing.JTable jtblTANQUES;
    public javax.swing.JTextField jtxtcantidad;
    // End of variables declaration//GEN-END:variables
}

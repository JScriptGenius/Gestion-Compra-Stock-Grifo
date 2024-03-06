package Vista;

public class IU_GestionarTanque extends javax.swing.JInternalFrame {

    public IU_GestionarTanque() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtgACCION_TANQUE = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbtnREFRESCAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblSOLICITUDES = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblTANQUES = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlblfondollenar = new javax.swing.JLabel();
        jlblfondovaciar = new javax.swing.JLabel();
        jpanvaciado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtcantidadVaciado = new javax.swing.JTextField();
        jbtnVACIAR = new javax.swing.JButton();
        jpanllenado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtxtcantidadLlenado = new javax.swing.JTextField();
        jbtnLLENAR = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jlblserie = new javax.swing.JLabel();
        jrbllenar = new javax.swing.JRadioButton();
        jrbvaciar = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(121, 155, 155));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnREFRESCAR.setBackground(new java.awt.Color(27, 38, 59));
        jbtnREFRESCAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnREFRESCAR.setForeground(new java.awt.Color(224, 225, 221));
        jbtnREFRESCAR.setText("REFRESCAR TABLA");
        jPanel1.add(jbtnREFRESCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 720, 720, -1));

        jtblSOLICITUDES.setBackground(new java.awt.Color(224, 225, 221));
        jtblSOLICITUDES.setForeground(new java.awt.Color(27, 38, 59));
        jScrollPane1.setViewportView(jtblSOLICITUDES);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 760, 260));

        jtblTANQUES.setBackground(new java.awt.Color(224, 225, 221));
        jtblTANQUES.setForeground(new java.awt.Color(27, 38, 59));
        jScrollPane2.setViewportView(jtblTANQUES);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 760, 310));

        jLabel5.setBackground(new java.awt.Color(27, 38, 59));
        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(224, 225, 221));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TABLA TANQUES");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 760, 30));

        jLabel6.setBackground(new java.awt.Color(27, 38, 59));
        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(224, 225, 221));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TABLA SOLICITUD COMPRA");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 760, 30));

        jlblfondollenar.setBackground(new java.awt.Color(120, 121, 118));
        jlblfondollenar.setOpaque(true);
        jPanel1.add(jlblfondollenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 280, 170));

        jlblfondovaciar.setBackground(new java.awt.Color(120, 121, 118));
        jlblfondovaciar.setOpaque(true);
        jPanel1.add(jlblfondovaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 280, 170));

        jpanvaciado.setBackground(new java.awt.Color(224, 225, 221));
        jpanvaciado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)), "VACIADO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(27, 38, 59))); // NOI18N
        jpanvaciado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 38, 59));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("CANTIDAD");
        jpanvaciado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, -1));
        jpanvaciado.add(jtxtcantidadVaciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, 30));

        jbtnVACIAR.setBackground(new java.awt.Color(27, 38, 59));
        jbtnVACIAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnVACIAR.setForeground(new java.awt.Color(224, 225, 221));
        jbtnVACIAR.setText("VACIAR");
        jpanvaciado.add(jbtnVACIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 160, 40));

        jPanel1.add(jpanvaciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 280, 160));

        jpanllenado.setBackground(new java.awt.Color(224, 225, 221));
        jpanllenado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)), "LLENADO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(27, 38, 59))); // NOI18N
        jpanllenado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 38, 59));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CANTIDAD");
        jpanllenado.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 200, -1));
        jpanllenado.add(jtxtcantidadLlenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, 30));

        jbtnLLENAR.setBackground(new java.awt.Color(27, 38, 59));
        jbtnLLENAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnLLENAR.setForeground(new java.awt.Color(224, 225, 221));
        jbtnLLENAR.setText("LLENAR");
        jpanllenado.add(jbtnLLENAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 160, 40));

        jPanel1.add(jpanllenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 280, 160));

        jPanel4.setBackground(new java.awt.Color(224, 225, 221));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 38, 59)), "SERIE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16), new java.awt.Color(27, 38, 59))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblserie.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jlblserie.setForeground(new java.awt.Color(27, 38, 59));
        jlblserie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jlblserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 200, 70));

        jrbllenar.setBackground(new java.awt.Color(120, 121, 118));
        jbtgACCION_TANQUE.add(jrbllenar);
        jrbllenar.setForeground(new java.awt.Color(224, 225, 221));
        jrbllenar.setText("LLENAR");
        jPanel1.add(jrbllenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 90, 30));

        jrbvaciar.setBackground(new java.awt.Color(120, 121, 118));
        jbtgACCION_TANQUE.add(jrbvaciar);
        jrbvaciar.setForeground(new java.awt.Color(224, 225, 221));
        jrbvaciar.setText("VACIAR");
        jPanel1.add(jrbvaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 560, 90, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOMBA_GASOLINA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 140, 140));

        jProgressBar1.setBackground(new java.awt.Color(121, 155, 155));
        jProgressBar1.setForeground(new java.awt.Color(120, 0, 0));
        jProgressBar1.setValue(50);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jbtgACCION_TANQUE;
    public javax.swing.JButton jbtnLLENAR;
    public javax.swing.JButton jbtnREFRESCAR;
    public javax.swing.JButton jbtnVACIAR;
    public javax.swing.JLabel jlblfondollenar;
    public javax.swing.JLabel jlblfondovaciar;
    public javax.swing.JLabel jlblserie;
    public javax.swing.JPanel jpanllenado;
    public javax.swing.JPanel jpanvaciado;
    public javax.swing.JRadioButton jrbllenar;
    public javax.swing.JRadioButton jrbvaciar;
    public javax.swing.JTable jtblSOLICITUDES;
    public javax.swing.JTable jtblTANQUES;
    public javax.swing.JTextField jtxtcantidadLlenado;
    public javax.swing.JTextField jtxtcantidadVaciado;
    // End of variables declaration//GEN-END:variables
}

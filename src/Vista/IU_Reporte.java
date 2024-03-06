package Vista;


public class IU_Reporte extends javax.swing.JFrame {

    public IU_Reporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpanFACTURA = new javax.swing.JPanel();
        jlblcantidad = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jlblID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlblfecha = new javax.swing.JLabel();
        jlblcombustible = new javax.swing.JLabel();
        jlbltanque = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlblproveedor = new javax.swing.JLabel();
        jtxtidsolicitud = new javax.swing.JTextField();
        jlblIMPRIMIR = new javax.swing.JLabel();
        jlblLIMPIAR = new javax.swing.JLabel();
        jlblBUSCAR = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(127, 137, 147));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanFACTURA.setBackground(new java.awt.Color(255, 255, 255));
        jpanFACTURA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblcantidad.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jlblcantidad.setForeground(new java.awt.Color(102, 102, 102));
        jpanFACTURA.add(jlblcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 340, 40));
        jpanFACTURA.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 170, 10));

        jPanel3.setBackground(new java.awt.Color(26, 69, 176));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblID.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        jlblID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jlblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 460, 80));

        jpanFACTURA.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 100));

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FECHA");
        jpanFACTURA.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 170, 30));

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("CANTIDAD:");
        jpanFACTURA.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, 40));

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("PROVEEDOR:");
        jpanFACTURA.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 40));

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("COMBUSTIBLE:");
        jpanFACTURA.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, 40));

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("TANQUE:");
        jpanFACTURA.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, 40));

        jlblfecha.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jlblfecha.setForeground(new java.awt.Color(102, 102, 102));
        jlblfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpanFACTURA.add(jlblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 170, 40));

        jlblcombustible.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jlblcombustible.setForeground(new java.awt.Color(102, 102, 102));
        jpanFACTURA.add(jlblcombustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 340, 40));

        jlbltanque.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jlbltanque.setForeground(new java.awt.Color(102, 102, 102));
        jpanFACTURA.add(jlbltanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 340, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gasolinera_reporte.png"))); // NOI18N
        jpanFACTURA.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 240, 270));

        jlblproveedor.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jlblproveedor.setForeground(new java.awt.Color(102, 102, 102));
        jpanFACTURA.add(jlblproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 340, 40));

        jPanel1.add(jpanFACTURA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 590, 750));

        jtxtidsolicitud.setBackground(new java.awt.Color(127, 137, 147));
        jtxtidsolicitud.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jtxtidsolicitud.setForeground(new java.awt.Color(255, 255, 255));
        jtxtidsolicitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtidsolicitud.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 69, 176), 2), "ID SOLICITUD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 14), new java.awt.Color(26, 69, 176))); // NOI18N
        jPanel1.add(jtxtidsolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 130, 60));

        jlblIMPRIMIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblIMPRIMIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imprimir.png"))); // NOI18N
        jPanel1.add(jlblIMPRIMIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 80, 80));

        jlblLIMPIAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLIMPIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpieza-de-datos.png"))); // NOI18N
        jPanel1.add(jlblLIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 80, 80));

        jlblBUSCAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblBUSCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_ID.png"))); // NOI18N
        jPanel1.add(jlblBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 80, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IU_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU_Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel jlblBUSCAR;
    public javax.swing.JLabel jlblID;
    public javax.swing.JLabel jlblIMPRIMIR;
    public javax.swing.JLabel jlblLIMPIAR;
    public javax.swing.JLabel jlblcantidad;
    public javax.swing.JLabel jlblcombustible;
    public javax.swing.JLabel jlblfecha;
    public javax.swing.JLabel jlblproveedor;
    public javax.swing.JLabel jlbltanque;
    public javax.swing.JPanel jpanFACTURA;
    public javax.swing.JTextField jtxtidsolicitud;
    // End of variables declaration//GEN-END:variables

}

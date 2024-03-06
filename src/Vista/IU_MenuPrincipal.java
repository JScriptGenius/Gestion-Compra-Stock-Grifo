package Vista;

public class IU_MenuPrincipal extends javax.swing.JFrame {

    public IU_MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jlblCargo = new javax.swing.JLabel();
        jlblIMAGEN_USUARIO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpanREGISTRAR_COMBUSTIBLE = new javax.swing.JPanel();
        jlblRC = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpanRECEPCIONAR_PEDIDO = new javax.swing.JPanel();
        jlblAC = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jpanGENERAR_SOLICITUDES = new javax.swing.JPanel();
        jlblSC = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jpanESTADO_TANQUES = new javax.swing.JPanel();
        jlblET = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jpanREGISTRAR_TANQUE = new javax.swing.JPanel();
        jlblTC = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jpanRECOGER_PEDIDO = new javax.swing.JPanel();
        jlblME = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jlblSALIR = new javax.swing.JLabel();
        jpanCERRAR_COMPRA = new javax.swing.JPanel();
        jlblET1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jpanREGISTRAR_PROVEEDOR = new javax.swing.JPanel();
        jlblET2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jbtnCERRAR_SESION = new javax.swing.JButton();
        jdespPANEL_INTERFACES = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(29, 53, 87));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(241, 250, 238));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 123, 157));
        jLabel3.setText("CARGO:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, 20));

        jlblUsuario.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jlblUsuario.setForeground(new java.awt.Color(29, 53, 87));
        jPanel5.add(jlblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 140, 20));

        jlblNombre.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jlblNombre.setForeground(new java.awt.Color(29, 53, 87));
        jPanel5.add(jlblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 140, 20));

        jlblCargo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jlblCargo.setForeground(new java.awt.Color(29, 53, 87));
        jPanel5.add(jlblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, 20));

        jlblIMAGEN_USUARIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblIMAGEN_USUARIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/USUARIO.png"))); // NOI18N
        jPanel5.add(jlblIMAGEN_USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 80));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 123, 157));
        jLabel2.setText("USUARIO:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 60, 20));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(69, 123, 157));
        jLabel6.setText("ID:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 60, 20));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(69, 123, 157));
        jLabel7.setText("NOMBRE:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 60, 20));

        jlblID.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jlblID.setForeground(new java.awt.Color(29, 53, 87));
        jPanel5.add(jlblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 140, 20));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 360, 120));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 250, 238));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("COMARSA");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 180, 30));

        jSeparator1.setBackground(new java.awt.Color(241, 250, 238));
        jSeparator1.setForeground(new java.awt.Color(241, 250, 238));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 150, 10));

        jpanREGISTRAR_COMBUSTIBLE.setBackground(new java.awt.Color(69, 123, 157));
        jpanREGISTRAR_COMBUSTIBLE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblRC.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jlblRC.setForeground(new java.awt.Color(255, 255, 255));
        jlblRC.setText("Registrar Combustible");
        jpanREGISTRAR_COMBUSTIBLE.add(jlblRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 180, 30));

        jLabel10.setBackground(new java.awt.Color(165, 165, 165));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRAR.png"))); // NOI18N
        jpanREGISTRAR_COMBUSTIBLE.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, 50));

        jPanel3.add(jpanREGISTRAR_COMBUSTIBLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 50));

        jpanRECEPCIONAR_PEDIDO.setBackground(new java.awt.Color(69, 123, 157));
        jpanRECEPCIONAR_PEDIDO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblAC.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jlblAC.setForeground(new java.awt.Color(255, 255, 255));
        jlblAC.setText("Recepcionar Pedido");
        jpanRECEPCIONAR_PEDIDO.add(jlblAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 180, 30));

        jLabel16.setBackground(new java.awt.Color(165, 165, 165));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/R_PEDIDO.png"))); // NOI18N
        jpanRECEPCIONAR_PEDIDO.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, 50));

        jPanel3.add(jpanRECEPCIONAR_PEDIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 400, 50));

        jpanGENERAR_SOLICITUDES.setBackground(new java.awt.Color(69, 123, 157));
        jpanGENERAR_SOLICITUDES.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblSC.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jlblSC.setForeground(new java.awt.Color(255, 255, 255));
        jlblSC.setText("Generar Solicitud");
        jpanGENERAR_SOLICITUDES.add(jlblSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 180, 30));

        jLabel11.setBackground(new java.awt.Color(165, 165, 165));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SOLICITUD_COMPRA.png"))); // NOI18N
        jpanGENERAR_SOLICITUDES.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, 50));

        jPanel3.add(jpanGENERAR_SOLICITUDES, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 50));

        jpanESTADO_TANQUES.setBackground(new java.awt.Color(69, 123, 157));
        jpanESTADO_TANQUES.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblET.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jlblET.setForeground(new java.awt.Color(255, 255, 255));
        jlblET.setText("Gestionar Tanque");
        jpanESTADO_TANQUES.add(jlblET, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 150, 30));

        jLabel12.setBackground(new java.awt.Color(165, 165, 165));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TANQUE_ESTADO.png"))); // NOI18N
        jpanESTADO_TANQUES.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 40, 40));

        jPanel3.add(jpanESTADO_TANQUES, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 400, 50));

        jpanREGISTRAR_TANQUE.setBackground(new java.awt.Color(69, 123, 157));
        jpanREGISTRAR_TANQUE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblTC.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jlblTC.setForeground(new java.awt.Color(255, 255, 255));
        jlblTC.setText("Registrar Tanque");
        jpanREGISTRAR_TANQUE.add(jlblTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 190, 30));

        jLabel14.setBackground(new java.awt.Color(165, 165, 165));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TANQUE_COMBUSTIBLE.png"))); // NOI18N
        jpanREGISTRAR_TANQUE.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, 50));

        jPanel3.add(jpanREGISTRAR_TANQUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 400, 50));

        jpanRECOGER_PEDIDO.setBackground(new java.awt.Color(69, 123, 157));
        jpanRECOGER_PEDIDO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblME.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jlblME.setForeground(new java.awt.Color(255, 255, 255));
        jlblME.setText("Recoger Pedido");
        jpanRECOGER_PEDIDO.add(jlblME, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, 30));

        jLabel15.setBackground(new java.awt.Color(165, 165, 165));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CAMION.png"))); // NOI18N
        jpanRECOGER_PEDIDO.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, 50));

        jPanel3.add(jpanRECOGER_PEDIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 400, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOTIPO_BLANCO.png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 70, 80));

        jlblSALIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CERRAR.png"))); // NOI18N
        jPanel3.add(jlblSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 0, 40, 40));

        jpanCERRAR_COMPRA.setBackground(new java.awt.Color(69, 123, 157));
        jpanCERRAR_COMPRA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblET1.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jlblET1.setForeground(new java.awt.Color(255, 255, 255));
        jlblET1.setText("Cerrar Compra");
        jpanCERRAR_COMPRA.add(jlblET1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 150, 30));

        jLabel13.setBackground(new java.awt.Color(165, 165, 165));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/C_COMPRA.png"))); // NOI18N
        jpanCERRAR_COMPRA.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, 50));

        jPanel3.add(jpanCERRAR_COMPRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 400, 50));

        jpanREGISTRAR_PROVEEDOR.setBackground(new java.awt.Color(69, 123, 157));
        jpanREGISTRAR_PROVEEDOR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblET2.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jlblET2.setForeground(new java.awt.Color(255, 255, 255));
        jlblET2.setText("Registrar Proveedor");
        jpanREGISTRAR_PROVEEDOR.add(jlblET2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 150, 30));

        jLabel18.setBackground(new java.awt.Color(165, 165, 165));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/R_PROVEEDOR.png"))); // NOI18N
        jpanREGISTRAR_PROVEEDOR.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, 50));

        jPanel3.add(jpanREGISTRAR_PROVEEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 400, 50));

        jbtnCERRAR_SESION.setBackground(new java.awt.Color(69, 123, 157));
        jbtnCERRAR_SESION.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jbtnCERRAR_SESION.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCERRAR_SESION.setText("CERRAR SESION");
        jPanel3.add(jbtnCERRAR_SESION, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 760, 240, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 820));

        jdespPANEL_INTERFACES.setBackground(new java.awt.Color(241, 250, 238));

        javax.swing.GroupLayout jdespPANEL_INTERFACESLayout = new javax.swing.GroupLayout(jdespPANEL_INTERFACES);
        jdespPANEL_INTERFACES.setLayout(jdespPANEL_INTERFACESLayout);
        jdespPANEL_INTERFACESLayout.setHorizontalGroup(
            jdespPANEL_INTERFACESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        jdespPANEL_INTERFACESLayout.setVerticalGroup(
            jdespPANEL_INTERFACESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );

        getContentPane().add(jdespPANEL_INTERFACES, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 1170, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JButton jbtnCERRAR_SESION;
    public javax.swing.JDesktopPane jdespPANEL_INTERFACES;
    public javax.swing.JLabel jlblAC;
    public javax.swing.JLabel jlblCargo;
    public javax.swing.JLabel jlblET;
    public javax.swing.JLabel jlblET1;
    public javax.swing.JLabel jlblET2;
    public javax.swing.JLabel jlblID;
    private javax.swing.JLabel jlblIMAGEN_USUARIO;
    public javax.swing.JLabel jlblME;
    public javax.swing.JLabel jlblNombre;
    public javax.swing.JLabel jlblRC;
    public javax.swing.JLabel jlblSALIR;
    public javax.swing.JLabel jlblSC;
    public javax.swing.JLabel jlblTC;
    public javax.swing.JLabel jlblUsuario;
    public javax.swing.JPanel jpanCERRAR_COMPRA;
    public javax.swing.JPanel jpanESTADO_TANQUES;
    public javax.swing.JPanel jpanGENERAR_SOLICITUDES;
    public javax.swing.JPanel jpanRECEPCIONAR_PEDIDO;
    public javax.swing.JPanel jpanRECOGER_PEDIDO;
    public javax.swing.JPanel jpanREGISTRAR_COMBUSTIBLE;
    public javax.swing.JPanel jpanREGISTRAR_PROVEEDOR;
    public javax.swing.JPanel jpanREGISTRAR_TANQUE;
    // End of variables declaration//GEN-END:variables

}

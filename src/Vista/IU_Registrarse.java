package Vista;

public class IU_Registrarse extends javax.swing.JFrame {

    public IU_Registrarse() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jpwdcontrasegna = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jpwdconfirmarpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jtxttelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtnombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcmbcargo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtxtapellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtcorreo = new javax.swing.JTextField();
        jbtnREGISTRARTE = new javax.swing.JButton();
        jlblVOLVER = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 250, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtusuario.setBackground(new java.awt.Color(255, 255, 255));
        jtxtusuario.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jPanel1.add(jtxtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 350, 30));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(69, 123, 157));
        jLabel1.setText("CONTRASEÑA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 350, 30));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 123, 157));
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 350, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 53, 87));
        jLabel3.setText("REGISTRARTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 53, 87));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("COMARSA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 180, 30));

        jSeparator1.setBackground(new java.awt.Color(29, 53, 87));
        jSeparator1.setForeground(new java.awt.Color(29, 53, 87));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 10));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOTIPO_AZUL.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 70, 80));

        jpwdcontrasegna.setBackground(new java.awt.Color(255, 255, 255));
        jpwdcontrasegna.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jPanel1.add(jpwdcontrasegna, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 350, 30));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(69, 123, 157));
        jLabel5.setText("CONFIRMAR CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 350, 30));

        jpwdconfirmarpass.setBackground(new java.awt.Color(255, 255, 255));
        jpwdconfirmarpass.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jPanel1.add(jpwdconfirmarpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 350, 30));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(69, 123, 157));
        jLabel6.setText("TELÉFONO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 170, 30));

        jtxttelefono.setBackground(new java.awt.Color(255, 255, 255));
        jtxttelefono.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jPanel1.add(jtxttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 170, 30));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(69, 123, 157));
        jLabel7.setText("NOMBRES");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 350, 30));

        jtxtnombre.setBackground(new java.awt.Color(255, 255, 255));
        jtxtnombre.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jPanel1.add(jtxtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 350, 30));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(69, 123, 157));
        jLabel8.setText("APELLIDOS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 350, 30));

        jcmbcargo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jcmbcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jcmbcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 170, 30));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(69, 123, 157));
        jLabel9.setText("CARGO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 170, 30));

        jtxtapellido.setBackground(new java.awt.Color(255, 255, 255));
        jtxtapellido.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jPanel1.add(jtxtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 350, 30));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(69, 123, 157));
        jLabel10.setText("CORREO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 350, 30));

        jtxtcorreo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtcorreo.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jPanel1.add(jtxtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 350, 30));

        jbtnREGISTRARTE.setBackground(new java.awt.Color(29, 53, 87));
        jbtnREGISTRARTE.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnREGISTRARTE.setForeground(new java.awt.Color(255, 255, 255));
        jbtnREGISTRARTE.setText("Registrarte");
        jPanel1.add(jbtnREGISTRARTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 710, 230, 40));

        jlblVOLVER.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jlblVOLVER.setForeground(new java.awt.Color(29, 53, 87));
        jlblVOLVER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblVOLVER.setText("Volver");
        jPanel1.add(jlblVOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 760, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 820));

        jPanel2.setBackground(new java.awt.Color(29, 53, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 50, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JButton jbtnREGISTRARTE;
    public javax.swing.JComboBox<String> jcmbcargo;
    public javax.swing.JLabel jlblVOLVER;
    public javax.swing.JPasswordField jpwdconfirmarpass;
    public javax.swing.JPasswordField jpwdcontrasegna;
    public javax.swing.JTextField jtxtapellido;
    public javax.swing.JTextField jtxtcorreo;
    public javax.swing.JTextField jtxtnombre;
    public javax.swing.JTextField jtxttelefono;
    public javax.swing.JTextField jtxtusuario;
    // End of variables declaration//GEN-END:variables

}

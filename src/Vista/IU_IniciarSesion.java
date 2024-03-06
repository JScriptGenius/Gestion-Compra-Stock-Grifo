package Vista;

public class IU_IniciarSesion extends javax.swing.JFrame {

    public IU_IniciarSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jtxtusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblREGISTRARTE = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jpswcontrasegna = new javax.swing.JPasswordField();
        jbtnINGRESAR = new javax.swing.JButton();
        jlblMOSTRAR = new javax.swing.JLabel();
        jlblOCULTAR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(29, 53, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 50, 530));

        jPanel1.setBackground(new java.awt.Color(241, 250, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtusuario.setBackground(new java.awt.Color(255, 255, 255));
        jtxtusuario.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jPanel1.add(jtxtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 370, 40));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(69, 123, 157));
        jLabel1.setText("CONTRASEÑA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 150, 30));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 123, 157));
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 150, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 53, 87));
        jLabel3.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 53, 87));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("COMARSA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 180, 30));

        jSeparator1.setBackground(new java.awt.Color(29, 53, 87));
        jSeparator1.setForeground(new java.awt.Color(29, 53, 87));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 10));

        jlblREGISTRARTE.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jlblREGISTRARTE.setForeground(new java.awt.Color(29, 53, 87));
        jlblREGISTRARTE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblREGISTRARTE.setText("Registrate");
        jPanel1.add(jlblREGISTRARTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 370, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOTIPO_AZUL.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 70, 80));

        jpswcontrasegna.setBackground(new java.awt.Color(255, 255, 255));
        jpswcontrasegna.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jPanel1.add(jpswcontrasegna, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 320, 40));

        jbtnINGRESAR.setBackground(new java.awt.Color(29, 53, 87));
        jbtnINGRESAR.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jbtnINGRESAR.setForeground(new java.awt.Color(255, 255, 255));
        jbtnINGRESAR.setText("Ingresar");
        jPanel1.add(jbtnINGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 370, 40));

        jlblMOSTRAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblMOSTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VISIBLE.png"))); // NOI18N
        jPanel1.add(jlblMOSTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 50, 40));

        jlblOCULTAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOCULTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INVISIBLE.png"))); // NOI18N
        jPanel1.add(jlblOCULTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JButton jbtnINGRESAR;
    public javax.swing.JLabel jlblMOSTRAR;
    public javax.swing.JLabel jlblOCULTAR;
    public javax.swing.JLabel jlblREGISTRARTE;
    public javax.swing.JPasswordField jpswcontrasegna;
    public javax.swing.JTextField jtxtusuario;
    // End of variables declaration//GEN-END:variables

}

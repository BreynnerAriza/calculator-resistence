package view;

import javax.swing.ImageIcon;

public class ResultadosValor extends javax.swing.JFrame {

    public ResultadosValor() {
        initComponents();
        setLocationRelativeTo(null);
        jLabel3.setVisible(false);
        oFormato.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        borde = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        resultadoTFormato = new javax.swing.JLabel();
        oFormato = new javax.swing.JLabel();
        resultado1Formato = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        resultado1 = new javax.swing.JLabel();
        resultadoT = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setTitle("Resultados");
        setIconImage(new ImageIcon(getClass().getResource("/img/Recurso 2.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 242, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multimetro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 19, 250, 350));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 109, 119));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Resultados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 228, -1));

        borde.setBackground(new java.awt.Color(0, 109, 119));

        javax.swing.GroupLayout bordeLayout = new javax.swing.GroupLayout(borde);
        borde.setLayout(bordeLayout);
        bordeLayout.setHorizontalGroup(
            bordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        bordeLayout.setVerticalGroup(
            bordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(borde, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 270, 5));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 8, 20));
        jLabel3.setText("Con su tolerancia el resultado es:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 270, 30));

        resultadoTFormato.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        resultadoTFormato.setForeground(new java.awt.Color(0, 8, 20));
        resultadoTFormato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(resultadoTFormato, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 280, 30));

        oFormato.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        oFormato.setForeground(new java.awt.Color(0, 8, 20));
        oFormato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oFormato.setText("o");
        jPanel1.add(oFormato, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 240, 30));

        resultado1Formato.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        resultado1Formato.setForeground(new java.awt.Color(0, 8, 20));
        resultado1Formato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(resultado1Formato, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 240, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 8, 20));
        jLabel6.setText("El valor de la resistencia seleccionada es:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 270, 30));

        resultado1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        resultado1.setForeground(new java.awt.Color(0, 8, 20));
        resultado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(resultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 240, 30));

        resultadoT.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        resultadoT.setForeground(new java.awt.Color(0, 8, 20));
        resultadoT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(resultadoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 280, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 8, 20));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("o");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void asignarResultado1(String resultado,String resultadoFormato){
        resultado1.setText(resultado);
        resultado1Formato.setText(resultado);
        resultado1Formato.setText(resultadoFormato);
    }
    
    public void asginarRultado2(String resultado,String resultadoFormato){
        resultadoT.setText(resultado);
        resultadoTFormato.setText(resultadoFormato);
        jLabel3.setVisible(true);
        oFormato.setVisible(true);
        resultadoTFormato.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel oFormato;
    private javax.swing.JLabel resultado1;
    private javax.swing.JLabel resultado1Formato;
    private javax.swing.JLabel resultadoT;
    private javax.swing.JLabel resultadoTFormato;
    // End of variables declaration//GEN-END:variables
}

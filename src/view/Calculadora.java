package view;

import javax.swing.ImageIcon;

public class Calculadora extends javax.swing.JFrame {    
    
    private final CalcularValor calcularValor = new CalcularValor();
    private final CalcularColores calcularColores = new CalcularColores();
    
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCalcularColores = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCalcularValor = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular resistencias");
        setIconImage(new ImageIcon(getClass().getResource("/img/Recurso 2.png")).getImage());
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 600));

        jPanel1.setBackground(new java.awt.Color(237, 246, 249));
        jPanel1.setForeground(new java.awt.Color(237, 246, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(512, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 119));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA DE RESISTENCIAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 550, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 41, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Img.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 560, 430));

        jPanel2.setBackground(new java.awt.Color(0, 109, 119));

        btnCalcularColores.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnCalcularColores.setForeground(new java.awt.Color(237, 246, 249));
        btnCalcularColores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCalcularColores.setText("Calcular colores");
        btnCalcularColores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcularColores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularColoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcularColores, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCalcularColores, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 220, 40));

        jPanel3.setBackground(new java.awt.Color(0, 109, 119));

        btnCalcularValor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnCalcularValor.setForeground(new java.awt.Color(237, 246, 249));
        btnCalcularValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCalcularValor.setText("Calcular valor");
        btnCalcularValor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcularValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularValorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalcularValorMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCalcularValor, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCalcularValor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 220, 40));

        jPanel4.setBackground(new java.awt.Color(0, 109, 119));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnCalcularValorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularValorMouseEntered
       
    }//GEN-LAST:event_btnCalcularValorMouseEntered

    private void btnCalcularValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularValorMouseClicked
        this.calcularValor.setVisible(true);
    }//GEN-LAST:event_btnCalcularValorMouseClicked

    private void btnCalcularColoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularColoresMouseClicked
       this.calcularColores.setVisible(true);
    }//GEN-LAST:event_btnCalcularColoresMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCalcularColores;
    private javax.swing.JLabel btnCalcularValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}

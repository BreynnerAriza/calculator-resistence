package view;

//Paquetes
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vendor.Colores;
import vendor.PrefijosConversion;
import vendor.Tolerancias;

public class CalcularValor extends javax.swing.JFrame {

    private ResultadosValor resultadosValor;

    public CalcularValor() {
        initComponents();
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        banda1 = new javax.swing.JComboBox<>();
        banda2 = new javax.swing.JComboBox<>();
        multiplicador = new javax.swing.JComboBox<>();
        tolerancia = new javax.swing.JComboBox<>();
        contenedorBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        borde = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        representacionBanda2 = new javax.swing.JPanel();
        representacionMultiplicador = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        representacionBanda1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        representacionTolerancia = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setTitle("Calcular Valor");
        setIconImage(new ImageIcon(getClass().getResource("/img/Recurso 2.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 242, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 109, 119));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CALCULAR VALOR");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 315, 40));

        banda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera banda" }));
        banda1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        banda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banda1ActionPerformed(evt);
            }
        });
        jPanel1.add(banda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 260, 38));

        banda2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda banda" }));
        banda2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        banda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banda2ActionPerformed(evt);
            }
        });
        jPanel1.add(banda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 260, 38));

        multiplicador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Multiplicador" }));
        multiplicador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicadorActionPerformed(evt);
            }
        });
        jPanel1.add(multiplicador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 260, 38));

        tolerancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tolerancia" }));
        tolerancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tolerancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toleranciaActionPerformed(evt);
            }
        });
        jPanel1.add(tolerancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 260, 38));

        contenedorBtn.setBackground(new java.awt.Color(0, 94, 129));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calcular");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout contenedorBtnLayout = new javax.swing.GroupLayout(contenedorBtn);
        contenedorBtn.setLayout(contenedorBtnLayout);
        contenedorBtnLayout.setHorizontalGroup(
            contenedorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        contenedorBtnLayout.setVerticalGroup(
            contenedorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(contenedorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        borde.setBackground(new java.awt.Color(0, 109, 119));

        javax.swing.GroupLayout bordeLayout = new javax.swing.GroupLayout(borde);
        borde.setLayout(bordeLayout);
        bordeLayout.setHorizontalGroup(
            bordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        bordeLayout.setVerticalGroup(
            bordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(borde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 290, 3));

        jPanel3.setBackground(new java.awt.Color(249, 234, 154));

        representacionBanda2.setBackground(new java.awt.Color(249, 234, 154));

        javax.swing.GroupLayout representacionBanda2Layout = new javax.swing.GroupLayout(representacionBanda2);
        representacionBanda2.setLayout(representacionBanda2Layout);
        representacionBanda2Layout.setHorizontalGroup(
            representacionBanda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        representacionBanda2Layout.setVerticalGroup(
            representacionBanda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        representacionMultiplicador.setBackground(new java.awt.Color(249, 234, 154));

        javax.swing.GroupLayout representacionMultiplicadorLayout = new javax.swing.GroupLayout(representacionMultiplicador);
        representacionMultiplicador.setLayout(representacionMultiplicadorLayout);
        representacionMultiplicadorLayout.setHorizontalGroup(
            representacionMultiplicadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        representacionMultiplicadorLayout.setVerticalGroup(
            representacionMultiplicadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(representacionBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(representacionMultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(representacionBanda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(representacionMultiplicador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 65, 90, 60));

        jPanel5.setBackground(new java.awt.Color(249, 234, 154));

        representacionBanda1.setBackground(new java.awt.Color(249, 234, 154));

        javax.swing.GroupLayout representacionBanda1Layout = new javax.swing.GroupLayout(representacionBanda1);
        representacionBanda1.setLayout(representacionBanda1Layout);
        representacionBanda1Layout.setHorizontalGroup(
            representacionBanda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        representacionBanda1Layout.setVerticalGroup(
            representacionBanda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(representacionBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(representacionBanda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 60, 70));

        jPanel6.setBackground(new java.awt.Color(249, 234, 154));

        representacionTolerancia.setBackground(new java.awt.Color(249, 234, 154));

        javax.swing.GroupLayout representacionToleranciaLayout = new javax.swing.GroupLayout(representacionTolerancia);
        representacionTolerancia.setLayout(representacionToleranciaLayout);
        representacionToleranciaLayout.setHorizontalGroup(
            representacionToleranciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        representacionToleranciaLayout.setVerticalGroup(
            representacionToleranciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(representacionTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(representacionTolerancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jPanel7.setBackground(new java.awt.Color(173, 181, 189));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jPanel8.setBackground(new java.awt.Color(173, 181, 189));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void banda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banda1ActionPerformed
        String opcion = (String) banda1.getSelectedItem();
        boolean seleccionado = !opcion.equals("Primera banda");
        pintarBandas(representacionBanda1, banda1, seleccionado);
    }//GEN-LAST:event_banda1ActionPerformed

    private void banda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banda2ActionPerformed
        String opcion = (String) banda2.getSelectedItem();
        boolean seleccionado = !opcion.equals("Segunda banda");
        pintarBandas(representacionBanda2, banda2, seleccionado);
    }//GEN-LAST:event_banda2ActionPerformed

    private void multiplicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicadorActionPerformed
        String opcion = (String) multiplicador.getSelectedItem();
        boolean seleccionado = !opcion.equals("Multiplicador");
        pintarBandas(representacionMultiplicador, multiplicador, seleccionado);
    }//GEN-LAST:event_multiplicadorActionPerformed

    private void toleranciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toleranciaActionPerformed
        String opcion = (String) tolerancia.getSelectedItem();
        Color fondo = Color.decode("#F9EA9A");
        if (!opcion.equals("Tolerancia")) {
            Tolerancias color = Tolerancias.valueOf(opcion);
            fondo = Color.decode(color.getColor());
        }
        representacionTolerancia.setBackground(fondo);
    }//GEN-LAST:event_toleranciaActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        contenedorBtn.setBackground(Color.decode("#0055A1"));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        contenedorBtn.setBackground(Color.decode("#005E81"));

    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        String primeraBanda = (String) banda1.getSelectedItem();
        String segundaBanda = (String) banda2.getSelectedItem();
        String multiplicadorBanda = (String) multiplicador.getSelectedItem();
        String toleranciaBanda = (String) tolerancia.getSelectedItem();

        String valorResistencia = "";

        if (!primeraBanda.equals("Primera banda")) {
            valorResistencia += Colores.valueOf(primeraBanda).getValor();

            if (!segundaBanda.equals("Segunda banda")) 
                valorResistencia += Colores.valueOf(segundaBanda).getValor();

            if (!multiplicadorBanda.equals("Multiplicador")) {
                
                double tolerancia = 0;
                int multiplicador = Colores.valueOf(multiplicadorBanda).getMultiplicador();
                
                int resistencia = (Integer.parseInt(valorResistencia)) * multiplicador;

                if (!toleranciaBanda.equals("Tolerancia")) 
                    tolerancia = resistencia * (Tolerancias.valueOf(toleranciaBanda).getTolerancia());

                mostrarResultados(resistencia, tolerancia); //Imprimir resultado
            } else {
                JOptionPane.showMessageDialog(null, "Por favor elija un multiplicador","Multiplicador no seleccionado", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor elija el color de la primera banda", "Primera banda no seleccionada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> banda1;
    private javax.swing.JComboBox<String> banda2;
    private javax.swing.JPanel borde;
    private javax.swing.JPanel contenedorBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JComboBox<String> multiplicador;
    private javax.swing.JPanel representacionBanda1;
    private javax.swing.JPanel representacionBanda2;
    private javax.swing.JPanel representacionMultiplicador;
    private javax.swing.JPanel representacionTolerancia;
    private javax.swing.JLabel titulo;
    private javax.swing.JComboBox<String> tolerancia;
    // End of variables declaration//GEN-END:variables

    private void iniciarComponentes() {
        llenarBandas(banda1);
        llenarBandas(banda2);
        llenarBandas(multiplicador);
        llenarTolerancia(tolerancia);
    }

    private void llenarBandas(JComboBox<String> banda) {
        Colores colores[] = Colores.values();
        for (Colores color : colores) 
            banda.addItem(color.toString());
    }

    private void llenarTolerancia(JComboBox<String> banda) {
        Tolerancias tolerancias[] = Tolerancias.values();
        for (Tolerancias tolerancia : tolerancias)
            banda.addItem(tolerancia.toString());
    }

    private void pintarBandas(JPanel banda, JComboBox<String> lista, boolean seleccionado) {
        String opcion = (String) lista.getSelectedItem();
        Color fondo = Color.decode("#F9EA9A");
        if (seleccionado) {
            Colores color = Colores.valueOf(opcion);
            fondo = Color.decode(color.getColor());
        }
        banda.setBackground(fondo);
    }

    private void mostrarResultados(int resistencia, double tolerancia) {
        if(resultadosValor != null) resultadosValor.dispose();
        resultadosValor = new ResultadosValor();

        //Asingar resultados sin tolerancia
        String resultadoFormato = PrefijosConversion.formato(resistencia) + "Ω";
        resultadosValor.asignarResultado1(resistencia + "Ω",resultadoFormato );

        
        //Mostrar tolerancia si tiene
        if (tolerancia > 0) {
            String resultadoTolerancia = "";
            resultadoTolerancia += (resistencia - tolerancia) + "Ω    -   ";
            resultadoTolerancia += (resistencia + "Ω    -   ");
            resultadoTolerancia += ((resistencia + tolerancia) + "Ω");
            
            String resultadoToleranciaFormato = "";
            resultadoToleranciaFormato += PrefijosConversion.formato(resistencia - tolerancia) + "Ω    -   ";
            resultadoToleranciaFormato += PrefijosConversion.formato(resistencia) + "Ω    -   ";
            resultadoToleranciaFormato += PrefijosConversion.formato(resistencia + tolerancia) + "Ω";
            
            resultadosValor.asginarRultado2(resultadoTolerancia,resultadoToleranciaFormato);
        }

        resultadosValor.setVisible(true);
    }
    
}

package view;

import java.awt.Color;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import vendor.Colores;
import vendor.Prefijos;

public class CalcularColores extends javax.swing.JFrame {

    private HashMap<String, Colores> coloresMap;

    public CalcularColores() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarPrefijo();
        crearMapa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        valor = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        prefijo = new javax.swing.JComboBox<>();
        borde = new javax.swing.JPanel();
        contenedorBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        representacionBanda1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        representacionBanda2 = new javax.swing.JPanel();
        representacionMultiplicador = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        representacionTolerancia = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Calcular colores");
        setIconImage(new ImageIcon(getClass().getResource("/img/Recurso 2.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 242, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(316, 280));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valor.setForeground(new java.awt.Color(102, 102, 102));
        valor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        valor.setFocusable(false);
        valor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valorMouseClicked(evt);
            }
        });
        jPanel1.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 280, 30));

        titulo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 109, 119));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CALCULAR COLORES");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 315, 40));

        prefijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prefijo" }));
        prefijo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(prefijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 30));

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

        contenedorBtn.setBackground(new java.awt.Color(0, 94, 129));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 242, 244));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calcular");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contenedorBtnLayout = new javax.swing.GroupLayout(contenedorBtn);
        contenedorBtn.setLayout(contenedorBtnLayout);
        contenedorBtnLayout.setHorizontalGroup(
            contenedorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        contenedorBtnLayout.setVerticalGroup(
            contenedorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(contenedorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 130, 30));

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

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 109, 119));
        jLabel2.setText("Ingrese el valor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorMouseClicked
        valor.setFocusable(true);
    }//GEN-LAST:event_valorMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String valorIngresado = this.valor.getText();
        String reguex = "^[0-9]*\\.?[0-9]+$";

        if (!valorIngresado.trim().equals("")) {
            if (valorIngresado.matches(reguex)) {
                calcularColores(valorIngresado);
            } else {
                JOptionPane.showMessageDialog(null, "Solo se permiten dijitos positivos y punto para indicar decimal", "Formato no valido", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un valor", "Valor vacio", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borde;
    private javax.swing.JPanel contenedorBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JComboBox<String> prefijo;
    private javax.swing.JPanel representacionBanda1;
    private javax.swing.JPanel representacionBanda2;
    private javax.swing.JPanel representacionMultiplicador;
    private javax.swing.JPanel representacionTolerancia;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables

    private void calcularColores(String valorIngresado) {

        double valorD = Double.parseDouble(valorIngresado);
        Colores colorBanda1 = null;
        Colores colorBanda2 = null;
        Colores colorMultiplicador = null;

        //Obtener prefijo si lo hay
        if (!prefijo.getSelectedItem().equals("Prefijo")) {
            double prefijoS = Prefijos.valueOf((String) prefijo.getSelectedItem()).getValor();
            valorD *= prefijoS;
        }

        if (valorD < 10) { //Cuando el valor ingresado es menor a 10 ohmios
            colorBanda1 = Colores.NEGRO;
            colorBanda2 = coloresMap.get(Character.toString(valorIngresado.charAt(0)));
            colorMultiplicador = Colores.NEGRO;
        } else if(valorD < 100){
            colorBanda1 = coloresMap.get(Character.toString(valorIngresado.charAt(0)));
            colorBanda2 = coloresMap.get(Character.toString(valorIngresado.charAt(1)));
            colorMultiplicador = Colores.NEGRO;
        }else {

            String valorDS = Double.toString(valorD);
            
            int indexP = valorDS.indexOf('.');
            valorDS = valorDS.substring(0, indexP);

            colorBanda1 = coloresMap.get(Character.toString(valorDS.charAt(0)));
            valorDS = valorDS.substring(1);
            
            colorBanda2 = coloresMap.get(Character.toString(valorDS.charAt(0)));
            valorDS = valorDS.substring(1);
            
            colorMultiplicador = coloresMap.get(Integer.toString(valorDS.length()));
        }
        representacionBanda1.setBackground(Color.decode(colorBanda1.getColor()));
        representacionBanda2.setBackground(Color.decode(colorBanda2.getColor()));
        representacionMultiplicador.setBackground(Color.decode(colorMultiplicador.getColor()));

    }

    private void crearMapa() {
        Colores colores[] = Colores.values();
        coloresMap = new HashMap<>();

        for (Colores color : colores) {
            coloresMap.put(color.getValor(), color);
        }

    }

    private void llenarPrefijo() {
        Prefijos prefijos[] = Prefijos.values();
        for (Prefijos prefijo : prefijos) {
            if (prefijo.getValor() >= 1) {
                this.prefijo.addItem(prefijo.toString());
            }
        }
    }

}

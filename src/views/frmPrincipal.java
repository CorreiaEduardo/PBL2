package views;

/**
 *
 * @author Eduardo C.
 */
public class frmPrincipal extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    int level;
    /**
     * Inicialização
     */
    public frmPrincipal(int level) {
        initComponents();
        this.level=level;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBatedeira = new javax.swing.JLabel();
        lblLiquidificador = new javax.swing.JLabel();
        lblFerro = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnFerro = new javax.swing.JLabel();
        btnLiquidificador = new javax.swing.JLabel();
        btnBatedeira = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(45, 45, 45));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 30));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_26px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Minimize_Window_26px.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(7, 7, 7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblBatedeira.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblBatedeira.setForeground(new java.awt.Color(204, 204, 204));
        lblBatedeira.setText("BATEDEIRA");
        lblBatedeira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBatedeira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBatedeiraMouseClicked(evt);
            }
        });

        lblLiquidificador.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblLiquidificador.setForeground(new java.awt.Color(204, 204, 204));
        lblLiquidificador.setText("LIQUIDIFICADOR");
        lblLiquidificador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLiquidificador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLiquidificadorMouseClicked(evt);
            }
        });

        lblFerro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFerro.setForeground(new java.awt.Color(204, 204, 204));
        lblFerro.setText("FERRO");
        lblFerro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFerro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFerroMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(75, 75, 75));

        btnFerro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/test2.png"))); // NOI18N
        btnFerro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFerro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFerroMouseClicked(evt);
            }
        });

        btnLiquidificador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/test3.png"))); // NOI18N
        btnLiquidificador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLiquidificador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLiquidificadorMouseClicked(evt);
            }
        });

        btnBatedeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tes3.png"))); // NOI18N
        btnBatedeira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBatedeira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatedeiraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnBatedeira)
                .addGap(104, 104, 104)
                .addComponent(btnFerro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(btnLiquidificador)
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnBatedeira)
                    .addComponent(btnFerro)
                    .addComponent(btnLiquidificador))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lblBatedeira)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFerro)
                .addGap(172, 172, 172)
                .addComponent(lblLiquidificador)
                .addGap(72, 72, 72))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblBatedeira)
                    .addComponent(lblFerro)
                    .addComponent(lblLiquidificador))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        frmLogin telaSair = new frmLogin();
        telaSair.pack();
        telaSair.setLocationRelativeTo(null);
        this.setVisible(false);
        telaSair.setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnBatedeiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatedeiraMouseClicked
        FrmBatedeira telaBatedeira = new FrmBatedeira(level);
        telaBatedeira.pack();
        telaBatedeira.setLocationRelativeTo(null);
        this.setVisible(false);
        telaBatedeira.setVisible(true);
    }//GEN-LAST:event_btnBatedeiraMouseClicked

    private void lblBatedeiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBatedeiraMouseClicked
        btnBatedeiraMouseClicked(evt);
    }//GEN-LAST:event_lblBatedeiraMouseClicked

    private void btnFerroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFerroMouseClicked
            FrmFerro telaFerro = new FrmFerro(level);
            telaFerro.pack();
            telaFerro.setLocationRelativeTo(null);
            this.setVisible(false);
            telaFerro.setVisible(true);
        
    }//GEN-LAST:event_btnFerroMouseClicked

    private void lblFerroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFerroMouseClicked
        btnFerroMouseClicked(evt);
    }//GEN-LAST:event_lblFerroMouseClicked

    private void btnLiquidificadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLiquidificadorMouseClicked
        FrmLiquidificador telaLiquidificador = new FrmLiquidificador(level);
        telaLiquidificador.pack();
        telaLiquidificador.setLocationRelativeTo(null);
        this.setVisible(false);
        telaLiquidificador.setVisible(true);
    }//GEN-LAST:event_btnLiquidificadorMouseClicked

    private void lblLiquidificadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLiquidificadorMouseClicked
        btnLiquidificadorMouseClicked(evt);
    }//GEN-LAST:event_lblLiquidificadorMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLogin novaTela = new frmLogin();
                novaTela.pack();
                novaTela.setLocationRelativeTo(null);
                novaTela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBatedeira;
    private javax.swing.JLabel btnFerro;
    private javax.swing.JLabel btnLiquidificador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBatedeira;
    private javax.swing.JLabel lblFerro;
    private javax.swing.JLabel lblLiquidificador;
    // End of variables declaration//GEN-END:variables
}

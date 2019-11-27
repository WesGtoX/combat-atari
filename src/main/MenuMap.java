package main;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Wesley
 */
public class MenuMap extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuMap() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnpPlay = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        rdbMap1 = new javax.swing.JRadioButton();
        rdbMap2 = new javax.swing.JRadioButton();
        rdbMap3 = new javax.swing.JRadioButton();
        jlbMap1 = new javax.swing.JLabel();
        jlbMap2 = new javax.swing.JLabel();
        jlbMap3 = new javax.swing.JLabel();
        lblBackgroundMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnpPlay.setBackground(new java.awt.Color(0, 87, 184));
        btnpPlay.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnpPlay.setForeground(new java.awt.Color(255, 255, 255));
        btnpPlay.setText("PLAY");
        btnpPlay.setMaximumSize(new java.awt.Dimension(200, 50));
        btnpPlay.setMinimumSize(new java.awt.Dimension(200, 50));
        btnpPlay.setPreferredSize(new java.awt.Dimension(200, 50));
        btnpPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnpPlay);
        btnpPlay.setBounds(540, 450, 200, 50);

        btnMenu.setBackground(new java.awt.Color(0, 87, 184));
        btnMenu.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("MENU");
        btnMenu.setMaximumSize(new java.awt.Dimension(200, 50));
        btnMenu.setMinimumSize(new java.awt.Dimension(200, 50));
        btnMenu.setPreferredSize(new java.awt.Dimension(200, 50));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(540, 530, 200, 50);

        rdbMap1.setBackground(new java.awt.Color(0, 102, 0));
        rdbMap1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbMap1.setForeground(new java.awt.Color(255, 255, 255));
        rdbMap1.setText("Map 1");
        rdbMap1.setContentAreaFilled(false);
        rdbMap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbMap1.setMaximumSize(new java.awt.Dimension(110, 25));
        rdbMap1.setMinimumSize(new java.awt.Dimension(110, 25));
        rdbMap1.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(rdbMap1);
        rdbMap1.setBounds(160, 360, 140, 25);

        rdbMap2.setBackground(new java.awt.Color(255, 0, 0));
        rdbMap2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbMap2.setForeground(new java.awt.Color(255, 255, 255));
        rdbMap2.setText("Map 2");
        rdbMap2.setContentAreaFilled(false);
        rdbMap2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbMap2.setMaximumSize(new java.awt.Dimension(110, 25));
        rdbMap2.setMinimumSize(new java.awt.Dimension(110, 25));
        rdbMap2.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(rdbMap2);
        rdbMap2.setBounds(570, 360, 140, 25);

        rdbMap3.setBackground(new java.awt.Color(255, 255, 0));
        rdbMap3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbMap3.setForeground(new java.awt.Color(255, 255, 255));
        rdbMap3.setText("Map 3");
        rdbMap3.setContentAreaFilled(false);
        rdbMap3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbMap3.setMaximumSize(new java.awt.Dimension(110, 25));
        rdbMap3.setMinimumSize(new java.awt.Dimension(110, 25));
        rdbMap3.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(rdbMap3);
        rdbMap3.setBounds(980, 360, 140, 25);

        jlbMap1.setForeground(new java.awt.Color(255, 255, 255));
        jlbMap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map1.JPG"))); // NOI18N
        jlbMap1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbMap1);
        jlbMap1.setBounds(60, 170, 350, 180);

        jlbMap2.setForeground(new java.awt.Color(255, 255, 255));
        jlbMap2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMap2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map2.JPG"))); // NOI18N
        jlbMap2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbMap2);
        jlbMap2.setBounds(470, 170, 350, 180);

        jlbMap3.setForeground(new java.awt.Color(255, 255, 255));
        jlbMap3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map3.JPG"))); // NOI18N
        jlbMap3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbMap3);
        jlbMap3.setBounds(870, 170, 350, 180);

        lblBackgroundMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/combat_map.jpg"))); // NOI18N
        getContentPane().add(lblBackgroundMenu);
        lblBackgroundMenu.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(
            (d.width-this.getSize().width)/2,
            (d.height-this.getSize().height)/2
        );
    }//GEN-LAST:event_formWindowOpened

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnpPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpPlayActionPerformed
        new Game().start();
        this.dispose();
    }//GEN-LAST:event_btnpPlayActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnpPlay;
    private javax.swing.JLabel jlbMap1;
    private javax.swing.JLabel jlbMap2;
    private javax.swing.JLabel jlbMap3;
    private javax.swing.JLabel lblBackgroundMenu;
    private javax.swing.JRadioButton rdbMap1;
    private javax.swing.JRadioButton rdbMap2;
    private javax.swing.JRadioButton rdbMap3;
    // End of variables declaration//GEN-END:variables
}

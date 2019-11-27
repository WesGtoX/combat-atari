package main;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Wesley
 */
public class MenuTank extends javax.swing.JFrame {

    public String player1;
    public String player2;
    
    /**
     * Creates new form Menu
     */
    public MenuTank() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTank1 = new javax.swing.JLabel();
        rdbTank1 = new javax.swing.JRadioButton();
        lblTank2 = new javax.swing.JLabel();
        rdbTank2 = new javax.swing.JRadioButton();
        lblTank3 = new javax.swing.JLabel();
        rdbTank3 = new javax.swing.JRadioButton();
        lblTank4 = new javax.swing.JLabel();
        rdbTank4 = new javax.swing.JRadioButton();
        btnPlayer1 = new javax.swing.JButton();
        btnPlayer2 = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnpPlay = new javax.swing.JButton();
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

        lblTank1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTank1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tank_125_02.png"))); // NOI18N
        getContentPane().add(lblTank1);
        lblTank1.setBounds(440, 140, 150, 150);

        rdbTank1.setBackground(new java.awt.Color(0, 102, 0));
        rdbTank1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbTank1.setForeground(new java.awt.Color(255, 255, 255));
        rdbTank1.setText("Tank Green");
        rdbTank1.setContentAreaFilled(false);
        rdbTank1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbTank1.setMaximumSize(new java.awt.Dimension(110, 25));
        rdbTank1.setMinimumSize(new java.awt.Dimension(110, 25));
        rdbTank1.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(rdbTank1);
        rdbTank1.setBounds(200, 290, 140, 25);

        lblTank2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTank2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tank_125_03.png"))); // NOI18N
        getContentPane().add(lblTank2);
        lblTank2.setBounds(680, 140, 150, 150);

        rdbTank2.setBackground(new java.awt.Color(255, 0, 0));
        rdbTank2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbTank2.setForeground(new java.awt.Color(255, 255, 255));
        rdbTank2.setText("Tank Red");
        rdbTank2.setContentAreaFilled(false);
        rdbTank2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbTank2.setMaximumSize(new java.awt.Dimension(110, 25));
        rdbTank2.setMinimumSize(new java.awt.Dimension(110, 25));
        rdbTank2.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(rdbTank2);
        rdbTank2.setBounds(440, 290, 140, 25);

        lblTank3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTank3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tank_125_04.png"))); // NOI18N
        getContentPane().add(lblTank3);
        lblTank3.setBounds(920, 140, 150, 150);

        rdbTank3.setBackground(new java.awt.Color(255, 255, 0));
        rdbTank3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbTank3.setForeground(new java.awt.Color(255, 255, 255));
        rdbTank3.setText("Tank Yellow");
        rdbTank3.setContentAreaFilled(false);
        rdbTank3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbTank3.setMaximumSize(new java.awt.Dimension(110, 25));
        rdbTank3.setMinimumSize(new java.awt.Dimension(110, 25));
        rdbTank3.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(rdbTank3);
        rdbTank3.setBounds(680, 290, 140, 25);

        lblTank4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTank4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tank_125_01.png"))); // NOI18N
        getContentPane().add(lblTank4);
        lblTank4.setBounds(200, 140, 150, 150);

        rdbTank4.setBackground(new java.awt.Color(0, 51, 255));
        rdbTank4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbTank4.setForeground(new java.awt.Color(255, 255, 255));
        rdbTank4.setText("Tank Blue");
        rdbTank4.setContentAreaFilled(false);
        rdbTank4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbTank4.setMaximumSize(new java.awt.Dimension(110, 25));
        rdbTank4.setMinimumSize(new java.awt.Dimension(110, 25));
        rdbTank4.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(rdbTank4);
        rdbTank4.setBounds(920, 290, 140, 25);

        btnPlayer1.setBackground(new java.awt.Color(0, 87, 184));
        btnPlayer1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayer1.setText("PLAYER 1");
        btnPlayer1.setMaximumSize(new java.awt.Dimension(200, 50));
        btnPlayer1.setMinimumSize(new java.awt.Dimension(200, 50));
        btnPlayer1.setPreferredSize(new java.awt.Dimension(200, 50));
        btnPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlayer1);
        btnPlayer1.setBounds(370, 360, 210, 50);

        btnPlayer2.setBackground(new java.awt.Color(0, 87, 184));
        btnPlayer2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayer2.setText("PLAYER 2");
        btnPlayer2.setMaximumSize(new java.awt.Dimension(200, 50));
        btnPlayer2.setMinimumSize(new java.awt.Dimension(200, 50));
        btnPlayer2.setPreferredSize(new java.awt.Dimension(200, 50));
        btnPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlayer2);
        btnPlayer2.setBounds(690, 360, 210, 50);

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

        lblBackgroundMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/combat_tank.jpg"))); // NOI18N
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

    private void btnPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlayer1ActionPerformed

    private void btnPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlayer2ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnpPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpPlayActionPerformed
        MenuMap map = new MenuMap();
        map.setVisible(true);
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
            java.util.logging.Logger.getLogger(MenuTank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPlayer1;
    private javax.swing.JButton btnPlayer2;
    private javax.swing.JButton btnpPlay;
    private javax.swing.JLabel lblBackgroundMenu;
    private javax.swing.JLabel lblTank1;
    private javax.swing.JLabel lblTank2;
    private javax.swing.JLabel lblTank3;
    private javax.swing.JLabel lblTank4;
    private javax.swing.JRadioButton rdbTank1;
    private javax.swing.JRadioButton rdbTank2;
    private javax.swing.JRadioButton rdbTank3;
    private javax.swing.JRadioButton rdbTank4;
    // End of variables declaration//GEN-END:variables
}

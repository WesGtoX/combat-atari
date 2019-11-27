package main;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Wesley
 */
public class MenuEnd extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuEnd() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTankWinner1 = new javax.swing.JLabel();
        lblTankWinner2 = new javax.swing.JLabel();
        lblTankWinner3 = new javax.swing.JLabel();
        lblTankWinner4 = new javax.swing.JLabel();
        lblTankLoser1 = new javax.swing.JLabel();
        lblTankLoser2 = new javax.swing.JLabel();
        lblTankLoser3 = new javax.swing.JLabel();
        lblTankLoser4 = new javax.swing.JLabel();
        btnPlayAgain = new javax.swing.JButton();
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

        lblTankWinner1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTankWinner1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hulls_tank01.png"))); // NOI18N
        getContentPane().add(lblTankWinner1);
        lblTankWinner1.setBounds(600, 120, 70, 70);

        lblTankWinner2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTankWinner2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hulls_tank02.png"))); // NOI18N
        getContentPane().add(lblTankWinner2);
        lblTankWinner2.setBounds(600, 120, 70, 70);

        lblTankWinner3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTankWinner3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hulls_tank03.png"))); // NOI18N
        getContentPane().add(lblTankWinner3);
        lblTankWinner3.setBounds(600, 120, 70, 70);

        lblTankWinner4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTankWinner4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hulls_tank04.png"))); // NOI18N
        getContentPane().add(lblTankWinner4);
        lblTankWinner4.setBounds(600, 120, 70, 70);

        lblTankLoser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTankLoser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hulls_tank01.png"))); // NOI18N
        getContentPane().add(lblTankLoser1);
        lblTankLoser1.setBounds(600, 380, 70, 70);

        lblTankLoser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTankLoser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hulls_tank02.png"))); // NOI18N
        getContentPane().add(lblTankLoser2);
        lblTankLoser2.setBounds(600, 380, 70, 70);

        lblTankLoser3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTankLoser3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hulls_tank03.png"))); // NOI18N
        getContentPane().add(lblTankLoser3);
        lblTankLoser3.setBounds(600, 380, 70, 70);

        lblTankLoser4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTankLoser4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hulls_tank04.png"))); // NOI18N
        getContentPane().add(lblTankLoser4);
        lblTankLoser4.setBounds(600, 380, 70, 70);

        btnPlayAgain.setBackground(new java.awt.Color(0, 87, 184));
        btnPlayAgain.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnPlayAgain.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayAgain.setText("PLAY AGAIN");
        btnPlayAgain.setMaximumSize(new java.awt.Dimension(200, 50));
        btnPlayAgain.setMinimumSize(new java.awt.Dimension(200, 50));
        btnPlayAgain.setPreferredSize(new java.awt.Dimension(200, 50));
        btnPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayAgainActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlayAgain);
        btnPlayAgain.setBounds(510, 550, 250, 50);

        lblBackgroundMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/combat_end.jpg"))); // NOI18N
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

    private void btnPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayAgainActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPlayAgainActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MenuEnd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlayAgain;
    private javax.swing.JLabel lblBackgroundMenu;
    private javax.swing.JLabel lblTankLoser1;
    private javax.swing.JLabel lblTankLoser2;
    private javax.swing.JLabel lblTankLoser3;
    private javax.swing.JLabel lblTankLoser4;
    private javax.swing.JLabel lblTankWinner1;
    private javax.swing.JLabel lblTankWinner2;
    private javax.swing.JLabel lblTankWinner3;
    private javax.swing.JLabel lblTankWinner4;
    // End of variables declaration//GEN-END:variables
}

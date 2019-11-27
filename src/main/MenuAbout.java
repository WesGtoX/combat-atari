package main;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Wesley
 */
public class MenuAbout extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuAbout() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDevOne = new javax.swing.JLabel();
        lblDevTwo = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
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

        lblDevOne.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblDevOne.setForeground(new java.awt.Color(255, 255, 255));
        lblDevOne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDevOne.setText("Lenin Boccardo de Andrade, 827969");
        getContentPane().add(lblDevOne);
        lblDevOne.setBounds(340, 380, 630, 40);

        lblDevTwo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblDevTwo.setForeground(new java.awt.Color(255, 255, 255));
        lblDevTwo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDevTwo.setText("Wesley de Oliveira Mendes, 828507");
        getContentPane().add(lblDevTwo);
        lblDevTwo.setBounds(350, 320, 610, 40);

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

        lblBackgroundMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/combat_menu.jpg"))); // NOI18N
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
            java.util.logging.Logger.getLogger(MenuAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAbout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel lblBackgroundMenu;
    private javax.swing.JLabel lblDevOne;
    private javax.swing.JLabel lblDevTwo;
    // End of variables declaration//GEN-END:variables
}

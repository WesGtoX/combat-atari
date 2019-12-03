package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley, Lenin
 */
public class MenuMap extends javax.swing.JFrame {
    
    public int player1;
    public int player2;
    public int map = 0;

    /**
     * Creates new form Menu
     */
    public MenuMap() {
        initComponents();
        configForm();
    }

    public MenuMap(int player1, int player2) {
        initComponents();
        configForm();
        this.player1 = player1;
        this.player2 = player2;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMap = new javax.swing.JTextField();
        rdbMap1 = new javax.swing.JRadioButton();
        rdbMap2 = new javax.swing.JRadioButton();
        rdbMap3 = new javax.swing.JRadioButton();
        jlbMap1 = new javax.swing.JLabel();
        jlbMap2 = new javax.swing.JLabel();
        jlbMap3 = new javax.swing.JLabel();
        btnpMapSelect = new javax.swing.JButton();
        btnpPlay = new javax.swing.JButton();
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

        txtMap.setFont(new java.awt.Font("Arial", 1, 55)); // NOI18N
        txtMap.setForeground(new java.awt.Color(255, 0, 0));
        txtMap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMap.setMaximumSize(new java.awt.Dimension(450, 80));
        txtMap.setMinimumSize(new java.awt.Dimension(450, 80));
        txtMap.setPreferredSize(new java.awt.Dimension(450, 80));
        getContentPane().add(txtMap);
        txtMap.setBounds(420, 30, 450, 80);

        rdbMap1.setBackground(new java.awt.Color(0, 102, 0));
        rdbMap1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbMap1.setForeground(new java.awt.Color(255, 255, 255));
        rdbMap1.setText("De Dust");
        rdbMap1.setContentAreaFilled(false);
        rdbMap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbMap1.setMaximumSize(new java.awt.Dimension(110, 25));
        rdbMap1.setMinimumSize(new java.awt.Dimension(110, 25));
        rdbMap1.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(rdbMap1);
        rdbMap1.setBounds(160, 330, 140, 25);

        rdbMap2.setBackground(new java.awt.Color(255, 0, 0));
        rdbMap2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbMap2.setForeground(new java.awt.Color(255, 255, 255));
        rdbMap2.setText("De Train");
        rdbMap2.setContentAreaFilled(false);
        rdbMap2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbMap2.setMaximumSize(new java.awt.Dimension(110, 25));
        rdbMap2.setMinimumSize(new java.awt.Dimension(110, 25));
        rdbMap2.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(rdbMap2);
        rdbMap2.setBounds(570, 330, 140, 25);

        rdbMap3.setBackground(new java.awt.Color(255, 255, 0));
        rdbMap3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbMap3.setForeground(new java.awt.Color(255, 255, 255));
        rdbMap3.setText("Fy Pool Day");
        rdbMap3.setContentAreaFilled(false);
        rdbMap3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbMap3.setMaximumSize(new java.awt.Dimension(110, 25));
        rdbMap3.setMinimumSize(new java.awt.Dimension(110, 25));
        rdbMap3.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(rdbMap3);
        rdbMap3.setBounds(980, 330, 140, 25);

        jlbMap1.setForeground(new java.awt.Color(255, 255, 255));
        jlbMap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map1.JPG"))); // NOI18N
        jlbMap1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbMap1);
        jlbMap1.setBounds(60, 140, 350, 180);

        jlbMap2.setForeground(new java.awt.Color(255, 255, 255));
        jlbMap2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMap2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map2.JPG"))); // NOI18N
        jlbMap2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbMap2);
        jlbMap2.setBounds(470, 140, 350, 180);

        jlbMap3.setForeground(new java.awt.Color(255, 255, 255));
        jlbMap3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map3.JPG"))); // NOI18N
        jlbMap3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbMap3);
        jlbMap3.setBounds(870, 140, 350, 180);

        btnpMapSelect.setBackground(new java.awt.Color(51, 204, 255));
        btnpMapSelect.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnpMapSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnpMapSelect.setText("SELECT");
        btnpMapSelect.setMaximumSize(new java.awt.Dimension(200, 50));
        btnpMapSelect.setMinimumSize(new java.awt.Dimension(200, 50));
        btnpMapSelect.setPreferredSize(new java.awt.Dimension(200, 50));
        btnpMapSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpMapSelectActionPerformed(evt);
            }
        });
        getContentPane().add(btnpMapSelect);
        btnpMapSelect.setBounds(540, 380, 200, 50);

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
        btnpPlay.setBounds(540, 470, 200, 50);

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
        btnMenu.setBounds(540, 540, 200, 50);

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

    private void btnpMapSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpMapSelectActionPerformed
        if (rdbMap1.isSelected()) {
            this.map = 1;
            txtMap.setText("De Dust");
        } else if (rdbMap2.isSelected()) {
            this.map = 2;
            txtMap.setText("De Train");
        } else if (rdbMap3.isSelected()) {
            this.map = 3;
            txtMap.setText("Fy Pool Day");
        }
    }//GEN-LAST:event_btnpMapSelectActionPerformed

    private void btnpPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpPlayActionPerformed
        if (this.map != 0) {
            new Game(this.map, this.player1, this.player2).start();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(
                    null, "Selecione um MAPA para jogar!", "WARNING", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnpPlayActionPerformed

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
    private javax.swing.JButton btnpMapSelect;
    private javax.swing.JButton btnpPlay;
    private javax.swing.JLabel jlbMap1;
    private javax.swing.JLabel jlbMap2;
    private javax.swing.JLabel jlbMap3;
    private javax.swing.JLabel lblBackgroundMenu;
    private javax.swing.JRadioButton rdbMap1;
    private javax.swing.JRadioButton rdbMap2;
    private javax.swing.JRadioButton rdbMap3;
    private javax.swing.JTextField txtMap;
    // End of variables declaration//GEN-END:variables
    
    private void configForm(){
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbMap1);
        bg.add(rdbMap2);
        bg.add(rdbMap3);
        rdbMap1.setSelected(true);
    }
}

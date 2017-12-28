/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feko_steffensmeierdoty;

/**
 *
 * @author rms130
 */
public class CharacterModGUI extends javax.swing.JFrame {

    /**
     * Creates new form CharacterModGUI
     */
    public CharacterModGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        BattleButton = new javax.swing.JButton();
        AlliesButton = new javax.swing.JButton();
        MiscButton = new javax.swing.JButton();
        MainCharacter = new javax.swing.JLabel();
        CastleBackground = new javax.swing.JLabel();
        TopBorder = new javax.swing.JLabel();
        BottomBorder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(540, 925));
        setMinimumSize(new java.awt.Dimension(540, 925));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(540, 925));
        setResizable(false);
        setSize(new java.awt.Dimension(540, 925));

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(540, 925));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(540, 925));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BattleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/battle_button_idle.png"))); // NOI18N
        BattleButton.setBorderPainted(false);
        BattleButton.setContentAreaFilled(false);
        BattleButton.setFocusPainted(false);
        BattleButton.setMaximumSize(new java.awt.Dimension(90, 90));
        BattleButton.setMinimumSize(new java.awt.Dimension(90, 90));
        BattleButton.setPreferredSize(new java.awt.Dimension(90, 90));
        BattleButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BattleButtonMouseDragged(evt);
            }
        });
        BattleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BattleButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BattleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BattleButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BattleButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BattleButtonMouseReleased(evt);
            }
        });
        jLayeredPane1.add(BattleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 840, 90, 90));

        AlliesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/allies_button_idle.png"))); // NOI18N
        AlliesButton.setBorderPainted(false);
        AlliesButton.setContentAreaFilled(false);
        AlliesButton.setFocusPainted(false);
        AlliesButton.setMaximumSize(new java.awt.Dimension(90, 90));
        AlliesButton.setMinimumSize(new java.awt.Dimension(90, 90));
        AlliesButton.setPreferredSize(new java.awt.Dimension(90, 90));
        AlliesButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                AlliesButtonMouseDragged(evt);
            }
        });
        AlliesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlliesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AlliesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AlliesButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AlliesButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AlliesButtonMouseReleased(evt);
            }
        });
        jLayeredPane1.add(AlliesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 840, 90, 90));

        MiscButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/misc_button_idle.png"))); // NOI18N
        MiscButton.setBorderPainted(false);
        MiscButton.setContentAreaFilled(false);
        MiscButton.setFocusPainted(false);
        MiscButton.setMaximumSize(new java.awt.Dimension(90, 90));
        MiscButton.setMinimumSize(new java.awt.Dimension(90, 90));
        MiscButton.setPreferredSize(new java.awt.Dimension(90, 90));
        MiscButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiscButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MiscButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MiscButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MiscButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MiscButtonMouseReleased(evt);
            }
        });
        jLayeredPane1.add(MiscButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 840, 90, 90));

        MainCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/char.png"))); // NOI18N
        jLayeredPane1.add(MainCharacter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        CastleBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/player_castle_background.png"))); // NOI18N
        jLayeredPane1.add(CastleBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        TopBorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/char_mod_border_top.png"))); // NOI18N
        jLayeredPane1.add(TopBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        BottomBorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/char_mod_border_bottom.png"))); // NOI18N
        jLayeredPane1.add(BottomBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MiscButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiscButtonMouseEntered
        MiscButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/misc_button_hover.png")));
    }//GEN-LAST:event_MiscButtonMouseEntered

    private void MiscButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiscButtonMouseExited
        MiscButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/misc_button_idle.png")));
    }//GEN-LAST:event_MiscButtonMouseExited

    private void MiscButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiscButtonMouseClicked
        
    }//GEN-LAST:event_MiscButtonMouseClicked

    private void MiscButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiscButtonMousePressed
        MiscButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/misc_button_click.png")));
    }//GEN-LAST:event_MiscButtonMousePressed

    private void BattleButtonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BattleButtonMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_BattleButtonMouseDragged

    private void BattleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BattleButtonMouseClicked
        MapGUI mapGUI = new MapGUI();
        mapGUI.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BattleButtonMouseClicked

    private void BattleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BattleButtonMouseEntered
        BattleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/battle_button_hover.png")));
    }//GEN-LAST:event_BattleButtonMouseEntered

    private void BattleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BattleButtonMouseExited
        BattleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/battle_button_idle.png")));
    }//GEN-LAST:event_BattleButtonMouseExited

    private void BattleButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BattleButtonMousePressed
        BattleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/battle_button_click.png")));
    }//GEN-LAST:event_BattleButtonMousePressed

    private void AlliesButtonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlliesButtonMouseDragged
        
    }//GEN-LAST:event_AlliesButtonMouseDragged

    private void AlliesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlliesButtonMouseClicked
        
    }//GEN-LAST:event_AlliesButtonMouseClicked

    private void AlliesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlliesButtonMouseEntered
        AlliesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/allies_button_hover.png")));
    }//GEN-LAST:event_AlliesButtonMouseEntered

    private void AlliesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlliesButtonMouseExited
        AlliesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/allies_button_idle.png")));
    }//GEN-LAST:event_AlliesButtonMouseExited

    private void AlliesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlliesButtonMousePressed
        AlliesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/allies_button_click.png")));
    }//GEN-LAST:event_AlliesButtonMousePressed

    private void MiscButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiscButtonMouseReleased
        MiscButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/misc_button_hover.png")));
    }//GEN-LAST:event_MiscButtonMouseReleased

    private void AlliesButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlliesButtonMouseReleased
        AlliesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/allies_button_hover.png")));
    }//GEN-LAST:event_AlliesButtonMouseReleased

    private void BattleButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BattleButtonMouseReleased
        BattleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/character_mod/battle_button_hover.png")));
    }//GEN-LAST:event_BattleButtonMouseReleased

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
            java.util.logging.Logger.getLogger(CharacterModGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterModGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterModGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterModGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterModGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlliesButton;
    private javax.swing.JButton BattleButton;
    private javax.swing.JLabel BottomBorder;
    private javax.swing.JLabel CastleBackground;
    private javax.swing.JLabel MainCharacter;
    private javax.swing.JButton MiscButton;
    private javax.swing.JLabel TopBorder;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}

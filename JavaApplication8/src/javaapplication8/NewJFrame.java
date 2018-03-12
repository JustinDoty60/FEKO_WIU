/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;

/**
 *
 * @author Justin
 */
public class NewJFrame extends javax.swing.JFrame {

    private Point mouseLocation;
    private Point componentLocation;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(595, 245));
        setMinimumSize(new java.awt.Dimension(595, 245));
        getContentPane().setLayout(null);

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseDragged(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(280, 90, 105, 25);

        jToggleButton2.setText("jToggleButton2");
        jToggleButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseDragged(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(490, 200, 105, 25);

        jToggleButton3.setText("jToggleButton3");
        jToggleButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseDragged(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(90, 220, 105, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Justin\\Documents\\NetBeansProjects\\FEKO_WIU\\src\\img\\backgrounds\\level1_map.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, -20, 670, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseDragged
        moveCharacter(jToggleButton1);
    }//GEN-LAST:event_jToggleButton1MouseDragged

    private void jToggleButton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseDragged
        moveCharacter(jToggleButton2);
    }//GEN-LAST:event_jToggleButton2MouseDragged

    private void jToggleButton3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton3MouseDragged
        moveCharacter(jToggleButton3);
    }//GEN-LAST:event_jToggleButton3MouseDragged

    
    private void moveCharacter(Component character) {
        mouseLocation = MouseInfo.getPointerInfo().getLocation();
        componentLocation = this.getLocationOnScreen();
        mouseLocation.x = mouseLocation.x - componentLocation.x - character.getWidth() / 2;
        mouseLocation.y = mouseLocation.y - componentLocation.y - character.getHeight() / 2;

        character.setLocation(mouseLocation);
    }
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imkimk;

import java.awt.Color;

/**
 *
 * @author ILHAM HADISYAH
 */
public class welc extends javax.swing.JFrame {

    /**
     * Creates new form welc
     */
    public welc() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(579, 473));
        setUndecorated(true);
        getContentPane().setLayout(null);

        enter.setBackground(new java.awt.Color(250, 205, 128));
        enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                enterMouseReleased(evt);
            }
        });
        enter.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel2.setText("ENTER");
        enter.add(jLabel2);
        jLabel2.setBounds(90, 0, 90, 40);

        getContentPane().add(enter);
        enter.setBounds(160, 400, 260, 40);

        jPanel1.setBackground(new java.awt.Color(252, 224, 177));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImg/close.png"))); // NOI18N
        jPanel1.add(jLabel4);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(550, 0, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImg/welcomePage.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseEntered
        // TODO add your handling code here:
        enter.setBackground(new Color(175,209,255));
    }//GEN-LAST:event_enterMouseEntered

    private void enterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseExited
        // TODO add your handling code here:
        enter.setBackground(new Color(250,205,128));
    }//GEN-LAST:event_enterMouseExited

    private void enterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMousePressed
        // TODO add your handling code here:
        enter.setBackground(new Color(46,209,255));
    }//GEN-LAST:event_enterMousePressed

    private void enterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseReleased
        // TODO add your handling code here:
        enter.setBackground(new Color(175,209,255));
    }//GEN-LAST:event_enterMouseReleased

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        jPanel1.setBackground(Color.red);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(252,224,177));
    }//GEN-LAST:event_jPanel1MouseExited

    private void enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseClicked
        // TODO add your handling code here:
        loginForm menu = new loginForm();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_enterMouseClicked

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
            java.util.logging.Logger.getLogger(welc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

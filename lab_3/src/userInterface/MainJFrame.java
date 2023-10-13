/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface;

import business.AccountDirectory;
import java.awt.CardLayout;

/**
 *
 * @author danica
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private AccountDirectory accountDirectory;
    public MainJFrame() {
        initComponents();
        this.accountDirectory = new AccountDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topjPanel = new javax.swing.JPanel();
        btnAccountingMng = new javax.swing.JButton();
        bottomJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topjPanel.setBackground(new java.awt.Color(102, 204, 255));

        btnAccountingMng.setText("Account manager");
        btnAccountingMng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountingMngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topjPanelLayout = new javax.swing.GroupLayout(topjPanel);
        topjPanel.setLayout(topjPanelLayout);
        topjPanelLayout.setHorizontalGroup(
            topjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topjPanelLayout.createSequentialGroup()
                .addContainerGap(690, Short.MAX_VALUE)
                .addComponent(btnAccountingMng)
                .addGap(79, 79, 79))
        );
        topjPanelLayout.setVerticalGroup(
            topjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topjPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnAccountingMng)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(topjPanel);

        bottomJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(bottomJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountingMngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountingMngActionPerformed
        // TODO add your handling code here:
        AccountMngJPanel panel = new AccountMngJPanel(bottomJPanel,accountDirectory);
        bottomJPanel.add("AccountMngJPanel", panel);
        CardLayout layout = (CardLayout) bottomJPanel.getLayout();
        layout.next(bottomJPanel);
    }//GEN-LAST:event_btnAccountingMngActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomJPanel;
    private javax.swing.JButton btnAccountingMng;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel topjPanel;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atm.gui;

import atm.controller.AccountController;
import atm.model.Account;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


/**
 *
 * @author viniciusbeletella
 */
public class DepositPage extends javax.swing.JPanel {
    

    /** Creates new form DepositPage */
    public DepositPage(Account account) {
        initComponents();
        
            depositButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(depositText.getText());
                    AccountController wt = new AccountController();
                    
                    try {
                      double deposit = Double.parseDouble(depositText.getText()); 
                      account.setBalance(account.getBalance() + deposit);
                        wt.updateBalance(account);

                        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(depositButton);
                        topFrame.setContentPane (new BalancePage(account));
                        topFrame.invalidate();
                    topFrame.validate();
                    } catch (NumberFormatException numberException) {
                        numberException.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Please enter a valid number (double). ");
                    }
                }
            });
       
    
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        depositHeader = new javax.swing.JLabel();
        depositButton = new javax.swing.JButton();
        depositText = new javax.swing.JTextField();

        depositHeader.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        depositHeader.setText("Deposit value: ");

        depositButton.setText("GO!");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        depositText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        depositText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(depositText, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(depositButton)))
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(depositHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(depositHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(depositButton)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void depositTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_depositTextActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed

         System.out.println(depositText.getText());
        


        // TODO add your handling code here:
    }//GEN-LAST:event_depositButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel depositHeader;
    private javax.swing.JTextField depositText;
    // End of variables declaration//GEN-END:variables

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.frontend;
import org.example.AdminRole;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
/**
 *
 * @author User
 */
public class AdminRoleGUI extends javax.swing.JFrame implements Node {

    
    public AdminRoleGUI() {
        
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

        AddLibrarian = new javax.swing.JButton();
        ViewLibrarians = new javax.swing.JButton();
        RemoveLibrarian = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Admin Role");

        AddLibrarian.setBackground(new java.awt.Color(0, 0, 0));
        AddLibrarian.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddLibrarian.setForeground(new java.awt.Color(255, 255, 255));
        AddLibrarian.setText("Add Librarian");
        AddLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLibrarianActionPerformed(evt);
            }
        });

        ViewLibrarians.setBackground(new java.awt.Color(0, 0, 0));
        ViewLibrarians.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewLibrarians.setForeground(new java.awt.Color(255, 255, 255));
        ViewLibrarians.setText("View Librarians");
        ViewLibrarians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewLibrariansActionPerformed(evt);
            }
        });

        RemoveLibrarian.setBackground(new java.awt.Color(0, 0, 0));
        RemoveLibrarian.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RemoveLibrarian.setForeground(new java.awt.Color(255, 255, 255));
        RemoveLibrarian.setText("Remove Librarian");
        RemoveLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveLibrarianActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(0, 0, 0));
        Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewLibrarians, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddLibrarian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RemoveLibrarian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(Logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(AddLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(ViewLibrarians, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(RemoveLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        
        
        admin.logout();

        this.setVisible(false);
        ((JFrame)(this.getParentNode().getParentNode())).setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void AddLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLibrarianActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        addlibrarian a= new addlibrarian();
        a.setVisible(true);
        a.setParentNode(this);
    }//GEN-LAST:event_AddLibrarianActionPerformed

    private void RemoveLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveLibrarianActionPerformed
        // TODO add your handling code here:\
        this.setVisible(false);
        RemoveLibrarian n =new RemoveLibrarian();
        n.setVisible(true);
        n.setParentNode(this);
    }//GEN-LAST:event_RemoveLibrarianActionPerformed

    private void ViewLibrariansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewLibrariansActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewLibrarians a =new ViewLibrarians();
        a.setParentNode(this);
        a.setTitle("librarians");
        a.tabelInfo();
        a.setdata();
        a.setVisible(true);
        
    }//GEN-LAST:event_ViewLibrariansActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRoleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRoleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRoleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRoleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRoleGUI().setVisible(true);
                
            }
        });
    }

    public AdminRole getAdmin() {
        return admin;
    }
    private Node parent;
   private AdminRole admin=new AdminRole();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLibrarian;
    private javax.swing.JButton Logout;
    private javax.swing.JButton RemoveLibrarian;
    private javax.swing.JButton ViewLibrarians;
    // End of variables declaration//GEN-END:variables
    public Node getParentNode() {
        try{
    return parent;
        }
        catch(NullPointerException i){
        }
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
       this.parent=node;
    }

  
}

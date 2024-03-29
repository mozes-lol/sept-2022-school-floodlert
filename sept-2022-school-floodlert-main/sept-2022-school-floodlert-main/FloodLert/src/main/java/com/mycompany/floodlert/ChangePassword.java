/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.floodlert;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh Garcia
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Change = new javax.swing.JButton();
        jPasswordField1_Password1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1_Password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Change.setBackground(new java.awt.Color(72, 140, 210));
        Change.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Change.setForeground(new java.awt.Color(255, 255, 255));
        Change.setText("Change");
        Change.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });
        getContentPane().add(Change, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 202, 108, 20));

        jPasswordField1_Password1.setBackground(new java.awt.Color(33, 55, 74));
        jPasswordField1_Password1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPasswordField1_Password1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1_Password1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 70, 85), 1, true));
        jPasswordField1_Password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1_Password1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1_Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 108, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Verify Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 108, -1));

        jPasswordField1_Password.setBackground(new java.awt.Color(33, 55, 74));
        jPasswordField1_Password.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPasswordField1_Password.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1_Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 70, 85), 1, true));
        getContentPane().add(jPasswordField1_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 108, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Change Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 108, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/floodlert/change pass.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void returnToMainMenu (){
        LogIn.main(null);
        new Dashboard().setVisible(false);
        this.dispose(); 
    }
    
    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed
    try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/floodlert","root","");
            String sql = "update login set password=? where username=?";
            
            PreparedStatement psmt = conn.prepareStatement(sql);
           
            psmt.setString(1, jPasswordField1_Password.getText());
            psmt.setString(2, jPasswordField1_Password1.getText());
         
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Password Updated");
            returnToMainMenu();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeActionPerformed

    private void jPasswordField1_Password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1_Password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1_Password1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {        
        FlatArcDarkIJTheme.setup();
        } catch( Exception ex ) {
        System.err.println( "Failed to initialize LaF" );
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jPasswordField1_Password;
    private javax.swing.JTextField jPasswordField1_Password1;
    // End of variables declaration//GEN-END:variables
}

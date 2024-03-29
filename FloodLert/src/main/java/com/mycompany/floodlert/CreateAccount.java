/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.floodlert;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author johnm
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
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

        jLabel1_Username = new javax.swing.JLabel();
        jLabel1_Password = new javax.swing.JLabel();
        jPasswordField1_Password = new javax.swing.JPasswordField();
        jButton1_CreateAccount = new javax.swing.JButton();
        jButton1_ReturnToLogIn = new javax.swing.JButton();
        jPasswordField1_Password1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1_Username.setText("Username");

        jLabel1_Password.setText("Password");

        jButton1_CreateAccount.setText("Create Account");
        jButton1_CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_CreateAccountActionPerformed(evt);
            }
        });

        jButton1_ReturnToLogIn.setText("Return to Log In");
        jButton1_ReturnToLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ReturnToLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1_CreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1_ReturnToLogIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1_Username)
                            .addComponent(jLabel1_Password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1_Password1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jPasswordField1_Password))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_Username)
                    .addComponent(jPasswordField1_Password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1_CreateAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1_ReturnToLogIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnToMainMenu (){
        LogIn.main(null);
        this.dispose();
    }
    
    private void jButton1_ReturnToLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ReturnToLogInActionPerformed
        // TODO add your handling code here:
        returnToMainMenu();
    }//GEN-LAST:event_jButton1_ReturnToLogInActionPerformed

    private void jButton1_CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_CreateAccountActionPerformed
        // This creates a new account data on the database.
        // NOTE: If the username already exists in the database, the account will not be created.
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/floodlert","root","");
            String sql = "insert into login values (?,?)";
            
            PreparedStatement psmt = conn.prepareStatement(sql);
           
            psmt.setString(1, jPasswordField1_Password1.getText());
            psmt.setString(2, jPasswordField1_Password.getText());
         
            psmt.executeUpdate();
            
            sql = "insert into login_weather value ( ?, ? )";
            
            psmt = conn.prepareStatement(sql);
            
            psmt.setString(1, jPasswordField1_Password1.getText());
            psmt.setString(2, "Manila");
            
            psmt.executeUpdate();
            returnToMainMenu();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Login already Exist");
        }
    }//GEN-LAST:event_jButton1_CreateAccountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {        
            FlatArcDarkIJTheme.setup();
        } catch( Exception ex ) {
        System.err.println( "Failed to initialize LaF" );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_CreateAccount;
    private javax.swing.JButton jButton1_ReturnToLogIn;
    private javax.swing.JLabel jLabel1_Password;
    private javax.swing.JLabel jLabel1_Username;
    private javax.swing.JPasswordField jPasswordField1_Password;
    private javax.swing.JTextField jPasswordField1_Password1;
    // End of variables declaration//GEN-END:variables
}

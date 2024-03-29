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
public class DeleteAcc extends javax.swing.JFrame {

    /**
     * Creates new form DeleteAcc
     */
    public DeleteAcc() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        DELETERECORD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 308, -1));

        jTextField1.setBackground(new java.awt.Color(33, 55, 74));
        jTextField1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 70, 85), 1, true));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 308, -1));

        DELETERECORD.setBackground(new java.awt.Color(72, 140, 210));
        DELETERECORD.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        DELETERECORD.setForeground(new java.awt.Color(255, 255, 255));
        DELETERECORD.setText("DELETE RECORD");
        DELETERECORD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DELETERECORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETERECORDActionPerformed(evt);
            }
        });
        getContentPane().add(DELETERECORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 308, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/floodlert/delete account.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 320, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void returnToMainMenu (){
        LogIn.main(null);
        new Dashboard().setVisible(false);
        this.dispose(); 
    }
    
    private void DELETERECORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETERECORDActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/floodlert","root","");
            String sql ="delete  from login where username =?";
            PreparedStatement psmt = conn.prepareStatement(sql);
            
            psmt.setString(1, jTextField1.getText());
            psmt.executeUpdate();
            
            sql = "delete  from login_weather where username =?";
            
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, jTextField1.getText());
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record deleted successfully!!");
            
            psmt.executeUpdate();
            returnToMainMenu();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_DELETERECORDActionPerformed

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
                new DeleteAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETERECORD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.floodlert;

import static com.mysql.cj.MysqlType.JSON;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author johnm
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        jPanel1_FloodLevel = new javax.swing.JPanel();
        jComboBox1_CitySelect = new javax.swing.JComboBox<>();
        jLabel1_FloodLevel = new javax.swing.JLabel();
        jLabel1_FloodLevelData = new javax.swing.JLabel();
        jButton1_SubmitFloodReport = new javax.swing.JButton();
        jButton1_LogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1_FloodLevel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox1_CitySelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT CITY", "Alaminos", "Angeles City", "Antipolo", "Bacolod", "Bacoor", "Bago", "Baguio", "Bais", "Balanga", "Batac", "Batangas City", "Bayawan", "Baybay", "Bayugan", "Biñan", "Bislig", "Bogo", "Borongan", "Butuaan", "Cadbadbaran", "Cabanatuan", "Cabuyao", "Cadiz", "Cagayan de Oro", "Calaca", "Calamba", "Calapan", "Calbayog", "Caloocan", "Candon", "Canlaon", "Carcar", "Catbalogan", "Cauayan", "Cavite City", "Ceby City", "Cotabato City", "Dagupan", "Danao", "Dapitan", "Dasmariñas", "Davao City", "Digos", "Dipolog", "Dumaguete", "El Salvador", "Escalante", "Gapan", "General Santos", "General Trias", "Gingoog", "Guihulngan", "Himamaylan", "Ilagan", "Iligan", "Iloilo City", "Imus", "Iriga", "Isabela", "Kabankalan", "Kidapawan", "Koronadal", "La Carlota", "Lamitan", "Laoag", "Lapu-Lapu City", "Las Piñas", "Legazpi", "Ligao", "Lipa", "Lucena", "Maasin", "Mabalacat", "Makati", "Malabon", "Malaybalay", "Malolos", "Mandaluyong", "Mandaue", "Manila", "Marawi", "Marikina", "Masbate City", "Mati", "Mecauayan", "Muñoz", "Muntinlupa", "Naga (Camarines Sur)", "Naga (Cebu)", "Navotas", "Olongapo", "Ormoc", "Oroquieta", "Ozamiz", "Pagadian", "Palayan", "Panabo", "Parañaque", "Pasay", "Pasig", "Passi", "Puerto Princessa", "Quezon City", "Roxas", "Sagay", "Samal", "San Carlos (Negros Occidental)", "San Carlos (Pangasinan)", "San Fernando (La Union)", "San Fernando (Pampanga)", "San Jose", "San Jose del Monte", "San Juan", "San Pablo", "San Pedro", "Santa Rosa", "Santo Tomas", "Santiago", "Silay", "Sipalay", "Sorsogon City", "Surigao City", "Tabaco", "Tabuk", "Tacloban", "Tacurong", "Tagaytay", "Tagbilaran", "Taguig", "Tagum", "Talisay (Cebu)", "Talisay (Negros Occidental)", "Tanauan", "Tandag", "Tangub", "Tanjay", "Tarlac City", "Tayabas", "Toledo", "Trece Martires", "Tuguegarao", "Urdaneta", "Valencia", "Valenzuela", "Victoras", "Vigan", "Zamboanga City" }));
        jComboBox1_CitySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_CitySelectActionPerformed(evt);
            }
        });

        jLabel1_FloodLevel.setText("Flood Level:");

        jLabel1_FloodLevelData.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1_FloodLevelData.setText("[NO DATA]");
        jLabel1_FloodLevelData.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1_FloodLevelLayout = new javax.swing.GroupLayout(jPanel1_FloodLevel);
        jPanel1_FloodLevel.setLayout(jPanel1_FloodLevelLayout);
        jPanel1_FloodLevelLayout.setHorizontalGroup(
            jPanel1_FloodLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_FloodLevelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_FloodLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1_CitySelect, 0, 235, Short.MAX_VALUE)
                    .addGroup(jPanel1_FloodLevelLayout.createSequentialGroup()
                        .addGroup(jPanel1_FloodLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1_FloodLevel)
                            .addComponent(jLabel1_FloodLevelData))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1_FloodLevelLayout.setVerticalGroup(
            jPanel1_FloodLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_FloodLevelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1_CitySelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1_FloodLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_FloodLevelData)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton1_SubmitFloodReport.setText("Submit Flood Report");
        jButton1_SubmitFloodReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SubmitFloodReportActionPerformed(evt);
            }
        });

        jButton1_LogOut.setText("Log Out");
        jButton1_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1_FloodLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1_SubmitFloodReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1_LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1_FloodLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1_SubmitFloodReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1_LogOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_SubmitFloodReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SubmitFloodReportActionPerformed
        // TODO add your handling code here:
        ReportFlood.main(null);
        this.dispose();
    }//GEN-LAST:event_jButton1_SubmitFloodReportActionPerformed

    private void jButton1_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_LogOutActionPerformed
        // TODO add your handling code here:
        FloodLert.loggedInUsername = null;
        FloodLert.LogInPrompt();
        ReportFlood.main(null);
        this.dispose();
    }//GEN-LAST:event_jButton1_LogOutActionPerformed

    private void jComboBox1_CitySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_CitySelectActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/floodlert","root","");
            String sql = 
                "SELECT AVG(floodLevel)\n" +
                "FROM floodreport\n" +
                "WHERE city=?;";
            
            PreparedStatement psmt = conn.prepareStatement(sql);
           
            psmt.setString(1, jComboBox1_CitySelect.getSelectedItem().toString());
            
            psmt.executeQuery();
            
            System.out.println(psmt.executeQuery());
           
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox1_CitySelectActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_LogOut;
    private javax.swing.JButton jButton1_SubmitFloodReport;
    private javax.swing.JComboBox<String> jComboBox1_CitySelect;
    private javax.swing.JLabel jLabel1_FloodLevel;
    private javax.swing.JLabel jLabel1_FloodLevelData;
    private javax.swing.JPanel jPanel1_FloodLevel;
    // End of variables declaration//GEN-END:variables
}

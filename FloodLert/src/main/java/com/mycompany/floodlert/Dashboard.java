/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.floodlert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Dashboard extends javax.swing.JFrame {
    
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel1.setText("Welcome," +  FloodLert.username + "!");
        
        WeatherAPI.fetch("Manila");
        
        WeatherAPI.setValues();
        DateTime.setValues();
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
        basicforecast_box = new javax.swing.JPanel();
        status = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        localdate = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        localtime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        searchbutton = new javax.swing.JButton();
        searchbar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
                    .addComponent(jComboBox1_CitySelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1_FloodLevelLayout.createSequentialGroup()
                        .addGroup(jPanel1_FloodLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1_FloodLevelData)
                            .addComponent(jLabel1_FloodLevel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1_FloodLevelLayout.setVerticalGroup(
            jPanel1_FloodLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_FloodLevelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1_CitySelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_FloodLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_FloodLevelData)
                .addContainerGap())
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

        basicforecast_box.setBackground(new java.awt.Color(51, 51, 51));
        basicforecast_box.setForeground(new java.awt.Color(51, 51, 51));
        basicforecast_box.setFocusable(false);

        status.setBackground(new java.awt.Color(237, 249, 244));
        status.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        status.setForeground(new java.awt.Color(237, 249, 244));
        status.setText("XXXXXX XXXXXX");

        temp.setBackground(new java.awt.Color(237, 249, 244));
        temp.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        temp.setForeground(new java.awt.Color(237, 249, 244));
        temp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temp.setText("XX°");

        localdate.setBackground(new java.awt.Color(237, 249, 244));
        localdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        localdate.setForeground(new java.awt.Color(237, 249, 244));
        localdate.setText("XX/XX/XXXX");

        location.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        location.setForeground(new java.awt.Color(237, 249, 244));
        location.setText("XXXXXXXXXXX, XXXXXXXXXXX");

        javax.swing.GroupLayout basicforecast_boxLayout = new javax.swing.GroupLayout(basicforecast_box);
        basicforecast_box.setLayout(basicforecast_boxLayout);
        basicforecast_boxLayout.setHorizontalGroup(
            basicforecast_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basicforecast_boxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basicforecast_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(localdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(location, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        basicforecast_boxLayout.setVerticalGroup(
            basicforecast_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicforecast_boxLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(basicforecast_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(basicforecast_boxLayout.createSequentialGroup()
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(location)
                        .addGap(8, 8, 8)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        localtime.setBackground(new java.awt.Color(237, 249, 244));
        localtime.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        localtime.setForeground(new java.awt.Color(237, 249, 244));
        localtime.setText("XX:XX XX");

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N

        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        jButton1.setText("SETTINGS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(jPanel1_FloodLevel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchbar)
                        .addGap(18, 18, 18)
                        .addComponent(searchbutton))
                    .addComponent(basicforecast_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1_SubmitFloodReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1_LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localtime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(localtime)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(basicforecast_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_SubmitFloodReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_LogOut))
                    .addComponent(jPanel1_FloodLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     public void searchProcess(String area) {
        if (area.equals("")) {
            WeatherAPI.current_area = "";
            WeatherAPI.fetch(WeatherAPI.currentUserArea());
        } else if (WeatherAPI.current_area != area){
            WeatherAPI.current_area = area;
            WeatherAPI.fetch(WeatherAPI.currentUserArea());
        }
        
        WeatherAPI.setValues();
    }
    
    private void jButton1_SubmitFloodReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SubmitFloodReportActionPerformed
        // goes to ReportFlood.java
        ReportFlood.main(null);
    }//GEN-LAST:event_jButton1_SubmitFloodReportActionPerformed

    private void jButton1_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_LogOutActionPerformed
        // goes to LogIn.java; also resets the logged in username to "null"
        FloodLert.username = null;
        FloodLert.LogInPrompt();
        LogIn.main(null);
        this.dispose();
    }//GEN-LAST:event_jButton1_LogOutActionPerformed

    private void jComboBox1_CitySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_CitySelectActionPerformed
        // Upon selecting a city inside the combo box, it will accumulate the average of the total flood level based on the databse.
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/floodlert","root","");
            Statement psmt = conn.createStatement();
            String x= String.valueOf(jComboBox1_CitySelect.getSelectedItem());
            String sql =  
                "SELECT AVG(floodLevel) as level\n" +
                "FROM floodreport\n" +
                "WHERE city='"+x+"'";
            
        ResultSet res = psmt.executeQuery(sql);

        String flevel="";
        while (res.next()){
            flevel = res.getString("level");
        }
        
        // If there's no flood level data for that city, this will display instead.
        if (flevel == null){
            flevel = "[NO DATA]";
        }
        
        // displays the flood level on the dashboard
        jLabel1_FloodLevelData.setText(flevel);     
           
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox1_CitySelectActionPerformed
    public void searchbarKeyPressed(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            searchProcess(searchbar.getText());
        }
    }  
    
    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
    searchProcess(searchbar.getText());
    }//GEN-LAST:event_searchbuttonActionPerformed
    
    
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
        
        FloodLert.access = true;

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basicforecast_box;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_LogOut;
    private javax.swing.JButton jButton1_SubmitFloodReport;
    private javax.swing.JComboBox<String> jComboBox1_CitySelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_FloodLevel;
    private javax.swing.JLabel jLabel1_FloodLevelData;
    private javax.swing.JPanel jPanel1_FloodLevel;
    public static javax.swing.JLabel localdate;
    public static javax.swing.JLabel localtime;
    public static javax.swing.JLabel location;
    private javax.swing.JTextField searchbar;
    private javax.swing.JButton searchbutton;
    public static javax.swing.JLabel status;
    public static javax.swing.JLabel temp;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.floodlert;

/**
 *
 * @author johnm
 */
public class ReportFlood extends javax.swing.JFrame {

    /**
     * Creates new form ReportFlood
     */
    public ReportFlood() {
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

        jLabel1_Where = new javax.swing.JLabel();
        jComboBox1_City = new javax.swing.JComboBox<>();
        jLabel1_WhatIsTheHeight = new javax.swing.JLabel();
        jSlider1_FloodLevel = new javax.swing.JSlider();
        jLabel1_Low = new javax.swing.JLabel();
        jLabel1_Hight = new javax.swing.JLabel();
        jButton1_SubmitReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_Where.setText("Where does the flood take place?");

        jComboBox1_City.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT CITY", "Alaminos", "Angeles City", "Antipolo", "Bacolod", "Bacoor", "Bago", "Baguio", "Bais", "Balanga", "Batac", "Batangas City", "Bayawan", "Baybay", "Bayugan", "Biñan", "Bislig", "Bogo", "Borongan", "Butuaan", "Cadbadbaran", "Cabanatuan", "Cabuyao", "Cadiz", "Cagayan de Oro", "Calaca", "Calamba", "Calapan", "Calbayog", "Caloocan", "Candon", "Canlaon", "Carcar", "Catbalogan", "Cauayan", "Cavite City", "Ceby City", "Cotabato City", "Dagupan", "Danao", "Dapitan", "Dasmariñas", "Davao City", "Digos", "Dipolog", "Dumaguete", "El Salvador", "Escalante", "Gapan", "General Santos", "General Trias", "Gingoog", "Guihulngan", "Himamaylan", "Ilagan", "Iligan", "Iloilo City", "Imus", "Iriga", "Isabela", "Kabankalan", "Kidapawan", "Koronadal", "La Carlota", "Lamitan", "Laoag", "Lapu-Lapu City", "Las Piñas", "Legazpi", "Ligao", "Lipa", "Lucena", "Maasin", "Mabalacat", "Makati", "Malabon", "Malaybalay", "Malolos", "Mandaluyong", "Mandaue", "Manila", "Marawi", "Marikina", "Masbate City", "Mati", "Mecauayan", "Muñoz", "Muntinlupa", "Naga (Camarines Sur)", "Naga (Cebu)", "Navotas", "Olongapo", "Ormoc", "Oroquieta", "Ozamiz", "Pagadian", "Palayan", "Panabo", "Parañaque", "Pasay", "Pasig", "Passi", "Puerto Princessa", "Quezon City", "Roxas", "Sagay", "Samal", "San Carlos (Negros Occidental)", "San Carlos (Pangasinan)", "San Fernando (La Union)", "San Fernando (Pampanga)", "San Jose", "San Jose del Monte", "San Juan", "San Pablo", "San Pedro", "Santa Rosa", "Santo Tomas", "Santiago", "Silay", "Sipalay", "Sorsogon City", "Surigao City", "Tabaco", "Tabuk", "Tacloban", "Tacurong", "Tagaytay", "Tagbilaran", "Taguig", "Tagum", "Talisay (Cebu)", "Talisay (Negros Occidental)", "Tanauan", "Tandag", "Tangub", "Tanjay", "Tarlac City", "Tayabas", "Toledo", "Trece Martires", "Tuguegarao", "Urdaneta", "Valencia", "Valenzuela", "Victoras", "Vigan", "Zamboanga City" }));

        jLabel1_WhatIsTheHeight.setText("What is the height of the flood?");

        jLabel1_Low.setText("Low");

        jLabel1_Hight.setText("High");

        jButton1_SubmitReport.setText("Submit Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_WhatIsTheHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1_Where, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1_Low)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider1_FloodLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1_Hight))
                            .addComponent(jComboBox1_City, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1_SubmitReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_Where, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_WhatIsTheHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSlider1_FloodLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_Low, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_Hight, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1_SubmitReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ReportFlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportFlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportFlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportFlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportFlood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_SubmitReport;
    private javax.swing.JComboBox<String> jComboBox1_City;
    private javax.swing.JLabel jLabel1_Hight;
    private javax.swing.JLabel jLabel1_Low;
    private javax.swing.JLabel jLabel1_WhatIsTheHeight;
    private javax.swing.JLabel jLabel1_Where;
    private javax.swing.JSlider jSlider1_FloodLevel;
    // End of variables declaration//GEN-END:variables
}

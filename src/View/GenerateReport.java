package View;

import Controler.JpanelLoader;
import Model.User;
import javax.swing.JOptionPane;

public class GenerateReport extends javax.swing.JFrame {
    
    JpanelLoader jpload = new JpanelLoader();
    
    public GenerateReport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnUserReport = new javax.swing.JButton();
        btnInventoryReport = new javax.swing.JButton();
        btnRepairItemReport = new javax.swing.JButton();
        btnDonatedItemReport = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        showPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAuctionsItemsReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 100, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setBackground(new java.awt.Color(1, 50, 32));
        jPanel2.setPreferredSize(new java.awt.Dimension(1100, 111));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generate Report");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 100, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnUserReport.setBackground(new java.awt.Color(204, 204, 204));
        btnUserReport.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btnUserReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ReportIcon.png"))); // NOI18N
        btnUserReport.setText("User Report");
        btnUserReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUserReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserReportActionPerformed(evt);
            }
        });

        btnInventoryReport.setBackground(new java.awt.Color(204, 204, 204));
        btnInventoryReport.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btnInventoryReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ReportIcon.png"))); // NOI18N
        btnInventoryReport.setText("Inventory Report");
        btnInventoryReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventoryReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryReportActionPerformed(evt);
            }
        });

        btnRepairItemReport.setBackground(new java.awt.Color(204, 204, 204));
        btnRepairItemReport.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btnRepairItemReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ReportIcon.png"))); // NOI18N
        btnRepairItemReport.setText("Repair Item Report");
        btnRepairItemReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRepairItemReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepairItemReportActionPerformed(evt);
            }
        });

        btnDonatedItemReport.setBackground(new java.awt.Color(204, 204, 204));
        btnDonatedItemReport.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btnDonatedItemReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ReportIcon.png"))); // NOI18N
        btnDonatedItemReport.setText("Donated Item Report");
        btnDonatedItemReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDonatedItemReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonatedItemReportActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BackIcon.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        showPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ReportGenerateImg.gif"))); // NOI18N

        javax.swing.GroupLayout showPanelLayout = new javax.swing.GroupLayout(showPanel);
        showPanel.setLayout(showPanelLayout);
        showPanelLayout.setHorizontalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showPanelLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(105, 105, 105))
        );
        showPanelLayout.setVerticalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showPanelLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        btnAuctionsItemsReport.setBackground(new java.awt.Color(204, 204, 204));
        btnAuctionsItemsReport.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btnAuctionsItemsReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ReportIcon.png"))); // NOI18N
        btnAuctionsItemsReport.setText("Auctions Items Report");
        btnAuctionsItemsReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAuctionsItemsReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuctionsItemsReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDonatedItemReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRepairItemReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInventoryReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUserReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAuctionsItemsReport, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUserReport, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnInventoryReport, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnRepairItemReport, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnDonatedItemReport, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAuctionsItemsReport, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserReportActionPerformed
        UserReport ur = new UserReport();
        jpload.jPanelLoader(showPanel, ur);
    }//GEN-LAST:event_btnUserReportActionPerformed

    private void btnInventoryReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryReportActionPerformed
        InventoryReport ir = new InventoryReport();
        jpload.jPanelLoader(showPanel, ir);
    }//GEN-LAST:event_btnInventoryReportActionPerformed

    private void btnRepairItemReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepairItemReportActionPerformed
        RepairItemReport RP = new RepairItemReport();
        jpload.jPanelLoader(showPanel, RP);
    }//GEN-LAST:event_btnRepairItemReportActionPerformed

    private void btnDonatedItemReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonatedItemReportActionPerformed
        DonatedInventoryReport dr = new DonatedInventoryReport();
        jpload.jPanelLoader(showPanel, dr);
    }//GEN-LAST:event_btnDonatedItemReportActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            if (User.getRole().equals("admin")) {
            this.dispose();
            AdminDash a1 = new AdminDash();
            a1.setVisible(true);
        } else if (User.getRole().equals("superadmin")) {
            this.dispose();
            SuperAdminDash a1 = new SuperAdminDash();
            a1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect role");
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAuctionsItemsReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuctionsItemsReportActionPerformed
        AuctionsItemsReport AR = new AuctionsItemsReport();
        jpload.jPanelLoader(showPanel, AR);
    }//GEN-LAST:event_btnAuctionsItemsReportActionPerformed


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
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuctionsItemsReport;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDonatedItemReport;
    private javax.swing.JButton btnInventoryReport;
    private javax.swing.JButton btnRepairItemReport;
    private javax.swing.JButton btnUserReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel showPanel;
    // End of variables declaration//GEN-END:variables
}

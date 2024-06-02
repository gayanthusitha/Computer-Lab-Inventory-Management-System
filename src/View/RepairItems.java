package View;

import DB_Connection.Database_Connection;
import Model.User;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RepairItems extends javax.swing.JFrame {

    public RepairItems() {
        initComponents();
        showTableDate();
        ShowRepairTable();
    }
    
    public void showTableDate() {
        try {
            DefaultTableModel dt = (DefaultTableModel) tblMainInventory.getModel();
            dt.setRowCount(0);

            Connection connection = Database_Connection.getInstance().getConnection();

            String query = "SELECT * FROM maininventory";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Vector v = new Vector();
                v.add(resultSet.getInt(1));
                v.add(resultSet.getString(2));
                v.add(resultSet.getString(3));
                v.add(resultSet.getString(4));
                v.add(resultSet.getString(5));
                v.add(resultSet.getInt(6));
                v.add(resultSet.getString(7));
                v.add(resultSet.getString(8));
                v.add(resultSet.getString(9));
                v.add(resultSet.getString(10));

                dt.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ShowRepairTable(){
        try {
            DefaultTableModel dt = (DefaultTableModel) tblRepair.getModel();
            dt.setRowCount(0);

            Connection connection = Database_Connection.getInstance().getConnection();

            String query = "SELECT * FROM repairitems";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Vector v = new Vector();
                v.add(resultSet.getInt(1));
                v.add(resultSet.getInt(2));
                v.add(resultSet.getString(3));
                v.add(resultSet.getString(4));
                v.add(resultSet.getString(5));
                v.add(resultSet.getInt(6));
                v.add(resultSet.getString(7));
                v.add(resultSet.getString(8));
                dt.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMainInventory = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRepair = new javax.swing.JTable();
        btnAddRepair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 100, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1380, 772));

        jPanel2.setBackground(new java.awt.Color(1, 50, 32));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Repair Items");

        txtSearch.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(1, 50, 32));
        btnRefresh.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(1, 50, 32));
        btnBack.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Main Inventory", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        tblMainInventory.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        tblMainInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Number", "Item Name", "Category", "Brand", "Serial Number", "Quantity", "Received Date", "Received By", "Location", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMainInventory.setRowHeight(30);
        jScrollPane1.setViewportView(tblMainInventory);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1358, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Repair Items", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        tblRepair.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        tblRepair.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Repair Number", "Item Number", "Item Name", "Brand", "Serial Number", "Quantity", "Reason", "Repair Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblRepair.setRowHeight(30);
        jScrollPane2.setViewportView(tblRepair);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        btnAddRepair.setBackground(new java.awt.Color(1, 50, 32));
        btnAddRepair.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        btnAddRepair.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRepair.setText("Add Repair");
        btnAddRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRepairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddRepair, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddRepair, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        if (txtSearch.getText().equals("Search")) {
            txtSearch.setText("");
            txtSearch.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if (txtSearch.getText().equals("")) {
            txtSearch.setText("Search");
            txtSearch.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSearchFocusLost

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // Get the entered text in the search field
        String searchCategory = txtSearch.getText();

        // Perform search only if the search string is not empty
        if (!searchCategory.isEmpty()) {
            try {
                Connection connection = Database_Connection.getInstance().getConnection();

                // Query to search for items by category
                String query = "SELECT * FROM maininventory WHERE category LIKE ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                // Set the parameter for category search using wildcard %
                preparedStatement.setString(1, "%" + searchCategory + "%");

                // Execute the SQL query
                ResultSet resultSet = preparedStatement.executeQuery();

                // Clear existing table data
                DefaultTableModel model = (DefaultTableModel) tblMainInventory.getModel();
                model.setRowCount(0);

                // Populate the table with search results
                while (resultSet.next()) {
                    Object[] row = {
                        resultSet.getString("item_number"),
                        resultSet.getString("item_name"),
                        resultSet.getString("category"),
                        resultSet.getString("brand"),
                        resultSet.getString("serial_number"),
                        resultSet.getString("qty"),
                        resultSet.getString("receved_date"),
                        resultSet.getString("receved_by"),
                        resultSet.getString("location"),
                        resultSet.getString("note")
                    };
                    model.addRow(row);
                }

                preparedStatement.close();
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            // If the search string is empty, show all items in the table
            showTableDate();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // Show Table data
        showTableDate() ;
        
        //Search Box clear
        txtSearch.setText("Search");
    }//GEN-LAST:event_btnRefreshActionPerformed

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

    private void btnAddRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRepairActionPerformed
        // Get the selected row from the main inventory table
        int selectedRow = tblMainInventory.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row from the main inventory table.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Extract data from the selected row
        String itemNumber = tblMainInventory.getValueAt(selectedRow, 0).toString();
        String itemName = tblMainInventory.getValueAt(selectedRow, 1).toString();
        String category = tblMainInventory.getValueAt(selectedRow, 2).toString();
        String brand = tblMainInventory.getValueAt(selectedRow, 3).toString();
        String serialNumber = tblMainInventory.getValueAt(selectedRow, 4).toString();
        String receivedDate = tblMainInventory.getValueAt(selectedRow, 5).toString();
        String receivedBy = tblMainInventory.getValueAt(selectedRow, 6).toString();
        String location = tblMainInventory.getValueAt(selectedRow, 7).toString();
        String note = tblMainInventory.getValueAt(selectedRow, 8).toString();
        
        // Get quantity for repair from user input
        String repairQtyStr = JOptionPane.showInputDialog(null, "Enter quantity for repair:", "Quantity for Repair", JOptionPane.QUESTION_MESSAGE);
        if (repairQtyStr == null || repairQtyStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide a quantity for repair.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int repairQty;
        try {
            repairQty = Integer.parseInt(repairQtyStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Check if quantity in main inventory is sufficient
        int currentQty = getCurrentQuantity(serialNumber);
        if (currentQty < repairQty) {
            JOptionPane.showMessageDialog(null, "Insufficient quantity in main inventory.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Get reason for repair from user input
        String repairReason = JOptionPane.showInputDialog(null, "Enter reason for repair:", "Reason for Repair", JOptionPane.QUESTION_MESSAGE);
        if (repairReason == null || repairReason.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide a reason for repair.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Get date for repair from user input
        String repairDateStr = JOptionPane.showInputDialog(null, "Enter repair date (yyyy-MM-dd):", "Repair Date", JOptionPane.QUESTION_MESSAGE);
        if (repairDateStr == null || repairDateStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide a repair date.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date repairDate;
        try {
            repairDate = dateFormat.parse(repairDateStr);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Invalid date format. Please enter the date in yyyy-MM-dd format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Convert repair date to string in yyyy-MM-dd format
        String repairDateString = dateFormat.format(repairDate);
        
        try {
            Connection connection = Database_Connection.getInstance().getConnection();
            connection.setAutoCommit(false);
            
            // Insert data into repair table
            String repairQuery = "INSERT INTO repairitems (item_number, item_name, brand, serial_number, quantity, reason, repair_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement repairStatement = connection.prepareStatement(repairQuery);
            repairStatement.setString(1, itemNumber);
            repairStatement.setString(2, itemName);
            repairStatement.setString(3, brand);
            repairStatement.setString(4, serialNumber);
            repairStatement.setInt(5, repairQty);
            repairStatement.setString(6, repairReason);
            repairStatement.setString(7, repairDateString);
            
            repairStatement.executeUpdate();
            
            // Update quantity in main inventory table
            String updateQuery = "UPDATE maininventory  SET qty = qty - ? WHERE serial_number = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setInt(1, repairQty);
            updateStatement.setString(2, serialNumber);
            updateStatement.executeUpdate();
            
            connection.commit();
            JOptionPane.showMessageDialog(null, "Item transferred to repair table successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            // Show Repair Item table
            ShowRepairTable();
            
            // Refresh main inventory table
            showTableDate() ;
            
            repairStatement.close();
            updateStatement.close();
            //connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddRepairActionPerformed

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
            java.util.logging.Logger.getLogger(RepairItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepairItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepairItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepairItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepairItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRepair;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMainInventory;
    private javax.swing.JTable tblRepair;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    
    private int getCurrentQuantity(String serialNumber) {
        try {
            Connection connection = Database_Connection.getInstance().getConnection();
            String query = "SELECT qty FROM maininventory WHERE serial_number = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, serialNumber);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("qty");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }
}


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

public class AuctionsItems extends javax.swing.JFrame {

    public AuctionsItems() {
        initComponents();
        ShowRepairTable();
        ShowAuctionsTable();
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
    
    public void ShowAuctionsTable(){
        try {
            DefaultTableModel dt = (DefaultTableModel) tblAuctions.getModel();
            dt.setRowCount(0);

            Connection connection = Database_Connection.getInstance().getConnection();

            String query = "SELECT * FROM auctionsitems";
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
                v.add(resultSet.getBoolean(8));
                v.add(resultSet.getInt(9));
                v.add(resultSet.getInt(10));
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
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRepair = new javax.swing.JTable();
        btnAddAuctions = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAuctions = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 100, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1380, 772));

        jPanel2.setBackground(new java.awt.Color(1, 50, 32));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Auctions Items");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 678, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAddAuctions.setBackground(new java.awt.Color(1, 50, 32));
        btnAddAuctions.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        btnAddAuctions.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAuctions.setText("Add Auctions");
        btnAddAuctions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAuctionsActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Auctions Items", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        tblAuctions.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        tblAuctions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Auction Number", "Item Number", "Item Name", "Brand", "Serial Number", "Quantity", "Auction Date", "Approval", "Auction Minimum Price", "Total Auction Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAuctions.setRowHeight(30);
        jScrollPane3.setViewportView(tblAuctions);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddAuctions, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddAuctions, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                String query = "SELECT * FROM repairitems WHERE serial_number LIKE ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                // Set the parameter for category search using wildcard %
                preparedStatement.setString(1, "%" + searchCategory + "%");

                // Execute the SQL query
                ResultSet resultSet = preparedStatement.executeQuery();

                // Clear existing table data
                DefaultTableModel model = (DefaultTableModel) tblRepair.getModel();
                model.setRowCount(0);

                // Populate the table with search results
                while (resultSet.next()) {
                    Object[] row = {
                        resultSet.getString("repair_number"),
                        resultSet.getString("item_number"),
                        resultSet.getString("item_name"),
                        resultSet.getString("brand"),
                        resultSet.getString("serial_number"),
                        resultSet.getString("quantity"),
                        resultSet.getString("reason"),
                        resultSet.getString("repair_date"),
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
            ShowRepairTable();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // Show Table data
        ShowRepairTable() ;

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

    private void btnAddAuctionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAuctionsActionPerformed

        // Get the selected row from the repair items table
        int selectedRow = tblRepair.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row from the repair items table.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Extract data from the selected row
        String repairNumber = tblRepair.getValueAt(selectedRow, 0).toString();
        String itemNumber = tblRepair.getValueAt(selectedRow, 1).toString();
        String itemName = tblRepair.getValueAt(selectedRow, 2).toString();
        String brand = tblRepair.getValueAt(selectedRow, 3).toString();
        String serialNumber = tblRepair.getValueAt(selectedRow, 4).toString();
        String qtyStr = tblRepair.getValueAt(selectedRow, 5).toString();
        int qty = Integer.parseInt(qtyStr);
        String reason = tblRepair.getValueAt(selectedRow, 6).toString();
        String repairDate = tblRepair.getValueAt(selectedRow, 7).toString();

        // Get quantity for auction from user input
        String auctionQtyStr = JOptionPane.showInputDialog(null, "Enter quantity for auction:", "Quantity for Auction", JOptionPane.QUESTION_MESSAGE);
        if (auctionQtyStr == null || auctionQtyStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide a quantity for auction.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int auctionQty;
        try {
            auctionQty = Integer.parseInt(auctionQtyStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (auctionQty > qty) {
            JOptionPane.showMessageDialog(null, "Auction quantity cannot be greater than the available quantity.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get date for auction from user input
        String auctionDateStr = JOptionPane.showInputDialog(null, "Enter auction date (yyyy-MM-dd):", "Auction Date", JOptionPane.QUESTION_MESSAGE);
        if (auctionDateStr == null || auctionDateStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide an auction date.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date auctionDate;
        try {
            auctionDate = dateFormat.parse(auctionDateStr);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Invalid date format. Please enter the date in yyyy-MM-dd format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convert auction date to string in yyyy-MM-dd format
        String auctionDateString = dateFormat.format(auctionDate);

        // Get HOD approval for auction
        int hodApproval = JOptionPane.showConfirmDialog(null, "Is the auction approved by the HOD?", "HOD Approval", JOptionPane.YES_NO_OPTION);
        boolean isApproved = hodApproval == JOptionPane.YES_OPTION;

        // Check if HOD approval is granted
        if (!isApproved) {
            JOptionPane.showMessageDialog(null, "HOD's approval is required for the auction.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get minimum auction price per unit from user input
        String minAuctionPricePerUnitStr = JOptionPane.showInputDialog(null, "Enter minimum auction price per unit:", "Minimum Auction Price per Unit", JOptionPane.QUESTION_MESSAGE);
        if (minAuctionPricePerUnitStr == null || minAuctionPricePerUnitStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide a minimum auction price per unit.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double minAuctionPricePerUnit;
        try {
            minAuctionPricePerUnit = Double.parseDouble(minAuctionPricePerUnitStr);
            if (minAuctionPricePerUnit <= 0) {
                JOptionPane.showMessageDialog(null, "Minimum auction price per unit must be a positive value.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid minimum auction price per unit. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Calculate total minimum auction price
        double totalMinAuctionPrice = minAuctionPricePerUnit * auctionQty;

        try {
            Connection connection = Database_Connection.getInstance().getConnection();
            connection.setAutoCommit(false);

            // Insert data into the auction locations table
            String insertAuctionQuery = "INSERT INTO auctionsitems (item_number, item_name, brand, serial_number, qty, auction_date, hod_approval, auction_minimum_price, total_min_auction_price) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertAuctionStatement = connection.prepareStatement(insertAuctionQuery);
            insertAuctionStatement.setString(1, itemNumber);
            insertAuctionStatement.setString(2, itemName);
            insertAuctionStatement.setString(3, brand);
            insertAuctionStatement.setString(4, serialNumber);
            insertAuctionStatement.setInt(5, auctionQty);
            insertAuctionStatement.setString(6, auctionDateString);
            insertAuctionStatement.setBoolean(7, isApproved);
            insertAuctionStatement.setDouble(8, minAuctionPricePerUnit);
            insertAuctionStatement.setDouble(9, totalMinAuctionPrice);
            insertAuctionStatement.executeUpdate();

            // Update quantity in repair items table
            String updateRepairQtyQuery = "UPDATE repairitems SET quantity = quantity - ? WHERE serial_number = ?";
            PreparedStatement updateRepairQtyStatement = connection.prepareStatement(updateRepairQtyQuery);
            updateRepairQtyStatement.setInt(1, auctionQty);
            updateRepairQtyStatement.setString(2, serialNumber);
            updateRepairQtyStatement.executeUpdate();

            connection.commit();
            JOptionPane.showMessageDialog(null, "Item transferred to auction table successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Refresh repair items table
            ShowAuctionsTable();

            insertAuctionStatement.close();
            updateRepairQtyStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddAuctionsActionPerformed

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
            java.util.logging.Logger.getLogger(AuctionsItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuctionsItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuctionsItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuctionsItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuctionsItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAuctions;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAuctions;
    private javax.swing.JTable tblRepair;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

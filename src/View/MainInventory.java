package View;

import DB_Connection.Database_Connection;
import Model.User;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainInventory extends javax.swing.JFrame {

    public MainInventory() {
        initComponents();
        showTableDate();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtReceivedBy = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        lblQty = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMainInventory = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblShow = new javax.swing.JLabel();
        lblBarCode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 100, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 762));

        jPanel2.setBackground(new java.awt.Color(1, 50, 32));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Main Inventory");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 770, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel4.setText("Item Name :");

        txtItemName.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel3.setText("Category :");

        cmbCategory.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer parts", "Electronic Parts", "Networking equipment", "Furniture" }));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel5.setText("Brand :");

        txtBrand.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel6.setText("Serial Number :");

        txtSerialNumber.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel7.setText("Quantity :");

        txtQty.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtyKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel9.setText("Received Date :");

        DateChooser.setBackground(new java.awt.Color(255, 255, 255));
        DateChooser.setToolTipText("");
        DateChooser.setDateFormatString("yyyy-MM-dd");

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel8.setText("Received By :");

        txtReceivedBy.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel11.setText("Location :");

        cmbLocation.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAB - 01", "LAB - 02", "LAB - 03", "LAB - 04" }));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel10.setText("Note :");

        jScrollPane1.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane1.setViewportView(txtNote);

        lblQty.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lblQty.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtQty)
                        .addComponent(txtSerialNumber)
                        .addComponent(txtBrand)
                        .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtItemName)
                        .addComponent(jScrollPane1)
                        .addComponent(cmbLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtReceivedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtReceivedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        tblMainInventory.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        tblMainInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
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
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMainInventory.setRowHeight(30);
        tblMainInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMainInventoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMainInventory);

        btnClear.setBackground(new java.awt.Color(1, 50, 32));
        btnClear.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(1, 50, 32));
        btnAdd.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(1, 50, 32));
        btnUpdate.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(1, 50, 32));
        btnRemove.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(1, 50, 32));
        btnBack.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BackIcon.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblShow.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QR Code", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        lblBarCode.setBackground(new java.awt.Color(255, 255, 255));
        lblBarCode.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bar Code", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblBarCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
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

        // Refresh Table Date
        showTableDate();

        // Clear all input fields
        txtItemName.setText("");
        cmbCategory.setSelectedIndex(0); // Assuming index 0 is for the default selection
        txtBrand.setText("");
        txtSerialNumber.setText("");
        txtQty.setText("");
        DateChooser.setDate(null);
        txtReceivedBy.setText("");
        cmbLocation.setSelectedIndex(0); // Assuming index 0 is for the default selection
        txtNote.setText("");

        // Show Add Button
        btnAdd.setEnabled(true);

        //Search Box clear
        txtSearch.setText("Search");
        
        //QR Box Clear
        lblShow.setIcon(null);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            txtQty.setEditable(false);
            lblQty.setText("Please Enter Number Only");
        } else {
            txtQty.setEditable(true);
        }
    }//GEN-LAST:event_txtQtyKeyPressed

    private void tblMainInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMainInventoryMouseClicked

        DefaultTableModel d1 = (DefaultTableModel) tblMainInventory.getModel();
        int SelectIndex = tblMainInventory.getSelectedRow();

        txtItemName.setText(d1.getValueAt(SelectIndex, 1).toString());
        cmbCategory.setSelectedItem(d1.getValueAt(SelectIndex, 2).toString());
        txtBrand.setText(d1.getValueAt(SelectIndex, 3).toString());
        txtSerialNumber.setText(d1.getValueAt(SelectIndex, 4).toString());
        txtQty.setText(d1.getValueAt(SelectIndex, 5).toString());
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(d1.getValueAt(SelectIndex, 6).toString());
            DateChooser.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(DonatedInventory.class.getName()).log(Level.SEVERE, null, ex);

        }
        txtReceivedBy.setText(d1.getValueAt(SelectIndex, 7).toString());
        cmbLocation.setSelectedItem(d1.getValueAt(SelectIndex, 8).toString());
        txtNote.setText(d1.getValueAt(SelectIndex, 9).toString());

        btnAdd.setEnabled(false);
    }//GEN-LAST:event_tblMainInventoryMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        // Clear all input fields
        txtItemName.setText("");
        cmbCategory.setSelectedIndex(0); // Assuming index 0 is for the default selection
        txtBrand.setText("");
        txtSerialNumber.setText("");
        txtQty.setText("");
        DateChooser.setDate(null);
        txtReceivedBy.setText("");
        cmbLocation.setSelectedIndex(0); // Assuming index 0 is for the default selection
        txtNote.setText("");

        // Clear QR Field
        lblShow.setIcon(null);

        // Show Add Button
        btnAdd.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Get the values
        String itemName = txtItemName.getText();
        String category = cmbCategory.getSelectedItem().toString();
        String brand = txtBrand.getText();
        String serialNumber = txtSerialNumber.getText();
        String qty = txtQty.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date selectedDate = DateChooser.getDate();
        String date = selectedDate != null ? sdf.format(selectedDate) : null;
        String receivedBy = txtReceivedBy.getText();
        String location = cmbLocation.getSelectedItem().toString();
        String note = txtNote.getText();
       
        //Check text fields for empty values
        if (itemName.isEmpty() || category.isEmpty() || brand.isEmpty() || qty.isEmpty() || (date == null || date.isEmpty()) || receivedBy.isEmpty() || location.isEmpty() || note.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields with valid data.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection connection = Database_Connection.getInstance().getConnection();

                // Query to check if an item with the same item number or serial number already exists
                String checkQuery = "SELECT COUNT(*) FROM maininventory WHERE serial_number = ?";
                PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
                checkStatement.setString(1, serialNumber);
                ResultSet resultSet = checkStatement.executeQuery();
                resultSet.next();
                int count = resultSet.getInt(1);

                // If count is greater than 0, it means an item with the same item number or serial number already exists
                if (count > 0) {
                    JOptionPane.showMessageDialog(null, "Same serial number already exists.", "Error", JOptionPane.ERROR_MESSAGE);

                    // Clear all input fields
                    txtItemName.setText("");
                    cmbCategory.setSelectedIndex(0); // Assuming index 0 is for the default selection
                    txtBrand.setText("");
                    txtSerialNumber.setText("");
                    txtQty.setText("");
                    DateChooser.setDate(null);
                    txtReceivedBy.setText("");
                    cmbLocation.setSelectedIndex(0); // Assuming index 0 is for the default selection
                    txtNote.setText("");

                } else {
                    // Query to insert a new product
                    String query = "INSERT INTO maininventory (item_name, category, brand, serial_number, qty, receved_date, receved_by, location, note) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);

                    // Set the parameters
                    
                    preparedStatement.setString(1, itemName);
                    preparedStatement.setString(2, category);
                    preparedStatement.setString(3, brand);
                    preparedStatement.setString(4, serialNumber);
                    preparedStatement.setString(5, qty);
                    preparedStatement.setString(6, date);
                    preparedStatement.setString(7, receivedBy);
                    preparedStatement.setString(8, location);
                    preparedStatement.setString(9, note);

                    // Execute the SQL query
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Item added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    showTableDate();
                    
                    // Generate and save QR code
                    generateAndDisplayQRCode(itemName, category, brand, serialNumber, location);

                    // Generate and display barcode
                    generateAndDisplayBarCode(serialNumber);

                    // Clear all input fields
                    txtItemName.setText("");
                    cmbCategory.setSelectedIndex(0); // Assuming index 0 is for the default selection
                    txtBrand.setText("");
                    txtSerialNumber.setText("");
                    txtQty.setText("");
                    DateChooser.setDate(null);
                    txtReceivedBy.setText("");
                    cmbLocation.setSelectedIndex(0); // Assuming index 0 is for the default selection
                    txtNote.setText("");

                    preparedStatement.close();
                }
                resultSet.close();
                checkStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //Get the values
        String itemName = txtItemName.getText();
        String category = cmbCategory.getSelectedItem().toString();
        String brand = txtBrand.getText();
        String serialNumber = txtSerialNumber.getText();
        String qty = txtQty.getText();
        String date = null; // Default date value
        if (DateChooser.getDate() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            date = sdf.format(DateChooser.getDate());
        }
        String receivedBy = txtReceivedBy.getText();
        String location = cmbLocation.getSelectedItem().toString();
        String note = txtNote.getText();

        // Check if there is data to update
        if (itemName.isEmpty() || brand.isEmpty() || serialNumber.isEmpty() || qty.isEmpty() || date == null || receivedBy.isEmpty() || location.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection connection = Database_Connection.getInstance().getConnection();

            // Query to update a new product
            String query = "UPDATE  maininventory SET item_name = ?, category = ?, brand = ?, qty = ?, receved_date = ?, receved_by = ?, location = ?, note = ? WHERE serial_number = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Set the parameters
            preparedStatement.setString(1, itemName);
            preparedStatement.setString(2, category);
            preparedStatement.setString(3, brand);
            preparedStatement.setString(4, qty);
            preparedStatement.setString(5, date);
            preparedStatement.setString(6, receivedBy);
            preparedStatement.setString(7, location);
            preparedStatement.setString(8, note);
            preparedStatement.setString(9, serialNumber);

            // Execute the SQL query
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Item updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update item.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            showTableDate();
            
            // Generate and save QR code
            generateAndDisplayQRCode(itemName, category, brand, serialNumber, location);
            
            // Generate and display barcode
            generateAndDisplayBarCode(serialNumber);

            // Clear all input fields
            txtItemName.setText("");
            cmbCategory.setSelectedIndex(0); // Assuming index 0 is for the default selection
            txtBrand.setText("");
            txtSerialNumber.setText("");
            txtQty.setText("");
            DateChooser.setDate(null);
            txtReceivedBy.setText("");
            cmbLocation.setSelectedIndex(0); // Assuming index 0 is for the default selection
            txtNote.setText("");

            // Show Add Button
            btnAdd.setEnabled(true);

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

       // Check if a table row is selected
        if (tblMainInventory.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Please select an item to remove.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if no row is selected
        }

        //Get the values
        String serialNumber = txtSerialNumber.getText();

        try {
            Connection connection = Database_Connection.getInstance().getConnection();

            // Query to remove a new product
            String query = "DELETE FROM  maininventory WHERE serial_number = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Set the parameters
            preparedStatement.setString(1, serialNumber);

            // Execute the SQL query
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Item removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            showTableDate();

            // Clear all input fields
            txtItemName.setText("");
            cmbCategory.setSelectedIndex(0); // Assuming index 0 is for the default selection
            txtBrand.setText("");
            txtSerialNumber.setText("");
            txtQty.setText("");
            DateChooser.setDate(null);
            txtReceivedBy.setText("");
            cmbLocation.setSelectedIndex(0); // Assuming index 0 is for the default selection
            txtNote.setText("");
            // Clear QR Field
            lblShow.setIcon(null);

            // Show Add Button
            btnAdd.setEnabled(true);
            
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(MainInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBarCode;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblShow;
    private javax.swing.JTable tblMainInventory;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtReceivedBy;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

    private void generateAndDisplayQRCode(String itemName, String category, String brand, String serialNumber, String location) {
        String qrCodeData = "Item Name: " + itemName + "\n\nCategory: " + category + "\n\nBrand: " + brand + "\n\nSerial Number: " + serialNumber + "\n\nLocation: " + location;
        String charset = "UTF-8"; // Character encoding
        Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<>();
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

        try {
            BitMatrix matrix = new QRCodeWriter().encode(new String(qrCodeData.getBytes(charset), charset),BarcodeFormat.QR_CODE, 200, 200, hintMap);
            Path path = FileSystems.getDefault().getPath("D:\\SLIATE (HND-IT)\\Semester - iv\\Project (4052)\\Lab_Inventory_Management_System\\qrcode\\Main_Inventory\\qr_code.png");
            MatrixToImageWriter.writeToPath(matrix, "PNG", path);
            JOptionPane.showMessageDialog(null, "QR Code generated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Display QR code in lblShow
            ImageIcon icon = new ImageIcon(path.toString());
            lblShow.setIcon(icon);
        } catch (WriterException | IOException ex) {
            System.err.println("Error generating QR Code: " + ex.getMessage());
        }
    }
    
    private void generateAndDisplayBarCode(String text) {
        int width = 450;
        int height = 60;
        String filePath = "D:\\SLIATE (HND-IT)\\Semester - iv\\Project (4052)\\Lab_Inventory_Management_System\\barcode\\Main_Inventory\\bar_code.png";

        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.CODE_128, width, height);
            BufferedImage barcodeImage = MatrixToImageWriter.toBufferedImage(bitMatrix);

            // Save the barcode as an image file
            File outputFile = new File(filePath);
            ImageIO.write(barcodeImage, "png", outputFile);
            JOptionPane.showMessageDialog(null, "Bar Code generated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Display the barcode in the JLabel
            ImageIcon barcodeIcon = new ImageIcon(barcodeImage);
            lblBarCode.setIcon(barcodeIcon);

        } catch (WriterException | IOException e) {
            e.printStackTrace();
        }
    }
}

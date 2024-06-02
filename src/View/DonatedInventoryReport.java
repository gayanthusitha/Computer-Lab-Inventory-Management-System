package View;

import DB_Connection.Database_Connection;
import javax.swing.table.DefaultTableModel;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DonatedInventoryReport extends javax.swing.JPanel {

    public DonatedInventoryReport() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonatedItems = new javax.swing.JTable();
        btnDonatedItems = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblDonatedItems.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        tblDonatedItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tblDonatedItems.setRowHeight(30);
        tblDonatedItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDonatedItemsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDonatedItems);

        btnDonatedItems.setBackground(new java.awt.Color(204, 204, 204));
        btnDonatedItems.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        btnDonatedItems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DonateItemIcon.png"))); // NOI18N
        btnDonatedItems.setText("View Donated Items");
        btnDonatedItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonatedItemsActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(204, 204, 204));
        btnPrint.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/PrintIcon.png"))); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDonatedItems)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDonatedItems, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDonatedItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonatedItemsMouseClicked

    }//GEN-LAST:event_tblDonatedItemsMouseClicked

    private void btnDonatedItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonatedItemsActionPerformed
        try {
            DefaultTableModel dt = (DefaultTableModel) tblDonatedItems.getModel();
            dt.setRowCount(0);

            Connection connection = Database_Connection.getInstance().getConnection();

            String query = "SELECT * FROM donateditems";
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
    }//GEN-LAST:event_btnDonatedItemsActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(null);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();
        }

        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "DonatedItemsReport.pdf"));
            doc.open();

            // Title
            Font titleFont = new Font(Font.STRIKETHRU, 18, Font.BOLD, Color.BLACK);
            Font midfont = new Font(Font.STRIKETHRU, 10, Font.NORMAL, Color.BLACK);
            Paragraph title = new Paragraph("Donated Items Report", titleFont);
            Paragraph title2 = new Paragraph("*______________________________*");
            Paragraph title3 = new Paragraph("SLIATE - KANDY" , midfont);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String foramttedDate = sdf.format(new Date());
            Paragraph title4 = new Paragraph("Date : " + foramttedDate, midfont);
            Paragraph title5 = new Paragraph("************");
            
            title.setAlignment(Element.ALIGN_CENTER);
            title2.setAlignment(Element.ALIGN_CENTER);
            title3.setAlignment(Element.ALIGN_CENTER);
            title4.setAlignment(Element.ALIGN_CENTER);
            title5.setAlignment(Element.ALIGN_CENTER);
            doc.add(title);
            doc.add(title2);
            doc.add(title3);
            doc.add(title4);
            doc.add(title5);

            // Table
            PdfPTable tbl = new PdfPTable(10);
            tbl.setWidthPercentage(100);
            tbl.setSpacingBefore(10f);
            tbl.setSpacingAfter(10f);

            // Header cells
            Font headerFont = new Font(Font.HELVETICA, 8, Font.BOLD, Color.WHITE);
            PdfPCell cell = new PdfPCell();
            cell.setBackgroundColor(Color.BLACK);
            cell.setPadding(5); // Increased cell padding
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);

            cell.setPhrase(new Paragraph("Item Number", headerFont));
            tbl.addCell(cell);

            cell.setPhrase(new Paragraph("Item Name", headerFont));
            tbl.addCell(cell);

            cell.setPhrase(new Paragraph("Category", headerFont));
            tbl.addCell(cell);

            cell.setPhrase(new Paragraph("Brand", headerFont));
            tbl.addCell(cell);

            cell.setPhrase(new Paragraph("Serial Number", headerFont));
            tbl.addCell(cell);

            cell.setPhrase(new Paragraph("Quantity", headerFont));
            tbl.addCell(cell);
            
            cell.setPhrase(new Paragraph("Received Date", headerFont));
            tbl.addCell(cell);
            
            cell.setPhrase(new Paragraph("Received By", headerFont));
            tbl.addCell(cell);
            
            cell.setPhrase(new Paragraph("Location", headerFont));
            tbl.addCell(cell);
            
            cell.setPhrase(new Paragraph("Note", headerFont));
            tbl.addCell(cell);

            // Data cells
            Font dataFont = new Font(Font.HELVETICA, 8); // Font for data cells
            for (int i = 0; i < tblDonatedItems.getRowCount(); i++) {
                for (int e = 0; e < tblDonatedItems.getColumnCount(); e++) {
                    PdfPCell dataCell = new PdfPCell(new Paragraph(tblDonatedItems.getValueAt(i, e).toString(), dataFont));
                    dataCell.setPadding(5); // Increased padding for data cells
                    tbl.addCell(dataCell);
                }
            }

            doc.add(tbl);
            JOptionPane.showMessageDialog(null, "Report successfully generated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        } finally {
            doc.close();
        }
    }//GEN-LAST:event_btnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonatedItems;
    private javax.swing.JButton btnPrint;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDonatedItems;
    // End of variables declaration//GEN-END:variables
}

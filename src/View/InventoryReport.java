package View;

import DB_Connection.Database_Connection;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InventoryReport extends javax.swing.JPanel {

    public InventoryReport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblMainInventory = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        btnViewInventory = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblMainInventory.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        tblMainInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Number", "Item Name", "Category", "Brand", "Serial Number", "Quantity", "Received Date", "Received By", "Location", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMainInventory.setRowHeight(30);
        jScrollPane2.setViewportView(tblMainInventory);

        btnPrint.setBackground(new java.awt.Color(204, 204, 204));
        btnPrint.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/PrintIcon.png"))); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnViewInventory.setBackground(new java.awt.Color(204, 204, 204));
        btnViewInventory.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        btnViewInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/InventoryIcon.png"))); // NOI18N
        btnViewInventory.setText("View Inventory ");
        btnViewInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInventoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewInventory)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

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
            PdfWriter.getInstance(doc, new FileOutputStream(path + "MainInventoryReport.pdf"));
            doc.open();

            // Title
            Font titleFont = new Font(Font.STRIKETHRU, 18, Font.BOLD, Color.BLACK);
            Font midfont = new Font(Font.STRIKETHRU, 10, Font.NORMAL, Color.BLACK);
            Paragraph title = new Paragraph("Main Inventory Report", titleFont);
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
            for (int i = 0; i < tblMainInventory.getRowCount(); i++) {
                for (int e = 0; e < tblMainInventory.getColumnCount(); e++) {
                    PdfPCell dataCell = new PdfPCell(new Paragraph(tblMainInventory.getValueAt(i, e).toString(), dataFont));
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

    private void btnViewInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInventoryActionPerformed
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
    }//GEN-LAST:event_btnViewInventoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnViewInventory;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMainInventory;
    // End of variables declaration//GEN-END:variables
}

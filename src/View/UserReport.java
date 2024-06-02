package View;

import DB_Connection.Database_Connection;
import Model.User;
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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserReport extends javax.swing.JPanel {

    public UserReport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btnViewUser = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblUser.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "User Name", "User Password", "User Mobile", "User Email", "User Type"
            }
        ));
        tblUser.setRowHeight(30);
        jScrollPane2.setViewportView(tblUser);

        btnViewUser.setBackground(new java.awt.Color(204, 204, 204));
        btnViewUser.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        btnViewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ViewUserBtnIcon.png"))); // NOI18N
        btnViewUser.setText("View User");
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
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
                        .addComponent(btnViewUser)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        try{
            Connection connection = Database_Connection.getInstance().getConnection();
            
            String query = "SELECT * FROM user";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                String userId = String.valueOf(resultSet.getInt("user_id"));
                String username = resultSet.getString("user_name");
                String userpassword = resultSet.getString("user_password");
                String usermobile = String.valueOf(resultSet.getInt("user_mobile"));
                String useremail = resultSet.getString("user_email");
                String usertype = resultSet.getString("user_type");
                
                //String array for store data into Jtable
                String tbData[] = {userId, username, userpassword, usermobile, useremail, usertype};
                DefaultTableModel tblModel = (DefaultTableModel)tblUser.getModel();
                
                //Add String array data into Jtable
                tblModel.addRow(tbData);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnViewUserActionPerformed

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
            PdfWriter.getInstance(doc, new FileOutputStream(path + "UserReport.pdf"));
            doc.open();

            // Title
            Font titleFont = new Font(Font.STRIKETHRU, 18, Font.BOLD, Color.BLACK);
            Font midfont = new Font(Font.STRIKETHRU, 10, Font.NORMAL, Color.BLACK);
            Paragraph title = new Paragraph("User Report", titleFont);
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
            PdfPTable tbl = new PdfPTable(6);
            tbl.setWidthPercentage(100);
            tbl.setSpacingBefore(10f);
            tbl.setSpacingAfter(10f);

            // Header cells
            Font headerFont = new Font(Font.HELVETICA, 8, Font.BOLD, Color.WHITE);
            PdfPCell cell = new PdfPCell();
            cell.setBackgroundColor(Color.BLACK);
            cell.setPadding(20); // Increased cell padding
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);

            cell.setPhrase(new Paragraph("User ID", headerFont));
            tbl.addCell(cell);

            cell.setPhrase(new Paragraph("User Name", headerFont));
            tbl.addCell(cell);

            cell.setPhrase(new Paragraph("User Password", headerFont));
            tbl.addCell(cell);

            cell.setPhrase(new Paragraph("User Mobile", headerFont));
            tbl.addCell(cell);

            cell.setPhrase(new Paragraph("User Email", headerFont));
            tbl.addCell(cell);

            cell.setPhrase(new Paragraph("User Type", headerFont));
            tbl.addCell(cell);

            // Data cells
            Font dataFont = new Font(Font.HELVETICA, 8); // Font for data cells
            for (int i = 0; i < tblUser.getRowCount(); i++) {
                for (int e = 0; e < tblUser.getColumnCount(); e++) {
                    PdfPCell dataCell = new PdfPCell(new Paragraph(tblUser.getValueAt(i, e).toString(), dataFont));
                    dataCell.setPadding(8); // Increased padding for data cells
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
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblUser;
    // End of variables declaration//GEN-END:variables
}

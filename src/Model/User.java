package Model;

import DB_Connection.Database_Connection;
import View.AdminDash;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import View.SuperAdminDash;

public class User {
    
    private int userid;
    private String name, password;
    private int mobile;
    private String email;
    private String usertype;
    private static String loggedInRole;
    
    public User(int userid, String name, String password, int mobile, String email, String usertype){
        this.userid = userid;
        this.name = name;
        this.password = password;
        this.mobile = mobile;
        this.email= email;
        this.usertype = usertype;
    }
    public int getUserId(){
        return userid;
    }
    public String getUserName(){
        return name;
    }
    public String getUserPassword(){
        return password;
    }
    public int getUerMobile(){
        return mobile;
    }
    public String getUserEmail(){
        return email;
    }
    public String getUserType(){
        return usertype;
    }
    public static String getRole(){
        return loggedInRole;
    }

    // Authenticate username and password
    public static User authenticateUser(String username, String password) {
        User authenticatedUser = null;
        loggedInRole = null;
        try {
            Connection connection = Database_Connection.getInstance().getConnection();

            String query = "SELECT * FROM user WHERE user_name = ? AND user_password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String role = resultSet.getString("user_type");

                if (role.equals("SuperAdmin")) {
                    SuperAdminDash SADB = new SuperAdminDash();
                    loggedInRole = "superadmin";
                    SADB.setVisible(true);
                    
                } else if (role.equals("Admin")) {
                    AdminDash ADB = new AdminDash();
                    loggedInRole = "admin";
                    ADB.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "User not found");
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authenticatedUser;
    }
}

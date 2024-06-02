package Controler;

import DB_Connection.Database_Connection;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ManageUserControler {
    
    // View User Details
    public List<User> viewUserDetails() {
        List<User> users = new ArrayList<>();
        try {
            Connection connection = Database_Connection.getInstance().getConnection();

            // SQL query to select all users
            String query = "SELECT * FROM user";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                String userName = resultSet.getString("user_name");
                String userPassword = resultSet.getString("user_password");
                int userMobile = resultSet.getInt("user_mobile");
                String userEmail = resultSet.getString("user_email");
                String userType = resultSet.getString("user_type");

                // Create a User object and add it to the list
                User user = new User(userId, userName, userPassword, userMobile, userEmail, userType){
                    
                };
                users.add(user);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
    
    // Add a new user to the database
    public boolean addUser(String userid, String username, String password, String usermobile, String useremail, String usertype){
        try{
            Connection connection = Database_Connection.getInstance().getConnection();
       
            // Query to insert a new product
            String query = "INSERT INTO user (user_id, user_name, user_password, user_mobile, user_email, user_type) VALUES ( ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            // Set the parameters
            preparedStatement.setString(1, userid);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, usermobile);
            preparedStatement.setString(5, useremail);
            preparedStatement.setString(6, usertype);

            
            // Execute the SQL query
            int rowsAffected = preparedStatement.executeUpdate();
            
            preparedStatement.close();
            return rowsAffected > 0;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    // Remove User from Database  
    public boolean removeUserFromDatabase(int userId){
        //Variables for connection
        Connection connection = null;
        PreparedStatement removeProductStatement = null;
        PreparedStatement removeSalesStatement = null;
        
        try {
            //Get Database Connction
            connection = Database_Connection.getInstance().getConnection();
            // Disable auto-commit to ensure transaction consistency
            connection.setAutoCommit(false);
            // Prepare a SQL statement to delete the product
            String removeProductSQL = "DELETE FROM user WHERE user_id = ?";
            removeProductStatement = connection.prepareStatement(removeProductSQL);
            removeProductStatement.setInt(1, userId);
            // Delete the product
            removeProductStatement.executeUpdate();
            // Commit the transaction
            connection.commit();
            return true; // Deletion was successful
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    // Update User Details
    public boolean updateCurrentUser(int userId, String userName, String userPassword, int userMobile, String userEmail, String userType) {
        try {
            Connection connection = Database_Connection.getInstance().getConnection();

            // SQL statement to update the user information
            String updateQuery = "UPDATE user SET user_name = ?, user_password = ?, user_mobile = ?, user_email = ?, user_type = ? WHERE user_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            // Set the parameters
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, userPassword);
            preparedStatement.setInt(3, userMobile);
            preparedStatement.setString(4, userEmail);
            preparedStatement.setString(5, userType);
            preparedStatement.setInt(6, userId);

            int rowsAffected = preparedStatement.executeUpdate();

            preparedStatement.close();

            // Check if the user was updated successfully and return a boolean value
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Search User Data
    public List<User> searchUser(String key) {
        List<User> searchResults = new ArrayList<>();
        
        try {
            Connection connection = Database_Connection.getInstance().getConnection();

            // SQL query to search
            String query = "SELECT user_id, user_name, user_password, user_mobile, user_email ,user_type FROM user "
                    + "WHERE user_id LIKE ? OR user_name LIKE ? OR user_password LIKE ? OR user_mobile LIKE ? OR user_email LIKE ? OR user_type LIKE ? ";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + key + "%");
            preparedStatement.setString(2, "%" + key + "%");
            preparedStatement.setString(3, "%" + key + "%");
            preparedStatement.setString(4, "%" + key + "%");
            preparedStatement.setString(5, "%" + key + "%");
            preparedStatement.setString(6, "%" + key + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int userId = resultSet.getInt("user_id");
                String userName = resultSet.getString("user_name");
                String userPassword = resultSet.getString("user_password");
                int userMobile = resultSet.getInt("user_mobile");
                String userEmail = resultSet.getString("user_email");
                String userType = resultSet.getString("user_type");

                // Create a user object and add it to the search results
                User user = new User(userId, userName, userPassword, userMobile, userEmail, userType) {
                };
                searchResults.add(user);
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return searchResults;
    }
    
}

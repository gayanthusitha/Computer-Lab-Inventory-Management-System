package DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database_Connection {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/l_i_m_system";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";
    
    private Connection connection;
    private static Database_Connection instance;
    
    public Database_Connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Database Connected...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Database_Connection getInstance(){
        if (instance == null){
            instance = new Database_Connection();
        }
        return instance;
    }
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
}

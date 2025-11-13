package studentproject.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionImpl implements IConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root"; 
    private static final String PASSWORD = "kunal123"; 

    @Override
    public Connection getConnection() {
        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

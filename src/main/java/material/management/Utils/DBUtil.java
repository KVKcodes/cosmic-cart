package material.management.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DBUtil {
	 
	public static Connection connectDB()
	{
	    try
	    {
	         
	        // Step 2: involve among 7 in Connection
	        // class i.e Load and register drivers
	 
	        // 2(a) Loading drivers using forName() method
	        // Here, the name of the database is mysql
	        Class.forName("com.mysql.jdbc.Driver");
	 
	        // 2(b) Registering drivers using DriverManager
	        Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/klu",
	            "root", "Amma@143$");
	             
	        // Root is the username, and
	        // 1234 is the password
	 
	        // Here, the object of Connection class is return
	        // which further used in main class 
	        return con;
	    }
	 
	    // Here, the exceptions is handle by Catch block
	    catch (SQLException | ClassNotFoundException e)
	    {
	         
	        // Print the exceptions
	        System.out.println(e);
	 
	        return null;
	    }
	}
	}
    


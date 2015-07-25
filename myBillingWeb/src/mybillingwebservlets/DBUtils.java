package mybillingwebservlets;

//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;

public class DBUtils {

	static Connection con;
	// Static block to load the driver just once
	static {
		try {
			// Step 1: Load the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out
					.println("Unable to load the Driver. Please check your Classpath");
		}
	}

	public static Connection getConnection() {
		// Step 2: Get the connection by passing the URL
		try {
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			Connection con = DriverManager.getConnection(url,"system","apoo123");
			return con;
			
		} catch (Exception e) {
			System.out.println("Unable to get connection");
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConnection(Connection con) {
		try {
			// Step 7: Close the connection.
			con.close();
			
		} catch (Exception e) {
			System.out.println("Failed to close the connection");
		}
	}
}
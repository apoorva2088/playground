package mybillingwebservlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.StringTokenizer;

import javax.servlet.*;
import javax.servlet.http.*;

import mybillingwebservlets.DBUtils;



public class RegistrationServlet extends HttpServlet {
	//private static final String String = null;

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// Read the data
		String firstName = req.getParameter("firstName");
		String middleName = req.getParameter("middleName");
		String lastName = req.getParameter("lastName");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		String userid = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(firstName);
		insertToDatabase(firstName, middleName, lastName,city, state, country, userid,password);

		// Forward to Shopping page
		req.getRequestDispatcher("/htmls/login.html").forward(req, res);
	}

	private void insertToDatabase(String firstName,String middleName,String lastName,
			String city, String state, String country, String userid,
			String password) {
		
		// Write JDBC logic to insert data to REGCUSTOMERS table
		String sql = "INSERT INTO CUSTOMERS (FIRSTNAME,LASTNAME,CITY,STATE,COUNTRY) VALUES(" + "'" + firstName + "'," + "'" + 
		lastName + "'," + "'" + city + "',"+ "'" + state + "'," +"'" + country + "')";      
		// Pass the sql to JDBC method    
		System.out.println(sql);
		String sql1 = "INSERT INTO REGCUSTOMER VALUES ('"+ userid +"','"+password+"')";
		
	Connection con = DBUtils.getConnection();   
	if (con != null) {     
	// Create statement from connection      
	Statement stmt = null;
	try {
		stmt = con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}     
	// Execute the statement by passing the sql  
	//System.out.println(sql);
	//System.out.println(sql1);
	int result = -1;
	try {
		result = stmt.executeUpdate(sql);
		result = stmt.executeUpdate(sql1);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}    
	if (result != -1) {         
	System.out.println("Inserted" + result + "Record(s) successfully");    
	} else {       
	System.out.println("Unable to insert record. Please check your SQL syntax");   
	}        // Close the statements and Connections    
	
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	DBUtils.closeConnection(con);        
	} else {     
	System.out.println("Unable to get the connection");  
	}
	
}    }       
		   
		
	
	
	


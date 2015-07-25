package mybillingwebservlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// Read the parameters
		String userid = req.getParameter("userid");
		String password = req.getParameter("password");
		if (isAuthenticated(userid, password)) {
			// Go to the shopping page
			RequestDispatcher rd = req.getRequestDispatcher("/htmls/shop.html");
			rd.forward(req, res);
		} else {

			// Go back the login page
			RequestDispatcher rd = req
					.getRequestDispatcher("/htmls/login.html");
			rd.forward(req, res);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);
	}


	private boolean isAuthenticated(String userid, String password) {
		// You need to write JDBC loginc here to verify from the datababse
		System.out.println(userid);
		System.out.println(password);
		
		String sql = "SELECT * FROM REGCUSTOMER  Where USERNAME  = '"+ userid+ "' and PASSWORD = '"+ password +"'";
		
		Connection con = DBUtils.getConnection();
		//System.out.println(con);
		
		
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
		ResultSet result = null;
		try {
			//System.out.println(sql);
			result = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(result);
		
		boolean flag = false;
		try {
			flag = result.isBeforeFirst();
			//System.out.println(flag);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				if (flag) {         
				System.out.println("Inserted" + result + "Record(s) successfully");  
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}     
				DBUtils.closeConnection(con);  
				return true;
				
				} else {      
					
				//System.out.println("Unable to insert record. Please check your SQL syntax");   
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}     
				DBUtils.closeConnection(con);  
				return false;
				}
		       // Close the statements and Connections    
		      
		} else {     
		System.out.println("Unable to get the connection");  
		
		return false;
	}
}}
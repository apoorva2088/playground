package mybillingwebservlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class BillingServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		System.out.println("Inside Billing GET");// Read the card details
		String cardType = req.getParameter("cardType");
		String number = req.getParameter("number");
		String date = req.getParameter("date");
		// Get the session
		HttpSession session = req.getSession(true);
		// Generate a confirmation number
		long conf = (long) (Math.random() * 9999999);
		// Store the data in the session
		session.setAttribute("Confirmation", new Long(conf));
		// Forward to Billing page
		req.getRequestDispatcher("/ConfirmationServlet").forward(req, res);
	}
	

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("Inside Billing POST");
		doGet(req, res);
			
	
	}
}
package mybillingwebservlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ConfirmationServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		System.out.println("Inside Confirmation GET");
		// Get the session
		HttpSession session = req.getSession(true);
		// Read the price and confirmation number
		Double price = (Double) session.getAttribute("TotalPrice");
		Long conf = (Long) session.getAttribute("Confirmation");
		// Compute the price including tax
		double totalPrice = price.doubleValue() + 0.07 * price.doubleValue();
		PrintWriter pw = res.getWriter();
		pw.println("<h3> Your Order has been sucessfully processed</h3><br/>");
		pw.println("<h3>Your credit card is charged for $ " + totalPrice + "</h3><br/");
		pw.println("<h3>The tracking Number for this order is " + conf.longValue() + "<br/");
		// Incude the response of Banner Servlet
		req.getRequestDispatcher("/BannerServlet").include(req, res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Inside Confirmation POST");
		doGet(req, res);
	}	
}

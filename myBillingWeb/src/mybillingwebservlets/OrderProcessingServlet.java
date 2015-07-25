package mybillingwebservlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class OrderProcessingServlet extends HttpServlet {
	/*protected void doGet(HttpServletRequest req, HttpServletResponse res)

	throws ServletException, IOException {
		// Read the form data.
		String j2eeQty = req.getParameter("j2eeQty");
		String perlQty = req.getParameter("perlQty");
		String flowersQty = req.getParameter("flowerQty");
		// Compute the price
		int q1 = Integer.parseInt(j2eeQty);
		int q2 = Integer.parseInt(perlQty);
		int q3 = Integer.parseInt(flowersQty);
		double totalPrice = q1 * 10.99 + q2 * 9.99 + q3 * 1.99;
		// Get the session
		HttpSession session = req.getSession(true);
		// Store the data in the session
		session.setAttribute("TotalPrice", new Double(totalPrice));
		// Forward to Billing page
		req.getRequestDispatcher("/htmls/billing.html").forward(req, res);
	}
*/
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// Read the form data.
		String j2eeQty = req.getParameter("j2eeQty");
		String perlQty = req.getParameter("perlQty");
		String flowersQty = req.getParameter("flowerQty");
		// Compute the price
		int q1 = Integer.parseInt(j2eeQty);
		int q2 = Integer.parseInt(perlQty);
		int q3 = Integer.parseInt(flowersQty);
		double totalPrice = q1 * 10.99 + q2 * 9.99 + q3 * 1.99;
		// Get the session
		HttpSession session = req.getSession(true);
		// Store the data in the session
		session.setAttribute("TotalPrice", new Double(totalPrice));
		// Forward to Billing page
		req.getRequestDispatcher("/htmls/billing.html").forward(req, res);
	}
}
package mybillingwebservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BannerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.println("<hr/>");
		pw.println("Thank You for Shopping at BuyForLess.com. Please Visit again. Hava a nice day!");
	}
}
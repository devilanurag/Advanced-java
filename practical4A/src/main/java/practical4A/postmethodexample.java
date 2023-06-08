package practical4A;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class postmethodexample extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name= req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		
		out.print("<html><body>");
		
		out.print("<h1><b> Your Name is: "+name+"</b></h1><br>");
		out.print("<h1><b> Your Age is: "+age+"</b></h1><br>");
		
		out.print("</body></html>");
	}
}

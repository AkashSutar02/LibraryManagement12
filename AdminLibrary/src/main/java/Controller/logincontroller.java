package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logincontroller
 */
@WebServlet("/login")
public class logincontroller extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		PrintWriter pw=response.getWriter();
		if (user.equals("admin")&&pass.equals("12345")) {
			HttpSession session=request.getSession(true);
			session.setAttribute("status", true);
			response.sendRedirect("home2.html");
			
		}else {
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('username or password is wrong, please try again');");
			pw.print("location='index.html';");
			pw.print("</script>");
		}
	}

}

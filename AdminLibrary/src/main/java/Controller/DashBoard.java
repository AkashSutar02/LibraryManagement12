package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class DashBoard extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getSession(false)!=null) {
			RequestDispatcher rd=null;
			String op=req.getParameter("a1");
			switch(op) {
			case "newStudent":
				resp.sendRedirect("newStudent.html");
				break;
			case "newBook":
				resp.sendRedirect("newBook.html");
				break;
			case "statistic":
				rd=req.getRequestDispatcher("statistic");
				rd.forward(req, resp);
				break;
			case "iBook":
				resp.sendRedirect("issue.html");
				break;
			case "rBook":
				resp.sendRedirect("Return.html");
				break;
			case "logout":
				System.out.println("9");
				 rd=req.getRequestDispatcher("logout1");
				rd.forward(req, resp);
				break;
			}
		}else {
			resp.sendRedirect("index.html");
		}
		
	}

}

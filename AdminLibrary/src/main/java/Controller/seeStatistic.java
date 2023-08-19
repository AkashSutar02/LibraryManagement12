package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAOpackage.DatabaseOp;
import DtoPackage.dtoStatistic;

@WebServlet("/statistic")
public class seeStatistic extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			DatabaseOp op=new DatabaseOp();
			ArrayList<dtoStatistic> d1=op.seeDeatils();
			ArrayList<dtoStatistic> d2=op.seeDeatils2();
			RequestDispatcher rd=req.getRequestDispatcher("Statistic.jsp");
			req.setAttribute("s1", d1);
			req.setAttribute("s2", d2);
			rd.forward(req, resp);
			
		}else {
			resp.sendRedirect("index.html");
		}
		
	}

}

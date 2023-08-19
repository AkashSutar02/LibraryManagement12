package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAOpackage.DatabaseOp;

@WebServlet("/addstudent")
public class addStudentController extends HttpServlet {
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);
	DatabaseOp d1=null;
	boolean status=(boolean) session.getAttribute("status");
	if (status) {
		String userRequest=req.getParameter("ur");
		if (userRequest.equals("save")) {
			String id=req.getParameter("id");
			String sName=req.getParameter("sName");
			String fName=req.getParameter("fName");
			String course=req.getParameter("course");
			String branch=req.getParameter("branch");
			 d1=new DatabaseOp();
			 PrintWriter pw=resp.getWriter();
			boolean s=d1.addStudent(id,sName,fName,course,branch);
			//System.out.println();
			if(!s) {
				
				pw.print("<script type=\"text/javascript\">");
				pw.print("alert('id already exists');");
				pw.print("location='newStudent.html';");
				pw.print("</script>");
			}else {
				pw.print("<script type=\"text/javascript\">");
				pw.print("alert('Student Added Succesfully');");
				pw.print("location='home2.html';");
				pw.print("</script>");
	
			}
		}else {
			resp.sendRedirect("home.html");
		}
	}else {
		resp.sendRedirect("index.html");
	}
}
}

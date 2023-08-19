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

@WebServlet("/issueBook")
public class IssueBook extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			HttpSession session=req.getSession(false);
			
			if(session!=null) {
			String bId=req.getParameter("bId");
			String sId=req.getParameter("sId");
			String iDate=req.getParameter("iDate");
			String dDate=req.getParameter("dDate");
			DatabaseOp d1=new DatabaseOp();
			PrintWriter pw=resp.getWriter();
			boolean status= d1.addIssueBook(sId,bId,iDate,dDate);
			if(!status) {
				pw.print("<script type=\"text/javascript\">");
				pw.print("alert('Invalid Book Id or Student Id');");
				pw.print("location='issue.html';");
				pw.print("</script>");
			}else {
				pw.print("<script type=\"text/javascript\">");
				pw.print("alert('Book issue Succesfully');");
				pw.print("location='home2.html';");
				pw.print("</script>");
	
			}
			
		}else{
			resp.sendRedirect("index.html");
		}}
		
}

package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.jdbc.DatabaseMetaData;

import DAOpackage.DatabaseOp;

@WebServlet("/addBook")
public class addnewBook extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		
		
		if (session!=null) {
			
			String id=req.getParameter("id");
			String bName=req.getParameter("bName");
			String pName=req.getParameter("pName");
			double price=Double.parseDouble(req.getParameter("price"));
			String year=req.getParameter("pYear");
			DatabaseOp d1=new DatabaseOp();
			PrintWriter pw=resp.getWriter();
		  boolean s=d1.addBook(id,bName,pName,price,year);
			if(!s) {
				
				pw.print("<script type=\"text/javascript\">");
				pw.print("alert('Id already exits');");
				pw.print("location='newBook.html';");
				pw.print("</script>");
			}else {
				pw.print("<script type=\"text/javascript\">");
				pw.print("alert('Book Added Succesfully');");
				pw.print("location='home2.html';");
				pw.print("</script>");
	
			}
			
		}else {
			resp.sendRedirect("index.html");
		}
	}
    
}

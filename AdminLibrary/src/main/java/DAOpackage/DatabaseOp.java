 package DAOpackage;

import java.util.ArrayList;
import java.util.Iterator;

import DtoPackage.dtoBook;
import DtoPackage.dtoStatistic;
import DtoPackage.dtostudent;

public class DatabaseOp {
	
	static ArrayList<dtostudent> d1=new ArrayList<dtostudent>();
	static ArrayList<dtoBook> a1=new ArrayList<dtoBook>();
	static ArrayList<dtoStatistic> s1=new ArrayList<dtoStatistic>();
	static ArrayList<dtoStatistic> returnBook=new ArrayList<dtoStatistic>();
	static{
		dtostudent d2=new dtostudent("1", "Alam", "Mujawar", "B-Tech", "CSE");
		dtostudent d3=new dtostudent("2", "Akash", "Sutar", "BE", "Mech");
		dtostudent d4=new dtostudent("3", "Darshan", "Lahakar", "BCA", "CSE");
		dtostudent d5=new dtostudent("4", "Rushi", "Madhure", "BE", "Cevil");
	    d1.add(d2);
	    d1.add(d3);
	    d1.add(d4);
	    d1.add(d5);
	}
	static {
		dtoBook d1=new dtoBook("1", "Core Java", "Games Gosling", 300, "19/10/1995");
		dtoBook d2=new dtoBook("2", "HTML", "Tim Berners Lie", 250, "11/02/2001");
		dtoBook d3=new dtoBook("3", "C", "Danie Richie", 400, "01/01/1974");
		dtoBook d4=new dtoBook("4", "Python", "Vam Grone", 500, "12/03/1999");
		a1.add(d1);
		a1.add(d2);
		a1.add(d3);
		a1.add(d4);
		
	}
	
	public boolean addStudent(String id, String sName, String fName, String course, String branch) {
		//dtostudent d2=new dtostudent(id, sName, fName, course, branch);
	boolean status=false;
//		for(dtostudent d:d1) {
//			if(!(id.equals(d.getId()))) {
//				System.out.println(d.getId());
//				d1.add(d2);
//				return true;
//			}
//			
//		}
	boolean status1=false;
		for (int i = 0; i <d1.size(); i++) {
			if (id.equals(d1.get(i).getId())) {
				
				status1=true;		
			}	
		}
		if (!status1) {
			dtostudent d2=new dtostudent(id, sName, fName, course, branch);
			d1.add(d2);
			status=true;
			
		}
		return status;
	}
	public boolean addBook(String id, String bName, String pName, double price, String year) {
		boolean status=false;
		for(dtoBook d:a1) {
			if(id.equals(d.getId())) {
				status=true;
				
			}
		}
		
		
		if (!status) {
			dtoBook d3=new dtoBook(id, bName, pName, price, year);
			a1.add(d3);
			return true;
			
		}
		return false;
	}
	public ArrayList<dtoStatistic> seeDeatils() {
		return s1;
	}
	public boolean addIssueBook(String sId, String bId, String iDate, String dDate) {
		boolean isBook=false;
		boolean isStudent=false;
		boolean status=false;
		String sName=null;
		String bName=null;
		for(dtoBook b:a1) {
			if(bId.equals(b.getId())) {
				isBook=true;
				bName=b.getbName();
			}
		}
		for(dtostudent d:d1) {
			if(sId.equals(d.getId())) {
				isStudent=true;
				sName=d.getSname();
			}
		}
		
		if(isBook==true && isStudent==true) {
			dtoStatistic d1=new dtoStatistic();
			d1.setbId(bId);
			d1.setsId(sId);
			d1.setIssueDate(iDate);
			d1.setDueDate(dDate);
			d1.setsName(sName);
			d1.setbName(bName);
			s1.add(d1);
			status=true;
		}
		return status;
	}
	public boolean addReturnBook(String sId, String bId, String iDate, String dDate) {
		boolean isBook=false;
		boolean isStudent=false;
		boolean status=false;
		Iterator<dtoStatistic> itr=s1.iterator();
		while(itr.hasNext()) {
			dtoStatistic d=itr.next();
	
			System.out.println(d.getbId()+d.getsId());
			if((d.getbId().equals(bId))&&(d.getsId().equals(sId))) {
				returnBook.add(d);
				itr.remove();
			
				status=true;
			}
		}
		
		return status;
	}
	public ArrayList<dtoStatistic> seeDeatils2() {
		return returnBook;
		
	}
}

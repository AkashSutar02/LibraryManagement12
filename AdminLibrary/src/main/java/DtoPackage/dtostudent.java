package DtoPackage;

public class dtostudent {
  private	String id;
  private	String sname;
private	String fname;
private	String course;
private	String branch;
	public dtostudent(String id, String sname, String fname, String course, String branch) {
		super();
		this.id = id;
		this.sname = sname;
		this.fname = fname;
		this.course = course;
		this.branch = branch;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}

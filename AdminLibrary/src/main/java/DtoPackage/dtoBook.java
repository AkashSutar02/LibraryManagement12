package DtoPackage;

public class dtoBook {
	private String id;
	private String bName;
	private String pName;
	private double price;
	private String date;
	public dtoBook(String id, String bName, String pName, double price, String date) {
		super();
		this.id = id;
		this.bName = bName;
		this.pName = pName;
		this.price = price;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}

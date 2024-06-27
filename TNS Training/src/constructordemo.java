
public class constructordemo {
	private String custName;
	private int custid;
	private String custcity;
	
//Default constructor
	public constructordemo() {
		System.out.println("Default constructor");
	}
//Parameterized constructor
//use of this cunstructor
	
	public constructordemo(String custName, int custid, String custcity) {
		super();
		this.custName = custName;
		this.custid = custid;
		this.custcity = custcity;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustcity() {
		return custcity;
	}

	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}

	@Override
	public String toString() {
		return "constructordemo [custName=" + custName + ", custid=" + custid + ", custcity=" + custcity + "]";
	}
	
	
	
	
	
	

}

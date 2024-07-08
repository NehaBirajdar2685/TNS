import java.util.Scanner;
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("enter id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter cust name");
		name=sc.nextLine();
		System.out.println("enter cust city");
		city=sc.nextLine();
		System.out.println(" ");
		constructordemo c1= new constructordemo();
		c1.setCustName(name);
		c1.setCustid(id);
		c1.setCustcity(city);
		System.out.println(c1);
		sc.close();
		constructordemo c2= new constructordemo(name,id,city);
		System.out.println(c2);
		
		
				
	}

	}



package Day8;

public class Singleinheritance    //Citzen
{
	private String name;
	private String adharNo;
	private String address;
	private long phone;
	
	
	//Non para constructor 
	public Singleinheritance () {
		System.out.println("Citizen object created");
	}


	//Para Constructor
	public Singleinheritance (String name, String adharNo, String address, long phone) {
		
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
		this.phone = phone;
	}


	//Getter and Setter 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdharNo() {
		return adharNo;
	}


	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	//ToString
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
//child class
public class Student extends Singleinheritance {
	
	private int rollNo;
	private String collegeName;
	
	
	public Student() {
		super();
	}


	public Student(String name, String adharNo, String address, long phone,int rollNo, String collegeName) {
		super( name,  adharNo,  address,  phone);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
}


		public static void main(String[] args) {

			
			Student student = new Student("Shubham", "TC0123", "Pune", 987654387L, 1001, "JSPM");
			System.out.println( student );
		}

	}

	

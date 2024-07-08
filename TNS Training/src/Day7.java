
public class Day7 {
	private String name;
	private String adharNo;
	private String address;
	private long phone;
//non parametrized constructor	
	public Day7 () {
		System.out.println("Citizen object created");
		
		
	}
//Parameterized constructor
	public Day7(String name, String adharNo, String address, long phone) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
		this.phone = phone;
	}

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
	@Override
	public String toString() {
		return "Day7 [name=" + name + ", adharNo=" + adharNo + ", address=" + address + ", phone=" + phone + "]";
	}
}

    class Student extends Day7{
	private int rollNo;
	private String ClgName;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String clgName) {
		super();
		this.rollNo = rollNo;
		ClgName = clgName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getClgName() {
		return ClgName;
	}

	public void setClgName(String clgName) {
		ClgName = clgName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", ClgName=" + ClgName + ", getName()=" + getName() + ", getAdharNo()="
				+ getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + "]";
	}
	
}
    
    class SLIinheritanceDemo{
    
    	
    }
	


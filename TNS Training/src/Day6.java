import java.util.Scanner;
public class Day6 {
	
}
	//Encapsulation
	/*private int serilaNum;
	private String name;
	private int age;
	public int getSerilaNum() {
		return serilaNum;
	}
	public void setSerilaNum(int serilaNum) {
		this.serilaNum = serilaNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//object class method - to return string representation of the object 
	@Override
	public String toString() {
		return "OopsConceptDemo [serilaNum=" + serilaNum + ", name=" + name + ", age=" + age + "]";
	}
	
public static void main(String[] args) {

	
	//object creation
	Day6 obj= new Day6 ();
	
	obj.setName("Neha");
	obj.setAge(21);
	obj.setSerilaNum(1001);
	
	System.out.println(obj.getAge());
	System.out.println(obj.getName());
	System.out.println(obj.getSerilaNum());
	
	System.out.println(obj);
	
	
}

}

//Constructor
	/*private String customerName;
	private int customerId;
	private String customerCity;
	
	//Default constructor 
	public Day6() {
		System.out.println("Default constructor");
	}

	
	
	//Parametriozed constructor 
	//use of this keyword 
	public Day6(String customerName, int customerId, String customerCity) {
		this(); //calling default constructor 
		
		System.out.println("Parameterized Constructor ");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}



	//getter and setter
	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerCity() {
		return customerCity;
	}



	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}



	//toString
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	

public static void main(String[] args) {
	
	Scanner sc =new Scanner (System.in);
	
	String name, city;
	int id;
	System.out.println("Enter Customer Id :");
	id=sc.nextInt();
	
	sc.nextLine();
	System.out.println("Enter Customer Name:");
	name=sc.nextLine();
	
	System.out.println("Enter Customer City :");
	city=sc.nextLine();
	
	
	System.out.println(" ");
	
	Day6 c1=new Day6(); // default 
	c1.setCustomerCity(city);
	c1.setCustomerName(name);
	c1.setCustomerId(id);
	System.out.println(c1);
	
	System.out.println("Enter Customer Id :");
	id=sc.nextInt();
	
	sc.nextLine();
	System.out.println("Enter Customer Name:");
	name=sc.nextLine();
	
	System.out.println("Enter Customer City :");
	city=sc.nextLine();
	
	Day6 c2 = new Day6(name, id, city); //para
	System.out.println(c2);
	
	

}

}*/






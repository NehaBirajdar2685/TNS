package Day9;

public class MyClass {

	private int section;  //non -static varible  or instance varible
	
	private static int srNo; // static or class varible 
	
	//static block 
	static
	{
		System.out.println("-----------Within static block -----------");
		srNo=1000;
	}
	
	//default constructor 
	MyClass()
	{
		System.out.println("------------Within Default COnstructor----------");
		srNo++;  //1001
		section++;   //1
	}

	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method 
	static void display()
	{
//		System.out.println("Section : "+ section ); //cam't access non static member 
	
		System.out.println("Serail No : "+ srNo);
	
	
	}
public static void main(String[] args) {

	
	MyClass.display();
	
	System.out.println();
	
	MyClass o1=new MyClass();
	System.out.println(o1);
	
	
	//static method with class name 
	MyClass.display();
	
	System.out.println();
	
	MyClass o2=new MyClass();
	System.out.println(o2);
	MyClass.display();
	
	MyClass o3=new MyClass();
	System.out.println(o3);
	MyClass.display();
	
}

}
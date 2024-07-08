package Day9;

public class staticvariablemethod {
	//Declare instance varibles.
	private String name;
	private int id;
	
	//DEclare a static varible companyName with data type string  assign value 
	
	//TNS which is common for all the objects.
	static String companyName = "TNS";
	
	//Decalre a two parameter constructor 
	public staticvariablemethod(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
		public static void main(String[] args) {

			
			//Create the first object of the clas and pass the two arguments with type 
			
			staticvariablemethod e = new staticvariablemethod("Zeel", 1001);
			System.out.println(e);
			
			//similarly we can create the objects for other employees
			e=new staticvariablemethod("Hema", 1002);
			System.out.println(e);
		}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Comapny= "+companyName+"]";
	}
	

}

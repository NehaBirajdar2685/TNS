package Day9;

public class finalkeyword {
	void show () {
		System.out.println("Final class cannot be inherited ");
	}

//can't create child classes from final class, Ex: String , Wrapper class, System, Scanner, Number are final classes



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finalkeyword f1 = new finalkeyword();
		f1.show();
	}

}



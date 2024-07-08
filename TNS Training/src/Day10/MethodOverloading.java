package Day10;

public class MethodOverloading {
	int a;
	int b;
	public static int addi(int a,int b) {
		return a+b;
	}
	public static float addi(float a,float  b) {
		return a+b;
	}
	public static String addi(String a,String b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		System.out.println("Addition of two no");
		System.out.println(MethodOverloading.addi(20,11 ));
		System.out.println("Addition of two float");
		System.out.println(MethodOverloading.addi(20.5f,10.3f));
		System.out.println("Addition of two String");
		System.out.println(MethodOverloading.addi("Neha","Asmita"));
		
	}
	

}

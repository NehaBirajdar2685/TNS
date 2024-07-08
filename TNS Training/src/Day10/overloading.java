package Day10;

public class overloading {
	private float x;
	private float y;
	
	public overloading() {
		x=0.0f;
		y=0.0f;
	}
	public overloading(float x) {
		this.x=x;
		this.y=x;
	}
	public overloading(float x,float y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "overloading [x=" + x + ", y=" + y + "]";
	}
	public static void main(String[] args) {
		System.out.println("-----Constructor overloading-----");
		overloading p= new overloading();
		System.out.println(p);
		overloading p1= new overloading(14.2f);
		System.out.println(p1);
		overloading p2= new overloading(12.2f,20.4f);
		System.out.println(p2);
	}
	
}

package Day10;

class RBI {
	public float getRateOfInterest() {
		return 6.7f;
	}

}
class Sbi extends RBI{
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}
}
class ICICI extends RBI{
	@Override
	public float getRateOfInterest() {
		return 7.2f;
	}
}
public class MethodOverriding{
	public static void main(String[] args) {
		
		//Dynamic binding= assigning child class object to parent class refernce
		RBI rbi;
		rbi=new Sbi();
		System.out.println(rbi.getRateOfInterest());
		rbi= new ICICI();
		System.out.println(rbi.getRateOfInterest());
					
				
		
	}
}
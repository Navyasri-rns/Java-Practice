
//	Method Overriding with upcasting

package oops;

class Bank{
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	float getRateOfInterest() {
		return 8.4f;
	}
}
class AXIS extends Bank{
	float getRateOfInterest() {
		return 7.3f;
	}
}
class ICICI extends Bank{
	float getRateOfInterest() {
		return 9.7f;
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b = new SBI();
		System.out.println("SBI Rate Of Interest: "+ b.getRateOfInterest());
		b = new AXIS();
		System.out.println("AXIS Rate Of Interest: "+b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Rate Of Interest: "+b.getRateOfInterest());
	}

}

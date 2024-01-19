package typeCasting;
class Calc{
	void square(int num) {
		System.out.println("Calculting square: "+num);
		int res = num*num;
		System.out.println("Resulit is: "+ res);
	}
}
public class Narrowing {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		c1.square((int)5.6);
		double x = 6.5;
		c1.square((int)x);
		
	}
}

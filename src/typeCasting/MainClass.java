package typeCasting;

 class MainClass{
	public static void main(String[] args) {
		int x = (int)59.99;
		System.out.println("x value is: "+ x);
		
		double y = (double) 125;
		System.out.println("y value is "+ y);
		
		int p = 25;
		double q = 5.12;
		int a = (int) q;  //Double type is casted to int type
		double b = (double) p; //int type is casted to double type
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
	}
}
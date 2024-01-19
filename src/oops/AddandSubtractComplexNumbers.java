package oops;

class Complex{
	int real, img;
	
	Complex()
	{
	}
	Complex(int tempReal,int tempImg){
			real = tempReal;
			img = tempImg;
	}
	Complex addComp(Complex c1, Complex c2){
		Complex temp = new Complex();
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}
	Complex SubtracrComp(Complex c1, Complex c2) {
		Complex temp = new Complex();
		temp.real = c1.real - c2.real;
		temp.img = c1.img - c2.img;
		return temp;
	}
	void printComplexNumbers() {
		System.out.println("Complex numbers: "+ real + " + "+ img + "i ");
	}
}
public class AddandSubtractComplexNumbers {
	public static void main(String[] args) {
		Complex C1 = new Complex(3,2);
		C1.printComplexNumbers();
		Complex C2 = new Complex(9,5);
		C2.printComplexNumbers();
		Complex C3 = new Complex();
		C3 = C3.addComp(C1, C2);
		System.out.println("Sum of ");
		C3.printComplexNumbers();
		
		C3 = C3.SubtracrComp(C1, C2);
		System.out.println("Difference of`");
		C3.printComplexNumbers();
	}

}

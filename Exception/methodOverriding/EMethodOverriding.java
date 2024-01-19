package methodOverriding;


class Parent{
	void msg() {
		System.out.println("parent method");
	}
}
public class EMethodOverriding extends Parent{
//	void msg() throws IOException{  //Compilation error comes bcoz of checked exception
//		
//	}
	void msg() throws ArithmeticException{
		System.out.println("child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new EMethodOverriding();
		p.msg();
	}

}

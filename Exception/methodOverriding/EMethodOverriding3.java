
//subclass overridden method declares subclass exception

package methodOverriding;
class Parentt{
	void msg() throws Exception{
		System.out.println("parent method");
	}
}
public class EMethodOverriding3 extends Parentt{
	void msg() throws ArithmeticException{
		System.out.println("child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentt p = new EMethodOverriding3();
		try {
			p.msg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

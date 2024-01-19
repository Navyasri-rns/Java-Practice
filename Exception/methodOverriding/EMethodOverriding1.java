
//subclass overridden method declares parent exception

package methodOverriding;
class P{
	void msg() throws ArithmeticException{
		System.out.println("parent method");
	}
}
public class EMethodOverriding1 extends P{
//	void msg() throws Exception{
	void msg() {
		System.out.println("child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p = new EMethodOverriding1();
		try {
			p.msg();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

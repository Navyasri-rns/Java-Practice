
//subclass overridden method declares no exception

package methodOverriding;
class Main{
	void msg() throws Exception{
		System.out.println("parent method");
	}
}
public class EMethodOverriding4 extends Main{
	void msg() {
		System.out.println("child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main p = new EMethodOverriding4();
		try {
			p.msg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

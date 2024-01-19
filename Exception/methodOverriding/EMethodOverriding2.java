

//subclass overridden method declares same exception

package methodOverriding;
class pt{
	void msg() throws Exception{
		System.out.println("parent method");
	}
}
public class EMethodOverriding2 extends pt{
	void msg() throws Exception{
		System.out.println("child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pt p = new EMethodOverriding2();
		try {
			p.msg();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

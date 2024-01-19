package keywords;

import java.io.IOException;

class M{
	void method() throws IOException{
		throw new IOException("device error");
	}
}
public class HandleExceptionTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		M m= new M();
		m.method();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception handled");
		}
		System.out.println("normal flow");
	}

}

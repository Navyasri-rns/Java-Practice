package exceptions;

import java.io.IOException;

class N{
	void method() throws IOException{
//		System.out.println("Executed fine"); //If exception does not occur
		throw new IOException("device error"); /*If exception occurs thrown to runtime
	                                            bcoz throws doesn't handle the exception*/
	}
}

public class DeclareExp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		N m = new N();
		m.method();
		
		System.out.println("normal flow...");
	}

}

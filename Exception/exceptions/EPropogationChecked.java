package exceptions;

import java.io.IOException;

public class EPropogationChecked {
	void m() throws IOException {
		throw new java.io.IOException("device error");
	}
	void n() throws IOException {
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
		//	e.printStackTrace();
			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EPropogationChecked obj = new EPropogationChecked();
		obj.p();
		System.out.println("normal flow..");
	}

}

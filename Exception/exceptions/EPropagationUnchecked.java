package exceptions;

public class EPropagationUnchecked {

	void m() {
		int a = 50/0;
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e){
			e.getMessage();
			e.printStackTrace();
		//	System.out.println("Exception handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EPropagationUnchecked obj = new EPropagationUnchecked();
		obj.p();
		System.out.println("normal flow...");
	}

}

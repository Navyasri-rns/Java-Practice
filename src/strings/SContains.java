package strings;

public class SContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "India is my country";
//		System.out.println(a.contains("India"));
//		System.out.println(a.contains("my country"));
//		System.out.println(a.contains("hello"));
		
		if(a.contains("India")) {
			System.out.println("This String contains India");
		}
		else {
			System.out.println("Record not found");
		}
	}

}

package strings;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " Welcome to Serole Techologies";
		int count = 0;
		int startFrom = 0;
		for(;;) {
			int index = str.indexOf('o', startFrom);
			if(index>0) {
				count = count + 1;
				startFrom = index + 1;
				
			}
			else {
				break;
			}
		}
		System.out.println("String: " + str);
		System.out.println("The o character has come " + count + " times");
		
//		String str = " This is indexOf Method";
//		int index = str.indexOf("Method");
//		System.out.println("index of substring: "+ index);
	}

}

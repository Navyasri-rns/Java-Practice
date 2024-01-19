package strings;

public class SFormatM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String n = "Navya";
//		String s1 = String.format("name is %s",n);
//		String s2 = String.format("value is %f", 23.3313);
//		String s3 = String.format("value is %23.12f",23.3313);
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		String st1 = String.format("%s", "Navya");
		String st2 = String.format("%d", 101);
		String st3 = String.format("%c", 'c');
		String st4 = String.format("%x", 134);
		String st5 = String.format("%f", 32.33);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(st5);
		
//		String a1 = String.format("%d", 101);
//		String a2 = String.format("|%10d|", 101); //specifying length of integer
//		String a3 = String.format("|%-10d|", 101);//left justifying within the specified width
//		String a4 = String.format("|%010d|", 101);//filling with zeros
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(a3);
//		System.out.println(a4);
//		
	}

}

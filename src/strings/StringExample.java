package strings;
 public class StringExample{
	 public static void main(String[] args) {
		String s1 = "Java"; //creating string by literals
		char ch[] = {'s','t','r','i','n','g','s'};
		String s2 = new String(ch); //Converting char array to string
		String s3 = new String("example"); //creating string by using new keyword
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
	}
 } 
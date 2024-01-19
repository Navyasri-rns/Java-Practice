package typeCasting;

public class CharacterTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		char c2 = 'A';
		char c3 = 'b';
		char c4 = 'B';
		
		int n1 = (int) c1;
		int n2 = (int) c2;
		int n3 = (int) c3;
		int n4 = (int) c4;
		System.out.println(c1 +" "+ n1);  //Printing ASCII Values
		System.out.println(c2 +" "+n2);
		System.out.println(c3+" "+n3);
		System.out.println(c4+" "+n4);
	}
}

package exceptions;

import java.util.Scanner;

class User extends Exception{
	public User(String str) {
		super(str);
	}
}

public class UserDefExp {
	public static void method(String a) throws User{
		if(a.equals("khammam")) {
			throw new User("Local");
		}
		else {
			System.out.println("Non Local");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the city name");
		String b = sc.next();
		b=b.toLowerCase();
		method(b);
		}
		catch(User e) {
			System.out.println(e.getMessage());
		}
	}

}
;
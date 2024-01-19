package keywords;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EThrowChecked {
	public static void method() throws FileNotFoundException{
		
		FileReader file = new FileReader("C:\\Users\\Dell\\Desktop\\abc.txt");
		BufferedReader fileIn = new BufferedReader(file);
		
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		}
		catch(FileNotFoundException e) {
		//	System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("rest of code");
	}

}

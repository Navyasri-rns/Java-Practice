package TypesOfExceptions;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EFileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw;
		try {
			pw = new PrintWriter("eng.txt");
			pw.println("saved");
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		System.out.println("File saved successfully");
	}

}

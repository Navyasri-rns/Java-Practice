package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDeserialization {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Ram");
		a.add("Ravi");
		a.add("Naveen");
		
		try {
			//serialization
			FileOutputStream f = new FileOutputStream("File");
			ObjectOutputStream g = new ObjectOutputStream(f);
			g.writeObject(a);
			f.close();
			g.close();
			//deserialization
			FileInputStream y = new FileInputStream("File");
			ObjectInputStream z = new ObjectInputStream(y);
			ArrayList l= (ArrayList)z.readObject();
//			y.close();
//			z.close();
			System.out.println(l);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

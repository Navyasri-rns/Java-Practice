package collections;

import java.util.HashMap;
import java.util.Map;

class Boook{
	int id;
	String name,author,publisher;
	int count;
	public Boook(int id, String name, String author, String publisher, int count) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.count = count;
	}
	
}
public class BookExamplee {

	public static void main(String[] args) {
		Map<Integer, Boook> m = new HashMap<>();
		Boook b1 = new Boook(11,"EDC","Godse","Radiant",25);
		Boook b2 = new Boook(12,"CE","Tamor","Falcon",22);
		Boook b3 = new Boook(13, "NATL", "Frendry", "Wiley", 30);
		
		m.put(1, b1);
		m.put(2, b2);
		m.put(3, b3);
		
		for(Map.Entry<Integer, Boook> k: m.entrySet()) {
			int key = k.getKey();
			Boook b = k.getValue();
			System.out.println(key+ " Details");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.count);
		}
	}

}

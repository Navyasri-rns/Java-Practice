package collections;

import java.util.LinkedHashMap;
import java.util.Map;

class LBook{
	int id;
	String name,author;
	int count;
	public LBook(int id, String name, String author, int count) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.count = count;
	}
	
}
public class LHMBook {

	public static void main(String[] args) {
		Map<Integer, LBook> m = new LinkedHashMap<>();
		LBook l1 = new LBook(11,"DE", "Godse", 10);
		LBook l2 = new LBook(12, "DCCN", "Forouzan", 20);
		LBook l3 = new LBook(13, null, null, 18);
		m.put(1, l1);
		m.put(2, l2);
		m.put(3, l3);
		
		for(Map.Entry<Integer, LBook> n: m.entrySet()) {
			int key = n.getKey();
			LBook v= n.getValue();
			System.out.println(key+ " Details");
			System.out.println(v.id+" "+ v.name+" "+v.author+" "+v.count);
		}

	}

}

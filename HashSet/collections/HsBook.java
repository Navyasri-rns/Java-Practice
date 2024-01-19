package collections;

import java.util.HashSet;
import java.util.Iterator;

class Boo{
	int id;
	String name,author;
	int quantity;
	public Boo(int id, String name, String author, int quantity) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
	
}
public class HsBook {

	public static void main(String[] args) {
		HashSet<Boo> h = new HashSet<>();
		Boo b1 = new Boo(101,"EDC","Jacob",20);
		Boo b2 = new Boo(103,"DE","Godse",15);
		Boo b3 = new Boo(105,"AC","Tomar",18);
		h.add(b1);
		h.add(b2);
		h.add(b3);
		
		for(Boo s:h) {
			System.out.println(s.id+" "+s.name+" "+s.author+" "+s.quantity);
		}
		

	}

}

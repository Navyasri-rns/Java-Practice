package collections;

import java.util.PriorityQueue;
import java.util.Queue;

class PBook implements Comparable<PBook>{
	int id;
	String name, author;
	int quantity;
	
	public PBook(int id, String name, String author, int quantity) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}

	public int compareTo(PBook o) {
		if(quantity> o.quantity) {
			return 1;
		}
		else if(quantity<o.quantity) {
			return -1;
		}
		else {
		return 0;
		}
	}
	
}
public class PQBook {

	public static void main(String[] args) {
		Queue<PBook> q = new PriorityQueue<>();
		PBook b1 = new PBook(101,"DE","Godse",18);
		PBook b2 = new PBook(104,"AC","James",16);
		PBook b3 = new PBook(102,"CE","Tamora",24);
		q.add(b1);
		q.add(b2);
		q.add(b3);

		for(PBook o:q) {
			System.out.println(o.id+" "+o.name+" "+o.author+" "+o.quantity);
		}
	}

}

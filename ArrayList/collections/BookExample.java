package collections;

import java.util.ArrayList;
import java.util.List;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
}
public class BookExample {

	public static void main(String[] args) {
		List<Book> l = new ArrayList<>();
		Book b1 = new Book(101,"C++","Stanley","Radiant",9);
		Book b2 = new Book(102,"Java","Joshua Bloch","Oracle press",8);
		Book b3 = new Book(103,"Python","John","springer",6);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		
		for(Book b: l) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}

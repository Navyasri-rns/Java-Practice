package collections;

import java.util.Iterator;
import java.util.LinkedList;

class Studennt{
	int id;
	String name;
	int classs;
	public Studennt(int id, String name, int classs) {
		
		this.id = id;
		this.name = name;
		this.classs = classs;
	}
	
}
public class Students {

	public static void main(String[] args) {
		LinkedList<Studennt> l = new LinkedList<>();
		Studennt s1 = new Studennt(3,"Harsha", 7);
		Studennt s2 = new Studennt(4,"Vishnu", 6);
		Studennt s3 = new Studennt(5,"Nishanth", 4);
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		for(Studennt c:l) {
			System.out.println(c.id+" "+c.name+" "+c.classs);
		}
	}

	public int age;

}

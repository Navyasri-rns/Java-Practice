package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sttudents implements Comparable<Sttudents>{
	int id;
	String name;
	int age;
	public Sttudents(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Sttudents s) {
		if(age == s.age)
			return 0;
		else if(age>s.age)
			return 1;
		else
			return -1;
	}
	
}
public class Comparable_InterfaceEx {

	public static void main(String[] args) {
		ArrayList<Sttudents> a = new ArrayList<>();
		a.add(new Sttudents(101,"Navya",22));
		a.add(new Sttudents(102,"Anusha",20));
		a.add(new Sttudents(103,"Bhargavi",23));
		
		Collections.sort(a);
		for(Sttudents n:a) {
			System.out.println(n.id+" "+n.name+" "+n.age);
		}
	}

}

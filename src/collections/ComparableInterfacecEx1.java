package collections;

import java.util.ArrayList;
import java.util.Collections;

class Peoples implements Comparable<Peoples>{
	int id;
	String name;
	int age;
	public Peoples(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Peoples p) {
		if(age ==p.age )
			return 0;
		else if(age>p.age)
			return -1;
		else
			return 1;
	}
}
public class ComparableInterfacecEx1 {

	public static void main(String[] args) {
		ArrayList<Peoples> s = new ArrayList<>();
		s.add(new Peoples(11,"Navya",22));
		s.add(new Peoples(12,"Anusha",12));
		s.add(new Peoples(13,"Ithihasa",16));
		
		Collections.sort(s);
		for(Peoples n:s) {
			System.out.println(n.id+"  "+n.name+"  "+n.age);
		}
	}

}

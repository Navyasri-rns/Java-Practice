package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class People{
	int id;
	String name;
	int age;
	public People(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
class AgeComparator implements Comparator<People>{
	
	public int compare(People o1, People o2) {
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}
	
}
class NameComparator implements Comparator<People>{

	public int compare(People o1, People o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
public class Comparator_Interface {

	public static void main(String[] args) {
		ArrayList<People> a = new ArrayList<>();
		a.add(new People(11,"Navya",22));
		a.add(new People(12,"Nishanth",20));
		a.add(new People(15,"Harsha",12));
		
		System.out.println("Sorting by name: ");
		Collections.sort(a,new NameComparator());
		
		for(People s: a) {
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		
		System.out.println();
		System.out.println("Sorting by age: ");
	
		Collections.sort(a, new AgeComparator());
		for(People s: a){
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
	}

}

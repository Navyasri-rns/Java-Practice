package collections;

import java.util.TreeSet;

class ClassCast{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class ClassCastExp {

	public static void main(String[] args) {
		ClassCast c1 = new ClassCast();
		ClassCast c2 = new ClassCast();
		
		TreeSet<ClassCast> t = new TreeSet<ClassCast>();
		t.add(c1);
		t.add(c2);
		
	}

}

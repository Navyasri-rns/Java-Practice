package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
public class StudentsC {

	public static void main(String[] args) {
		Student s1 = new Student(11,"Navya", 22);
		Student s2 = new Student(12,"Anusha", 21);
		Student s3 = new Student(13,"Sravani", 22);
		
		ArrayList<Student> a = new ArrayList<>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		Iterator<Student> i = a.iterator();
		while(i.hasNext()) {
			Student s = (Student)i.next();
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
//		Spliterator<Student> str = a.spliterator();
//		System.out.println("Next element present? "+str.tryAdvance(System.out::println));
//		System.out.println("Remaining names present in the list");
//		str.forEachRemaining(System.out::println);
		
	}

}

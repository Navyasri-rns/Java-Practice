package strings;
class Student{
	int rollno;
	String name;
	String city;

	public Student(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return rollno +" "+ name +" "+city;
	}
}


public class StoString {
	public static void main(String[] args) {
		Student s1 = new Student(12,"Navya","Medak");
		Student s2 = new Student(13,"Navyasri","Ramayampet");
		System.out.println(s1);
		System.out.println(s2);
	}
	
}

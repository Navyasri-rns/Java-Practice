package oops;

public class CollegeStudents {
	public static void main(String[] args) {
		People a=new People("Navya",13,"ECE","BRIL","Hyderabad");
		a.printStudentDetails();
	}

}
class Person{
	String name;
	int id;
	String branch;
	String college;
	
	Person(String name,int id, String branch, String college){
	this.name=name;
	this.id=id;
	this.branch=branch;
	this.college=college;
	}
}
class People extends Person{
	String city;
	People(String name, int id, String branch, String college,String city){
		super(name,id,branch,college);
		this.city=city;
	}
	void printStudentDetails() {
		System.out.println("Student name - "+ name);
		System.out.println("Student id - "+ id);
		System.out.println("Branch name - "+ branch);
		System.out.println("College name - "+ college);
		System.out.println("City name -  "+ city);
	}
	
}
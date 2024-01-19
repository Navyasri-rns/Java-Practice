package oops;

public class StudentDetailsClasses {
	public static void main(String[] args) {
		Student1 students[] = new Student1[5];
		students[0] = new Student1();
		students[0].name = "Navya";
		students[0].marks = 85;
		students[0].section ='A';
	//	students[0].college = "BRIL";
		
		students[1] = new Student1();
		students[1].name = "Anusha";
		students[1].marks = 90;
		students[1].section = 'B';
	//	students[1].college = "KNRR";
		
		students[2] = new Student1();
		students[2].name = "Divya";
		students[2].marks = 95;
		students[2].section ='A';
	//	students[2].college = "BRIL";
		
		students[3] = new Student1();
		students[3].name= "Nihan";
		students[3].marks  = 99;
		students[3].section = 'A';
	//	students[3].college = "KNRR";
		
		students[4] = new Student1();
		students[4].name = "kavya";
		students[4].marks = 75;
		students[4].section = 'B';
	//	students[4].college = "BRIL";
		
		for(int i=0; i<students.length;i++) {
			System.out.println(students[i].name + " In section " + students[i].section + " got "+
					students[i].marks +" marks." );
		}
		
	}

}
class Student1{
	String name;
	int marks;
	char section;
	//String college;
}

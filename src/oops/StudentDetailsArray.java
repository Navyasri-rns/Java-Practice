package oops;

import java.util.ArrayList;
import java.util.List;

class student{
	String name;
	int id;
	String branch;
	String college;
	
	student (String n, int i, String b, String c){
		this.name = n;
		this.id = i;
		this.branch = b;
		this.college = c;
	}
	
	public void display() {
		System.out.println("Name: "+ this.name);
		System.out.println("Id: "+ this.id);
		System.out.println("Branch name: "+ branch);
		System.out.println("College name: "+ college +"\n");
	}
}
public class StudentDetailsArray {
	public static void main(String[] args) {
//		student s1 = new student("Navya", 11, "ECE");
//		student s2 = new student("Chandana", 12, "ECE");
//		s2.display();
		
		List<student> lists = new ArrayList<student>();
		String[] na = {"Navya","Chandana","Hemachandra"};
		int[] rn = {11,12,13};
		String[] bh= {"ECE", "CSE","Civil"};
		String[] cg = {"BRIL", "KNRR", "BRIG"};
		
		for(int i=0;i<3;i++) {
			student s = new student(na[i], rn[i], bh[i], cg[i]);
				lists.add(s);
		}
		for(int i=0;i<3;i++) {
			lists.get(i).display();
		}
		
//		lists.get(1).display();
	}
	
}

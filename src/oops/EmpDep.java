package oops;

import java.util.ArrayList;

public class EmpDep {
	
	public static void main(String[] args) {
		Employees emp=new Employees("Navyasri",22,"Intern","SAP", 386);
		Employees emp1=new Employees("Chandana", 22, "Intern", "Java", 401);
		emp.printEmployeeDetails();
		emp1.printEmployeeDetails();
	
//		ArrayList<Department> a = new ArrayList<Department>()
//		{
//			 e1=new Employees("Navyasri",22,"Intern","SAP",386);
//			 e1.Employees();
//		 }
//	    e1.add("Navya", 22, "Intern"," SAP");
//		e1.add("Divya", 24,"Intern","Java");
//		
//		for(int i=0;i<e1.size();i++) {
//			System.out.println(e1.get(i));
//		}
//		
	}

}
 class Department{
	String name;
	int age;
	String designation;
	String department;
	Department(String name, int age, String designation, String department){
		this.name=name;
		this.age=age;
		this.designation=designation;
		this.department=department;
	}
	
}
 class Employees extends Department {
	 	int id;
	 	Employees( String name, int age, String designation, String department,int id){
	 		super(name,age,designation,department);
	 		this.id=id;	
	 	}
	 	void printEmployeeDetails() {
	 		System.out.println("Employee name "+ name);
    		System.out.println("Employee age "+ age);
	 		System.out.println("Employee designation "+ designation);
	 		System.out.println("Employee department "+ department);
	 		System.out.println("Employee Id "+ id + "\n");
	 	}
 }
 
// ArrayList a=new ArrayList() {
//	 e1=new Employees("Navyasri",22,"Intern","SAP",386);
//	 e1.Employees();
// }
 
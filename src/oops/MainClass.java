package oops;

import java.util.ArrayList;

class EmployeeDetails{
	String name;
	String empId;
	int age;
	String designation;
	String location;
	String department;
	
	public EmployeeDetails(String name, String empId, int age, String designation, 
			String location, String department) {
		this.name = name;
		this.empId = empId;
		this.age = age;
		this.designation = designation;
		this.location = location;
		this.department = department;
		
		
	}

	
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String display() {
		return "Employee name: "+ name+ "\nEmployee Id: "+ empId+ "\nEmployee age: " + age +
				"\nDesignation: " + designation +"\nLocation: "+ location + "\nDepartment: "+ department + "\n";
	}
}

 class DeptDetails extends EmployeeDetails{
	String department;
	int deptId;
	
	public DeptDetails(String department, int deptId) {
		super();
		this.department = department;
		this.deptId = deptId;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String displayDeptDetails() {
		return "Department name: " + department +"\nDepartment Id: " + deptId;
	}
}
public class MainClass {
	public static void main(String[] args) {
		
		ArrayList<EmployeeDetails> e = new ArrayList<EmployeeDetails>();
		e.add(new EmployeeDetails("Navya","SE0386", 22, "Intern","Khammam", "Java"));
		e.add(new EmployeeDetails("Hemachandra", "SE0385", 24, "Intern", "Hyderabad", "Java"));
		e.add(new EmployeeDetails("Dilshad","SE0384", 23, "Intern", "Khammam"," SAP"));
		e.add(new EmployeeDetails("Saajan","SE388", 25,"Intern","Chennai","Testing"));
		
		ArrayList<DeptDetails> d= new ArrayList<DeptDetails>();
		d.add(new DeptDetails("Java", 25));
		d.add(new DeptDetails("Java",22));
		d.add(new DeptDetails("SAP", 50));
		d.add(new DeptDetails("Testing", 35));
		
		for(int i=0;i<d.size();i++) {
			System.out.println(e.get(i).display());
		}
	}
}
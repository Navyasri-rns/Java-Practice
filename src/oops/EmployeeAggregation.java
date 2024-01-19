
//Aggregation(Has a relationship)-Inheritance
package oops;
class Address{
	String city,state,country;

	public Address(String city, String state, String country) {
	
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
}

public class EmployeeAggregation{	
	int id;
	String name;
	Address Ad;
	
public EmployeeAggregation(int id, String name, Address ad) {
	
		this.id = id;
		this.name = name;
		Ad = ad;
	}
	void display() {
		System.out.println(id+"   "+name);
		System.out.println(Ad.city+"  "+Ad.state+"  "+Ad.country);
	}

public static void main(String[] args) {
	Address a1 = new Address("Hyd","TS","India");
	Address a2 = new Address("Vzg","AP","India");
	
	EmployeeAggregation p1 = new EmployeeAggregation(11,"Navya",a1);
	EmployeeAggregation p2 = new EmployeeAggregation(12,"Anusha",a2);
	p1.display();
	p2.display();
}

}

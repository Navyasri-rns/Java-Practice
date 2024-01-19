import java.util.*;
 class Emp implements People {
public void checkdep()throws DomainsException {
//	Scanner sc = new Scanner(System.in);
//	Map<String, Integer> map = new HashMap<>();
//	System.out.println("Enter the number of Employees in SAP:");
//	int in1=sc.nextInt();
//	map.put("SAP", in1);
//	System.out.println("Enter the number of Employees in Testing:");
//	int in2=sc.nextInt();
//	map.put("Testing", in2);
//	System.out.println("Enter the number of Employees in Products & Platforms:");
//	int in3=sc.nextInt();
//	map.put("Products & Platforms", in3);
//
//	System.out.println(map);
	int SAP = 15;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter how many people are there in SAP ");
	int s = sc.nextInt();
	if(s<=15) {
		System.out.println(s+ " Yes,SAP consists of 15 members");
	}
	else {
		throw new DomainsException();
	}
	int PP = 20;
	System.out.println("enter how many people are there in Products & Platforms");
	int p = sc.nextInt();
	if(p<=20) {
		System.out.println("Products & Platforms consists of 20 members");
	}
	else {
		throw new DomainsException();
	}
	int QA =10;
	System.out.println("Enter how many people are there in QA");
	int q = sc.nextInt();
	if(q<=10) {
		System.out.println("QA consists of 10 members");
	}
	else {
		throw new DomainsException();
	}
}
//	for(Entry<String, Integer> i :map.entrySet()) {
//		System.out.println(i.getKey()+":"+i.getValue());
//	}
@Override
public void navya() throws SeatsException {
	int s = 45;
	System.out.println("Total n of seats: "+ s);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many seats filled");
	int n = sc.nextInt();
	for(int i=0;i<=s;i++) {
		if(n>0 && n<=s) {
			int a = s - n;
			System.out.println(a + " seats available");
			break;
		}
		else {
			throw new SeatsException();
			
		}
	}
	
}
}


 
//public static void main(String[] args) throws Domains {
//	try {
//		checkdep();
//	} catch (Exception e) {
//		System.out.println(e);
//	}

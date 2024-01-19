package exceptions;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
			String bankName = null,nextOption = "";
			 int Option = 0;
			double amount =0.0;
			double withdrawalAmount = 0.0;
			CityBank c = new CityBank();
			AmericanBank a = new AmericanBank();
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Enter bank name");
				bankName = sc.next();
				try {
					
				start:
				while(true) {
					System.out.println("\n*****Choose operation*****");
			         System.out.println(" 1. Deposit");
			         System.out.println(" 2. Withdraw");
			         System.out.println(" 3. Balance Enquiry");
			         System.out.println(" 4. Exit");
			         Option = sc.nextInt();
			         try {
			        	 switch(Option) {
			        	 //deposit 
			        	 case 1:
			        	 {
			        		 System.out.println("Enter amount to be deposit: ");
			        		 amount = sc.nextDouble();
			        		 c.deposit(amount);
			        		 System.out.println(" Amount "+ amount+ " deposited");
			        		 break;
			        	 }
			        	 case 2:
			        	 {
			        		 System.out.println("Enter the amount to be withdraw: ");
			        		 amount = sc.nextDouble();
			        		 withdrawalAmount = c.withdraw(amount);
			        		 System.out.println("collect "+ withdrawalAmount+ " cash");
			        		 break;
			        	 }
			        	 case 3:
			        	 {
			        		 System.out.println("Current Balance: "+ c.balanceEnquiry());
			        		 break;
			        	 }
			        	 case 4:
			        		 break start;
			        		 default:
			        		 System.out.println("Invalid option");
			        	 }
			        	 System.out.println("\nDo you want to continue");
			        	 System.out.print("Enter Y or N: ");
			        	 nextOption = sc.next();
			        	 if("N".equalsIgnoreCase(nextOption)) 
			        		 break start;
			        	 }
			        	 catch(InvalidAmountException e) {
			        		 System.out.println(e.getMessage());
			        	 }
			        	 catch(Exception e) {
			        		 System.out.println(e.getMessage());
			        	 }
				}
				}
				
				
				catch(Exception e) {
					System.out.println(e.getMessage());
				}	
				System.out.println("***********************");
				System.out.println("Thank you :) Visit again");
				System.out.println("***********************");
		}
	}
}


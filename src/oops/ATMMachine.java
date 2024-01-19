package oops;

import java.util.Scanner;

class ATM{
	
	float Balance= 15000;
	int pin = 2403;
	
	public void checkpin() {
		System.out.println("Enter your pin");
		Scanner sc = new Scanner(System.in);
		int enteredPin = sc.nextInt();
		
		if(enteredPin == pin) {
			menu();
		}
		else {
			System.out.println("Enter a valid pin");
			menu();
		}
	}
	
	public void menu() {
		System.out.println("Enter your choice");
		System.out.println("1.Check Balance");
		System.out.println("2.Withdraw");
		System.out.println("3.Deposit");
		System.out.println("4.Exit");
		
		Scanner a = new Scanner(System.in);
		int opt = a.nextInt();
		
		if(opt==1) {
			checkBalance();
		}
		else if(opt==2){
			 	withdraw();
		}
		else if(opt ==3) {
			deposit();
		}
		else if(opt ==4) {
			return;
		}
		else { 
			System.out.println("Enter a valid choice");
		}
	}
		public void checkBalance() {
			System.out.println("Balance: "+ Balance+ "\n");
			menu();
		}
		
		public void withdraw() {
			System.out.println("Enter Amount to Withdraw: ");
				Scanner b= new Scanner(System.in);
				float amount= b.nextFloat();
				if(amount>Balance) {
					System.out.println("Insufficient Balance");
				}
				else {
					Balance= Balance-amount;
					System.out.println("Collect your amount"+"\n");
				}
				menu();			
}
		public void deposit() {
			System.out.println("Enter the amount to be deposited");
			Scanner c = new Scanner(System.in);
			float amt = c.nextFloat();
			Balance = Balance+amt;
			System.out.println("Money Deposited Successfully" + "\n");
			menu();
			}
}


public class ATMMachine {
	public static void main(String[] args) {
		ATM obj = new ATM();
		obj.checkpin();
	}

}

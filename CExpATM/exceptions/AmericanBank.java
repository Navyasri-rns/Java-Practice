package exceptions;

public class AmericanBank implements ATMCard{
	double balance;
	{
		this.balance = 2000 ;
	}
	public void deposit(double amount) throws InvalidAmountException{
		if(amount<=0) {
			throw new InvalidAmountException(" Invalid amount: amount<=0");
		}
		balance = balance +amount;
	}
	public double withdraw(double amount) throws InvalidAmountException,InsufficientFundsException{
		if(amount<=0) {
			throw new InvalidAmountException(" Invalid amount: amount<=0");
		}
		balance = balance - amount;
		return amount;
	}
	public double balanceEnquiry() {
		return balance;
		
	}

}

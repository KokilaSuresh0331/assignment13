package assignment13;

class InsufficientBalanceException extends Exception {
	 public InsufficientBalanceException(String message) {
	        super(message);
	    }
}
class Account{
	private String accountNo;
	private double bal;
	public Account(String accountNo, double bal) {
		this.accountNo=accountNo;
		this.bal=bal;
		
	}
	public void deposit(double amount) {
		bal+=amount;
		System.out.println("Deposit amount is successful:"+amount);
	}
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(bal<amount) {
			 throw new InsufficientBalanceException("Insufficient balance to withdraw $" + amount);
		}

	bal-=amount;
	System.out.println("withdraw amount is successful:"+amount);
	}
}
public class CustomException2{
	public static void main(String[] args) throws InsufficientBalanceException {
	Account a=new Account("123",1000);	
	try {
        a.deposit(500);
        a.withdraw(200);
        a.withdraw(1500); 
    } catch (InsufficientBalanceException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}
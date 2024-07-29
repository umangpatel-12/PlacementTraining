package Problems;

public class SavingAccount extends BankAccount {
	
	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	

	public void withdraw(double amount) {
        double minimumBalance = 500; // example minimum balance
        if (getBalance() - amount >= minimumBalance) {
            super.Widhdrawl(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance must be maintained.");
        }
    }

}

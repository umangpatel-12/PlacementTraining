package Problems;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
	}
	
	public void Widhdrawl(double amount) {
		if (balance >= amount) {
            // Decrease the balance the withdrawal amount
            balance -= amount;
        } else {
            // Print a message 
            System.out.println("Insufficient balance");
        }
	}
	
	public double getBalance() {
		return balance;
	}
	
}

package Problems;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount("52060100050004", 1000);
		CurrentAccount ca = new CurrentAccount("520616875600", 5000);
		
		sa.deposit(500);
		ca.deposit(200);
		
		sa.withdraw(200);
		ca.withdraw(5000);
	}

}

import java.text.ParseException;

public class Main {//©KS

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		Account acc = new Account(1122, 20000);
//		acc.setAnnualInterestRate(4.5);
//		acc.withdraw(2500.0);
//		acc.deposit(3000.0);
//		System.out.println(acc.getBalance());
//		System.out.println(acc.getMonthlyInterest());
//		System.out.println(acc.getDateCreated());
//		
//		Account accChecking = new CheckingAccount(1125, 2500.0, 500.0);
//		Account accSavings = new SavingsAccount(1130, 2500.0);
//		
//		System.out.println(acc);
//		System.out.println(accChecking);
//		System.out.println(accSavings);
		
		Account2 acc2 = new Account2(1122, "George", 1000.0, 1.5);
		acc2.deposit(30.0, "Inesimas");
		acc2.deposit(40.0, "Inesimas");
		acc2.deposit(50.0, "Inesimas");
		
		acc2.withdraw(5.0, "CashOut");
		acc2.withdraw(4.0, "CashOut");
		acc2.withdraw(2.0, "CashOut");
		
		acc2.printSummary();
	}

}

import java.util.HashMap;
import java.util.Map;

import lt.vtvpmc.oop.practice.Account;
import lt.vtvpmc.oop.practice.Bank;

<<<<<<< HEAD:Papildomai/Bank/src/MyBank.java
public class MyBank extends Bank {
//	Bank bank = new Bank();
//    Map<String, MyAccount> advanceAccounts = new HashMap<String, MyAccount>();
//	
//	public MyBank() {
//		bank = new Bank();
//	    advanceAccounts = new HashMap<String, MyAccount>();
//	}

//	public void crateAccount() {
//		
//	Account tempAcc = bank.openAccount();
////	MyAccount myacc = new MyAccount(tempAcc);
//					
//	}
//	
//	public Account useAccount(String number) {
//		return bank.getAccount(number);
//	}
	@Override
	protected MyAccount postProcessAccount(Account account) {
		
		return new MyAccount(account);
=======
public class Bank implements FeeCollector {

//	private List<MyAccount> accounts;

	public Bank() {
//		accounts =new ArrayList<>();
>>>>>>> 85ede6228612bca856b351b5c96328c817e783ef:Papildomai/Bank/src/Bank.java
		
	}
	
	
<<<<<<< HEAD:Papildomai/Bank/src/MyBank.java
=======
	private MyAccount postProcessAccount(Account account) {
		
		return account;
	}



>>>>>>> 85ede6228612bca856b351b5c96328c817e783ef:Papildomai/Bank/src/Bank.java
	
}

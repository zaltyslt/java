import java.util.HashMap;
import java.util.Map;

import lt.vtvpmc.oop.practice.Account;
import lt.vtvpmc.oop.practice.Bank;

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
		
	}
	
	
	
}

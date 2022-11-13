import java.util.ArrayList;
import java.util.List;

import lt.vtvpmc.oop.practice.Account;
import lt.vtvpmc.oop.practice.Bank;
import lt.vtvpmc.oop.practice.FeeCollector;

public class MyBank extends Bank  {

	private List<MyAccount> accounts;

	public MyBank() {
		accounts =new ArrayList<>();
		
	}

	
	
	private MyAccount postProcessAccount(MyAccount account) {
		
		return account;
	}



	



	

}

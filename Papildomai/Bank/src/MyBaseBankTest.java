import lt.vtvpmc.oop.practice.Bank;

import lt.vtvpmc.oop.practice.BaseBankTest;

public class MyBaseBankTest extends BaseBankTest {

	public MyBaseBankTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Bank getBank() {
		// TODO Auto-generated method stub
		return new MyBank();
	}

}

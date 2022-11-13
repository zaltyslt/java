import lt.vtvpmc.oop.practice.*;
public class Main {

	public static void main(String[] args) {
		MyBank mybank = new MyBank();
		MyAccount account1 = new MyAccount("001", 100);
		mybank.openAccount();
		account1.deposit(100);
		mybank.openAccount();

	}

}

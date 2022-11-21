package tobechanged;

import java.math.BigDecimal;

public class AppMain {
    public static void main(String[] args) {
        MyDebitAccount myAccount = new MyDebitAccount("1","As");

//        System.out.println(new BigDecimal(5).compareTo(new BigDecimal(0)));

        System.out.println(myAccount.getBalance());
        myAccount.deposit(new BigDecimal(10));
        System.out.println(myAccount.getBalance());
    }
}

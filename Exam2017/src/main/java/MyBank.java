import lt.itakademija.exam.*;

public class MyBank implements Bank {
    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {

        return new Customer(new SequenceGenerator().getNext(),personCode,personName);
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        return new Account(new SequenceGenerator().getNext(),customer,currency,new Money(0));
    }

    @Override
    public Operation transferMoney(Account account, Account account1, Money money) {
        if(account.getBalance().isLessThan(money)){
            throw new InsufficientFundsException("No enough funds.");
        }
       // account.
        return null;
    }

    @Override
    public Money getBalance(Currency currency) {
        return null;
    }
}

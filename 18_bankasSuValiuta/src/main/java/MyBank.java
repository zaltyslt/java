import lt.itakademija.exam.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyBank implements Bank {
    private Map<PersonCode, Customer> customers;
    private SequenceGenerator customerSequence;
    private SequenceGenerator operationsSequence;
    private CurrencyConverter myCurrencyConverter;

    public MyBank(CurrencyConverter myCurrencyConverter) {
        customers = new HashMap<>();
        customerSequence = new SequenceGenerator();
        operationsSequence = new SequenceGenerator();
        this.myCurrencyConverter = myCurrencyConverter;
    }

    @Override

    public Customer createCustomer(PersonCode personCode, PersonName personName) {
        if (customers.containsKey(personCode)) {
            throw new CustomerCreateException("Customer " + personName.getName() + " " + personName.getSurname() + " already exists ");
        }
        if (personCode == null || personName.getName() == null || personName.getSurname() == null)
            throw new NullPointerException();

        Customer tempCustomer = new Customer(customerSequence.getNext(), personCode, personName);
        customers.put(personCode, tempCustomer);
        return tempCustomer;
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        if (!this.customers.containsValue(customer)) {
            throw new AccountCreateException("Customer " + customer.getPersonName() + " does not belong to this bank");
        }
        if (customer == null || currency == null) throw new NullPointerException();

        Account tempAccount = new Account(new SequenceGenerator().getNext(), customer, currency, new Money(0));
        customer.addAccount(tempAccount);
        return tempAccount;

    }

    @Override
    public Operation transferMoney(Account account, Account account1, Money money) {

        Operation tempOperation;
        Money tempMoney = null;

        if (!account.getCurrency().equals(account1.getCurrency())) {
            tempMoney = myCurrencyConverter.convert(account.getCurrency(), account1.getCurrency(), money);
        } else {
            tempMoney = money;
        }

        try {
            if ((account.getBalance().substract(tempMoney)).isLessThan(new Money(0))) {
                System.out.println("Balance bad" + account.getBalance() + "; money" + money);
                throw new InsufficientFundsException("");
            }
            account.setBalance(account.getBalance().substract(money));
            account1.setBalance(account1.getBalance().add(tempMoney));
        }

        finally {
            tempOperation = new Operation(operationsSequence.getNext(), account, account1, money);
        }

        return tempOperation;
    }

    @Override
    public Money getBalance(Currency currency) {
        Money balance = new Money(0);

        for (var customer : customers.entrySet()) {

                for (Account account : customer.getValue().getAccounts()) {
                    if (account.getCurrency().equals(currency)) {
                     balance = balance.add(account.getBalance());
                    }else{
                        balance =  balance.add(myCurrencyConverter.convert(account.getCurrency(),currency,account.getBalance()));
                    }
                }
        }
        return balance;
    }
}

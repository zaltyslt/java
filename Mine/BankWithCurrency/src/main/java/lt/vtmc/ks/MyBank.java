package lt.vtmc.ks;

import lt.itakademija.exam.*;
import lt.itakademija.exam.Currency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Atlieka bankines operacijas, implementuoja Bank.
 */
public class MyBank implements Bank {
    /**
     *Duomenų išvedimui į konsolę.
     */
    public static final Logger logger = LoggerFactory.getLogger(MyBank.class);
    /**
     * SequenceGenerator instance customer id generavimui.
     */
    SequenceGenerator customerIdGenerator;
    /**
     * SequenceGenerator instance acount id generavimui.
     */
    SequenceGenerator accountIdGenerator;
    /**
     * SequenceGenerator instance operation id generavimui.
     */
    SequenceGenerator operationIdGenerator;
    /**
     * CurrencyConverter instance
     */
    CurrencyConverter currencyConverter;
    /**
     * Custommers list
     */
    Map<PersonCode, Customer> customers;

    /**
     *
     * @param currencyConverter Objekto sukūrimui būtinas CurrencyConverter objektas.
     */
    public MyBank(CurrencyConverter currencyConverter) {
        this.customerIdGenerator = new SequenceGenerator();
        this.accountIdGenerator = new SequenceGenerator();
        this.operationIdGenerator = new SequenceGenerator();
        this.currencyConverter = currencyConverter;
        this.customers = new HashMap<>();
    }

    /**
     * Atlieka vartotojo duomenų verifikaciją, dubliavimo kontrolę. Sukurtas vartotojos patalpinamas į vartotojų DB.
     * @param personCode "asmens" kodas.
     * @param personName objektas saugantis vartotojo vardą ir pavardę.
     * @return new Customer.
     * @throws CustomerCreateException kai vartotojas egzistuoja.
     * @throws NullPointerException kai pateikti blogi duomenys vartotojo skūtimui.
     */
    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {
        if (personCode == null || personName == null) {
            throw new NullPointerException("Person code can't be null");
        }

        if (customers.containsKey(personCode)) {
            throw new CustomerCreateException("This user already created.");
        }

        Customer customer = new Customer(customerIdGenerator.getNext(), personCode, personName);

        customers.put(personCode, customer);
        return customer;
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        if (customer == null || currency == null) {
            throw new NullPointerException("Customer can't be null.");
        }
        if (!customers.containsValue(customer)) {
            throw new AccountCreateException("Can't create account for non existing customer.");
        }
//        logger.info("{}", customer);

        Account account = new Account(accountIdGenerator.getNext(), customer, currency, new Money("0"));
        customer.addAccount(account);
        return account;
    }

    @Override
    public Operation transferMoney(Account account, Account account1, Money money) {
        if (currencyConverter.convert(account.getCurrency(), account1.getCurrency(), money) == null) {
            throw new CurrencyConversionException("Can't convert this pair.");
        }

        if(account.getBalance().isLessThan(money)){
            throw new InsufficientFundsException(" Not enough funds for this operation.");}


        if (account.getCurrency() != account1.getCurrency()) {
            account1.setBalance(
                    account1.getBalance()
                            .add(currencyConverter.convert(account.getCurrency(), account1.getCurrency(), money)));
            }else{
            account1.setBalance(account1.getBalance().add(money));
        }

        account.setBalance(account.getBalance().substract(money));

       return new Operation(operationIdGenerator.getNext(), account, account1, money);

    }

    @Override
    public Money getBalance(Currency currency) {
       Money totalBankBalance = new Money(0);

       for(Customer customer : customers.values()){

            for(Account account : customer.getAccounts()){

                if(!currency.equals(account.getCurrency())){
                totalBankBalance = totalBankBalance.add(this.currencyConverter.convert(account.getCurrency(), currency, account.getBalance()));
//                logger.info("Cur {}, cur {} balance {}, converted {}", currency, account.getCurrency(), account.getBalance(), currencyConverter.convert(currency, account.getCurrency(),account.getBalance()));
                }else{
                    totalBankBalance = totalBankBalance.add(account.getBalance());
                }
            }
       }

       return totalBankBalance;
    }
}

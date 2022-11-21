package tobechanged;

import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.*;

public class MyBank implements Bank {

    private Map<String, Account> accounts;

    private BigDecimal totalReserves;
    private int accountNumbersSequence;

    public MyBank() {
        this.totalReserves = BigDecimal.valueOf(0);
        accounts = new HashMap<>();
        accountNumbersSequence = 0;
    }

    @Override
    public int getNumberOfAccounts() {
        return this.accounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        return totalReserves;
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return this.accounts;
    }

    @Override
    public Account openDebitAccount(String holderName) {
        int accountNumber = Integer.toString(accountNumbersSequence++);
        accounts.put()
        return new MyDebitAccount(Integer.toString(accountNumber), holderName);

    }

    @Override
    public Account openCreditAccount(String s, BigDecimal amount) {
        int accountNumber = accountNumbersSequence++;

        return new MyCreditAccount(Integer.toString(accountNumber), holderName,amount);
    }

    @Override
    public Account getAccountByHolderName(String s) {
        return null;
    }

    @Override
    public Account getAccountByNumber(String s) {
        return null;
    }

    @Override
    public void closeAccount(Account account) {

    }
}

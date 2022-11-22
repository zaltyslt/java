package lt.vtmc.ks.bank.logic;

import ibank.Account;
import ibank.Bank;
import lt.vtmc.ks.bank.account.MyCreditAccount;

import java.math.BigDecimal;
import java.util.*;

public class MyBank implements Bank {

    private ArrayList<Account> accounts;

//    private BigDecimal totalReserves;
    private int accountNumbersSequence;

    public MyBank() {
//        this.totalReserves = BigDecimal.valueOf(0);
        accounts = new ArrayList<>();
        accountNumbersSequence = 0;
    }

    @Override
    public int getNumberOfAccounts() {

        return this.accounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {

        return accounts.stream().map(Account::getBalance).reduce(BigDecimal.ZERO,BigDecimal::add);
    }

    @Override
    public Collection<Account> getAllAccounts() {

        return this.accounts;
    }

    @Override
    public Account openDebitAccount(String holderName) {
        int accountNumber = accountNumbersSequence++;

        return openCreditAccount(holderName, new BigDecimal(0));
    }

    @Override
    public Account openCreditAccount(String holderName, BigDecimal amount) {

        if(accounts.stream().map(Account::getHolderName).filter(holderName::equals).findFirst().isEmpty()) {
            int accountNumber = accountNumbersSequence++;
            Account newAccount = new MyCreditAccount(Integer.toString(accountNumber), holderName, amount);
            accounts.add(newAccount);

            return newAccount;
        }
        return null;
    }

    @Override
    public Account getAccountByHolderName(String name) {
       return accounts.stream().filter(a -> a.getHolderName().equals(name))
                .findFirst()
                .get();

    }

    @Override
    public Account getAccountByNumber(String number) {
        return accounts.stream().filter(n -> n.getNumber().equals(number))
                .findFirst()
                .get();
    }

    @Override
    public void closeAccount(Account account) {
        if((account != null) && (accounts.contains(account))){
            accounts.remove(account);
        }
    }
}

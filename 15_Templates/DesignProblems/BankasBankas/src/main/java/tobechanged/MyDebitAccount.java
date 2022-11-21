package tobechanged;

import ibank.Account;

import java.math.BigDecimal;

public class MyDebitAccount implements Account {

    private String accountNumber;
    private String holderName;
    private BigDecimal ballance;

    public MyDebitAccount(String accountID, String holderName) {
        this.accountNumber = accountID;
        this.holderName = holderName;
        this.ballance = BigDecimal.valueOf(0);
    }

    @Override
    public String getNumber() {
        return this.accountNumber;
    }

    @Override
    public String getHolderName() {
        return this.holderName;
    }

    @Override
    public BigDecimal getBalance() {
        return this.ballance;
    }

    @Override
    public boolean deposit(BigDecimal amount) {
        //1 daugiau, 0 lygu, -1 maziau
        if((amount!= null)&&( amount.compareTo(new BigDecimal(0))) >0 ){
            BigDecimal tempBalance = this.ballance.add(amount);
           this.ballance = tempBalance;
            return true;
        }

        return false;
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
//1 daugiau, 0 lygu, -1 maziau
        if((amount!= null)&&(( amount.compareTo(new BigDecimal(0))) >0)
                          &&( this.ballance.compareTo(amount) >=0) ){
            BigDecimal tempBalance = this.ballance.subtract(amount);
            this.ballance = tempBalance;
            return true;
        }


        return false;
    }
}

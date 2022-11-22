package lt.vtmc.ks.bank.account;

import java.math.BigDecimal;

public class MyCreditAccount extends MyDebitAccount{
    private BigDecimal limit;

    public MyCreditAccount(String accountID, String holderName, BigDecimal limit) {
        super(accountID, holderName);
        this.limit = limit.negate();
    }
    @Override
    public boolean withdraw(BigDecimal amount) {
        if ((amount != null) && (amount.compareTo(BigDecimal.ZERO) > 0)
                && ((super.getBalance().subtract(amount).compareTo(this.limit) >= 0))) {

            BigDecimal tempBalance = super.getBalance().subtract(amount);
            this.setBalance(tempBalance);

            return true;
        }
        return false;
    }
}

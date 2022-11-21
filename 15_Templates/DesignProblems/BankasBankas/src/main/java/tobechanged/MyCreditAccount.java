package tobechanged;

import java.math.BigDecimal;

public class MyCreditAccount extends MyDebitAccount{
    private BigDecimal limit;

    public MyCreditAccount(String accountID, String holderName, BigDecimal limit) {
        super(accountID, holderName);
        this.limit = limit;
    }
}

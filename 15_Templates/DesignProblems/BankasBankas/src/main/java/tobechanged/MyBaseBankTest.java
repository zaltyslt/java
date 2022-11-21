package tobechanged;

import ibank.Bank;
import ibank.BaseBankTest;

public class MyBaseBankTest extends BaseBankTest {

    @Override
    protected Bank createBank() {
        return new MyBank();
    }
}

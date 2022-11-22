package test;

import ibank.Bank;
import ibank.BaseBankTest;
import lt.vtmc.ks.bank.logic.MyBank;

public class MyBaseBankTest extends BaseBankTest {

    @Override
    protected Bank createBank() {
        return new MyBank();
    }
}

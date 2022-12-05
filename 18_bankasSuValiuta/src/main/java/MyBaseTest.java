import lt.itakademija.exam.*;
import lt.itakademija.exam.test.BaseTest;
import lt.itakademija.exam.CurrencyRatesProvider;

public class MyBaseTest extends BaseTest {

    @Override
    protected Bank createBank(CurrencyConverter currencyConverter) {
        return new MyBank(currencyConverter);
    }

    @Override
    protected CurrencyConverter createCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        return new MyCurrencyConverter(currencyRatesProvider);
    }
}

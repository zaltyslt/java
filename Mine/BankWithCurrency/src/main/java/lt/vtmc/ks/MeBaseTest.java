package lt.vtmc.ks;

import lt.itakademija.exam.Bank;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.test.BaseTest;

/**
 * Paleidžia kontrolinio testus
 */
public class MeBaseTest extends BaseTest {
    /**
     * createBank metodo aprašymas
     * @param currencyConverter CurrencyConverter instance - gaunama iš kontrolinio užduoties
     * @return MyBank objektą, MyBank klasė implementuoja Bank klasę
     */
    @Override
    protected Bank createBank(CurrencyConverter currencyConverter) {
        return new MyBank(currencyConverter);
    }

    /**
     * createCurrencyConverter metodo aprašymas
     * @param currencyRatesProvider instance - gaunama iš kontrolinio užduoties
     * @return MyCurrencyConverter objektą, MyCurrencyConverter implementuoja CurrencyConverter.
     */
    @Override
    protected CurrencyConverter createCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        return new MyCurrencyConverter(currencyRatesProvider);
    }
}

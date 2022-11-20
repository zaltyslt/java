import lt.itakademija.exam.Currency;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.CurrencyRatesProvider.CurrencyPair;
import lt.itakademija.exam.Money;

public class MyCurrencyConverter implements CurrencyConverter {
    private CurrencyPair currencyPair;
    private double rate;

    public MyCurrencyConverter(CurrencyPair currencyPair, Money exchangeRate) {
        this.currencyPair = currencyPair;
    }

    @Override
    public Money convert(Currency currency, Currency currency1, Money money) {
        if(!currency.equals(currency1)){
//           new CurrencyRatesProvider().getRate(currency,currency1);
//           new CurrencyRatesProvider(new Curr)
        }

        return money;
    }
}

import lt.itakademija.exam.Currency;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.Money;

public class AppMain {

    public static void main(String[] args) {
Money eurToUsd = new Money(0.9);

        Currency eur = new Currency("EUR");
        Currency usd = new Currency("USD");
        CurrencyRatesProvider.CurrencyPair pair = new CurrencyRatesProvider.CurrencyPair(eur,usd);
        CurrencyConverter currencyConverter = new MyCurrencyConverter();
        Money converted = currencyConverter.convert(eur,usd,new Money(10));
//        System.out.println(money1);
//        System.out.println(money2);

    }
}

import lt.itakademija.exam.*;
import lt.itakademija.exam.CurrencyRatesProvider.CurrencyPair;

import java.util.HashMap;
import java.util.Map;

public class MyCurrencyConverter implements CurrencyConverter {
   CurrencyRatesProvider currencyRatesProvider ;
//    private Map<CurrencyRatesProvider.CurrencyPair,Money> ratesMap;



    public MyCurrencyConverter(CurrencyRatesProvider currencyRatesProvider ){
       this.currencyRatesProvider = currencyRatesProvider;
    }
      @Override

      public Money convert(Currency currency, Currency currency1, Money money) {

        if(currencyRatesProvider.getRate(currency,currency1) == null){
            throw new CurrencyConversionException("");
        }

          return currencyRatesProvider.getRate(currency,currency1).multiply(money);

    }
}

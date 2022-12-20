/**
 * @Description Pagrindinis egzamino package
 */
package lt.vtmc.ks;

import lt.itakademija.exam.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Konvertuoja valiutą, pagal CurrencyRatesProvider pateiktą kursą.
 **/
public class MyCurrencyConverter implements CurrencyConverter {
    /**
     *duomenų išvedimui į konsolę.
     */
    public static final Logger logger = LoggerFactory.getLogger(MyCurrencyConverter.class);
    /**
     * Lokali CurrencyRatesProvider instance.
     */
    private CurrencyRatesProvider currencyRatesProvider;

    /**
     * @param currencyRatesProvider CurrencyRatesProvider instance
     */
    public MyCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        this.currencyRatesProvider = currencyRatesProvider;
    }

    /**
     *
     * @param currencyFrom konvertuojama valiuta
     * @param currencyTo valiuta i kurią konvertuojama
     * @param money konvertuojamos valiutos kiekis (type Money)
     * @return valiutos kiekį po konvertavimo (type Money)
     */
    @Override
    public Money convert(Currency currencyFrom, Currency currencyTo, Money money) {



        if(currencyRatesProvider.getRate(currencyFrom,currencyTo )== null){
            throw new CurrencyConversionException("Can't convert this pair");
        }

        return money.multiply(currencyRatesProvider.getRate(currencyFrom,currencyTo));
    }
}

package lt.vtmc.ks;
import lt.itakademija.exam.Currency;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.Money;
import lt.vtmc.ks.MyCurrencyConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Klasė su unit testais, testuoja MyCurrencyConverter objektą.
 */
public class MyTest {
    CurrencyConverter myCurrencyConverter;

    /**
     * prieš kiekvieną testą sukuria MyCurrencyConverter objektą su dviem valiutų porom.
     */
    @BeforeEach
    void setup() {
        Map<CurrencyRatesProvider.CurrencyPair, Money> myCurrencyMap = new HashMap<>();
        myCurrencyMap.put(new CurrencyRatesProvider.CurrencyPair(
                new Currency("curA"),
                new Currency("curB")),
                new Money(0.5));
        myCurrencyMap.put(new CurrencyRatesProvider.CurrencyPair(
                new Currency("curB"),
                new Currency("curA")),
                new Money(2));

        CurrencyRatesProvider myCurrencyRatesProvider = new CurrencyRatesProvider(myCurrencyMap);
         myCurrencyConverter = new MyCurrencyConverter(myCurrencyRatesProvider);
    }


    /**
     * Tikrina ar valiuta konvertuojama teisingai
     */
    @Test
    @DisplayName("Convert method test")
    void convertMethodTest(){
     Currency a = new Currency("curA");
     Currency b = new Currency("curB");

        assertAll(
                ()->  assertEquals(new Money(10),myCurrencyConverter.convert(
                        a, b, new Money(20) ), "I test a"),

                ()->  assertEquals(new Money(10),myCurrencyConverter.convert(
                        b, a, new Money(5) ), "I test b")
       );
    }
}

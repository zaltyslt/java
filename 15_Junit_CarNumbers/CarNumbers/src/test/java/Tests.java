package lt.vtmc.ks;

import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Tests {
    CarNumberPricingCalculator numberCalc;

    @BeforeEach
    void init() {
        numberCalc = new CarNumberPricingCalculator();
    }

    @Test
    @Tag("Input")
    @DisplayName("Checks for bad input to deny bad values")
    void calculatePricePassedNullValueTest() {

       assertAll(
               ()->assertThrows(IllegalArgumentException.class, () -> numberCalc.calculatePrice(null), "Number shouldn't be null"),
               ()->assertThrows(IllegalArgumentException.class, () -> numberCalc.calculatePrice(""), "Number shouldn't be empty"),
               ()->assertThrows(IllegalArgumentException.class, () -> numberCalc.calculatePrice("aaaaaaa"),"Number shouldn't exceed 6 symbols")
       );
    }

    @Test
    @DisplayName("Checks for correct exception message")
    @Tag("Input")
    void calculatePriceRightExceptionMessageTest() {
        Exception expectedException = assertThrows(IllegalArgumentException.class, () -> numberCalc.calculatePrice(null));
        assertEquals(expectedException.getLocalizedMessage(), "Incorrect plate number format. Must be 1-6 symbols latin letters and number combination");
    }

    @Test
    @DisplayName("Checks if equal letters recognised correctly")
    @Tag("Combination")
    void areAllLettersTest() {
        assertAll(
                ()-> assumeTrue( numberCalc.areAllLetters("ABA000"),"ABA000"),
                ()-> assumeFalse( numberCalc.areAllLetters("A1A000"), "A1A000"),
                ()-> assumeFalse( numberCalc.areAllLetters("000000"), "000000"),
                ()-> assumeTrue(  numberCalc.areAllLetters("AAA000"), "AAA000")
        );
    }
@Test
    @DisplayName("Checks if equal numbers are recognised correctly")
    @Tag("Combination")
    void areAllNumbersTest() {
        assertAll(
                ()-> assumeFalse( numberCalc.areAllNumbers("QQQ1AA"), "QQQ1AA"),
                ()-> assumeFalse( numberCalc.areAllNumbers("QQQ1A1"), "QQQ1A1"),
                ()-> assumeFalse( numberCalc.areAllNumbers("QQQAAA"), "QQQAAA"),
                ()-> assumeTrue(  numberCalc.areAllNumbers("QQQ000"), "QQQ000")
        );
    }
    @Test
    @DisplayName("Checks if special combinations are recognised correctly")
    @Tag("Combination")
    void isCombinationSpecialTest() {
        assertAll(
                ()->assumeTrue(numberCalc.isCombinationSpecial("GOD"),"GOD"),
                ()->assumeTrue(numberCalc.isCombinationSpecial("KLR"),"KLR"),
                ()->assumeTrue(numberCalc.isCombinationSpecial("GOD"),"GOD"),
                ()->assumeTrue(numberCalc.isCombinationSpecial("001"),"001"),
                ()->assumeTrue(numberCalc.isCombinationSpecial("666"),"666")
        );
    }
    @Test
    @DisplayName("Checks if personalised number recognised correctly")
    @Tag("Combination")
    void  isNumberPersonalisedTest() {
        assertAll(
                ()->assumeTrue(numberCalc.isNumberPersonalised("KESTAS"),"KESTAS"),
                ()->assumeFalse(numberCalc.isNumberPersonalised("GOD111"),"GOD111"),
                ()->assumeTrue(numberCalc.isNumberPersonalised("GOD"),"GOD"),
                ()->assumeTrue(numberCalc.isNumberPersonalised("GODGOD"),"GODGOD"),
                ()->assumeTrue(numberCalc.isNumberPersonalised("01"),"01"),
                ()->assumeTrue(numberCalc.isNumberPersonalised("01AAA"),"01AAA")

        );
    }
    @Test
    @DisplayName("Check if price for number calculated right")
    @Tag("Calculation")
    void calculatePriceTest(){
        assertAll(
                ()->assertEquals(50,numberCalc.calculatePrice("NVS962"),"Given regular number"),
                ()->assertEquals(1_000,numberCalc.calculatePrice("NNN962"),"Given number with equal letters"),
                ()->assertEquals(1_000,numberCalc.calculatePrice("NVS999"),"Given number with equal numbers"),
                ()->assertEquals(5_000,numberCalc.calculatePrice("NNN999"),"Given number with equal letters and numbers"),
                ()->assertEquals(2_000,numberCalc.calculatePrice("GOD100"),"Given number with special combination of letters"),
                ()->assertEquals(7_000,numberCalc.calculatePrice("GOD999"),"Given number with special combination of letters and numbers")


        );
    }
}



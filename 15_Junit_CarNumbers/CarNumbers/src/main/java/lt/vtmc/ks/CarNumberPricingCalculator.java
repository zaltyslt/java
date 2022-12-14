package lt.vtmc.ks;

import java.util.ArrayList;
import java.util.Arrays;

class CarNumberPricingCalculator {


    /**
     * Naudojam TDD
     * Kursime programą Regitrai, kuri turi paskaičiuoti kainą pagal
     * pageidautiną automobilio numerį.
     * Kainų politika yra tokia:
     * Jeigu visos trys raidės yra vienodos, arba jeigu
     * visi trys skaičiai vienodi arba
     * "001","666" - numerio kaina 1000 eur.
     * <p>
     * Jeigu trys raidės vienodos IR trys
     * skaičiai vienodi - numerio kaina 5000 EUR.
     * Jeigu raidžių rinkinys yra vienas iš "GOD", "KLR", "BOS" numerio kaina 2000 EUR.
     *
     * Jeigu prie aukščiau minėto raidžių rinkinio pridėsime tris vienodus skaičius - 7000 EUR.
     * Jeigu numeris yra ne iš trijų simbolių ir trijų skaičių (1-6 simboliai)
     * jis yra vardinis - kaina 10 000 EUR.
     * <p>
     * Jei skaičiuoklei paduodamas blogo formato numeris - turi mesti
     * IllegalArgumentException su pranešimu - "Incorrect plate number format. Must be 1-6 symbols
     * latin letters and number combination" mažosiomis ir d
     * <p>
     * P.S. NIEKADA realiose sistemose nenaudokite float/double
     * pinigų ir kitoms tikslioms operacijoms tam naudokite BigDecimal tipą!
     */

    //testo metodo pvz.:
    //@Test
    // public void testAllNumbersAndLettersAreTheSameCost5000() {
    //	assertEquals(new Double(5000.0), priceCalc.calculatePrice("AAA111"));
    //}
    private ArrayList<String> combinations = new ArrayList<>(Arrays.asList("001", "666", "GOD", "KLR", "BOS"));

    public double calculatePrice(String number) {
        double numberPrice = 50.0;
        String firstGroup, secondGroup;
        if (number == null || number.isEmpty() || number.length() > 6) {
            throw new IllegalArgumentException("Incorrect plate number format. Must be 1-6 symbols latin letters and number combination");
        }
        if(areSymbolsTheSame(number.substring(0,3)) || areSymbolsTheSame(number.substring(3,6)) && !isCombinationSpecial(number.substring(0,3)) ) {
            if(areSymbolsTheSame(number.substring(0,3)) && areSymbolsTheSame(number.substring(3,6))){
                return 5_000.0;
            }
            return 1_000.0;}

        if(isCombinationSpecial(number.substring(0,3))){
            if(areSymbolsTheSame(number.substring(3,6))){
                return 7_000;
            }
            return 2_000;
        }

        if(isNumberPersonalised(number)){ return 10_000.0;}
        return 50.0;
    }

    public boolean areAllLetters(String number) {
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean areAllNumbers(String number) {
        for (int i = 3; i < 6; i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean areSymbolsTheSame(String number) {
        for (int i = 0; i < 2; i++) {
            if (number.charAt(2) != number.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isCombinationSpecial(String threeSymbols) {
        if (this.combinations.contains(threeSymbols)) {
            return true;
        }
        return false;
    }

    public boolean isNumberPersonalised(String number) {

        if(number.length() < 6){return true;}

        return !areAllLetters(number) || !areAllNumbers(number);
    }

}
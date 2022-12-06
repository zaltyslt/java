package lt.vtmc;

import lt.techin.municipality.Person;
import lt.techin.municipality.TaxCalculator;
import lt.techin.municipality.TaxRateProvider;

public class MyTaxCalculator implements TaxCalculator {
private TaxRateProvider taxRateProvider;
    public MyTaxCalculator(TaxRateProvider taxRateProvider) {
        this.taxRateProvider = taxRateProvider;
    }

    @Override
    public double calculateTax(Person person) {

        return taxRateProvider.getTaxRate(person.getYearlyIncome())/100 * person.getYearlyIncome();
    }
}

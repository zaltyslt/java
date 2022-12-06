package lt.vtmc;

import lt.techin.municipality.*;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MyMunicipality implements Municipality {

    private TaxCalculator taxCalculator;
    List<Person> citizens = new ArrayList<>();
    public MyMunicipality(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    @Override
    public void registerCitizen(Person person) throws IllegalCitizenException {
        if (person == null
                || person.getDateOfBirth() ==null
                || person.getFirstName() == null
                || person.getLastName() == null
//              || person.getFirstName().equals("")
//              || person.getLastName().equals("")
                || person.getYearlyIncome() <0
                || person.getDateOfBirth().isAfter(LocalDate.now())

        ) {
                    throw new IllegalCitizenException(person);
        }

        if(!isRegisteredCitizen(person)){
         this.citizens.add(person);
        }
    }

    @Override
    public int getCitizenCount() {

        return citizens.size();
    }

    /**
     * Paskaičiuoja vidutines citizen pajamas
     * @return double
     */
    @Override
    public double getAverageCitizenIncome() {

       return this.citizens.stream().mapToDouble(Person::getYearlyIncome).summaryStatistics().getAverage();


    }

    @Override
    public boolean isRegisteredCitizen(Person person) {
        return this.citizens.contains(person);
    }

    @Override
    public Person findOldestPerson() {
        Person oldestPerson = null;
        LocalDate date = LocalDate.now();
        for(Person person: citizens ){
            if(person.getDateOfBirth().compareTo(date) <0){
                date = person.getDateOfBirth();
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    @Override
    public int countAdultCitizens() {
       LocalDate date = LocalDate.now().minusYears(18);
//        int count = 0;
//        for(Person citizen : citizens){
//
//
//        }
        return (int) citizens.stream().filter(c->c.getDateOfBirth().compareTo(date) <0).count();



    }

    @Override
    public double totalIncomeInTaxes() {
       double total = 0;
        for(Person citizen:citizens){
           total += taxCalculator.calculateTax(citizen);
       }
        return total;
    }

    @Override
    public Collection<Person> findCitizensBy(PersonPredicate personPredicate) {
        return citizens.stream().filter(p->personPredicate.test(p)).toList();
    }

    @Override
    public Collection<Person> getOrderedCitizens() {
        citizens = citizens.stream()
                .sorted(Comparator
                .comparing(Person::getLastName)
                .thenComparing(Person::getFirstName))
               .toList();

        return citizens;

    }

    @Override
    public Map<Integer, List<Person>> groupByYearOfBirth() {
//        HashMap<Integer, List<Person>> byYears = new HashMap<>();
//        for(Person citizen: citizens){
//            int year = citizen.getDateOfBirth().getYear();
//            if(byYears.containsKey(year)){
//                List<Person> tempList = byYears.get(year);
//                tempList.add(citizen);
//                byYears.put(year,tempList);
//            }
//        }
//
//        return byYears;
          return citizens.stream().collect(Collectors.groupingBy(c->c.getDateOfBirth().getYear()));

//        Map<String, List<Dog>> map = dogs.stream()
//                .collect(Collectors.groupingBy(d -> d.map.get("Breed")));

    }
}

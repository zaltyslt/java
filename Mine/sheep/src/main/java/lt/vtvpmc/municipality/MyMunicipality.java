package lt.vtvpmc.municipality;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class MyMunicipality implements Municipality {
   Map<Integer, Person> citizens;

    public MyMunicipality() {
        this.citizens = new HashMap<>();
    }

    @Override
    public void registerCitizen(Person person) throws IllegalCitizenException {
        LocalDate today = LocalDate.now();
//        Has no first name (or the name is empty)
//        Has no last name (or the name is empty)
//        Has no birthdate
//        Has birthdate in the future
//        Has negative income
//        System.out.println("ex1 " +
//                person.getFirstName() +" "+
//                person.getLastName() +" "+
//                person.getDateOfBirth()+" "+
//                person.getYearlyIncome()
//        );


        if((person.getFirstName() == null ||
                person.getLastName() == null ||
                person.getDateOfBirth() == null ||
           person.getFirstName().isEmpty() ||
           person.getLastName().isEmpty() ||
           person.getYearlyIncome() < 0 ||
                !(today.compareTo(person.getDateOfBirth()) > 0)     )    ){
//            System.out.println("Illegal " +
//                    person.getFirstName() +" "+
//                    person.getLastName() +" "+
//                    person.getDateOfBirth()+" "+
//                    person.getYearlyIncome()
//            );
            throw new IllegalCitizenException(person);
        } else{
            if(isRegisteredCitizen(person)){
//                System.out.println("This citizen is already registered");
            }
                citizens.put(person.hashCode(), person);

        }
    }

    @Override
    public boolean isRegisteredCitizen(Person person) {
//        System.out.println(person.getFirstName()+ " is registered "+ citizens.containsKey(person.hashCode()));
        return citizens.containsKey(person.hashCode());
    }

    @Override
    public Person findOldestPerson() {
        Collection<Person> citizensValues = citizens.values();
       Person oldMan = citizensValues.stream().min(Comparator.comparing(Person::getDateOfBirth)).get();
        System.out.println(oldMan.getDateOfBirth());
       return oldMan;
//        return friends.stream().sorted(Comparator.comparing(Friend::getCity)
//                        .thenComparing(Friend::getLastName)
//                        .thenComparing(Friend::getFirstName))
//                .toList();
    }

    @Override
    public double totalIncomeInTaxes() {
        /*
        * Returns total yearly tax income for municipality.
        * Taxes earned are calculated by taking 15% of every citizens yearly income.
        * Few exceptions apply:
            Citizens with yearly income bellow 14 000 euros are not taxed.
            Citizens who earn above 1 million a year, pay 16% tax on all of their income.

         */
        Collection<Person> citizensValues = citizens.values();
        citizensValues.forEach(s -> System.out.println(s.getFirstName() +" "+ s.getYearlyIncome()));
        double taxable16Percent = citizensValues.stream()
                .mapToDouble(Person::getYearlyIncome)
                .filter(x-> x> 1_000_000)
                .map(x->x*0.16)
                .sum();
        double taxable15Percent = citizensValues.stream()
                .mapToDouble(Person::getYearlyIncome)
                .filter(x->x <= 1_000_000)
                .filter(x-> x>= 14_000)
                .map(x->x*0.15)
                .sum();
        return taxable15Percent + taxable16Percent;

    }

    @Override
    public int getCitizenCount() {

        return citizens.size();
    }
}

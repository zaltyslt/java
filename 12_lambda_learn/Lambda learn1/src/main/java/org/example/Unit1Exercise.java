package org.example;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Predicate;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 41),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 49)
        );

//        Step 1. Sort list by last name
        Comparator<Person> myPersonComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        };

//        Collections.sort(people,myPersonComparator);
        Collections.sort(people, (a, b) -> a.getLastName().compareTo(b.getLastName()));

//        printList(people);

        Predicate<Person>  condition1 = person -> person.getFirstName().startsWith("C");
        Predicate<Person> condition2 = person -> person.getLastName().startsWith("C");
        Predicate<Person> condition3 = person -> true;
        Consumer<Person> doThat = person -> System.out.println(person);



        System.out.println();
        performConditionally(people, condition1, doThat);
        System.out.println();
        performConditionally(people, condition2, doThat );
        System.out.println();
        performConditionally(people, condition3, doThat );


        DoubleUnaryOperator doubleUnaryOperator = (dbl)-> dbl * 2;
        doubleOperator(2.0, doubleUnaryOperator);

    }

    private static double doubleOperator(double dbl, DoubleUnaryOperator doubleUnaryOperator) {
        return doubleUnaryOperator.applyAsDouble(dbl);
    }

    private static <T>void performConditionally(List<T> peoples, Predicate<T> condition, Consumer<T> consume) {
        for(T person : peoples){
            if(condition.test(person)){consume.accept(person);}
        }
    }


}

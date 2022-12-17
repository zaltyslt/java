package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String[] words = {"lorem", "ipsum", "dolor ", "consectetur", "adipiscing", "gravida", "tellus", "suscipit"};

//        Arrays.sort(words,(x,y)-> x.length()-y.length());
//        logger.info(Arrays.asList(words).toString());
//
//        Arrays.sort(words,(x,y)-> y.length()-x.length());
//        logger.info(Arrays.asList(words).toString());
//
//        Arrays.sort(words,(x,y)-> x.charAt(0)-y.charAt(0));
//        logger.info(Arrays.asList(words).toString());

//        Arrays.sort(words,(x,y)-> x.contains("e")?-1:0);
//        logger.info(Arrays.asList(words).toString());

//        Arrays.sort(words, (s1,s2) -> yourMethod(s1,s2));
//        logger.info(Arrays.asList(words).toString());
        String string1 = "lorem";
        String string2 = "consectetur";
        String longer = betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        String first = betterString(string1, string2, (s1, s2) -> true);
        String second = betterString2(string1, string2, (s1, s2) -> s1.charAt(0) > s2.charAt(0));
        String thirt = betterEntry(string1, string2, (s1, s2) -> s1.charAt(0) > s2.charAt(0));
        Car car1 = new Car(100);
        Car car2 = new Car(200);
        Car car = betterEntry(car1, car2, (c1, c2) -> c1.getPrice() > c2.getPrice());

        Employee employee = betterEntry(new Employee(200), new Employee(150), (e1, e2) -> e1.getSalary() > e2.getSalary());
    }

    private static String betterString2(String s1, String s2, TwoStringPredicate condition) {
        if (condition.test(s1, s2)) {
            return s1;
        }
        return s2;
    }

    private static <T> T betterEntry(T t1, T t2, TwoEntryPredicate<T, T> condition) {
        if (condition.test(t1, t2)) {
            return t1;
        }
        return t2;
    }

    private static String betterString(String word1, String word2, BiPredicate<String, String> condition) {
        if (condition.test(word1, word2)) {
            return word1;
        }

        return word2;

    }

    private static int yourMethod(String string1, String string2) {
        if (string1.contains("e")) {
            return -1;
        }
        return 1;
    }
}

interface TwoStringPredicate {
    boolean test(String s1, String s2);
}

interface TwoEntryPredicate<T, U> {
    boolean test(T t1, U u2);
}

class Car {
    private int price;

    public Car(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
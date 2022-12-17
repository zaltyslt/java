package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtils<T> {

    //    public List<String> allMatches(List<String> list, Predicate<String> condition) {
//        List<String> results = new ArrayList<>();
//        for (String item : list) {
//            if (condition.test(item)) {
//                results.add(item);
//            }
//        }
//        return results;
//    }
    public static <T> List<T> allMatches(List<T> list, Predicate<T> condition) {
        List<T> results = new ArrayList<>();
        for (T item : list) {
            if (condition.test(item)) {
                results.add(item);
            }
        }
        return results;
    }

    public static <T,R> List<R> transformedList(List<T> items, Function<T, R> action) {
        ArrayList<R> resultList = new ArrayList<>();
        for (T item : items) {
            resultList.add(action.apply(item));
        }
        return resultList;
    }
}


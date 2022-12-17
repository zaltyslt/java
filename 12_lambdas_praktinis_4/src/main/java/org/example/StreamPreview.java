package org.example;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamPreview {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");
        String s1 = words.stream()
                .filter(word -> word.contains("o"))
                .findFirst()
                .orElse(null);
        System.out.println(s1);
        String s2 = words.stream()
                .filter(word -> word.length() > 5)
                .findFirst()
                .orElse(null);
        System.out.println(s2);
    }

    public static <T> Predicate<T> allPassPredicate(Predicate<T>... conditions ){

        return new Predicate<T>() {
            @Override
            public boolean test(T t) {
                for (Predicate<T> condition : conditions) {
                    if (!condition.test(t)) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

//    potential heap pollution?
    @SafeVarargs
    public static <T> T firstAllMatch(Stream<T> stream, Predicate<T>... conditions){
        return stream.filter(word -> allPassPredicate(conditions).test(word))
                .findFirst()
                .orElse(null);
    }

public static <T> Predicate<T> anyPassPredicate(Predicate<T>... conditions ){

    return new Predicate<T>() {
        @Override
        public boolean test(T t) {
            for (Predicate<T> condition : conditions) {
                if (condition.test(t)) {
                    return true;
                }
            }
            return false;
        }
    };
}
    @SafeVarargs
    public static <T> T firstAnyMatch(Stream<T> stream, Predicate<T>... conditions){
        return stream.filter(word -> anyPassPredicate(conditions).test( word))
                .findFirst()
                .orElse(null);
    }
}
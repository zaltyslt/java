package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye, 8aaaaaao");
        Predicate<String> pre1 = (word)-> word.contains("o");
        Predicate<String> pre2 = (word)-> word.length() > 5;
        System.out.println(StreamPreview.firstAllMatch(words.stream(), pre1, pre2));
        System.out.println(StreamPreview.firstAnyMatch(words.stream(), pre1, pre2));

        String word1 =
                StreamPreview.firstAllMatch(words.stream(),
                        s -> s.contains("o"),
                        s -> s.length() > 5);
        System.out.println("First word with o and 5+ letters is " + word1);

        String word2 =
                StreamPreview.firstAllMatch(words.stream(),
                        s -> s.contains("o"),
                        s -> s.length() > 8);
        System.out.println("First word with o and 8+ letters is " + word2);

        String word3 =
                StreamPreview.firstAnyMatch(words.stream(),
                        s -> s.contains("o"),
                        s -> s.length() > 5);
        System.out.println("First word with o or 5+ letters is " + word3);

        String word4 =
                StreamPreview.firstAnyMatch(words.stream(),
                        s -> s.contains("o"),
                        s -> s.length() > 8);
        System.out.println("First word with o or 8+ letters is " + word4);

        String word5 =
                StreamPreview.firstAnyMatch(words.stream(),
                        s -> s.contains("q"),
                        s -> s.length() > 8);
        System.out.println("First word with q or 8+ letters is " + word5);


    }
}
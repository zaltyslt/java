package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Make","static","method", "called","transformedList","blue");

        List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 5);
        List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
        List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
        logger.info("1. {}",shortWords);
        logger.info("2. {}",wordsWithB);
        logger.info("3. {}",evenLengthWords);

        List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
        List<Integer> bigNums = StringUtils.allMatches(nums, n -> n>500);
        logger.info("4. {}",bigNums);


        List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
        List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
        List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
        logger.info("5. {}",excitingWords);
        logger.info("6. {}",eyeWords);
        logger.info("7. {}",upperCaseWords);

        List<Integer> wordLengths = StringUtils.transformedList(words, String::length);
        logger.info("8. {}",wordLengths);

    }


}

package com.advent.d03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> charMap = new HashMap<>();
        Queue<String> dublicates = new PriorityQueue<>();
        Integer prioritiesTotal = 0;
//        ArrayList<String> ruckSack = new ArrayList<>(Arrays.asList(
//                "vJrwpWtwJgWrhcsFMMfFFhFp",
//                "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
//                "PmmdzqPrVvPwwTWBwg",
//                "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
//                "ttgJtRGJQctTZtZT",
//                "CrZsJsPPZsGzwwsLwLmpwMDw"));

        ArrayList<String> ruckSack = new ArrayList<>();



        extracted(charMap);
        File file = new File("F:\\desktop\\codedump\\java\\Mine\\advent\\01\\adv1\\src\\main\\resources\\input03.txt");
        try {
           ruckSack.addAll(Files.readAllLines(Paths.get(file.toURI())));

        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < ruckSack.size(); i= i+3){
            String elf1 = ruckSack.get(i);
            String elf2 = ruckSack.get(i+1);
            String elf3 = ruckSack.get(i+2);

            for(int j = 0; j < elf1.length();j++){
                String charAtPosition = String.valueOf(elf1.charAt(j));
                if(elf2.contains(charAtPosition) && elf3.contains(charAtPosition)){
                    dublicates.add(charAtPosition);
                    break;
                }
            }
        }

/**
 * Pirma dalis

        for (String items : ruckSack) {
            String leftCompartment = "";
            String rightCompartment = "";
            int halfItemsLength = items.length() / 2;
            leftCompartment = items.substring(0, halfItemsLength);
            rightCompartment = items.substring(halfItemsLength);
//            System.out.println(leftCompartment + " " + leftCompartment.length());
//            System.out.println(rightCompartment+ " " + rightCompartment.length());
            for (int i = 0; i < halfItemsLength; i++) {
                String charAtPosition = String.valueOf(leftCompartment.charAt(i));
                if (rightCompartment.contains(charAtPosition) && !dublicates.contains(charAtPosition)) {
                    dublicates.add(charAtPosition);
                }
            }
 */

            System.out.println(dublicates);
           while (!dublicates.isEmpty()){
                String element = dublicates.poll();
                prioritiesTotal += charMap.get(element);
            }
        System.out.println(prioritiesTotal);
        }


    private static void extracted(Map<String, Integer> charMap) {
        int priority = 1;
        for (int i = 97; i < 123; i++) {

//            System.out.println(priority++ + " - "+ Character.toString(i));
            charMap.put(Character.toString(i), priority++);
        }
        for (int i = 65; i < 91; i++) {

//            System.out.println(priority++ + " - "+ Character.toString(i));
            charMap.put(Character.toString(i), priority++);
        }
    }
}

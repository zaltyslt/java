package com.advent.d01;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        File file = new File("F:\\desktop\\codedump\\java\\Mine\\advent\\01\\adv1\\src\\main\\resources\\input01.txt");
//        File file = new File(url.getPath());
        System.out.println("current = " + file);
        int thatElf = 0;
        int maxSum = 0;
        List<Integer> elfs = new ArrayList<>();

        try {
            List<String> allLines = Files.readAllLines(Paths.get(file.toURI()));
            int elfsCount = 0;
            int elfCals = 0;
            for (String line : allLines) {
//                System.out.println(i++ + " "+line);
                if (!line.equals("")) {
                    int lineValue = Integer.parseInt(line);
                    elfCals += lineValue;
                } else {
                    elfsCount++;
//                    if (elfCals > maxSum) {
//                        maxSum = elfCals;
//                        thatElf = elfsCount;
//                    }
                    elfs.add(elfCals);
                    elfCals = 0;
                }
            }
            System.out.println("Elves count: " + elfsCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        maxSum = elfs.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .reduce(0, Integer::sum);
        //3 elf cals 213958
        System.out.println("3 elf cals " + maxSum);

//        System.out.println("That elf " + thatElf);
//        System.out.println("Calories" + maxSum);
    }
}
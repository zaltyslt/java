package com.advent.d02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        File file = new File("F:\\desktop\\codedump\\java\\Mine\\advent\\01\\adv1\\src\\main\\resources\\input02.txt");

        System.out.println("current = " + file);
        String a = "A";
        String b = "B";
        String c = "C";
        String x = "A";
        String y = "B";
        String z = "C";
// 1 for Rock, 2 for Paper, and 3 for Scissors
// 0 if you lost, 3 if the round was a draw, and 6 if you won
//        C Z
//        A Y
//        C Z
//        A Y
//        C Y
        Character oponent = null;
        Character me = null;
        Integer sum = 0;
        try {
            List<String> allLines = Files.readAllLines(Paths.get(file.toURI()));
            for (String line : allLines) {
                oponent = line.charAt(0);
                me = line.charAt(2);
//
//                if (me.equals('X')) {
//                    me = 'A';
//                }
//                if (me.equals('Y')) {
//                    me = 'B';
//                }
//                if (me.equals('Z')) {
//                    me = 'C';
//                }

                switch (oponent) {
                    case 'A':
                        if (me.equals('X')) {sum += 0+3; }
                        if (me.equals('Y')) {sum += 3+1; }
                        if (me.equals('Z')) {sum += 6+2; }
                    break;
                    case 'B':
                        if (me.equals('X')) {sum += 0+1; }
                        if (me.equals('Y')) {sum += 3+2; }
                        if (me.equals('Z')) {sum += 6+3; }
                    break;
                    case 'C':
                        if (me.equals('X')) {sum += 0+2; }
                        if (me.equals('Y')) {sum += 3+3; }
                        if (me.equals('Z')) {sum += 6+1; }
                        break;
                }
//                if (me.equals('A')) {sum += 1; }
//                if (me.equals('B')) {sum += 2; }
//                if (me.equals('C')) {sum += 3; }

            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
                System.out.println(sum);
    }
}

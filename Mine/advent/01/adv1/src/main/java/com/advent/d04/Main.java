package com.advent.d04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<String> assignments = new ArrayList<>(Arrays.asList(
//                "2-4,6-8",
//                "2-3,4-5",
//                "5-7,7-9",
//                "2-8,3-7",
//                "6-6,4-6",
//                "2-6,4-8"));
        List<String> assignments = new ArrayList<>();
        File file = new File("F:\\desktop\\codedump\\java\\Mine\\advent\\01\\adv1\\src\\main\\resources\\input04.txt");
        try {
            assignments.addAll(Files.readAllLines(Paths.get(file.toURI())));

        } catch (IOException e) {
            e.printStackTrace();
        }

        int totalOverlaps = 0;
        int partialOverlaps = 0;
        for(int i =0; i < assignments.size(); i++){

            int separatorPos = assignments.get(i).indexOf(",");
            Section left = new Section(assignments.get(i).substring(0,separatorPos));
            Section right = new Section(assignments.get(i).substring(separatorPos+1));

            if(left.fullOverlap(right)) {
                totalOverlaps++;
            }

            if(left.partOverlap(right)){
                partialOverlaps++;
            }
        }
        System.out.println("totalOverlaps " + totalOverlaps);
        System.out.println("partialOverlaps " + partialOverlaps);
    }
}

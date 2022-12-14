package com.advent.d06;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sourceData = new ArrayList<>();

        File file = new File("F:\\desktop\\codedump\\java\\Mine\\advent\\01\\adv1\\src\\main\\resources\\input06s.txt");
        try {
            sourceData.addAll(Files.readAllLines(Paths.get(file.toURI())));

        } catch (IOException e) {
            e.printStackTrace();
        }

Analyzer analyzer = new Analyzer();
//        for(String buffer: sourceData){
//            analyzer.analyze(buffer);
//        }
        System.out.println(analyzer.analyze(sourceData.get(0)));
    }
}

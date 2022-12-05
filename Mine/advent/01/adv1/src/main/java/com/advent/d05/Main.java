package com.advent.d05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.codePointAt;

public class Main {
    public static void main(String[] args) {
        List<String> sourceData = new ArrayList<>();

        File file = new File("F:\\desktop\\codedump\\java\\Mine\\advent\\01\\adv1\\src\\main\\resources\\input05s.txt");
        try {
            sourceData.addAll(Files.readAllLines(Paths.get(file.toURI())));

        } catch (IOException e) {
            e.printStackTrace();
        }
        int instructionLine =0;
        Levels levels = new Levels();
        ArrayList<String> crates = new ArrayList<>();
        for (String line : sourceData) {
          instructionLine++;
            if (line.isEmpty()) {break;}
            crates.add(line);
//          levels.addLevel(line);
        }
        Converter converter = new Converter(crates);
        Movement movement = new Movement();
        for(int i=instructionLine; i<sourceData.size();i++){
           movement.addMove( sourceData.get(i));
        }

        levels.remove();
        Stack stack = new Stack(levels,movement);


    }

}

package com.advent.readfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Reader {
public ArrayList<String> read(String filename){
    ArrayList<String> list = new ArrayList<>();
    File file = new File(filename);
    try {
        list.addAll(Files.readAllLines(Paths.get(file.toURI())));

    } catch (IOException e) {
        e.printStackTrace();
    }
    return list;
}
}

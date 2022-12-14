package com.advent.d09;
import com.advent.readfile.Reader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.TreeSet;

public class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Commander commander =  new Commander();
        commander.move();

    }
}

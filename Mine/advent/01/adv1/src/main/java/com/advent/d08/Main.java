package com.advent.d08;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        Processor processor = new Processor();

//        logger.info("Tress count {}",processor.sort());
        logger.info("Max distance {}", processor.getMax());

    }
}

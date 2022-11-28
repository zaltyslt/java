package com.mkyong;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;

public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        URL main = HelloWorld.class.getResource("HelloWorld.class");
        if (!"file".equalsIgnoreCase(main.getProtocol())) throw new IllegalStateException("Main class is not stored in a file.");

        logger.debug(main.getPath());
        logger.debug("Hello from Logback");

        logger.debug("getNumber() : {}", getNumber());

    }

    static int getNumber() {
        return 5;
    }

}
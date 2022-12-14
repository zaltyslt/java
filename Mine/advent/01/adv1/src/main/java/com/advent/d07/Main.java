package com.advent.d07;
import com.advent.readfile.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        Reader reader = new Reader();
        List<String> sourceData = reader.read("input07s.txt");
        Mover mover = new Mover(sourceData);
        mover.processCommands();

        logger.info("{} ", mover.dirForUpdate());
//       logger.info("Root size: {}",mover.getCurrentDirectory().getDirectoryName() );
//       logger.info("Root size: {}",mover.getCurrentDirectory().getDirectorySize() );
//       logger.info("Root2 size: {}",mover.getCurrentDirectory().getDirectoryName() );
//       logger.info("Root2 size: {}",mover.getCurrentDirectory().getDirectoriesSize2());


//        File a01 = new File(10, "aa1");
//        File a02 = new File(10, "aa2");
//
//        Directory directoryRoot = new Directory("/");
//        directoryRoot.addFile(a01);
//        directoryRoot.addFile(a02);
//
//        Directory directoryD01 = new Directory("*d01");
//        directoryD01.addFile(a01);
//        directoryD01.addFile(a02);
//        directoryD01.addFile(a01);
//
//        directoryRoot.addDirectory(directoryD01);
//
//        System.out.println(directoryD01.getDirectorySize());
//        System.out.println(directoryRoot.getDirectorySize());
    }
}

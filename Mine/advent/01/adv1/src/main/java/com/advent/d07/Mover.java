package com.advent.d07;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Mover {
    private static final Logger logger = LoggerFactory.getLogger(Mover.class);
    private Directory parentDirectory;
    private Directory currentDirectory;
    private Directory rootDirectory;
    List<String> commandsList;

    /**
     * Mover constructor
     */
    public Mover(List commandsList) {
        /** Sets command list to this.commandlist */
        this.commandsList = commandsList;
        /** Creates root directory and set currentDirectory to root */
        rootDirectory = new Directory("/");
        currentDirectory = rootDirectory;
        parentDirectory = rootDirectory;
    }

    /**
     * Processes commands in list analyzing and executing them
     */
    public void processCommands() {
        for (String command : commandsList) {
            String[] commandBody = command.split(" ");
            /** Determines if sequence is true command, prefix $ */
            if (commandBody[0].equals("$")) {
                /** ls is only one part command*/
                if (commandBody.length == 2) {
                    command(commandBody[1]);
                } else {
                    command(commandBody[1], commandBody[2]);
                }
                continue;
            }
            if (commandBody[0].equals("dir")) {
                currentDirectory.addDirectory(createDirectory(commandBody[1]));
                continue;
            }

            if (isNumeric(commandBody[0])) {
                currentDirectory.addFile(createFile(Integer.parseInt(commandBody[0]), commandBody[1]));
            }
         }
//        command("cd","/");
    }

    public void command(String command) {
        //ls
        int sum = 0;
        for (Directory directory : currentDirectory.getDirectories()) {
            logger.info("dir ${} Size:{}", directory.getDirectoryName(), directory.getDirectorySize());
            sum += directory.getDirectorySize();
        }
        for (File file : currentDirectory.getFiles()) {
            logger.info("${} {}", file.getFileSize(), file.getFileName());
            sum += file.getFileSize();
        }
    }
    public void command(String command, String name) {
        //jei root, tai current dir pereina i root
        if (command.equals("cd") && name.equals("/")) {
            currentDirectory = rootDirectory;
            parentDirectory = rootDirectory;
            return;
        }
        /** if command 'cd' and name ".." changes current directory to parent directory  */
        if ((command.equals("cd")) && (name.equals(".."))) {
            if (currentDirectory.isRoot()) {
                return;
            } else {
                this.currentDirectory = currentDirectory.getParent();
                this.parentDirectory = currentDirectory.getParent();

                return;
            }
        }

        if (command.equals("cd")) {
            /** checks if current directory contains directory with name equal $name */
            for (Directory directory : currentDirectory.getDirectories()) {
                if (directory.getDirectoryName().equals(name)) {
                    parentDirectory = currentDirectory;
                    currentDirectory = directory;
                    directory.getDirectorySize();
                    return;
                }
            }
        }
    }
    public int getDirectoriesSize2(){
        Directory tempDirectory;
        int totalFilesSize = 0;

        Queue<Directory> directoriesQueue = new LinkedList<>();
        directoriesQueue.add(rootDirectory);
        while (!directoriesQueue.isEmpty()){
            tempDirectory = directoriesQueue.poll();
            if(tempDirectory.getDirectorySize() <= 100_000){
              totalFilesSize += tempDirectory.getDirectorySize();
          }
          if(tempDirectory.getDirectories().size() >0){
              directoriesQueue.addAll(tempDirectory.getDirectories());
          }
        }
        return totalFilesSize;
    }

    public int dirForUpdate(){
        Directory tempDirectory;
        List<Integer> dirs = new ArrayList<>();
        int diff = 70_000_000 - rootDirectory.getDirectorySize();
logger.info("root {}, diff {}", rootDirectory.getDirectorySize(), diff);
        Queue<Directory> directoriesQueue = new LinkedList<>();
        directoriesQueue.add(rootDirectory);
        while (!directoriesQueue.isEmpty()) {
            tempDirectory = directoriesQueue.poll();
            dirs.add(tempDirectory.getDirectorySize());

            if(tempDirectory.getDirectories().size() >0){
                directoriesQueue.addAll(tempDirectory.getDirectories());
            }
        }
        dirs.sort((x,y)->x-y);
        int thisNumber = 0;
        for(Integer num:dirs){
            if(diff + num >= 30_000_000){
                thisNumber = num;
                break;
            }
        }

        return thisNumber;
    }

    public void count(){
        int dirCount = 0;
        int fileCount = 0;
        int size =0;
        Queue<Directory> dirsQueue = new LinkedList<>();
        dirsQueue.add(rootDirectory);
        Directory tempDir;

        while(!dirsQueue.isEmpty()){
            tempDir = dirsQueue.poll();
            logger.info("DirName {}",tempDir.getDirectoryName().toUpperCase());
            dirCount += 1;

            if(tempDir.getFiles().size()>0){
                fileCount += tempDir.getFiles().size();
            }
            for(File file : tempDir.getFiles()){
//                logger.info("fileName {}", file.getFileName());
                size += file.getFileSize();
            }
            if(tempDir.getDirectories().size() > 0){
                dirsQueue.addAll(tempDir.getDirectories());
            }
        }
        logger.info("Dirs: {}, files: {}", dirCount, fileCount);
        logger.info("Size: {}", size);
    }

    public File createFile(int size, String name) {
        return new File(size, name);
    }

    public Directory createDirectory(String name) {
        return new Directory(name, getCurrentDirectory());
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public Directory getRootDirectory() {
        return this.rootDirectory;
    }

    public Directory getCurrentDirectory() {
        return this.currentDirectory;
    }
    public Directory getParentDirectory(Directory directory) {
        return directory;
    }
}

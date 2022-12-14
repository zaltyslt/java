package com.advent.d07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Directory {
    private boolean isRoot;
    private  Directory parent;
    private List<Directory> directories;
    private List<File> files;
    private String name;

    public Directory(String title) {
        isRoot = true;
        directorySetup(title);
        this.parent = this;
    }

    public Directory(String title, Directory parent) {
        isRoot = false;
        directorySetup(title);
        this.parent = parent;
    }
    private void directorySetup(String title){
        this.name = title;
        directories = new ArrayList<>();
        files = new ArrayList<>();

    }
    public void addFile(File file){
        files.add(file);
    }
   public void addDirectory(Directory directory){
      if(directories.contains(directory)){throw new IllegalArgumentException("Directory already exists!");}
        this.directories.add(directory);
   }

   public List<File> getFiles(){return this.files;}
   public List<Directory> getDirectories(){return this.directories;}
    public String getDirectoryName(){
        return this.name;
    }

   public int getDirectorySize(){
//       int dirCount = 0;
//       int fileCount = 0;
       int size =0;

       Queue<Directory> dirsQueue = new LinkedList<>();
       dirsQueue.add(this);
       Directory tempDir;

       while(!dirsQueue.isEmpty()) {
           tempDir = dirsQueue.poll();
//           logger.info("DirName {}",tempDir.getDirectoryName().toUpperCase());
//           dirCount += 1;

           if (tempDir.getFiles().size() > 0) {
               for (File file : tempDir.getFiles()) {
//                logger.info("fileName {}", file.getFileName());
               size += file.getFileSize();
               }
           }

           if(tempDir.getDirectories().size() > 0){
               dirsQueue.addAll(tempDir.getDirectories());
           }
       }
//       logger.info("Dirs: {}, files: {}", dirCount, fileCount);
//       logger.info("Size: {}", size);
        return size;
   }

   public boolean isRoot(){
       return this.isRoot;
   }
   public Directory getParent(){
        return  this.parent;
   }

   @Override
    public String toString(){
        return this.name;
//        return this.name + " " + this.directoriesSize + " " + this.filesSize + " " + this.totalSize;
   }
}

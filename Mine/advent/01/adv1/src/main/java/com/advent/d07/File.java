package com.advent.d07;

public class File {
    private int fileSize;
    private String fileName;

    public File(int fileSize, String fileName) {
        this.fileSize = fileSize;
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getFileName() {
        return fileName;
    }
}

package org.example;

public class MyObject {
    private static boolean exsists = false;

    public MyObject() {
        if (!exsists) {
            exsists = true;
        }else{
           throw new RuntimeException("Object exists");
        }

    }
}

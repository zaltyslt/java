package com.advent.d10;

import com.advent.readfile.Reader;

import java.util.List;

public class MainD10 {
    public static void main(String[] args) {
        Reader reader = new Reader();
        List<String > source = reader.read("F:\\desktop\\codedump\\java\\Mine\\advent\\01\\adv1\\src\\main\\resources\\input10.txt");
        MyReader myReader = new MyReader(source);
        RegisterX registerX = new RegisterX(new MyReader(source).getInstructions());
//        registerX.perform();
        Crt crt = new Crt(registerX);
        crt.showScreen();


    }
}

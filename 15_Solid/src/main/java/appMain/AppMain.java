package appMain;

import solid.srp.incorrect.TextTransformer;
import userIO.ProcessUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppMain {

    public static void main(String[] args) throws IOException{

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input =" ";

            do {
                System.out.print("$ ");
                input = reader.readLine();

                if(!input.isEmpty()) {
                    System.out.println("Transformed: " + new ProcessUI().transform(input));
                }

            }
            while (!input.equals(""));
    }
}

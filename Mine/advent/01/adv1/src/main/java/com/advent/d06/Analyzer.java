package com.advent.d06;

import java.util.Arrays;
import java.util.Comparator;

public class Analyzer {

    public int analyze(String buffer) {

        int symbols = 0;
        String[] sequence;
        boolean dublicateFound = false;
        for (int i = 0; i < buffer.length()-13; i++) {
            if (buffer.length() < 14) { break; }
            dublicateFound = false;
            sequence = buffer.substring(i,i+14).split("");
            for(int j=0; j<14;j++){
                if(!dublicateFound){
             for(int k=0; k<13;k++){
                    if(j !=k && sequence[j].equals(sequence[k]) ){
                      dublicateFound = true;
                        System.out.println(Arrays.toString(sequence) +" "+j+" "+k);
                       break;
                    }
            }}
        }


            if(!dublicateFound) {
                System.out.println(Arrays.toString(sequence));
                return i+14;
            }
        }

            return -1;

    }
}

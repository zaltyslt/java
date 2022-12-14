package com.advent.d05;

import java.util.ArrayList;

public class Converter {

    public Converter(ArrayList<String> crates) {
        crates.remove(crates.size() - 1);
//        int x = crates.size();
//        int y = crates.size();
//        int col = 0;
//        String[][] array2D = new String[x][y];

        ArrayList list2D = new ArrayList();
        ArrayList listRotated = new ArrayList();
        for (String crate : crates) {
            String tempValue = crate;
            ArrayList tempList = new ArrayList<>();


            while (tempValue.length() > 0) {
                String seq = tempValue.substring(0, 3);
                if (seq.equals("   ")) {
                    tempList.add("*");
                } else if (seq.substring(0, 1).equals("[")) {
                    tempList.add(seq.substring(1, 2));
                }
//            System.out.println(seq);
                if (tempValue.length() > 3) {
                    tempValue = tempValue.substring(4);
                } else {
                    break;
                }
            }
            list2D.add(tempValue);

            for(int i = 0; i < tempList.size();i++){
               array2D[col][i] = tempList.get(i).toString();
               col++;
            }
        }

        int i =0;
    }
}

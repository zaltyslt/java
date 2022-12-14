package com.advent.d05;
import java.util.ArrayList;
import java.util.List;

public class Converter {
    private List<String> organizedCrates;
    public Converter(ArrayList<String> crates) {
       organizedCrates = new ArrayList<>();

        //is crates list istrina paskutine linija, nes ten stulpeliu indeksai
        crates.remove(crates.size() - 1);
        StringBuilder cratesRow = new StringBuilder();

        for (String crate : crates) {
            String tempValue = crate;


            while (tempValue.length() > 0) {
                String seq = tempValue.substring(0, 3);
                if (seq.equals("   ")) {
                    cratesRow.append("*");
                } else if (seq.substring(0, 1).equals("[")) {
                    cratesRow.append(seq.substring(1, 2));
                }
//            System.out.println(seq);
                if (tempValue.length() > 3) {
                    tempValue = tempValue.substring(4);
                } else {
                    break;
                }
            }

            organizedCrates.add(cratesRow.toString());
            cratesRow.setLength(0);
        }
       //does nothing, just placeholder for breakpoint

        int i = 0;
    }
    //returns transformed crates list
    public List<String> getCratesList(){
        return organizedCrates;
    }
}

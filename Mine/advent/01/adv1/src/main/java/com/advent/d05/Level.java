package com.advent.d05;

import java.util.ArrayList;

public class Level {
    private ArrayList<String> level = new ArrayList<>();
        public Level(String value) {
//        this.value = value;

       String tempValue = value;
        while (tempValue.length() >0) {
            String seq = tempValue.substring(0,3);
            if(seq.equals("   ")){
                level.add("*");
            } else
           if(seq.substring(0,1).equals("[")){
                level.add(seq.substring(1,2));
            }
//            System.out.println(seq);
           if(tempValue.length() >3){ tempValue = tempValue.substring(4);}
//
           else{break;}
        }
    }

    public Level(){
            this.level = new ArrayList<>();
    this.level.add("*");
    }
    protected String getBoxValue(int fromIndex){
       String tempBox = this.level.get(fromIndex);
       this.setBoxValue("*", fromIndex);
       return tempBox;
    }


    protected void setBoxValue(String value, int toIndex){
            this.level.set(toIndex,value);
    }

    protected boolean boxHasValue(int inIndex){
            if(this.level.get(inIndex).equals("*")){
                return false;
            }
                return true;
    }

    protected Level emptyLevel(int size){

           for(int i =0; i < size; i++){
           level.add("*");
        }
            return this;
    }

    public int levelLength (){
        return this.level.size();
    }

    @Override
    public String toString(){
           StringBuilder result = new StringBuilder();
            for(int i =0; i < levelLength(); i++){
                result.append(level.get(i)+", ");
            }
            result.substring(0,result.length()-3);
            return result.toString();
    }


}

package com.advent.d05;//package com.advent.d05;

import java.util.ArrayList;
import java.util.List;

public class Levels {
// private List<Level> levels;
//
//    public Levels() {
//        this.levels = new ArrayList<>();
//    }
//
//    public void addLevel(String values){
//      this.levels.add(new Level(values));
//    }
//
//    public String getBoxValueFrom(int column){
//        int levelsCount = levels.size();
//
//        for(int i = 0; i <levelsCount; i++){
//            System.out.println(levels.get(i).toString()+"$");
//           if(levels.get(i).boxHasValue(column)){
//              return  levels.get(i).getBoxValue(column);
//           }
//       }
//        throw new IllegalStateException("getBoxValueFrom");
//    }
//
//    public boolean addBoxValueTo(String value, int column){
//        //if there are value in the highest level add level
//        System.out.println(this.levels.get(0)+"$- "+(column+1));
//        System.out.println(this.levels.get(0).boxHasValue(column));
//        if(this.levels.get(0).boxHasValue(column)){
//          Level tempLevel = new Level();
//            tempLevel.emptyLevel(levels.get(0).levelLength()-1);
//            levels.add(0,tempLevel);
//            levels.get(0).setBoxValue(value, column);
//
//            return true;
//        }
//        for (int i= levels.size()-1; i >=0; i--) {
//            if (!levels.get(i).boxHasValue(column)) {
//                levels.get(i).setBoxValue(value, column);
//                return true;
//            }
//        }
//        return false;
//    }
//    public void remove() {
//        this.levels.remove(levels.size()-1);
//    }
//    public String reportTopBoxes(){
//        StringBuilder tops = new StringBuilder();
//        for(int i =0; i<this.levels.get(0).levelLength(); i++){
//            for(Level level : levels){
//                if (level.boxHasValue(i)){
//                    tops.append(level.getBoxValue(i));
//                    break;
//                }
//            }
//        }
//
//        return tops.toString();
//    }
}

package com.advent.d05;

import java.util.ArrayList;
import java.util.List;

public class Levels {
 private List<ArrayList<String>> columns;
// private List<Level> levels;
 private List<String> crates;
 private int columnsCount;

    public Levels(List<String> cratesList) {
        this.columns = new ArrayList<>();
        this.crates = cratesList;
        this.columnsCount = crates.get(0).length();
        addCollumns();
        putCrates();
        clearMarksInColumns();
    }
    private void addCollumns(){
       for(int i =0; i< columnsCount;i++){
          this.columns.add(new ArrayList<String>());
       }
    }

    private void putCrates(){
       for(String crate : crates){
            String[] cratesRow = crate.split("");
                for(int i=0; i<columnsCount; i++) {
                    columns.get(i).add(0, cratesRow[i]);
                }
       }
    }

   private void clearMarksInColumns(){
        for(ArrayList<String> column : columns){
            while (column.contains("*")){
                column.remove("*");
            }
        }
   int i =0;
    }

 public String getBoxValueFrom(int column){
    List<String> tempColumn = columns.get(column);
    String tempCrate = tempColumn.get(tempColumn.size()-1);
      tempColumn.remove(tempColumn.size()-1);
        return tempCrate;
 }

 public void putBoxValueTo(int column, String value){
        columns.get(column).add(value);
 }

    public String reportTopBoxes(){
        StringBuilder tops = new StringBuilder();
        for(ArrayList<String> column : columns){
           tops.append(column.get(column.size()-1));
        }
        return tops.toString();
    }
}

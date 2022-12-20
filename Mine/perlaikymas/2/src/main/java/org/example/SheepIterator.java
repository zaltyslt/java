package org.example;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;

import java.util.ArrayList;

public class SheepIterator implements lt.vtvpmc.sheep.SheepIterator {
private ArrayList<SheepColor> colors;



    public SheepIterator(int i) {
       colors = new ArrayList<>();
        for(int y = 0; y < i; y++){
            if(y % 2 == 0){
                colors.add(SheepColor.WHITE);
            }else{
                colors.add(SheepColor.BLACK);
            }
      }
    }

    @Override
    public boolean hasNext() {
        if(colors.size() > 0){
            return true;}
        return false;
    }

    @Override
    public Sheep next() {
        if (hasNext()) {
          Sheep newSheep = new NewSheep(colors.get(0));
            colors.remove(0);
            return newSheep;
        }
        return null;
    }


}

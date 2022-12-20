package org.example;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;

public class NewSheep extends Sheep {
    private String name;



    public NewSheep(SheepColor color) {
        super(color);


        if(color.equals(SheepColor.WHITE)){
            this.name = "Dolly";
        }else{
            this.name = "Jack";
        }
    }

    public String getName() {

        return name;
    }



}

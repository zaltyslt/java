package org.example;

import lt.vtvpmc.sheep.Sheep;

public class Main {
    public static void main(String[] args) {
        SheepIterator sheepIterator = new SheepIterator(2);
        Sheep sheep;
        while (sheepIterator.hasNext()){

            sheep = sheepIterator.next();
        System.out.println(sheep.getColor() + " " + sheep.getColor());
        }
    }
}
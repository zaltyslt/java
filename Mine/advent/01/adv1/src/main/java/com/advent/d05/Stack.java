package com.advent.d05;

public class Stack {
    Levels collumns;
    Movement moves;
    int levelsCount = 0;

    public Stack(Levels collumns, Movement moves) {
        this.collumns = collumns;
        this.moves = moves;

        moveIt();
    }

    public void moveIt() {
        int ops =0;
        while (moves.hasNextMove()) {
            Move move = moves.getNextMove();

            System.out.println("take from "+ (move.getFrom()+1)+" put to "+(move.getWhereTo()+1)+ " take " +move.getCount());
           String[] cratesPortion = new String[move.getCount()];
            for(int i =0; i< move.getCount();i++) {
               cratesPortion[i] = collumns.getBoxValueFrom(move.getFrom());
           }
            for(int i = move.getCount()-1; i>=0; i--) {
                collumns.putBoxValueTo(move.getWhereTo(),  cratesPortion[i]);
            }

        }
        System.out.println(collumns.reportTopBoxes());
    }


}

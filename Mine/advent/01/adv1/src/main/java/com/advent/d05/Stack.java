package com.advent.d05;

import java.util.List;

public class Stack {
    Levels levels;
    Movement moves;
    int levelsCount = 0;

    public Stack(Levels levels, Movement moves) {
        this.levels = levels;
        this.moves = moves;

        moveIt();
    }

    public void moveIt() {
        int ops =0;
        while (moves.hasNextMove()) {
            Move move = moves.getNextMove();

            System.out.println("take from "+ (move.getFrom()+1)+" put to "+(move.getWhereTo()+1)+ " take " +move.getCount());
            String box = levels.getBoxValueFrom(move.getFrom());

            System.out.println("box val " + box);
            System.out.println("ops "+(++ops));
            levels.addBoxValueTo(box, move.getWhereTo());

        }
        System.out.println(levels.reportTopBoxes());
    }


}

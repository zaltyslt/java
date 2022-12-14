package com.advent.d05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movement {
    List<Move> moves;

    public Movement() {
        this.moves = new ArrayList<>();
    }

    public void addMove(String instruction) {
        Scanner sc = new Scanner(instruction);
        String[] temp = instruction.split(" +");

//        for (int i = 0; i < Integer.parseInt(temp[1]); i++) {
//            moves.add(new Move(Integer.parseInt(temp[3])-1, Integer.parseInt(temp[5])-1));
//        }
moves.add(new Move(Integer.parseInt(temp[3])-1, Integer.parseInt(temp[5])-1, Integer.parseInt(temp[1])) );

//        System.out.println();
    }

    public Move getNextMove() {
            Move temp = moves.get(0);
            moves.remove(0);
            return temp;

    }

    public boolean hasNextMove(){
        if(moves.size() > 0){
            return true;}
        return false;
    }
}
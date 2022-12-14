package com.advent.d05;

public class Move {
    private int from = 0;
    private int to = 0;
    private int count = 0;

    public Move(int from, int to) {
        this.from = from;
        this.to = to;
           }
    public Move(int from, int to, int count) {
        this(from, to);
        this.count = count;
    }

    public int getFrom() {
        return from;
    }

    public int getWhereTo() {
        return to;
    }

    public int getCount(){
        return count;
    }
}

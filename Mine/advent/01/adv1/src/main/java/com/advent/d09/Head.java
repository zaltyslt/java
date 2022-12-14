package com.advent.d09;

public class Head {
    private int x = 0;
    private int y = 0;

    public void calcHeadCoords(Command command) {

        if (command.getDirection().equals("L")) {
            x -= command.getSteps();
        }
        if (command.getDirection().equals("R")) {
            x += command.getSteps();
        }
        if (command.getDirection().equals("U")) {
            y += command.getSteps();
        }
        if (command.getDirection().equals("D")) {
            y -= command.getSteps();
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    @Override
    public String toString(){
        return x + ":"+ y;
    }
}

package com.advent.d09;

public class Command {
    private String  direction;
    private Integer steps;

    public Command(String direction, Integer steps) {
        this.direction = direction;
        this.steps = steps;
    }
    public Command setCommand(String direction, int steps){
        this.direction = direction;
        this.steps = steps;

        return this;
    }
    public String getDirection() {
        return direction;
    }

    public Integer getSteps() {
        return steps;
    }
    @Override
    public String toString(){
        return direction +" "+steps;
    }
}

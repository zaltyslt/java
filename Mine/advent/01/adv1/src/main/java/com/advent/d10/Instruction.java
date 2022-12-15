package com.advent.d10;

public class Instruction {
    private String name;
    private int cycles;
    private int value;

    public Instruction(String name, int value) {
        if(name.equals("noop")){
            this.cycles = 1;
            this.value =0;
        }else{
            this.cycles = 2;
            this.value = value;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCycles() {
        return cycles;
    }

    public int getValue() {
        return value;
    }
    @Override
    public String toString(){
        return name + " " + value;
    }
}

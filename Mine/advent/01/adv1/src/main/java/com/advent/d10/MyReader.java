package com.advent.d10;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyReader {
    private Queue<Instruction> instructions;

    public MyReader(List<String> source) {
        this.instructions = new LinkedList<>();
       for(int i = 0; i < source.size();i++){
           String[] tempString = source.get(i).split(" ");
           if(tempString[0].equals("noop")){
                instructions.add(new Instruction(tempString[0], 0));
           }else{
                instructions.add(new Instruction(tempString[0], Integer.parseInt(tempString[1])));
           }
        }

    }

    public Queue<Instruction> getInstructions(){
        return this.instructions;
    }

}

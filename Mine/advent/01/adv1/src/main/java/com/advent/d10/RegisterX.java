package com.advent.d10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Queue;

public class RegisterX {
    public static final Logger logger = LoggerFactory.getLogger(RegisterX.class);
    private Queue<Instruction> instructions;
    private int signalStrengthTotal;
    private int cycle;
    private int valueX;


    public RegisterX(Queue<Instruction> instructions) {
        this.instructions = instructions;
        cycle = 0;
        valueX = 1;
        signalStrengthTotal =0;
    }
    public void perform(){
        Instruction tempInstruction;
        while(instructions.size() > 0){
           tempInstruction = instructions.poll();
           for(int i = 0; i < tempInstruction.getCycles(); i++){
              cycle++;
              if(cycle == 20 || (cycle - 20) % 40 == 0 ){ signalStrengthTotal +=  cycle * valueX;
                  logger.info("Cycle {} * valueX {} = {}", cycle, valueX, cycle * valueX);
              }
           }
            valueX += tempInstruction.getValue();
           if(valueX <= 0){logger.info("ValueX {}", valueX);}
        }
    logger.info("Total: {} for {} cycles", signalStrengthTotal, cycle);
    }
    private Instruction stepInstruction = null;
    private int stepCycle =0;
    private int valueXtoAdd = 0;
    public void performStep(){
        if (cycle == 61 ){ cycle = 1;}
        if (stepInstruction == null && stepCycle == 0){
            valueX += valueXtoAdd;
            stepInstruction = instructions.poll();
            stepCycle = stepInstruction.getCycles();
        }
        cycle++; stepCycle--;
        if (stepCycle == 0){
            valueXtoAdd = stepInstruction.getValue();
            stepInstruction = null;}
       }
    public boolean getSprite(int crtPos){
        performStep();
        if(valueX-1 <= crtPos && crtPos <= valueX+1){
            return  true;}
       return false;
    }

    public int getCycle() {
        return cycle;
    }

    public int getValueX() {
        return valueX;
    }

    public int getValueXtoAdd() {
        return valueXtoAdd;
    }
}

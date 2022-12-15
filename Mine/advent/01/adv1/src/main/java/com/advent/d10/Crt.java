package com.advent.d10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Crt {
    public static final Logger logger = LoggerFactory.getLogger(Crt.class);

    List<String> screen = new ArrayList<>();
    RegisterX register;

    public Crt(RegisterX register) {
        this.register = register;
        drawPixels();
    }

    public void drawPixels(){
        StringBuilder builder = new StringBuilder();

        for(int v = 0; v < 6; v++){
            for(int h = 0; h <= 39; h++){
            if(register.getSprite(h)){
                builder.append("#");
            }else{ builder.append(" ");}
                logger.info("CRT ccl {}, reg ccl {}, valX {}", h, register.getCycle(),register.getValueX());
            }
            screen.add(builder.toString());
            builder.setLength(0);
        }
    }

    public void showScreen(){
        for(String line : screen){
          logger.info(line);
        }
    }
}

package com.advent.d09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Tail {
    private Head head;
    private Tracer tailTracer = new Tracer();
    public static final Logger logger = LoggerFactory.getLogger(Tail.class);

    private List<Head> tails = new ArrayList<>();
    private int whichTail = 0;

    public Tail(Head head) {
        this.head = head;
        for (int i = 0; i < 9; i++){
            tails.add(new Head());
        }
    }
    public void moveTails() {
       Head tempTail = this.head;
       Head listTail;

        for (int i = 0; i < 9; i++){
            whichTail = i;
            if(i== 0){
                tempTail = head;
            tailTracer.addTo(this.head.getX(), this.head.getY());
            }
            listTail = tails.get(i);
           if (!isTouching(tempTail,listTail)) {
               if (!moveDirect(tempTail,listTail)) {
                   movesDiagonally(tempTail,listTail);
               }
               movesDirect(tempTail,listTail);
           }
           if(i==8){ tailTracer.addTo(listTail.getX(), listTail.getY());}
           tempTail = listTail;
           logger.info("Tail{} ({}:{})",i,tempTail.getX(), tempTail.getY());

       }
        Painter painter = new Painter(this.head, this.tails);
        logger.info("Locations count: {}", tailTracer.count());
    }
    private boolean isTouching(Head head, Head tail) {

        int headX = head.getX();
        int headY = head.getY();
        int tailX = tail.getX();
        int tailY = tail.getY();
        return (headY == tailY + 1 || headY == tailY || headY == tailY - 1)
                && (headX == tailX - 1 || headX == tailX || headX == tailX + 1);
    }
    private boolean moveDirect(Head head, Head tail) {

        return head.getX() == tail.getX() || head.getY() == tail.getY();
    }
    private void movesDirect(Head head, Head tail) {

        int diff = 0;
        String direction = "";

        if (head.getX() == tail.getX()) {
            diff = Math.abs(tail.getY() - head.getY()) - 1;
            direction = tail.getY() > head.getY() ? "D" : "U";

        } else if (head.getY() == tail.getY()) {
            diff = Math.abs(tail.getX() - head.getX()) - 1;
            direction = tail.getX() > head.getX() ? "L" : "R";
        }

        for (int y = diff; y > 0; y--) {

            tail.calcHeadCoords(new Command(direction, 1));
//          if(whichTail == 9){
            tailTracer.addTo(tail.getX(), tail.getY());
//          }
        }

    }
    private void movesDiagonally(Head head, Head tail) {

        int headX = head.getX();
        int headY = head.getY();
        int tailX = tail.getX();
        int tailY = tail.getY();

        if (tailX < headX && tailY > headY) {
            tail.setX(tailX + 1);
            tail.setY(tailY - 1);
        }

        if (tailX > headX && tailY > headY) {
            tail.setX(tailX - 1);
            tail.setY(tailY - 1);
        }

        if (tailX < headX && tailY < headY) {
            tail.setX(tailX + 1);
            tail.setY(tailY + 1);
        }

        if (tailX > headX && tailY < headY) {
            tail.setX(tailX - 1);
            tail.setY(tailY + 1);
        }
//        if(whichTail == 9) {
            tailTracer.addTo(tail.getX(), tail.getY());
//        }
    }
}

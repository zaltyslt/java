package com.advent.d09;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Tail {
    private Head head;
    private Tracer tailTracer = new Tracer();
    public static final Logger logger = LoggerFactory.getLogger(Tail.class);

    private List<Head> tails = new ArrayList<>();
    private int tail9 =1;
    //private int whichTail = 0;

    public Tail(@NotNull Head head) {
          this.head = head;
        for (int i = 0; i < 9; i++){
            tails.add(new Head());
        }
    }
    public void moveTails() {
       Head tempHead = this.head;
       Head listTail = null;

        for (int i = 0; i < tails.size(); i++){

//            if(i== 0){
//                tailTracer.addTo(this.head.getX(), this.head.getY());
//            }

            listTail = tails.get(i);

            if (!isTouching(tempHead,listTail)) {
               if(i==8){ tail9++;}
                if (!moveDirect(tempHead,listTail)) {
                   movesDiagonally(tempHead,listTail);
               }
                movesDirect(tempHead,listTail);
            }

            if(i == 8) {
                tailTracer.addTo(listTail.getX(), listTail.getY());
                logger.info("TempHead ({}:{}), Tail{} ({}:{})", tempHead.getX(), tempHead.getY(), i, listTail.getX(), listTail.getY());
            }
//            logger.info("TempHead ({}:{}), Tail{} ({}:{})",tempHead.getX(), tempHead.getY(), i, listTail.getX(), listTail.getY());
            tempHead = listTail;

       }
//        Painter painter = new Painter(this.head, this.tails);
        logger.info("Locations count: {}", tail9);
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
//            tailTracer.addTo(tail.getX(), tail.getY());
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
//            tailTracer.addTo(tail.getX(), tail.getY());
//        }
    }
}

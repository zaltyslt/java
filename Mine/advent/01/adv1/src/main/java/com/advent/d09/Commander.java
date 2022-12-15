package com.advent.d09;

import com.advent.readfile.Reader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.advent.readfile.*;
import java.util.*;


public class Commander {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);
    Head head = new Head();
    Head tail = new Head();
//    Tracer tailTracer = new Tracer();
    Tail tails = new Tail(head);

    Queue<Command> commands = new LinkedList<>();

    public Commander() {

        Reader reader = new Reader();
        List<String> source = reader.read("input09.txt");
        String[] number;
        logger.info("Commands {} ", source.size());
        for (String str : source) {
            number = str.split(" ");
            commands.add(new Command(number[0], Integer.parseInt(number[1])));
        }
    }


    public void move() {

        Command command = commands.poll();
        int i = 0;
        //kol yra komandu
        while (command != null) {

                for(int n=0; n< command.getSteps();n++){
                    head.calcHeadCoords(new Command(command.getDirection(),1));
                    logger.info("No {}, command({} {}): head {}", i++, command.getDirection(), command.getSteps(), printHeadLocation());
//                  moveTail();
                    tails.moveTails();
//            logger.info("No {},                 tail {}:{}", i,  tail.getX(), tail.getY());
            }
            command = commands.poll();
            logger.info("------------------------");
//            if(!isTouching()){logger.info("!!!! {}:{} {}:{}", head.getX(),head.getY(), tail.getX(), tail.getY());}
        }

//        logger.info("Locations count: {}", tailTracer.count());
    }
    private boolean isTouching() {

        int headX = head.getX();
        int headY = head.getY();
        int tailX = tail.getX();
        int tailY = tail.getY();
        return (headY == tailY + 1 || headY == tailY || headY == tailY - 1)
                && (headX == tailX - 1 || headX == tailX || headX == tailX + 1);
    }

    private boolean moveDirect() {

        boolean value = head.getX() == tail.getX() || head.getY() == tail.getY();

        return value;
    }

    private Command moveCommand;

    private void movesDirect() {

        int diff = 0;
        String direction = "";
//      cia blogai;
        if (head.getX() == tail.getX()) {
            diff = Math.abs(tail.getY() - head.getY()) - 1;
            direction = tail.getY() > head.getY() ? "D" : "U";

        } else if (head.getY() == tail.getY()) {
            diff = Math.abs(tail.getX() - head.getX()) - 1;
            direction = tail.getX() > head.getX() ? "L" : "R";
        }

        for (int y = diff; y > 0; y--) {
//            moveCommand = new Command(direction, 1);
            tail.calcHeadCoords(new Command(direction, 1));
//            tailTracer.addTo(tail.getX(), tail.getY());
        }

    }

    private void movesDiagonally() {

        int headX = head.getX();
        int headY = head.getY();
        int tailX = tail.getX();
        int tailY = tail.getY();
//        if (tail.getX() < head.getX() && tail.getY() > head.getY()) {
//            tail.setX(tail.getX() + 1);
//            tail.setY(tail.getY() - 1);
//        }
        if (tailX < headX && tailY > headY) {
            tail.setX(tailX + 1);
            tail.setY(tailY - 1);
        }

//        if (tail.getX() > head.getX() && tail.getY() > head.getY()) {
//            tail.setX(tail.getX() - 1);
//            tail.setY(tail.getY() - 1);
//        }
        if (tailX > headX && tailY > headY) {
            tail.setX(tailX - 1);
            tail.setY(tailY - 1);
        }
//        if (tail.getX() < head.getX() && tail.getY() < head.getY()) {
//            tail.setX(tail.getX() + 1);
//            tail.setY(tail.getY() + 1);
//        }

        if (tailX < headX && tailY < headY) {
            tail.setX(tailX + 1);
            tail.setY(tailY + 1);
        }

//        if (tail.getX() > head.getX() && tail.getY() < head.getY()) {
//            tail.setX(tail.getX() - 1);
//            tail.setY(tail.getY() + 1);
//        }

        if (tailX > headX && tailY < headY) {
            tail.setX(tailX - 1);
            tail.setY(tailY + 1);
        }
//        tailTracer.addTo(tail.getX(), tail.getY());
    }

    private void moveTail() {

        if (!isTouching()) {
            if (!moveDirect()) {
                movesDiagonally();
            }
            movesDirect();
        }
    }

    public String printHeadLocation() {
        return head.getX() + ":" + head.getY();
    }
}

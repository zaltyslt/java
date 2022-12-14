package com.advent.d08;

import com.advent.readfile.Reader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Processor {
    private static final Logger logger = LoggerFactory.getLogger(Processor.class);
    private int xSize, ySize;
    int[][] area;

    public Processor(){
        setup();
    }
    public void setup() {
        Reader reader = new Reader();
        List<String> source = reader.read("input08.txt");
        xSize = source.get(0).length();
        ySize = source.size();
        area = new int[xSize][ySize];
        int lineX = 0;
        int lineY = 0;
        for(String line : source){
            String[] lineOfTrees = line.split("");
            for(String tree : lineOfTrees ){
                area[lineX][lineY] = Integer.parseInt(tree);
                lineX++;
            }
            lineX = 0;
            lineY++;
        }
    }

    private boolean isOuter(int posX, int posY){
        if(posX ==0 || posX == xSize-1 || posY ==0 || posY == ySize-1){
            return true;
        }
        return false;
    }

    private boolean isVisible(int posX, int posY){
        int tree = area[posX][posY];
        boolean left = true;
        boolean right = true;
        boolean up = true;
        boolean down = true;

        for(int i =0; i <posX; i++){
            if(tree <= area[i][posY] ){
                left = false;
                break;
            }
        }
        for(int i =posX+1; i <xSize; i++){
            if(tree <= area[i][posY] ){
                right = false;
                break;
            }
        }
        if(left || right){return true;}

        for(int i =0; i <posY; i++){
            if(tree <= area[posX][i] ){
                up = false;
            }
        }
        for(int i =posY+1; i <ySize; i++){
            if(area[posX][posY] <= area[posX][i] ){
                down = false;
            }
        }
        if(up || down){return true;}

        return false;
    }

    public int viewDistance(int posX, int posY){
        int tree = area[posX][posY];
        int dLeft = posX;
        int dRight = xSize-posX-1;
        int dUp = posY;
        int dDown = ySize-posY-1;

        for(int i = 1; i < posX; i++){

           if(tree <= area[posX-i][posY]){
               dLeft = i;
               break;
           }
        }
        for (int i = 1; i < xSize-posX; i++) {

            if (tree <= area[posX + i][posY]) {
                dRight = i;
                break;
            }
        }
        for (int i = 1; i < posY; i++) {

            if (tree <= area[posX][posY-i]) {
                dUp = i;
                break;
            }
        }
        for (int i = 1; i < ySize-posY; i++) {

            if (tree <= area[posX][posY + i]) {
                dDown = i;
                break;
            }
        }

        return dLeft * dRight * dUp * dDown;
    }

    public int sort(){
        int total = 0;
        for(int y=0; y < ySize; y++ ) {
            for (int x = 0; x < xSize; x++) {
                if (isOuter(x,y)) {
                total++;
                } else{
                    if(isVisible(x,y)){
                        total++;
                    }
                }
            }
        }
        return total;
    }

    public int getMax(){
        int max = 0;
        int distance = 0;
        for(int y=0; y < ySize; y++ ) {
            for (int x = 0; x < xSize; x++) {

                if (!isOuter(x, y)) {
                    distance = viewDistance(x, y);
                    if (distance > max) {
                        max = distance;
                    }
                }
            }
        }
        return max;
    }
}

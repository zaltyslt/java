package com.advent.d09;

import java.util.List;
public class Painter {
    private Head head;
    private List<Head> tails;
    private String[][] board = new String[14][22]; //0x = 11, 0y = 16

    public Painter(Head head, List<Head> tails){
        this.head = head;
        this.tails = tails;
        prepair();
        draw();
    }

    private void prepair(){
        for(int y=0; y < board.length; y++){
            for(int x=0; x < board[0].length; x++){
                board[y][x] =".";
            }
        }
        board[convertY(0)][convertX(0)] ="S";

        for(int t=this.tails.size()-1; t>=0;t--){
        Head ttt = tails.get(t);
//            System.out.println((ttt.getX()+10)+":"+(ttt.getY()+16) +" tail "+t);
            board[convertY(tails.get(t).getY())]
                 [convertX(tails.get(t).getX())] = Integer.toString(t+1);
        }
        board[convertY(this.head.getY())]
                [convertX(this.head.getX())] = "H";
    }

    private int convertX(int x){
        return board[0].length /2;
    }
    private int convertY(int y){return board.length /2;
    }
  private void draw(){
      for(int y=0; y < board.length; y++){
          for(int x=0; x < board[0].length; x++){
              System.out.print(board[y][x]);
          }
          System.out.println();
      }
  }
}

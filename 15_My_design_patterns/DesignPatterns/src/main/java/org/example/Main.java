package org.example;

public class Main {
    public static void main(String[] args) {
        Crussader crussader = new Crussader(new Kick());
        crussader.doFight();
    }
}

class Crussader{
  private Fight fight;

    public Crussader(Fight fight) {
        this.fight = fight;
    }

    public void doFight(){
        fight.perform();
    }
}

interface Fight{
    public void perform();
}
class Punch implements Fight{

    @Override
    public void perform() {
        System.out.println("punch");
    }
}

class Kick implements Fight{

    @Override
    public void perform() {
        System.out.println("kick");
    }
}
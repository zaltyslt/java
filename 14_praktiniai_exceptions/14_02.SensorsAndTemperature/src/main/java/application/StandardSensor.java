package application;

import java.util.LinkedList;
import java.util.List;

public class StandardSensor implements Sensor {//©KS
    //private int isOn;
    private int value;

    public StandardSensor(int val) {
        //this.isOn = true;
        this.value = val;
    }

    @Override
    public boolean isOn() {
   return true;
       // return this.isOn;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
//        readings.add(val);
        return this.value;
    }

    @Override
    public List<Integer> readings() {
     return new LinkedList<Integer>();
    }
}

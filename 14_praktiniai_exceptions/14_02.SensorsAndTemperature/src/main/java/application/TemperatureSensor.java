package application;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class TemperatureSensor implements Sensor{//©KS
    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
this.isOn = true;
    }

    @Override
    public void setOff() {
this.isOn = false;
    }

    @Override
    public int read() {
        if(!isOn) {
         throw  new IllegalStateException();
        }

        return new Random().nextInt(61)-30;
    }

    @Override
    public List<Integer> readings() {
        return null;
    }

}

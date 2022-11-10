package application;

public class StandardSensor implements Sensor{
    private boolean isOn;
    private int val;

    public StandardSensor(int val) {
        this.isOn = isOn;
        this.val = val;
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return this.val;
    }
}

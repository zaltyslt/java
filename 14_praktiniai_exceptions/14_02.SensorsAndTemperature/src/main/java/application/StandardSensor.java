package application;

public class StandardSensor implements Sensor{
    private boolean isOn;

    public StandardSensor(boolean isOn) {
        this.isOn = isOn;
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
        return 0;
    }
}

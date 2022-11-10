package application;

public class TemperatureSensor implements Sensor{
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
       return Random().nextInt(61) - 30;
    }

}

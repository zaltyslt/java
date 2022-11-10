package application;

import java.util.*;

public class AverageSensor implements Sensor {//©KS
    private List<Sensor> sensorsList = new ArrayList<>();
//    private List<Integer> readings = new LinkedList<Integer>();
    private List<Integer> readings = new LinkedList<Integer>();


    public void
    addSensor(Sensor toAdd) {
        this.sensorsList.add(toAdd);
        //this.readings.addAll(toAdd.getReadings());
    }

    @Override
    public boolean isOn() {

     return  sensorsList.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        this.setAllTo(true);

    }

    @Override
    public void setOff() {
        this.setAllTo(false);
//        this.isOn = sensorsList.stream().anyMatch(s -> !(s.isOn()));
    }

    @Override
    public int read() {
        if (!this.isOn() || this.sensorsList == null || this.sensorsList.size() == 0) {
            throw new IllegalStateException();
        } else {
            int reading = (int) sensorsList.stream().mapToInt(Sensor::read).average().orElse(0.0);
            this.readings.add(reading);
            return reading;
        }
    }

    public void setAllTo(boolean state) {
        if (state) {
            //prabega ir bando kiekviena ijungti
            sensorsList.forEach(Sensor::setOn);

        } else {
            for (Sensor sensor : sensorsList) {
                if (sensor.isOn()) {
                    sensor.setOff();
                    if (sensor.isOn()) {
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
    }
    @Override
    public List<Integer> readings() {

     return this.readings;
    }
@Override
    public String toString(){
    StringBuilder str = new StringBuilder();
    readings.forEach(s -> str.append(s).append(", "));

    return " [" + str.substring(0, str.length() - 2) + "]";
}

}

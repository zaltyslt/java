package application;

public class Main {
    public static void main(String[] args) {//©KS
        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();
        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);
        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + "C");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + "C");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + "C");
        //helsinkiRegion.readings.add(7);
        System.out.println("readings: " + helsinkiRegion.readings());
    }
}

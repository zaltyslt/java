package lt.vtmc;

import lt.vtvpmc.java.imperial.ImperialCube;
import lt.vtvpmc.java.imperial.MetricCube;

public class MyMetricCube implements MetricCube {
   private ImperialCube imperialCube;
   private  double inch = 2.54;

    public MyMetricCube(ImperialCube imperialCube) {
        this.imperialCube = imperialCube;
    }

    @Override
    public double getSideInCentimeters() {
        return imperialCube.getSideInInches() * this.inch;
    }

    @Override
    public double getVolumeInCentimeters() {
        return Math.pow(getSideInCentimeters(),3);
    }

    @Override
    public String getColor() {
       if(imperialCube.getColor().toLowerCase().equals("gray")){
           return "grey";
       }

        return imperialCube.getColor();
    }
}

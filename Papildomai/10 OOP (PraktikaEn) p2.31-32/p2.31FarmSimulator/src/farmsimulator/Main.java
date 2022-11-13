package farmsimulator;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {//©KS
    
  	
    	BulkTank tank = new BulkTank();
    
    	Farm farm = new Farm("pekka", new CowHouse( tank ));
    farm.installMilkingRobot( new MilkingRobot() );
    	farm.addCow( new Cow("Lehmä 1") );
    	farm.addCow( new Cow("Lehmä 2") );
    	farm.addCow( new Cow("Lehmä 3") );
    	farm.addCow( new Cow("Lehmä 4") );
    	farm.addCow( new Cow("Lehmä 5") );
    	farm.liveHour();
    	farm.manageCows();
     System.out.println( 	tank.getVolume());
    }
}
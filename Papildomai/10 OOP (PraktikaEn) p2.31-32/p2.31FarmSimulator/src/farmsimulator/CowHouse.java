package farmsimulator;


import java.util.Collection;
import java.util.List;

public class CowHouse {//©KS

 private MilkingRobot milkingRobot;
    private BulkTank bulkTank;


    public CowHouse() {
//        milkingRobot = null;
//        bulkTank = null;
    }

    public CowHouse(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

//    public CowHouse(MilkingRobot milkingRobot) {
//        this.installMilkingRobot(milkingRobot);
//    }

    public BulkTank getBulkTank() {
        return this.bulkTank;
    }

    /**
     * @param milkingRobot installs a milking robot and connects it to the barn bulk tank
     */
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        milkingRobot.setBulkTank(this.getBulkTank());
        this.milkingRobot = milkingRobot;
    }
//    public void addMilkablesToBarn(Milkable animal){
//
//        this.milkablesInBarn.add(animal);
//    }
    /**
     * @param cow milks the parameter cow with the help of the milking robot,
     *            the method throws an IllegalStateException if the milking robot hasn't been installed
     */
    public void takeCareOf(Cow cow) {
if(milkingRobot == null) {
	throw new IllegalStateException("The milking robot hasn't been installed");
	}
        this.milkingRobot.milk(cow);
    }

    /**
     * @param cows milks the parameter animal with the help of the milking robot,
     *             the method throws an IllegalStateException if the milking robot
     *             hasn't been installed
     */

    public void  takeCareOf(Collection<Cow> cows) {
        for (Cow cow: cows) {
            this.takeCareOf(cow);
        }
    }

    /**
     * @return String returns the state of the bulk tank contained by the barn
     */

    public String toString() {
        return this.bulkTank.toString();
    }


}

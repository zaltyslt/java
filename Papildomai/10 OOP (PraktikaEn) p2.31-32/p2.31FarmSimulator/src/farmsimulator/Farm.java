package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Farm implements Alive {//©KS

	private String ownerName;
	private ArrayList<Cow> cows;
    private CowHouse barn;
	//private MilkingRobot milkingRobot;

	public Farm() {
		cows = new ArrayList<>();
	}

	public Farm(String ownerName, CowHouse barn) {
		this();
		this.ownerName = ownerName;
		if(barn == null) {throw new IllegalArgumentException("Class Farm cr barn null");}
		this.barn = barn;
		
		
	}

	public void installMilkingRobot(MilkingRobot milkingRobot) {

		if (milkingRobot.equals(null)) {
			throw new IllegalArgumentException("Milking robot null");
		} else {
			this.barn.installMilkingRobot(milkingRobot);
		}
	}

	public String getOwner() {

		return ownerName;
	}

	public void addCow(Cow cow) {
		cows.add(cow);
	}

	@Override
	public void liveHour() {
		for (Cow cow : cows) {

			cow.liveHour();
		}
	}

	public void manageCows() {
barn.takeCareOf(this.cows);
	}

	@Override
	public String toString() {
		/*
		 * Farm owner: Esko Barn bulk tank: 0.0/2000.0 No cows.
		 */
		StringBuilder farmString = new StringBuilder();
		farmString.append("Farm owner: " + ownerName + "\n");
		farmString.append("Barn bulk tank:" + this.barn.getBulkTank() + "\n");
		farmString.append("Animals:\n");
		for (Milkable cow : cows) {
			farmString.append(cow + "\n");
		}
		return farmString.substring(0, farmString.length() - 2);
	}

}

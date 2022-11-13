package farmsimulator;

import java.util.Random;

public class Cow implements Alive, Milkable {//©KS

	private String name;
	private int livedHours;
	private double udder;
	private static final String[] NAMES = new String[] { "Anu", "Arpa", "Essi", "Heluna", "Hely", "Hento", "Hilke",
			"Hilsu", "Hymy", "Ihq", "Ilme", "Ilo", "Jaana", "Jami", "Jatta", "Laku", "Liekki", "Mainikki", "Mella",
			"Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu",
			"Virpi" };

	public Cow() {
		this.name = NAMES[(new Random().nextInt(NAMES.length - 1))];
		this.udder = 15 + new Random().nextInt(26);
	}

	public Cow(String name) {
		this();
		this.name = name;

	}

	public double getCapacity() {
		return this.udder;
	}

	@Override
	public void liveHour() {

		this.livedHours++;
	}

	@Override
	public double milk() {
		// 1.04 ltr/hour, 1.2 growt coefficient
		double cowGotMilk = getAmount();
		this.livedHours = 0;
		return cowGotMilk;
	}

	public String getName() {
		return this.name;
	}

	public double getAmount() {

		if(udder >= this.livedHours * 1.04 * 1.2) {
			return this.livedHours * 1.04 * 1.2;
		}
		return getCapacity();
	}

	@Override
	public String toString() {
		return name + " " + Math.ceil(getAmount()) + "/" + udder;
	}
}

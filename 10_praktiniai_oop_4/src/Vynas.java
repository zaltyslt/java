
public class Vynas implements IExcise {//©KS

	public Vynas() {
		
	}

	@Override
	public double CountExcise(double strength, double volume) {
		if (strength <= 8.5) {
			return EXSICE_RATE_VINE_LIGHT * volume;
		} else {
			return EXSICE_RATE_VINE_STRONG * volume;
		}
	}

	

}

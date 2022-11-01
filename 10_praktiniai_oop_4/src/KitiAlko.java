
public class KitiAlko implements IExcise {//©KS

	public KitiAlko() {
		
	}

	@Override
	public double CountExcise(double strength, double volume) {
		if (strength <= 15) {
			return EXSICE_RATE_SPIRIT_LIGHT * volume;
		} else {
			return EXSICE_RATE_SPIRIT_STRONG * volume;
		}
	}

	

}

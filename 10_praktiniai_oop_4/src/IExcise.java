
public interface IExcise {//©KS

	public final double EXSICE_RATE_SPIRIT_LIGHT = 0.89;
	public final double EXSICE_RATE_SPIRIT_STRONG = 1.26;
	public final double EXSICE_RATE_VINE_LIGHT = 0.28;
	public final double EXSICE_RATE_VINE_STRONG = 0.72;
	
	double CountExcise(double strength, double volume);
	
}

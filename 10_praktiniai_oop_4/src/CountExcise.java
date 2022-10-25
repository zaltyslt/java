
public interface CountExcise {
//0.89 < 15  < 1,26	
//0.28 < 8.5 <0.72
	public final double EXSICE_RATE_SPIRIT_LIGHT = 0.89;
	public final double EXSICE_RATE_SPIRIT_STRONG = 0.89;
	public final double EXSICE_RATE_VINE_LIGHT = 0.89;
	public final double EXSICE_RATE_VINE_STRONG = 0.89;
	
	void CountExsice(Item item, double volume);
	
}

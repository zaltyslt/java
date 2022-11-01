
public class PriceConverter {//©KS
private double exchangeRate;

	public PriceConverter(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	private double getExchangeRate() {
		return this.exchangeRate;
	}
	
	public double convertPrice(double basePrice) {
		return Math.round(basePrice * exchangeRate * 100) / 100.0;
	}
}

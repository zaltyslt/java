import java.text.DecimalFormat;

public class Item {//©KS

	private String title;
	private double priceNeto;
	private double vat;
	private IExcise excise;
	private double strength;
	private double volume;
	private PriceConverter converter;

	public Item(String title, double priceNeto, double vatPercent, PriceConverter converter) {
		this.title = title;
		this.priceNeto = priceNeto;
		this.vat = vatPercent;
		this.converter = converter;
	}

	public Item(String title, double priceNeto, double vatPercent, double strength, double volume, IExcise excise, PriceConverter object) {
		this(title, priceNeto, 21, object);
		this.excise = excise;
		this.strength = strength;
		this.volume = volume;
	}

	public String getTitle() {
		return this.title;
	}

	public double getPriceNeto() {
		return this.priceNeto;
	}

	public void setPriceNeto(double priceNeto) {
		this.priceNeto = priceNeto;
	}

	public double getPrice() {
		return this.priceNeto * this.vat;
	}

	public double calculatePrice() {
		if (this.excise == null) {

			return priceNeto * (1.0 + (vat / 100.0));
		} else {

			return Math.round(
					(priceNeto + excise.CountExcise(this.strength, this.volume)) * (1.0 + (vat / 100.0)) * 100) / 100.0;

		}
	}

	@Override
	public String toString() {
		return this.title + " - " + this.calculatePrice() + "eur, " + this.converter.convertPrice(this.calculatePrice()) + " CHF";
	}

}

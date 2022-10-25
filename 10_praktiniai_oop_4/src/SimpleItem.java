
public class SimpleItem extends Item {
	
	public final int vat = 21;

	public SimpleItem(String title, double priceNeto) {
		super(title, priceNeto);
		System.out.println(this.getPriceNeto());

	}

	@Override
	public double countPriceEuro(double priceNeto) {
		// TODO Auto-generated method stub
//		System.out.println(priceNeto);	
//		System.out.println(1.0+(vat / 100.0));
//		
		return priceNeto + (1.0+(vat / 100.0));
//		return getPriceNeto() + (1.0+(vat / 100.0));
		
	}

	@Override 
	public double countPriceFrank(double priceNeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return this.getTitle() + " pardavimo kaina: "+ this.countPriceEuro(vat) +"Eur / " +
				                                       this.countPriceFrank(vat) +"sFr";
	}

	@Override
	public double FrankRate() {
		// TODO Auto-generated method stub
		return 1.5;
	}
}

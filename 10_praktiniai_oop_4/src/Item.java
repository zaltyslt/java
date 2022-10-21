
public abstract class Item implements CountPrice{
	private String title;
	private double priceNeto;
//	public Preke() {
//		// TODO Auto-generated constructor stub
//	}
	public Item(String title, double priceNeto) {
		this.title = title;
		this.priceNeto = priceNeto;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPriceNeto() {
		return priceNeto;
	}
	public void setPriceNeto(double priceNeto) {
		this.priceNeto = priceNeto;
	}
	
	
}

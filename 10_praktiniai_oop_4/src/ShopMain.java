
public class ShopMain {//©KS

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Item item1 = new Item("Muilas", 2, 21);
//		System.out.println( item1.getPrice());
		PriceConverter converter = new PriceConverter(0.9871);
		
		IExcise vynas = new Vynas();
		IExcise kitiAlko = new KitiAlko();
		
		Item preke1 = new Item("Muilas", 10/*Kaina Neto*/, 21 /*PVM tarifas*/ /*8.5 arba 15 Stipr */ /*talpa*/, converter);
		Item prekeV = new Item("Vaistas", 10/*Kaina Neto*/, 9 /*PVM tarifas*/ /*8.5 arba 15 Stipr */ /*talpa*/, converter);
		Item preke2 = new Item("Vynas",  10/*Kaina Neto*/, 21 /*PVM tarifas*/,8 /*8.5 arba 15 Stipr */,1 /*talpa*/,vynas, converter);
		Item preke3 = new Item("Vodka",  10/*Kaina Neto*/, 21 /*PVM tarifas*/,40/*8.5 arba 15 Stipr */,0.7 /*talpa*/,kitiAlko, converter);
		
		System.out.println(preke1);
		System.out.println(preke2);
		System.out.println(prekeV);
		System.out.println(preke3);
		
	}

}

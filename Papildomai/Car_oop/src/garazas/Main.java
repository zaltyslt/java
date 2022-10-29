package garazas;
import garazas.masinos.Car;
import garazas.masinos.varikliai.Benziniukas;
import garazas.masinos.varikliai.Dyzeliukas;
import garazas.masinos.varikliai.Elektra;
import garazas.masinos.varikliai.InterfaceVariklis;

public class Main {

	public static void main(String[] args) {
		// sukuriamas variklio objektas
//		InterfaceVariklis variklisElek = new Elektra();
		InterfaceVariklis variklisDysel = new Dyzeliukas();
		InterfaceVariklis variklisA95 = new Benziniukas();
		

		Car avensis = new Car(variklisDysel);
		Car sienna = new Car(variklisA95);
//		Car tesla = new Car(variklisElek);

		System.out.println("Avensis - dyzelis");
		avensis.go(1);

		System.out.println("Sienna - benzinas ");
		sienna.go(1);
		
//		System.out.println("Tesla - elektra");
//		tesla.go(1);
	}

}

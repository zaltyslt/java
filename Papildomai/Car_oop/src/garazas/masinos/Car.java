package garazas.masinos;
import java.util.Iterator;

import garazas.masinos.varikliai.InterfaceVariklis;

public class Car {

	// argumentas rodo i klase kuri implementuoja VariklisInterface,
	// kad butu galima paduoti bet kokia klase, kuri implementuoja VariklisInterface.
	private InterfaceVariklis variklis;

	//kuriant objekta variklis, kaip argumentas paduodamas interface kintamasis,
	//todel kas kart kuriant objekta galima paduodi vis kita klase implementuojancia
	//interfaca ir bus vygdomi kiek kiti veiksmai;
	public Car(InterfaceVariklis variklioTipas) {
		this.variklis = variklioTipas;
	}
	
	//metodas, per kuri/kuris naudosis interface funkcijomis
	public void go(int km) {
		for (int i = 1; i <= km; i++) {
			System.out.println(i); 
			this.variklis.run();
			
		}
	}
	
}

package garazas.masinos.varikliai;

import garazas.masinos.CarsDevices;
import garazas.masinos.siurblys.InterfaceSiurblys;
import garazas.masinos.siurblys.KuroSiurblys;

public class Dyzeliukas extends CarsDevices implements InterfaceVariklis  {
	InterfaceSiurblys siurblys;
	
	public Dyzeliukas() {
		this.siurblys = new KuroSiurblys();
	}
	
	public void run() {
		// TODO Auto-generated method stub
		if(siurblys.inhale()) {
		System.out.println(" Bur bur bur");
		} else {
			System.out.println("Niekur nevaziuojam");
		}
	}
	

}

package garazas.masinos.varikliai;

import garazas.masinos.CarsDevices;
import garazas.masinos.siurblys.InterfaceSiurblys;
import garazas.masinos.siurblys.KuroSiurblys;

public class Benziniukas extends CarsDevices implements InterfaceVariklis  {//©KS
	InterfaceSiurblys siurblys; 

	public Benziniukas() {
		this.siurblys = new KuroSiurblys();
		
	}
	
	@Override
	public void run() {
		System.out.println("Ennn nnn");

	}

}

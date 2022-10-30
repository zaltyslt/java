package garazas.masinos.siurblys;

public class KuroSiurblys implements InterfaceSiurblys {//©KS

	@Override
	public boolean isReady() {
		{
			return ((Math.random() * (10-0))+0 > 5) ? true : false;
		}
	}

	@Override
	public boolean inhale() {
		if (isReady()) {
			System.out.println("Paduodu kura");
			return true;
		} else {
			System.out.println("Siurblys neveikia");
			return false;
		}
	}
}

package Templates.News;
import java.util.ArrayList;
import java.util.List;

public class Swearwords {

	private List<String> swearwords;

	public Swearwords() {

		this.swearwords = new ArrayList<>();
		swearwords.add("rupūs miltai");
		swearwords.add("velniai rautų");
		swearwords.add("velnias");
		swearwords.add("velniais");
	}

	public List<String> getSwearwords() {
		
		return this.swearwords;
	}

}

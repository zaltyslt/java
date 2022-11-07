import java.util.HashMap;
import java.util.Map;

public class Abbreviations {//©KS
private Map<String, String> abbr;
	public Abbreviations() {
		abbr = new HashMap<String, String>();
	}
	public void addAbbreviation(String abbreviation, String explanation) {
		abbr.put(abbreviation, explanation);
	}
	
	public boolean hasAbbreviation(String abbreviation) {
		if(abbr.containsKey(abbreviation)) {
			return true;
		}
		return false;
	}
	public String findExplanationFor(String abbreviation) {
		return abbr.get(abbreviation);
	}
}

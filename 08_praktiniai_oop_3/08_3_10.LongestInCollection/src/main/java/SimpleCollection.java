
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
    		if(this.elements.size() > 0) {	
    			int longestC = 0;
    			int longestPos = 0;
    				
    			for (int i =0; i< elements.size();i++) { 
    				if(elements.get(i).length() > longestC) { 
    						longestC = elements.get(i).length(); 
    						longestPos = i;
    					}
    				}
    			return this.elements.get(longestPos);	
    		}
    
		return null;
    }
}

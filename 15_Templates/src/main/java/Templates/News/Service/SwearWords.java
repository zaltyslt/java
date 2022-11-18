package Templates.News.Service;

import java.util.ArrayList;
import java.util.List;

public class SwearWords {

   private List<String> swearWords;

    public SwearWords() {
        this.swearWords = new ArrayList<>();
        swearWords.addAll(List.of(new String[]{"rupūs miltai", "velniai rautų", "velnias", "velniais"}));
   }

   public  List<String> getSwearWords(){

        return  this.swearWords;
   }
}

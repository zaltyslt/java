package lt.vtmc.ks;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepIterator;

public class Main {
    public static void main(String[] args) {

        SheepIterator avide = new MySheepIterator(5);
       while (avide.hasNext()){
//           SheepExt sheep = avide.next();
           SheepExt sheep = (SheepExt) avide.next();
           System.out.println(sheep.getColor()+ " " + sheep.getName()+" "+ sheep.getClass());

       }

    }
}
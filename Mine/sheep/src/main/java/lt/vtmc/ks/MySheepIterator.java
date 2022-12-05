package lt.vtmc.ks;

import lt.vtvpmc.sheep.SheepIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MySheepIterator implements SheepIterator {
//    private int sheepNumber;
    List<SheepExt> sheeps;
    Iterator<SheepExt> iterator;

    public MySheepIterator(int sheepsNumber) {
//        this.sheepNumber = sheepsNumber;
        sheeps = new ArrayList<>();
        for(int i =0; i<sheepsNumber;i++){
            if(i % 2 != 0){
                sheeps.add(new BlackSheep());
            } else{
                sheeps.add(new WhiteSheep());
            }
        }
        iterator =sheeps.iterator();
    }

    @Override
    public boolean hasNext() {

        return iterator.hasNext();
    }

    @Override
    public SheepExt next() {
      SheepExt thisSheep;
       if(hasNext()){
        return iterator.next();
       }
        return null;
    }
}

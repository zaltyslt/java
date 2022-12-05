package lt.vtmc.ks;

import lt.vtvpmc.sheep.AbstractSheepIteratorTest;
import lt.vtvpmc.sheep.SheepIterator;

public class Sheeptest extends AbstractSheepIteratorTest {
    @Override
    public SheepIterator getSheepIterator(int sheepNumber) {

        return new MySheepIterator(sheepNumber);
    }
}

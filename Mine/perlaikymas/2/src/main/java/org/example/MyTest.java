package org.example;

import lt.vtvpmc.sheep.AbstractSheepIteratorTest;

public class MyTest extends AbstractSheepIteratorTest {
    @Override
    public lt.vtvpmc.sheep.SheepIterator getSheepIterator(int i) {
        return new SheepIterator(i);
    }
}

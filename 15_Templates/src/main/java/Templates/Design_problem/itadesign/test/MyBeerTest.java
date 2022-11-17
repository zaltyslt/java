package Templates.Design_problem.itadesign.test;

import Templates.Design_problem.itadesign.beerdrinker.MeBeerConsumer;
import Templates.Design_problem.itadesign.beerdrinker.MyBeerFactory;
import itadesign.beerdrinker.BeerConsumer;
import itadesign.beerdrinker.BeerFactory;
import itadesign.test.AbstractBeerTest;

public class MyBeerTest extends AbstractBeerTest {
    @Override
    protected BeerFactory getBeerFactory() {
        return new MyBeerFactory();
    }

    @Override
    protected BeerConsumer getBeerConsumer() {
        return new MeBeerConsumer();
    }
}

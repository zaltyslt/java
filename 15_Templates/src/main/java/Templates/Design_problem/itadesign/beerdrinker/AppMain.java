package Templates.Design_problem.itadesign.beerdrinker;

import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.BeerConsumer;
import itadesign.beerdrinker.BeerFactory;
import itadesign.beerdrinker.NoMoreMaltException;

public class AppMain {

    public static void main(String[] args) throws NoMoreMaltException {
        MyBeerFactory factory = new MyBeerFactory();
        BeerConsumer consumer = new MeBeerConsumer();
        BeerBottle bottle1 = factory.produceNextBeerBottle();
//       factory.receiveMaltShippment(2);
//        System.out.println(factory.getMaltAmount());
       System.out.println(factory.getMaltAmount());
        BeerBottle bottle2 = factory.produceNextBeerBottle();
        System.out.println(factory.getMaltAmount());
//        System.out.println(consumer.getBloodAlcoholContentInLiters());
//        consumer.consumeBeer(bottle1);
//        System.out.println(consumer.getBloodAlcoholContentInLiters());
    }
}


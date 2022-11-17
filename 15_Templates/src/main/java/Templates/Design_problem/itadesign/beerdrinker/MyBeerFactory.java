package Templates.Design_problem.itadesign.beerdrinker;

import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.BeerFactory;
import itadesign.beerdrinker.DefaultBeerBottle;
import itadesign.beerdrinker.NoMoreMaltException;

/*
* It can only produce beer while it has malt in stock.
* For every kilogram of Malt, Factory can produce 40 liters of beer.
* BeerFactory should start with 1kg of malt when it is opened.
*/
public class MyBeerFactory implements BeerFactory {
   private double maltAmount;

    public MyBeerFactory() {
        this.maltAmount = 1;
    }

    @Override
    public void receiveMaltShippment(double amountInKilograms) {
       try {
           if (this.maltAmount <= 0) {
               throw new NoMoreMaltException("");
           }
       }catch (NoMoreMaltException exception){
           new MyBeerBottle(0,0);
       }
        if(amountInKilograms >=0){
            this.maltAmount += amountInKilograms;
        }
    }

    public double getMaltAmount() {
        return maltAmount;
    }

    @Override
    public DefaultBeerBottle produceNextBeerBottle()  throws NoMoreMaltException{
        /*
         * Produces beer bottles. It should only produce as much as it has available malt in its reserves.
         * One bottle consumes 25 grams of malt.
         * Each bottle should be between one third to half a liter in volume and
         * be between 4.5% to 5.7% in alcohol content.
         */
        if (this.maltAmount > 0.0249) {
            this.maltAmount -= 0.025;

            return new DefaultBeerBottle(0.5, 5.0);
        }
        if (this.maltAmount <= 0) {
            throw new NoMoreMaltException("No more malt!");
        }
        return null;
    }

}

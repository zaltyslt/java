package Templates.Design_problem.itadesign.beerdrinker;

import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.BeerConsumer;

public class MeBeerConsumer extends BeerConsumer {
    private BeerConsumer meBeerConsumer;
    public MeBeerConsumer() {
        super();
        meBeerConsumer = this;
    }

    @Override
    protected boolean shouldConsumeBeer(BeerBottle beerBottle) {
/*
    Bottles larger than 0.5L in volume should be avoided
    Bottles of beer stronger than 6% should be avoided
    If blood alcohol content surpasses 120 milliliters drinking should stop
 */
        if(beerBottle.getVolumeInLiters() <= 0.5 &&
           beerBottle.getAlcoholContentInPercent() <=6 &&
           convertAlcoholPersentsToLitters(beerBottle) + this.meBeerConsumer.getBloodAlcoholContentInLiters() <= 0.120){
            return true;
        }
        return false;
    }

    private double convertAlcoholPersentsToLitters(BeerBottle beerBottle){
        return beerBottle.getVolumeInLiters() * beerBottle.getAlcoholContentInPercent() /100;
    }

    @Override
    public BeerBottle showBeerBottleToAStranger(BeerBottle beerBottle, boolean mightBeAPoliceMan) {
        if(mightBeAPoliceMan){
            return new NonAlcoBeerBottle(beerBottle);
        }
        return  beerBottle;
    }
}

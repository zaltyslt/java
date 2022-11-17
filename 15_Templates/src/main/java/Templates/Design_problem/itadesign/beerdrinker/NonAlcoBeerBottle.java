package Templates.Design_problem.itadesign.beerdrinker;

import itadesign.beerdrinker.BeerBottle;

public class NonAlcoBeerBottle implements BeerBottle {
    BeerBottle wrappedBottle;

    public NonAlcoBeerBottle(BeerBottle wrappedBottle) {
        this.wrappedBottle = wrappedBottle;
    }

    @Override
    public double getAlcoholContentInPercent() {
        return 0;
    }

    @Override
    public double getVolumeInLiters() {
        return this.wrappedBottle.getVolumeInLiters();
    }

    @Override
    public void takeASip(double volumeInLiters) {
        if(volumeInLiters > 0){
            this.wrappedBottle.takeASip(volumeInLiters);
        }
    }
}

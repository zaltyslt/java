package Templates.Design_problem.itadesign.beerdrinker;

import itadesign.beerdrinker.BeerBottle;

public class MyBeerBottle implements BeerBottle {
    private double volumeInLitters;
    private double alcoholContentInPercent;

    public MyBeerBottle(double volumeInLitters, double alcoholContentInPercent) {
        this.volumeInLitters = volumeInLitters;
        this.alcoholContentInPercent = alcoholContentInPercent;
    }

    @Override
    public double getAlcoholContentInPercent() {
        return alcoholContentInPercent;
    }

    @Override
    public double getVolumeInLiters() {
        return volumeInLitters;
    }

    @Override
    public void takeASip(double volumeInLiters) {
        if(volumeInLitters > 0){
            this.volumeInLitters -= volumeInLiters;
        }
    }
}

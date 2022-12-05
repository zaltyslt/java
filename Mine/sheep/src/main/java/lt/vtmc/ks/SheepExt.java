package lt.vtmc.ks;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;

public class SheepExt extends Sheep {
    private String sheepName;
    public SheepExt(SheepColor color, String sheepName) {
        super(color);
        this.sheepName = sheepName;
    }

    public String getName(){
        return sheepName;
    }
}

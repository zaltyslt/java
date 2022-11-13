package farmsimulator;

public class MilkingRobot {//©KS
    private BulkTank tank;
    

    public MilkingRobot(){
    	setBulkTank(null);
    }
    
    public MilkingRobot(BulkTank tank){
        setBulkTank(tank);
    }

    
       
    
     public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }

    public BulkTank getBulkTank(){
        return this.tank;
    }

    
    
    
    public void milk(Milkable milkable){
        try {
          this.tank.addToTank(milkable.milk());
        }
        catch (Exception e){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }

}

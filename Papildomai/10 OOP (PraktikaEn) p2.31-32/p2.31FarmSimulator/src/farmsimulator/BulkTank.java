package farmsimulator;

public class BulkTank {//©KS
    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000d;
        this.volume = 0d;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0d;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity-this.volume;
    }

    public void addToTank(double amount) {
        if(amount > 0){
            if(this.volume + amount > this.capacity){
                this.volume = this.capacity;
            } else{
                this.volume += amount;
            }
        }
    }
    public double getFromTank(double amount) {
        if (amount > 0) {
            double tempVolume = 0;
            if (this.volume - amount < 0) {
                tempVolume = this.volume;
                this.volume = 0;
                return this.volume;
            }else{
                tempVolume = this.volume -= amount;
                this.volume = tempVolume;
                return tempVolume;
            }
        }
        return 0;
    }
    @Override
    public String toString(){
        return String.valueOf(Math.ceil(this.volume)) +"/"+Math.ceil(this.capacity);
    }
}

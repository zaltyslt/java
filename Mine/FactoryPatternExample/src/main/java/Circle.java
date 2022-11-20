public class Circle implements IShape {
   private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getSquare() {
        return (int)(Math.PI * Math.pow((double) this.radius,2.0));
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with radius " + this.radius);
    }
}

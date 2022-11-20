public class Square implements IShape{
   private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getSquare() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square with all sides length of  " + this.side);
    }
}

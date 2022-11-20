public class AppMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape shape = shapeFactory.getShape("circle");
        shape.draw();
        System.out.println(shape.getSquare());

        IShape shape2 = shapeFactory.getShape("square");
        shape2.draw();
        System.out.println(shape2.getSquare());
    }
}

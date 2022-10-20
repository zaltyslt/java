import java.util.ArrayList;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Shape> collection = new ArrayList<>();
//		Shape shape1 = new Shape();
//		Shape shape2 = new Shape("jOda", true);
//		collection.add(shape1);
//		collection.add(shape2);

//		System.out.println(shape1);
//		System.out.println(shape2);

		Circle circle1 = new Circle(2.0);
		Circle circle2 = new Circle(3.0, "blue", false);
		collection.add(circle1);
		collection.add(circle2);
		

//		System.out.println(circle1);
//		System.out.println(circle2);

		Rectangle rect1 = new Rectangle(4.0, 3.0);
//		System.out.println(rect1);
//		System.out.println(rect1.getArea());
		collection.add(rect1);
//		System.out.println(rect1.getPerimeter());
		
		Square square1 = new Square(5.0);
		collection.add(square1);
//		System.out.println(square1);
//		System.out.println(square1.getArea());
//		System.out.println(square1.getPerimeter());
//		System.out.println(square1.getSide());
//		System.out.println(square1.getLength());
		
		Double sumOfAreas = 0.0;
		Double sumOfPerimeters = 0.0;
		Double biggestPerimeter = collection.get(0).getPerimeter();
		for (Shape shape : collection) {
//			System.out.println(shape.getClass()+ " - "+ shape.getArea());
//			System.out.println(shape.getClass()+ " - "+ shape.getPerimeter());
			System.out.println(shape.getClass()+ " - "+ (shape instanceof Square));
			sumOfAreas += shape.getArea();
			sumOfPerimeters += shape.getPerimeter(); 
			if (biggestPerimeter < shape.getPerimeter()) {
				biggestPerimeter = shape.getPerimeter();
			}
			
			
			if( shape instanceof Square ) {
				System.out.println( ((Square) shape).getSide() );
			}
			
		}
		System.out.println("Sum of areas: " + sumOfAreas);
		System.out.println("Sum of perimeters: " + sumOfPerimeters);
		System.out.println("Biggest perimeters: " + biggestPerimeter);
		
		Triangle triangle = new Triangle();
		System.out.println(triangle);
	}

}

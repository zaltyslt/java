import java.awt.*;

public class ShapeFactory {
    public IShape getShape(String type){
       if(type.toLowerCase().equals("circle")){
           return new Circle(5);
       }

        if(type.toLowerCase().equals("square")){
            return new Square(3);
        }

        return null;
    }

    public IShape getCircle(int radius){
        Circle tempShape = (Circle) getShape("circle");
        tempShape.setRadius(radius);
        return tempShape;
    }
}

package Templates.Decorator;

public class GreeterExclamationMarkInheritance extends GreeterImpl{

    @Override
    public String greet(String fName, String lName) {
        return "Inheritance " + super.greet(fName,lName) + "!";
    }
}

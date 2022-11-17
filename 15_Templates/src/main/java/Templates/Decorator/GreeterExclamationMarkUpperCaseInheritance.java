package Templates.Decorator;

public class GreeterExclamationMarkUpperCaseInheritance extends GreeterExclamationMarkInheritance{
    @Override
    public String greet(String fName, String lName) {
        return "Inheritance" + super.greet(fName,lName).toUpperCase();
    }
}

package Templates.Decorator;

public class GreeterImpl implements Greeter {
    @Override
    public String greet(String fName, String lName) {
        return fName + " " + lName;
    }
}

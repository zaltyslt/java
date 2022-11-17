package Templates.Decorator;

public class GreeterUppercaseDecorator implements Greeter{
    private Greeter originalGreeter;

    public GreeterUppercaseDecorator(Greeter greeterMember) {
        this.originalGreeter = greeterMember;
    }

    @Override
    public String greet(String fName, String lName) {

        return originalGreeter.greet(fName, lName).toUpperCase();

    }
}

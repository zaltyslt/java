package Templates.Decorator;

public class GreeterExclamationMarkDecorator implements Greeter{
    Greeter original;

    public GreeterExclamationMarkDecorator(Greeter original) {
        this.original = original;
    }


    @Override
    public String greet(String fName, String lName) {

        return "Decorator "+original.greet(fName, lName) + "!";
    }

}

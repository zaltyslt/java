package Templates.Strategy;

public class GreeterEn extends Greeter {
    public GreeterEn(String fName, String lName) {
        super.greet(fName,lName);
    }

    @Override
    protected String getGreetingString() {
        return "Hello";
    }
}

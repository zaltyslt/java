package Templates.Strategy;

public class GreeterLt extends Greeter {

    public GreeterLt(String fName, String lName) {
        super.greet(fName, lName);
    }

    @Override
    protected String getGreetingString() {
        return "Sveiki";
    }
}

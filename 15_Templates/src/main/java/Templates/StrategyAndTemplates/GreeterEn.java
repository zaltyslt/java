package Templates.StrategyAndTemplates;

public class GreeterEn extends Greeter {
    public void greet(String fName, String lName, int ending) {

        super.greet(fName, lName, ending);
    }

    @Override
    protected String getGreetingString() {
        return "Hello";
    }

    @Override
    protected String getEndingString(int type) {
        return switch (type) {
            case 1 -> "!";
            case 3 -> "!!!";
            default -> ".";
        };
    }
}

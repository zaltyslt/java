package Templates.StrategyAndTemplates;

public class GreeterStrategy {
    private IGreeterLanguageStrategy greeterLanguageStrategy;
    private String endingString;


    GreeterStrategy(IGreeterLanguageStrategy greeterLanguageStrategy, String endingString) {
        this.greeterLanguageStrategy = greeterLanguageStrategy;
        this.endingString = endingString;
    }

    public void greet(String fName, String lName){
        System.out.println(greeterLanguageStrategy.getGreetingString() + " "+fName+" "+lName + endingString);
    }

}

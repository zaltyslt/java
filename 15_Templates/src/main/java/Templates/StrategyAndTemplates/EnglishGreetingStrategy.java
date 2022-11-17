package Templates.StrategyAndTemplates;

public class EnglishGreetingStrategy implements IGreeterLanguageStrategy{
    @Override
    public String getGreetingString() {
        return "Hello, ";
    }
}
package Templates.StrategyAndTemplates;

public class LithuanianGreetingStrategy implements IGreeterLanguageStrategy{
    @Override
    public String getGreetingString() {
        return "Labas, ";
    }
}

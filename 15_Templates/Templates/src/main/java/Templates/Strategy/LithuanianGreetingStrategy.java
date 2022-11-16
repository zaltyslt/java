package Templates.Strategy;

public class LithuanianGreetingStrategy implements IGreeterLanguageStrategy{
    @Override
    public String getGreetingString() {
        return "Labas, ";
    }
}

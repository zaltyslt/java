package Templates.StrategyAndTemplates;
public abstract class Greeter {
    public void greet( String fName, String lName, int endingSymbol){
        System.out.println(getGreetingString() + " " +fName + " " + lName+ getEndingString(endingSymbol));
    };
   protected abstract String getGreetingString();
   protected abstract String getEndingString(int type);
}

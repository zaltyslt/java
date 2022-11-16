package Templates.Strategy;

public abstract class Greeter {




    public void greet( String fName, String lName){
        System.out.println(getGreetingString() + " " +fName + " " + lName);
    };

   protected abstract String getGreetingString();
}

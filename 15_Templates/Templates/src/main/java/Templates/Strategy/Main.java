package Templates.Strategy;

public class Main {
    public static void main(String[] args) {
//        Greeter greet1 = new GreeterLt();
//        Greeter greet2 = new GreeterEn();
//
//        greet1.greet("Puonis1", "Juonis",1);
//        greet2.greet("Puonis2", "Juonis",3);

        GreeterStrategy grtLt = new GreeterStrategy(new LithuanianGreetingStrategy(), IEndingString.EXCLAMATION_POINT);
        GreeterStrategy grtEn = new GreeterStrategy(new EnglishGreetingStrategy(), IEndingString.EXCLAMATION_POINT_3);

        grtLt.greet("As", "Tas");
        grtEn.greet("Me", "Em");

    }
}
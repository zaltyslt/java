package Templates.Decorator;

public class appRunMain {
    public static void main(String[] args) {
        Greeter greeter1 = new GreeterImpl();
        Greeter greeter2 = new GreeterExclamationMarkDecorator(greeter1);
        Greeter greeter3 = new GreeterUppercaseDecorator(greeter1);

        System.out.println(greeter1.greet("a","b"));
        System.out.println(greeter2.greet("a","b"));
        System.out.println(greeter3.greet("a","b"));

        Greeter greeter4 = new GreeterExclamationMarkInheritance();
        System.out.println(greeter4.greet("a","b"));
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
            HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
            Greeting lambdaGreeter = ()-> System.out.println("a) " + "Hello world!");
            Greeting anonymousInnerClassGreeter = new Greeting(){
                public void perform(){
                    System.out.println("b) " + "Hello world!");
                }
            };
            lambdaGreeter.perform();
            anonymousInnerClassGreeter.perform();
    }
}

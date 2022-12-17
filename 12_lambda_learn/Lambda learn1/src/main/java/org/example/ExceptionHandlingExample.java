package org.example;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4};
        int key = 2;
        BiConsumer<Integer, Integer> doThat = (x, y)-> System.out.println(x+y);
        intAddAndPrint(someNumbers, key, doThat );
    }

    private static void intAddAndPrint(int[] someNumbers, int key, BiConsumer<Integer, Integer> doSomething) {
        for(int number: someNumbers){
            doSomething.accept(number,key);
        }
    }
}

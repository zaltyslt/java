package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

    List<Integer> aa = generateFirst10PrimeNumbers();
        List<Integer> aa1 = new ArrayList<>();
        System.out.println(Arrays.asList(aa));
        aa1.add(1);
        aa1.add(2);
        int[] aa2 = {4,5};
        System.out.println(Arrays.asList(aa2));
        System.out.println(Arrays.toString(aa2));
}
    public static List<Integer> generateFirst10PrimeNumbers(){
        return IntStream.rangeClosed(2, Integer.MAX_VALUE-2)
                .filter(x -> isPrime(x)).boxed().limit(10)
                .toList();
    }
    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number % i == 0);
    }


}
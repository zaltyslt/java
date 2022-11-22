package lt.vtmc;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class MyExercises implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {

        return list
                .stream()
                .mapToInt(x -> x)
                .min()
                .orElse(Integer.MIN_VALUE);
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        return list
                .stream()
                .mapToInt(x -> x)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    @Override
    public boolean isEqual(Object object1, Object object2) {
        return object1.equals(object2);
    }

    @Override
    public boolean isSameObject(Object object1, Object object2) {
        if (object1 == object2) {
            return true;
        }
        return false;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        List<Integer> integers = new ArrayList<>();
        int i = 0;
        for (Iterator<Integer> it = iterator; it.hasNext(); ) {
            integers.add(it.next());

        }
        return integers;

    }

    @Override
    public int computeSumOfNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int computeSumOfNumbers(int number, NumberFilter numberFilter) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (numberFilter.accept(i)) {
                sum += i;
            }
        }
        return sum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < number; i++) {
           numbers.add(i);
        }
        return numbers;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> occurrencies = new HashMap<>();
        for(Integer number : list){
            if(!occurrencies.containsKey(number)){
                occurrencies.put(number,1);
            } else{
                int mapValue = occurrencies.get(number).intValue();
               occurrencies.put(number, mapValue++ );
            }
        }
        return null;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int start, int end) {
        return new MyIntegerGenerator(start, end);
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
//           IntegerGenerator createIntegerGenerator(1, 10), (n) -> {
//            return n % 2 == 0;
//        });



//        return numberFilter.accept(integerGenerator.getNext());;
        return null;
    }
}

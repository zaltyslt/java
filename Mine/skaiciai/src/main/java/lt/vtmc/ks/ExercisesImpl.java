package lt.vtmc.ks;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;
import java.util.stream.IntStream;

public class ExercisesImpl implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {

        return list
                .stream()
                .mapToInt(v -> v)
                .min().orElseThrow(NoSuchElementException::new);

    }

    @Override
    public Integer findLargest(List<Integer> list) {
        return list
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
    }

    @Override
    public boolean isEqual(Object object1, Object object2) {
        return object1.equals(object2);
    }

    @Override
    public boolean isSameObject(Object object1, Object object2) {
        return object1 == object2;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        List <Integer> numbers = new ArrayList<>();
        while(iterator.hasNext()){
            numbers.add(iterator.next());
        }
        return numbers;
    }

    @Override
    public int computeSumOfNumbers(int end) {
        return IntStream.rangeClosed(1,end).sum();
    }

    @Override
    public int computeSumOfNumbers(int end, NumberFilter numberFilter) {
        return IntStream.rangeClosed(1,end).filter(numberFilter::accept).sum();
    }

    @Override
    public List<Integer> computeNumbersUpTo(int end) {

        return IntStream.rangeClosed(1, end-1).boxed().toList();
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
       Map<Integer,Integer> occurrences = new HashMap<>();
       for (Integer number : list) {
           if (occurrences.containsKey(number)){
               occurrences.put(number, occurrences.get(number)+1);
           } else{
               occurrences.put(number, 1);
           }
       }
       return occurrences;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int start, int end) {

        return new IntegerGeneratorImpl(start, end);
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return new IntegerGeneratorImpl(integerGenerator, numberFilter);
    }
}

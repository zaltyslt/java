package lt.vtmc.ks;

import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class IntegerGeneratorImpl implements IntegerGenerator {
    private Iterator iterator;
    IntegerGenerator integerGenerator;

    private List<Integer> numbers = new ArrayList<>();
    int pos = 0;


    public IntegerGeneratorImpl(int start, int end) {

        numbers.addAll(IntStream.rangeClosed(start, end).boxed().toList());
        iterator = numbers.iterator();
    }

    public IntegerGeneratorImpl(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
       this.integerGenerator = integerGenerator;
       Integer number = integerGenerator.getNext();
        while(number != null) {
            if (numberFilter.accept(number)) {
                numbers.add(number);
            }
            number = integerGenerator.getNext();
        }
        iterator = numbers.iterator();
    }

    @Override
    public Integer getNext() {
       if(iterator.hasNext()){
           return (Integer) iterator.next();
        }
        return null;
       }


}

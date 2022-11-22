package lt.vtmc;

import lt.itakademija.exam.IntegerGenerator;

import java.util.LinkedList;
import java.util.List;

public class MyIntegerGenerator implements IntegerGenerator {
    List<Integer> numbers = new LinkedList<>();
    int pos = 0;

    public MyIntegerGenerator(int start, int end) {

        for(int i = start; i <= end; i++){
            numbers.add(i);
        }
    }

    @Override
    public Integer getNext() {
      if (numbers.size() < pos){
          pos++;
          return  numbers.get(pos-1);
      }

        return null;
    }
}

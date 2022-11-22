package lt.vtmc;

import lt.itakademija.exam.NumberFilter;

import java.util.ArrayList;
import java.util.List;

public class MyNumberFilter implements NumberFilter {
    private List<Integer> numbers = new ArrayList<>();

//    public void addToFilter(int number) {
//        if (!this.numbers.contains(number)) {
//            numbers.add(number);
//        }
//    }



    @Override
    public boolean accept(int number) {
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}

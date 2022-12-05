package algorithms;


import javax.lang.model.element.Element;
import java.util.Arrays;


public class AppMain {

    public static void main(String[] args) {
//        List <Integer> intList = new LinkedList<>();
LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
       Iterator<Integer> iterator = intList.iterator();
        System.out.println(iterator.current());
        System.out.println(iterator.next());


    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        Student third = new Student("Barbs");
//        System.out.println(first.compareTo(second));
        List<Student> list = new ArrayList<>(Arrays.asList(first,second, third));
       // Collections.sort(list);
        list.sort(null);
        System.out.println(list);
    }
}

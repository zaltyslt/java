import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       List<String> strings = Arrays.asList("Uno", "Due", "Tres");
       strings.stream().forEach(System.out::println);
       strings.forEach(System.out::println);
    }

}


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Implement the static method public static List<String> read(String
         file), which reads the file with the filename of the parameter and returns the
         lines as a string list.
         * */


    }
    public static List<String> read(String file){

        return Arrays.stream(file).spliterator("\n").;
    }

}

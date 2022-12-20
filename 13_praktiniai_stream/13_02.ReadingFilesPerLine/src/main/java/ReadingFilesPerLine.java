
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
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
        List <String> tempList = new ArrayList<>();
        try {
            List<String> allLines = Files.readAllLines(Paths.get(file));

            tempList.addAll(allLines);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempList;
    }


}

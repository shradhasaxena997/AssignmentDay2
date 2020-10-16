import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class Assignment6 {
    public static void main(String[] args) {

        //String fileName="/home/knoldus/IdeaProjects/demo/src/main/resources/read";
        Path textFilePath = Paths.get("/home/knoldus/IdeaProjects/demo/src/main/resources/read");
        try {


            System.out.println( Files.lines(Paths.get("/home/knoldus/IdeaProjects/demo/src/main/resources/read"))
                    //.flatMap(line -> Arrays.stream(line.split(" ")))
                    // .map(word -> word.replaceAll("[^a-zA-Z]", ""))
                    //.filter(word -> !word.isEmpty())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
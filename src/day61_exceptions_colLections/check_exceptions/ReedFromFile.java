package day61_exceptions_colLections.check_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReedFromFile {
    public static void main(String[] args)  {   // or throws IOException
        String filePath = "src/day61_exceptions_colLections/check_exceptions/data.txt";

        try {
            List<String> list = Files.readAllLines(Paths.get(filePath));
            System.out.println("First line = " + list.get(0));
            System.out.println();

            for(String each : list){
                System.out.println(each);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("--- THE END ----");

    }
}

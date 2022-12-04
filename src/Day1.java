import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Day1 {
    public static void main(String[] args) throws IOException {
        Day1.mostCalories();
    }

    public static String mostCalories() throws IOException {
        Path filePath = Path.of("C:\\Coding\\Repos MMS\\mms-core-product-importer\\sqlproxy\\dev\\Advent of Code\\input.txt");
        String content = Files.readString(filePath);
        String[] elfen = content.split("\r\n\r\n");
        ArrayList<Integer> sumCal = new ArrayList<>();
        for (int i = 0; i < elfen.length ; i++) {
            String[] elfe = elfen[i].split("\r\n");
            int sum = 0;
            for (int j = 0; j < elfe.length; j++) {
                sum += Integer.parseInt(elfe[j]);

            }
            sumCal.add(sum);

            System.out.println(elfe);
            Collections.sort(sumCal);
            System.out.println(sumCal);
        }
        return content;
    }
}
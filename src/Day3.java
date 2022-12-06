import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Day3 {
    public static void main(String[] args) throws IOException {
        System.out.println(Day3.sumPriosByGroup());

    }

    public static int sumPrios() throws IOException {
        Path filePath = Path.of("C:\\Users\\benpl\\IdeaProjects\\AOC\\Advent of Code\\Day3.txt");
        String content = Files.readString(filePath);
        String[] alleStrings = content.split("\r\n");
        int sum = 0;
        for (String s : alleStrings) {
            String firstHalf = s.substring(0, s.length() / 2);
            String secondHalf = s.substring(s.length() / 2);
            Character duplicate = Day3.checkDuplicate(firstHalf, secondHalf);
            if (Character.isLowerCase(duplicate)) {
                sum += duplicate - 96;
            } else
                sum += duplicate - 38;
        }
        return sum;

    }

    public static int sumPriosByGroup() throws IOException {
        Path filePath = Path.of("C:\\Users\\benpl\\IdeaProjects\\AOC\\Advent of Code\\Day3.txt");
        String content = Files.readString(filePath);
        System.out.println(content);
        List<String> groups = divideElfsIntoGroup(content);
        int sum = 0;
        for (String group : groups) {
            String[] elfs = group.split("\n");
            Character duplicate = checkDuplicate(elfs[0], elfs[1], elfs[2]);
            if (Character.isLowerCase(duplicate)) {
                sum += duplicate - 96;
            } else
                sum += duplicate - 38;
        }
        return sum;
    }


    private static Character checkDuplicate(String elf, String elf1, String elf2) {
        for (int k = 0; k < elf.length(); k++) {
            for (int kp = 0; kp < elf1.length(); kp++)
                for (int i = 0; i < elf2.length(); i++) {
                    {
                        char dulli = elf.charAt(k);
                        char dulliS = elf1.charAt(kp);
                        char dulliss = elf2.charAt(i);
                        if (dulli == dulliS && dulliS == dulliss) {
                            System.out.println(dulli);
                            return dulli;
                        }
                    }
                }
        }
        return null;
    }

    private static List<String> divideElfsIntoGroup(String content) {
        String[] alleStrings = content.split("\r\n");
        List<String> elfs = new ArrayList<>();
        for (int i = 0; i < alleStrings.length; i = i + 3) {
            elfs.add(alleStrings[i] + "\n" + alleStrings[i + 1] + "\n" + alleStrings[i + 2]);
            System.out.println(elfs);
        }
        return elfs;
    }


    public static Character checkDuplicate(String firstHalf, String secondHalf) {
        for (int k = 0; k < firstHalf.length(); k++) {
            for (int kp = 0; kp < secondHalf.length(); kp++) {
                char dulli = firstHalf.charAt(k);
                char dulliS = secondHalf.charAt(kp);
                if (dulli == dulliS) {
                    System.out.println(dulli);
                    return dulli;
                }

            }

        }
        return null;
    }
}


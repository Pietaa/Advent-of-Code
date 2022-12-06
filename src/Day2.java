import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Day2 {
    public static void main(String[] args) throws IOException {
        Day2.highestScore();
    }

    public static int highestScore() throws IOException {
        Path filePath = Path.of("C:\\Users\\benpl\\IdeaProjects\\AOC\\Advent of Code\\Day2.txt");
        String content = Files.readString(filePath);
        String[] games = content.split("\r\n\r\n");
        for (int i = 0; i < games.length; i++) {
            String[] sign = games[i].split("\r\n");
            System.out.println(Arrays.toString(sign));
            int score = 0;
            final int Xrock = 1;
            final int Ypaper = 2;
            final int Zscissor = 3;
            for (int j = 0; j < sign.length; j++) {
                if (sign[i].equals("A X")) {
                    score +=  Zscissor;
                    i++;
                } else if (sign[i].equals("A Y")) {
                    score += 3 + Xrock;
                    i++;
                } else if (sign[i].equals("A Z")) {
                    score += 6 +  Ypaper;
                    i++;
                } else if (sign[i].equals("B X")) {
                    score += Xrock;
                    i++;
                } else if (sign[i].equals("B Y")) {
                    score += 3 + Ypaper;
                    i++;
                } else if (sign[i].equals("B Z")) {
                    score += 6 + Zscissor;
                    i++;
                } else if (sign[i].equals("C X")) {
                    score +=  Ypaper;
                    i++;
                } else if (sign[i].equals("C Y")) {
                    score +=  3 + Zscissor;
                    i++;
                } else if (sign[i].equals("C Z")) {
                    score += 6 + Xrock;
                    i++;
                }
                System.out.println(score);
            }
            return 0;
        }
        return 0;
    }
}
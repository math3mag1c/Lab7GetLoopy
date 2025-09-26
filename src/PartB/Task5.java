package PartB;

public class Task5 {
    public static void main(String[] args) {
        String line;
        for (int i = 1; i <= 5; i++) {
            line = "";
            for (int j = 1; j <= i - 1; j++) {
                line += "* ";
            }
            // line 11 prevents a whitespace after the line
            line += "*";
            System.out.println(line);
        }
    }
}

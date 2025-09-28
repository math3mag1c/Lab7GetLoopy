package PartB;

public class Task7 {
    public static void main(String[] args) {
        String line;
        for (int i = 0; i <= 4; i++) {
            line = "";
            for (int j = 0; j <= 3; j++) {
                line += "* ";
            }
            // line 12 prevents the whitespace from being after the line
            line += "*";
            System.out.println(line);
        }
    }
}

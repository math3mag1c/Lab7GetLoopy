package PartB;

public class Task6 {
    public static void main(String[] args) {
        String line;
        for (int i = 5; i >= 1; i--) {
            line = "";
            for (int j = i-1; j >= 1; j--) {
                line += "* ";
            }
            // line 12 prevents the whitespace from being after the line
            line += "*";
            System.out.println(line);
        }
    }
}

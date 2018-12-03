package cup.example;


import java.io.FileNotFoundException;

public class Driver {

    public static void main (String[] args) {
        System.err.close();
        try {
        	Parser p = new Parser(new TScanner("input.txt"));
            p.parse();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to find file.");
        } catch (Exception e) {
            System.out.println("\n[reject] from catch");
        }
    }
}
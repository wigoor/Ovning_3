import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Ord ord = new Ord();

        System.out.println("===PALINDROM===\n");

        System.out.println(ord.palindrom("test"));
        System.out.println(ord.palindrom("nitalarbralatin"));
        System.out.println(ord.palindrom("madam"));
        System.out.println("------");

        String input = JOptionPane.showInputDialog("Skriv ett ord för att kontrollera Palindrom: ");
        System.out.println(ord.palindrom(input));


        System.out.println("\n===ISOGRAM===\n");

        System.out.println(ord.isogram("test"));
        System.out.println(ord.isogram("tesa"));
        System.out.println("------");

        input = JOptionPane.showInputDialog("Skriv ett ord för att kontrollera Isogram: ");
        System.out.println(ord.isogram(input));

        System.out.println("\n===PANGRAM===\n");

        System.out.println(ord.pangram("hej jag heter tobias vad heter du?"));
        System.out.println(ord.pangram("abcdefghijklmno pqrstuvwxyzåäö"));
        System.out.println(ord.pangram("abcdeghijklmnopqrstuvwxyzååäö"));
        System.out.println(ord.pangram("abcsdefglhiakjklsmdjnopqfdlhrstuvwgxhfyzåädsö"));
        System.out.println(ord.pangram("abcsdefglhiakjklsmdjnopqfdlhrstuvwgxhfyzåädsö23412"));
        System.out.println(ord.pangram("abcsdefglhiakjklsmdjnopqfdlhrstuvwgxhfyzåädsö2341#¤%2"));
        System.out.println("------");

        input = JOptionPane.showInputDialog("Skriv ett ord för att kontrollera Isogram: ");
        System.out.println(ord.pangram(input));


    }
}

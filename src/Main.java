import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        C c = new C();
        c.C();
        c.C();
        c.C();
        System.out.println(c.getId());
        c.C();
        c.C();
        System.out.println(C.getTotaltAntal());

        //Ord ord = new Ord();


        System.out.println("===PALINDROM===\n");


        System.out.println(Ord.palindrom("test"));
        System.out.println(Ord.palindrom("nitalarbralatin"));
        System.out.println(Ord.palindrom("madam"));
        System.out.println("------");

        String input = JOptionPane.showInputDialog("Skriv ett ord för att kontrollera Palindrom: ");
        System.out.println(Ord.palindrom(input));


        System.out.println("\n===ISOGRAM===\n");

        System.out.println(Ord.isogram("test"));
        System.out.println(Ord.isogram("tesa"));
        System.out.println("------");

        input = JOptionPane.showInputDialog("Skriv ett ord för att kontrollera Isogram: ");
        System.out.println(Ord.isogram(input));

        System.out.println("\n===PANGRAM===\n");

        System.out.println(Ord.pangram("hej jag heter tobias vad heter du?"));
        System.out.println(Ord.pangram("abcdefghijklmno pqrstuvwxyzåäö"));
        System.out.println(Ord.pangram("abcdeghijklmnopqrstuvwxyzååäö"));
        System.out.println(Ord.pangram("abcsdefglhiakjklsmdjnopqfdlhrstuvwgxhfyzåädsö"));
        System.out.println(Ord.pangram("abcsdefglhiakjklsmdjnopqfdlhrstuvwgxhfyzåädsö23412"));
        System.out.println(Ord.pangram("abcsdefglhiakjklsmdjnopqfdlhrstuvwgxhfyzåädsö2341#¤%2"));
        System.out.println("------");

        input = JOptionPane.showInputDialog("Skriv ett ord för att kontrollera Isogram: ");
        System.out.println(Ord.pangram(input));


    }
}

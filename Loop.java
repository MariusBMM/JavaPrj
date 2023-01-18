import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // while
        // gaseste pozitia caracterelor dintr-un text si prezinta caracterul aferent pozitiei
        Scanner console = new Scanner(System.in);
        String text;
        System.out.print("Introduceti Textul: ");
        text = console.nextLine();

        int counter = 1;
        int index = 0;

        while (counter <= text.length()) {
            System.out.println("Textul dvs este: " + "'" + text + "'" + " Caracterul nr:" + counter + " este: '" + text.charAt(index) + "'");
            counter = counter + 1;
            index = index+1;
        }
        System.out.println("Nr total caractere:" + text.length());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // for si for-each
        // prezinta indexul fiecarui caracter din text daca este nr par
        index = 0;
        for ( int i = 0; i < text.length(); i=i+2) {
            System.out.println("Textul dvs este: '" + text + "'  indexul este: " + i + " caracterul de control: '" + text.charAt(index) + "'");
            index = index+1;
        }
        // for-each

    }
}

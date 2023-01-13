import java.util.Scanner;

public class Variabile {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // variabile
        // declarare
        System.out.println("Variabile! int, String, double, float, boolean, char");
        System.out.println("Declarare Variabile!");
        int numarIntreg;
        String text;
        double numarDouble;
        float numarFloat;
        boolean optiune;
        char caracter;

        // initializare variabile
        System.out.println("=================================");
        Scanner console = new Scanner(System.in);

        System.out.print("Introduceti Nume: ");
        text = console.nextLine();
        System.out.print("Introduceti nr intreg: ");
        numarIntreg = console.nextInt();
        System.out.print("Introduceti nr cu zecimale: ");
        numarDouble = console.nextDouble();
        System.out.print("Introduceti nr flooat: ");
        numarFloat = console.nextFloat();
        System.out.print("Introduceti True/False: ");
        optiune = console.hasNextBoolean();
        caracter = text.charAt(0);  // ia primul cararcter din text
        System.out.println("=================================");

        // printare variabile
        System.out.println("Printare Variabile!");
        System.out.println("int: " + numarIntreg);
        System.out.println("String: " + text);
        System.out.println("Double: " + numarDouble);
        System.out.println("Float: " + numarFloat);
        System.out.println("Boolean: " + optiune);
        System.out.println("char: " + caracter);
        // print f
        System.out.printf("Variabile: " + numarIntreg + " " + text + " " + numarDouble + " " + numarFloat + " " + optiune + " " + caracter +  " final!Print f ");
        System.out.println("=================================");
        System.out.println("caracter = " + caracter);
        System.out.println("numarFloat = " + numarFloat);

    }
}

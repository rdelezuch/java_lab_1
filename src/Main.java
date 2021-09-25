import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        System.out.println("Zadanie 1\n");

        int liczbaInt = 1010;
        byte liczbaByte = 1;
        long liczbaLong = 101010110;
        short liczbaShort = 1011;
        double liczbaDouble = 10.10;
        float liczbaFloat = 10.11f;
        char zmiennaChar = 'r';
        String zmiennaString = "Smacznej kawusi";

        System.out.println("Losowe liczby: " + liczbaByte + " " + liczbaDouble + " " + liczbaFloat + " " + liczbaInt +
                " "+ liczbaLong + " " + liczbaShort);
        System.out.println("Losowy znak: " + zmiennaChar);
        System.out.println(zmiennaString);
        System.out.println();
        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        System.out.println("Zadanie 2\n");
        System.out.println("Przykład a)\n");

        int liczbaA = 4, liczbaB = 2;

        System.out.println("Wynik odejmowania: " + (liczbaA - liczbaB));
        System.out.println("Wynik dodawania: " + (liczbaA + liczbaB));
        System.out.println("Wynik mnożenia: " + (liczbaA * liczbaB));
        System.out.println("Wynik dzielenia: " + (liczbaA / liczbaB));
        System.out.println("Wynik modulo: " + (liczbaA % liczbaB));

        System.out.println("\nPrzykład b)\n");

        double liczbaX = 2.2, liczbaY = 3.4;

        System.out.println("Wynik odejmowania: " + (liczbaX - liczbaY));
        System.out.println("Wynik dodawania: " + (liczbaX + liczbaY));
        System.out.println("Wynik mnożenia: " + (liczbaX * liczbaY));
        System.out.println("Wynik dzielenia: " + (liczbaX / liczbaY));
        System.out.println("Wynik modulo: " + (liczbaX % liczbaY));
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadanie 1\n");

        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();

        if (wiek % 3 == 0)
        {
            System.out.println("Twoj wiek jest podzielny przez 3");
        }
        else
        {
            System.out.println("Twój wiek jest niepodzielny przez 3");
        }


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        System.out.println("\nZadanie 2\n");

        System.out.print("Podaj nr indeksu: ");
        int nrIndeksu = scan.nextInt();

        if (nrIndeksu % 2 == 0 || nrIndeksu % 4 == 0 || nrIndeksu % 8 == 0)
        {
            System.out.println("Twoj nr indeksu jest parzysty");
        }
        else
        {
            System.out.println("Twój nr indeksu nie jest parzysty");
        }

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.println("\nZadanie 3\n");

        System.out.print("Podaj liczbę zmiennoprzecinkową: ");
        double liczba = scan.nextDouble();

        if (liczba < 0)
        {
            System.out.println("Liczba jest mniejsza niż 0");
        }
        else if (liczba > 100)
        {
            System.out.println("Liczba jest większa od 100");
        }
        else
        {
            System.out.println("Liczba jest pomiędzy 0 a 100");
        }
    }
}

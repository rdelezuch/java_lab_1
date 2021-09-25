import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        System.out.println("zadanie 1\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = scan.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("Podaj nr indeksu: ");
        String nrIndeksu = scan.next();

        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();

        System.out.println("\nWprowadzone dane to: \n");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.printf("Nr indeksu: %s\n", nrIndeksu);
        System.out.printf("Wiek: %d\n", wiek);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        System.out.println("\n zadanie 2\n");

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scan.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scan.nextInt();

        System.out.println("\nWyniki działań na tych 2 liczbach\n");

        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        System.out.printf("%d %s %d = %d\n", a,"%", b, a%b);

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        int[] tab = {34, 54, 23, 1, 100};

        for (int i = 0; i < tab.length; i++)
        {
            System.out.println("Liczba "+(i+1)+ ": " + tab[i]);
        }

    }
}

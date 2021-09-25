import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true, b = true, c = false;
        int x = 2, y = 4, z = -3;

        System.out.println("("+a+"&&"+c+") || ("+!b+"&&"+a+") = " + ((a && c) || (!b && a)));
        System.out.println("((("+x+"+"+y+")>"+z+") || ("+y+"=="+z+")) && ("+x+"!="+z+") = " + ((((x+y)>z) || (y==z)) && (x != z)));

    }
}

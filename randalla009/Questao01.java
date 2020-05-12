import java.util.Scanner;

public class Questao01 {
    public static void main (String[] args) {
        int n;
        Scanner s;

        s = new Scanner(System.in);

        System.out.println("**Programa Gerador de Tabuada**");
        System.out.print("Numero:");
        n = s.nextInt();

        System.out.println(n + "x1 = " + (1*n));
        System.out.println(n + "x2 = " + (2*n));
        System.out.println(n + "x3 = " + (3*n));
        System.out.println(n + "x4 = " + (4*n));
        System.out.println(n + "x5 = " + (5*n));
        System.out.println(n + "x6 = " + (6*n));
        System.out.println(n + "x7 = " + (7*n));
        System.out.println(n + "x8 = " + (8*n));
        System.out.println(n + "x9 = " + (9*n));
        System.out.println(n + "x10 = " + (10*n));
    }
}

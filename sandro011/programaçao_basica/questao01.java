import java.util.Scanner;
public class questao01 {
    public static void main  (String[] args) {
        Scanner s;
        int n;

        s = new Scanner (System.in);
        System.out.println("** gerador de tabuada**");
        System.out.print(" informe o numero: ");
        n = s.nextInt();

        System.out.println(n + " x 1 = " + (1 * n));
        System.out.println(n + " x 2 = " + (2 * n));
        System.out.println(n + " x 3 = " + (3 * n));
        System.out.println(n + " x 4 = " + (4 * n));
        System.out.println(n + " x 5 = " + (5 * n));
        System.out.println(n + " x 6 = " + (6 * n));
        System.out.println(n + " x 7 = " + (7 * n));
        System.out.println(n + " x 8 = " + (8 * n));
        System.out.println(n + " x 9 = " + (9 * n));
        System.out.println(n + " x 10 = " + (10 * n));
    }
}

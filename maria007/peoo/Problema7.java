import java.util.Scanner;

public class Problema7 {
        public static void main(String[] args) {
        Scanner S;
        int a;
        int b;
        int x;
        int y;

        S = new Scanner(System.in);
        System.out.println("Informe o valor de a: ");
        a = S.nextInt();
        System.out.println("Informe o valor de b: ");
        b = S.nextInt();

        x = a;
        y = b;


        System.out.println("Inicialmente a era " + a + " mas se tornou " + y + ".");
        System.out.println("Inicialmente b era " + b + " mas se tornou " + x + ".");

    }
}

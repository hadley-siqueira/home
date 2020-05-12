import java.util.Scanner;

public class questao11 {
    public static void main (String[] args) {
        double p1;
        double p2;
        double p3;
        double p4;
        double n1;
        double n2;
        double n3;
        double n4;
        double r;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Calculadora de media ponderada**");

        System.out.println("Informe o primeiro peso:");
        p1 = s.nextDouble();
        System.out.println("Informe o segundo peso:");
        p2 = s.nextDouble();
        System.out.println("Informe o terceiro peso:");
        p3 = s.nextDouble();
        System.out.println("Informe o quarto peso:");
        p4 = s.nextDouble();

        System.out.println("Informe a primeira nota:");
        n1 = s.nextDouble();
        System.out.println("Informe a segunda nota:");
        n2 = s.nextDouble();
        System.out.println("Informe a terceira nota:");
        n3 = s.nextDouble();
        System.out.println("Informe a quarta nota:");
        n4 = s.nextDouble();

        r = (p1 *n1 + p2 * n2 + p3 * n3 + p4 * n4)/(p1 + p2 + p3 + p4);

        System.out.println( );
        System.out.println("O resultado eh:" + r);
    }
}

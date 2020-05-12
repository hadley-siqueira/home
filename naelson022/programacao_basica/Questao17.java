import java.util.Scanner;

public class Questao17 {
    public static void main (String [] args ) {
        Scanner s;
        double w;
        double u;
        s = new Scanner (System.in);
        System.out.println("calcule de dinheiro");
        u = 0;
        System.out.print(" informe a quantidade de moedas 1  centavos");
        w = s.nextInt ();
        u = u + w * 0.01;

        System.out.print(" informe a quantidade de moedas 5  centavos");
        w = s.nextInt ();
        u = u + w * 0.05;

        System.out.print(" informe a quantidade de moedas 10  centavos");
        w = s.nextInt ();
        u = u + w * 0.10;

        System.out.print(" informe a quantidade de moedas 25  centavos");       w = s.nextInt ();
        u = u + w * 0.25;

        System.out.print(" informe a quantidade de moedas 50  centavos");
        w = s.nextInt ();
        u = u + w * 0.50;

        System.out.print(" informe a quantidade de moedas 1 real");
        w = s.nextInt ();
        u = u + w * 1.00;
        System.out.println(" o dinheiro economizado eh " + u);

    }
}

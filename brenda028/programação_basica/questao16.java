import java.util.Scanner;

public class questao16 {
    public static void main (String [] args) {
        Scanner s;
        double a;
        double e;
        double i;
        double o;
        s = new Scanner(System.in);
        System.out.print(" Informe a quantidade de frangos: ");
        a = s.nextInt ();
        e = 3.5 * a * 2;
        i = a * 4;
        o = e + i;
        System.out.println(" O custo dos chips vai ser: " + o);

    }
}

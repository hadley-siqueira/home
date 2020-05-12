import java.util.Scanner;

public class questao16 {
    public static void main (String [] args ) {
        Scanner s;
        double n;
        double f;
        double e;
        double q;
        s = new Scanner(System.in);
        System.out.print(" informe a quantidade frangos: ");
        n = s.nextInt ();
        f = 3.5 * n * 2;
        e = n * 4;
        q = f + e;
        System.out.println(" o custo dos chips vai ser: " + q );
    }
}



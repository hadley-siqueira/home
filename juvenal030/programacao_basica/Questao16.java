import java.util.Scanner;

public class Questao16 {
    public static void main (String [] args ) {
        Scanner s;
        double x;
        double z;
        double g;
        double h;
        s = new Scanner(System.in);
        System.out.print(" informe a quantidade de frangos: ");
        x = s.nextInt ();
        z = 3.5 * x * 2;
        g = x * 4;
        h = z + g;
        System.out.println(" o custo dos chips vsi ser: " + h );
    }
}

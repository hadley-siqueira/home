import java.util.Scanner;

public class questao15 {
    public static void main (String[] args) {
        Scanner s;
        double a;
        double b;
        s = new Scanner (System.in);
        System.out.println(" Informe quantos graus: ");
        a = s.nextInt ();
        b = 1.8 * a + 32;
        System.out.println(b);

    }
}

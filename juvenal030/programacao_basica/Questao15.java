import java.util.Scanner;

public class Questao15 {
    public static void main (String [] args ){
        Scanner s;
        double c;
        double x;
        s = new Scanner (System.in);
        System.out.println("informe quantos graus: ");
        c = s.nextInt ();
        x = 1.8 * c + 32;
        System.out.println(x);
    }
}

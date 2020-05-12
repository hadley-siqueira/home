import java.util.Scanner;

public class questao15 {
    public static void main (String [] args ){
        Scanner s;
        double c;
        double f;
        s = new Scanner (System.in);
        System.out.println("informe quantos graus: ");
        c = s.nextInt ();
        f = 1.8 * c + 32;
        System.out.println("a quantidade de graus em fahrenheit eh: " + f );
    }
}


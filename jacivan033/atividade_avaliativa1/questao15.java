import java.util.Scanner;

public class questao15 {
    public static void main (String[] args) {
        Scanner s;
        double c;
        double f;
        s = new Scanner (System.in);
        System.out.println("Informe quantos graus: ");
        c = s.nextInt();
        f = 1.8 * c + 32;
        System.out.println(f);
    }
}        

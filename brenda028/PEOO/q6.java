wv
import java.util.Scanner;

public class q6 {
    public static void main (String[] args) {
        Scanner s;
        double a;
        double b;
        double c;
        double d;
        double e;
        s = new Scanner(System.in);

        System.out.print("PREÇO DA REFEIÇÃO REALIZADA:");
        a = s.nextInt();
        System.out.print("QUAL A PORCENTAGEM DO GARÇOM:");
        c = s.nextInt();

        b = ((c *0.01) * a);
        d = a;
        e = a + b;

        System.out.println("COMISSAO DO GARÇOM: " + c + " reais ");
        System.out.println("SUBTOTAL: " + d + " reais ");
        System.out.println("TOTAL: " + e + " reais ");

    } 
}

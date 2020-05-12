import java.util.Scanner;
public class q5 {
    public static void main (String[] args) {

        Scanner s;
        double a;
        double b;
        double c;
        double d;
        s = new Scanner(System.in);

        System.out.print("preço da refeição realizada:");
        a = s.nextFloat();
        b =0.1 * a;
        c = a;
        d = a + b;

        System.out.println("a comissão do garçom: " + b + " reais ");
        System.out.println("o subttotal: " + c + " reais ");
        System.out.println("total: " + d + " reais ");

    }
}

import java.util.Scanner;

public class questao09 {
    public static void main (String [] args ) {
        Scanner s = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print(" Informe quanto o salgado custava: ");
        a = s.nextDouble();
        System.out.print(" Informe quanto o salgado custa: ");
        b = s.nextDouble();
        System.out.print(" Quanto dinheiro você tem: ");
        c = s.nextDouble();

        int d = (int) (c / a);
        int e = (int) (c / b);
        System.out.print(" Com esse dinheiro você comprava " + d + " salgado ");
        System.out.print(" Com esse dinheiro você compra " + e + " salgado ");

    }
}

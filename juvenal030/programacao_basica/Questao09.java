import java.util.Scanner;

public class Questao09 {
    public static void main (String [] args ) {
        Scanner s = new Scanner(System.in);
        double x;
        double c;
        double v;

        System.out.print("informe quanto o salgado custava:");
        x = s.nextDouble();

        System.out.print("informe quanto o salgado custa:");
        c = s.nextDouble();
        System.out.print("quanto dinheiro voce tem :");
        v = s.nextDouble();
        int z = (int)(v / x);
        int d = (int)(v / c);
        System.out.print("com este dinheiro voce comprava " + z + " salgados");
        System.out.print("com este dinheiro voce compra " + d + " salgados");
    }

}

import java.util.Scanner; 

public class questao09 {
    public static void main (String [] args ) {
        Scanner s = new Scanner(System.in);
        double x;
        double c;
        double v;

        System.out.print("informe quanto o salgado custava: ");
        x = s.nextDouble();
    
        System.out.print("informe quanto o salgado custa: ");
        c = s.nextDouble();
        System.out.print("quanto dinheiro vc tem: ");
        v = s.nextDouble();
        int h = (int) (v / x);
        int d = (int) (v / c);
        System.out.println("com esse dinheiro voce comprava " + h + " salgados");
        System.out.println("com esse dinheiro voce compra " + d + " salgados");
    }
}

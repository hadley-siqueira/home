import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        double a, b, c;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite os tres numeros: ");
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();

        if (a < b && a < c) {
            System.out.println("O menor valor eh " + a);
        } else if (b < a && b < c) {
            System.out.println("O menor valor eh " + b);
        } else {
            System.out.println("O menor valor eh " + c);
        }
    }
}

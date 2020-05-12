import java.util.Scanner;

public class questao13 {
    public static void main (String[] args) {
        Scanner s;
        double n;
        double u;
        double i;
        double o;
        double x;
        double y;
        double d;
        s = new Scanner (System.in);
        System.out.println("Informe o x1: ");
        n = s.nextInt();
        System.out.println("Informe o x0: ");
        u = s.nextInt();
        System.out.println("Informe o y1: ");
        i = s.nextInt();
        System.out.println("Informe o y0: ");
        o = s.nextInt();
        x = (n - u) * (n - u);
        y = (o - i) * (o - i);
        d = Math.sqrt(x + y);
        System.out.println("A distancia eclidiana eh " + d);
    }
}

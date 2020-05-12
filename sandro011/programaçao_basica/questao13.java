import java.util.Scanner;

public class questao13 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        double ss;
        double u;
        double n;
        double x;
        double i;
        double y;
        double t;

        System.out.print("informe o x1: ");
        ss = s.nextDouble();

        System.out.print("informe o x0: ");
        u = s.nextDouble();

        System.out.print("informe o y1: ");
        n = s.nextDouble();
        
        System.out.print("informe o y0: ");
        x = s.nextDouble();
        
        i = (ss - u) * (ss - u);
        y = (n - x) * (n - x);
        t = Math.sqrt(x + y);
        System.out.println("a distancia eucliadiana " + t );
    }
}

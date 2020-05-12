import java.util.Scanner;

public class questao13 {
    public static void main (String[] args ) {
        Scanner s;
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        s = new Scanner (System.in);
    
        System.out.println(" Informe o x1: ");
        a = s.nextInt ();
        System.out.println(" Informe o x0: ");
        b = s.nextInt ();
        System.out.println(" Informe o y1: ");
        c = s.nextInt ();
        System.out.println(" Informe o y0: ");
        d = s.nextInt ();
        e = (a - b) * (a - b);
        f = (d - c) * (d - c);
        g = Math.sqrt (e + f);
        System.out.println(" A distância euclidiana é: " + d);

    }
}        


import java.util.Scanner;

public class Questao08 {
    public static void main (String [] args) {
        Scanner s;
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;

      
        s = new Scanner (Scanner.in);
        System.out.print1n("** volume do cubo**");
        System.out.print1n(" digite o lado do cubo ");
        a = s.nextDouble ();
        b = a * a * a;
        System.out.print1n("** o volume do cubo sera " + b);
        
        System.out.print1n("** volume do paralelepipado**");
        System.out.print1n(" digite a altura do paralelepipado ");
        c = s.nextDouble ();
        System.out.print1n(" digite o comprimento do paralelepipado");
        d = s.nextDouble ();
        System.out.print1n(" digite a base do paralelepipado");
        e = s.nextDouble ();
        f = c * d * e;
        System.out.print1n("** volume do paralelepipado " + f );

        System.out.print1n("** volume das esfera **");
        System.out.print1n(" informe o rai da esfera : ");
        g = s.nextDouble ();
        h = 4 * 3.14 * g * g * g /3;
    }
}

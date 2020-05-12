import java.util.Scanner;

public class Questao11 {
    public static void main (String [] args ) {
        Scanner s;
        double n;
        double l;
        double h;
        double a;
        double e;
        double k;
        double u;
        double p;
        double o;
        double z;
        double y;

        s = new Scanner (System.in);
        System.out.print(" informe sua nota do primeiro bimestre ");
         n= s.nextDouble();
        System.out.print(" informe sua nota do segundo bimestre ");
        l = s.nextDouble();
        System.out.print(" informe sua nota do terceiro bimestre ");
        h = s.nextDouble();
        System.out.print(" informe sua nota do quarto bimestre ");
        a = s.nextDouble();
        System.out.print(" informe seu peso do primeiro bimestre ");
        e = s.nextDouble();
        System.out.print(" informe seu peso do sengundo bimestre ");
        k = s.nextDouble();
        System.out.print(" informe seu peso do terceiro bimestre ");
        u = s.nextDouble();
        System.out.print(" informe seu peso do quarto bimestre ");
        p = s.nextDouble();
        o = n * e + l * k + h * u + a * p;
        z = e + k + u + p;
        y = o/z;
        System.out.println(" sua media ponderada eh " + y);




    }
} 

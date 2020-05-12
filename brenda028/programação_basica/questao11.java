import java.util.Scanner;

public class questao11 {
    public static void main (String [] args) {
        Scanner s;
        double n;
        double l;
        double h;
        double a;
        double e;
        double k;
        double u;
        double p;
        double b;
        double z;
        double y;
        s = new Scanner (System.in);
        System.out.print(" Informe sua nota do primeiro bimestre: " );
        n = s.nextDouble();
        System.out.print(" Informe sua nota do segundo bimestre: " );
        l = s.nextDouble();
        System.out.print(" Informe sua nota do terceiro bimestre: " );
        h = s.nextDouble();
        System.out.print(" Informe sua nota do quarto bimestre: ");
        a = s.nextDouble();
        System.out.print(" Informe o peso do primeiro bimestre: ");
        e = s.nextDouble();
        System.out.print(" Informe o peso do segundo bimestre: ");
        k = s.nextDouble();
        System.out.print(" Informe o peso do terceiro bimestre: ");
        u = s.nextDouble();
        System.out.print(" Informe o peso do quarto bimestre: ");
        p = s.nextDouble();
        
        b = n * e + l * k + h * u + a * p;
        z = e + k + u + p;
        y = b/z;
        
        System.out.println(" Sua média ponderada é: " + y); 

    }
} 


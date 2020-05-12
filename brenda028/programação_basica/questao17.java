import java.util.Scanner;

public class questao17 {
    public static void main (String[] args) {
        Scanner s;
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;
        double j;
        double i;
        double k;

        s = new Scanner (System.in);
        System.out.println(" >>Calcule o dinheiro do cofrinho<< ");
        
        System.out.print(" Informe a quantidade de moedas de 1 centavo: ");
        a = s.nextInt ();
        g = a * 0.01;

        System.out.print(" Informe a quantidade de moedas de 5 centavos: ");
        b = s.nextInt ();
        a = b * 0.05;

        System.out.print(" Informe a quantidade de moedas de 10 centavos: ");
        c = s.nextInt ();
        h = c * 0.10;
    
        System.out.print(" Informe a quantidade de moedas de 25 centavos: ");
        d = s.nextInt ();
        a = d * 0.25; 

        System.out.print(" Informe a quantidade de moedas de 50 centavos: ");
        e = s.nextInt ();
        i = e * 0.50;

        System.out.print(" Informe a quantidade de moedas de 1 real: ");
        f = s.nextInt ();
        j = f * 1.00;

        k = g + a + h + a + i + j;
        System.out.println(" O dinheiro economizado é: " + k);
    }
}

 

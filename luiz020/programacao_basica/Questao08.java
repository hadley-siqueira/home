import java.util.Scanner;

public class Questao08 {

    public static void main (String [] args) {

        Scanner k;
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;

        k = new Scanner (System.in);
        System.out.println(" Volume do Cubo ");
        System.out.println("Informe o lado do cubo: ");
        a = k.nextDouble ();
        b = a * a * a;
        System.out.println("O volume do cubo eh: " + b);

        System.out.print(" Volume do Paralelepípedo ");
        System.out.print("Informe a altura do paralelepípedo: ");
        c = k.nextDouble ();
        System.out.println("Informe o comprimento do paralelepípedo: ");
        d = k.nextDouble ();
        System.out.println("Informe a base do paralelepípedo: ");
        e = k.nextDouble ();
        f = c * d * e;
        System.out.println("O volume do paralelepípedo eh: " + f );

        System.out.print(" Volume da Esfera ");
        System.out.println("Informe o raio da esfera: ");
        g = k.nextDouble ();
        h = 4 * 3.14 * g * g * g/3;
        System.out.print("O volume da esfera eh: " + h);

        }}
 

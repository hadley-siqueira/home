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
	System.out.println("** volume do cubo**");
	System.out.println(" digite o lado do cubo ");
	a = s.nextDouble ();
	b = a * a * a;
	System.out.println(" o volume do cubo sera " + b);

	System.out.println("** volume do paralelepipado**");
	System.out.println(" digite a altura do paralelepipado ");
	c = s.nextDouble ();
	System.out.println(" digite o comprimento do paralelepipado");
	d = s.nextDouble ();
	System.out.println(" digite a base do paralelepipado");
	e = s.nextDouble ();
	f = c * d * e;
	System.out.println(" o volume do paralelepipado " + f );

	System.out.println("** volume das esfera **");
	System.out.println(" informe o rai da esfera : ");
	g = s.nextDouble ();
	h = 4 * 3.14 * g * g * g /3;
    }
}

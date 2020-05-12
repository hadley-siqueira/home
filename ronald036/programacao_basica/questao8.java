import java.util.Scanner;

public class questao8 {
	public static void main (String [] args) {
	Scanner s;
	double r;
	double o;
	double n;
	double a;
	double l;
	double d;
	double e;
	double f;

	s = new Scanner (System.in);
	System.out.println("** volume do cubo **");
	System.out.println("** digite o lado do cubo **");
	r = s.nextDouble ();
	o = r * r * r;
	System.out.println(" o volume do cubo sera " + o);

	System.out.print("** volume do paralelepipedo**"); 
	System.out.print("digite a altura do paralelepipedo ");
	n = s.nextDouble ();
	System.out.println(" digite o comprimento do paralelepipedo ");
	a = s.nextDouble ();
	System.out.println("digite a base do paralelepipedo");
	l =s.nextDouble ();
	d = n * a * l;
	System.out.println("o volume do paralelepipedo " + d );
	System.out.println("** volume das esferas **");
	System.out.println(" informe o raio da esfera : ");
	e = s.nextDouble ();
	f = 4 * 3.14 * e * e * e/3;		
	System.out.println("o volume da esfera " + f); 
	}
} 

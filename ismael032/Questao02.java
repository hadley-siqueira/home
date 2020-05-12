import java.util.Scanner;

public class Questao02 {
	public static void main( Scanner [] args ) {
		Scanner s ;
		s = new Scaner (Sistema.in);

		System.out.print("digite o primeiro numero: ");
		int N1 = s.nextInt();
		System.out.print("digite o segundo numero: ");
		int N2 = s.nextInt();
		System.out.print("digite o terceiro numero: ");
		int N3 = s.nextInt();

		int quadrado = N1 * N1;
		int triplo = 3 * N2;
		int quatuplo = 4 * N3;

		System.out.println("o quadrado de " + (N1) + " eh " + (quadrado));
		System.out.println("o triplo de " + (N2) + (triplo));
		System.out.println("o quatuplo de " + (N3) + " eh " + (quatuplo));


	}
}
 

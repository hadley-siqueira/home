import java.util.Scanner;

public class questao15 {
	public static void main (String[] args) {
	double temperatura_celsius;
	double temperatura_farenheit;
	Scanner s;
	s = new Scanner (System.in);

	System.out.println("*** programa para converter de celsius para farenheit ***");
	System.out.println("Digite a temperatura desejada em celsius: ");
	temperatura_celsius = s.nextDouble();

	temperatura_farenheit = temperatura_celsius * 1.8 + 32;
	System.out.println("A temperatura de farenheit é de " + (temperatura_farenheit));
}
}

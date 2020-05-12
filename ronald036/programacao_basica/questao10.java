import java.util.Scanner;

public class questao10 {
	public static void main(String [] args) {
	double horas;
	double segundos;
	Scanner s;
	s = new Scanner (System.in);
	
	System.out.println("*******programa para transformar horas em segundos*******");

	System.out.print("Digite a hora que você quer: ");
	horas = s.nextDouble();

	segundos = horas * 3600;
	System.out.println("estes horas em segundos é de:" + (segundos));
}
	}

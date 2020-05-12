import java.util.Scanner;

public class questao16 {
	public static void main(String [] args){
	int qtd_frangos;
	double custo;
	Scanner s;
	s = new Scanner (System.in);

	System.out.println("*** programa para o custo de anéis e para os frangos***");
	System.out.println(" digite a quantidade desejada de frangos: ");
	qtd_frangos = s.nextInt();

	custo = 4 + 3.50 * 2 * qtd_frangos;
	System.out.println("O custo desses anéis para frangos é de" + (custo));
}}
	

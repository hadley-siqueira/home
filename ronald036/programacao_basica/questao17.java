import java.util.Scanner;

public class questao17{ 
	public static void main (String[] args){
	int qtd_moedas_1_centavos;
	int qtd_moedas_5_centavos;
	int qtd_moedas_10_centavos;
	int qtd_moedas_25_centavos;
	int qtd_moedas_50_centavos;
	int qtd_moedas_1_real;
	double valor_reais;
	Scanner s;
	s = new Scanner (System.in);

	System.out.println("*** programa da poupança de pedro ***");

	System.out.print(" digite a quantidade de moedas desejadas: ");
	qtd_moedas_1_centavos = s.nextInt();

	System.out.print(" digite a quantidade de moedas desejadas: ");
	qtd_moedas_5_centavos = s.nextInt();

	
	System.out.print(" digite a quantidade de moedas desejadas: ");
	qtd_moedas_10_centavos = s.nextInt();


	System.out.print(" digite a quantidade de moedas desejadas: ");
	qtd_moedas_25_centavos = s.nextInt();


	System.out.print(" digite a quantidade de moedas desejadas: ");
	qtd_moedas_50_centavos = s.nextInt();


	System.out.print(" digite a quantidade de moedas desejadas: ");
	qtd_moedas_1_real = s.nextInt();

	
	valor_reais = qtd_moedas_1_centavos * 0.01 + qtd_moedas_5_centavos * 0.05 + qtd_moedas_10_centavos * 0.10 + qtd_moedas_25_centavos * 0.25 + qtd_moedas_50_centavos * 0.50 + qtd_moedas_1_real * 1.00;

	System.out.println("o valor poupado de pedro em reais é de" + (valor_reais));
}}








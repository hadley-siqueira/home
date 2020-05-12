import java.util.Scanner;

public class questao12{
	public static void main (String[] args) {
	int qtd_camisas_pequenas;
	int qtd_camisas_médias;
	int qtd_camisas_grandes;
	int qtd_total;
	int valor_recebido;
	Scanner s;
	s = new Scanner (System.in);

	System.out.println("*** Dinheiro das camisas ***");

	System.out.print("Digite a quantidades de camisas pequenas: ");
	qtd_camisas_pequenas = s.nextInt();

	System.out.print("Digite a quantidade de camisas médias: ");
	qtd_camisas_médias = s.nextInt();
	
	System.out.print("digite a quantidade de camisas grandes: ");
	qtd_camisas_grandes = s.nextInt();

	qtd_total = qtd_camisas_pequenas + qtd_camisas_médias + qtd_camisas_grandes;
	valor_recebido = qtd_camisas_pequenas*10 + qtd_camisas_médias*12 + qtd_camisas_grandes*15;
	System.out.println("A quantidade total será de " + (qtd_total));
	System.out.println("O valor recebido será de " + (valor_recebido));
}
}

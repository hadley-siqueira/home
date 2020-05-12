import java.util.Scanner;
public class questao9{
	public static void main(String [] args){
	double qtd_dinheiro;
	double valor_agora;
	double qtd_salgados;
	Scanner s;
	s = new Scanner (System.in);
	
	System.out.println("****** CANTINA IFRN ******");
	
	System.out.print("Digite a quantidade de dinheiro: ");
	qtd_dinheiro = s.nextDouble();

	System.out.print("Digite o valor atual: ");
	valor_agora = s.nextDouble();

	qtd_salgados = qtd_dinheiro/valor_agora;

	System.out.println("A quantidade de salgados será de " + (qtd_salgados));

	}
}


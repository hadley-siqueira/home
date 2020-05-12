import java.util.Scanner;

public class questao5 {
   public static void main(String[] args) {
	int simples;
	int completo;
	int lucro;
	Scanner k;
	k = new Scanner (System.in);
	
	System.out.println("** seguradora xyz **");
	System.out.println("     >> Sistema de avaliação <<");
	
	System.out.print("quantidade de contratos simples : ");
	simples = k.nextInt();

	System.out.print("quantidade de contratos completos : ");
	completo = k.nextInt();

	lucro = simples * 2300 + completo * 3500;

	System.out.println("lucro obtido: R$ " + (lucro));	
	
	}}


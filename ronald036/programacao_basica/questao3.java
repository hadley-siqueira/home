import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int casamento, certidao,total;

Scanner leitor= new Scanner (System.in);

System.out.println("digite quantos casamentos você quer: ");
casamento =leitor.nextInt(); 
		
System.out.println("digite quantas certidões você quer: ");
certidao=leitor.nextInt(); 

casamento=casamento*250;
certidao=certidao*30;
total=casamento+certidao;
System.out.println("o total apagar é: "+total);
				
		
		
		
		
		
	}

}


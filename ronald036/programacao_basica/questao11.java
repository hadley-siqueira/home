import java.util.Scanner;
public class questao11 {
	public static void main (String[] args){
	int nota1;
	int nota2;
	int nota3;
	int nota4;
	int nota_total;
	double média_ponderada;
	Scanner s;
	s = new Scanner (System.in);
	
	System.out.println("*** média ponderada das notas ***");

	System.out.print("Digite a primeira nota: ");
	nota1 = s.nextInt();

	System.out.print("Digite a segunda nota: ");
	nota2 = s.nextInt();

	System.out.print("Digite a terceira nota: ");
	nota3 = s.nextInt();

	System.out.print("Digite a quarta nota: ");
	nota4 = s.nextInt();

	nota_total = nota1 + nota2 + nota3 + nota4;

	média_ponderada = nota1 * 7.0 + nota2 * 5.0 + nota3 * 6.0 + nota4 * 9.5/nota_total;
	System.out.println("A media ponderada é de " + (média_ponderada));
}
}

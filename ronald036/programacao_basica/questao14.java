import java.util.Scanner;
public class questao14{
	public static void main (String[] args){
	int dias;
	int ano;
	int mes;
	int dia;
	Scanner s;
	s = new Scanner (System.in);

	System.out.println("*** programa para converter o calendário ***");

	System.out.print("Digite os dias");
	dias = s.nextInt();

	ano = dias /360;

	mes = (dias - ano * 360)/30;

	dia = dias - ano * 360 - mes * 30;

	System.out.println(" os anos do calendário desejados são" + (ano));
        System.out.println(" os meses do calendário desejados são" + (mes));
	System.out.println(" os dias do calendário desejados são" + (dia));
}
}

import java.util.Scanner;

public class Questao04{
    public static void main(String[] args){
	Scanner s;
	int n;
	int p;
	int s;

	s= new Scanner (System.in);
	System.out.println(" programa gerador de paragrafos ");
	System.out.print("informe a palavra :");
	n = s.next();
	System.out.print("informe a quantidade de repticoes:");
	p = s.nextInt(); 
	s = n * p;


   }
}

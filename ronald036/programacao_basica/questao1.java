

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int n1,mult=0,cont;	
		
		Scanner leitor= new Scanner (System.in);
		
		
		System.out.println("DIGITE A TABUADA QUE DESEJA: ");
		n1=leitor.nextInt();
		
		for (cont=0 ; cont<=10 ; cont++){
			
			mult=cont*n1;
			
			System.out.println(n1+" X "+ cont + " = "+ mult);
		}}}               	

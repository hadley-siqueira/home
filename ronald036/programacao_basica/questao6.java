import java.util.Scanner;
public class questao6 {
	public static void main (String [] args){
	Scanner s;
	int n;
	double v;
	double x;
	
	s = new Scanner(System.in);
	System.out.print(" informe os metros quadrados : ");
	n = s.nextInt();
	v = n * 1.5;
	x = v * 300;
	System.out.print("quantidade de pontos de rede sao :" + v);
	System.out.println(" o custo pela implantação eh : " + x);
  }
}
	

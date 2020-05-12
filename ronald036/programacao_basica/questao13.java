import java.util.Scanner;
import java.lang.Math;

public class questao13 {
	public static void main (String[] args) {
	int rx;
	int sx;
	int ry;
	int sy;
	double Distancia;
	Scanner s;
	s = new Scanner (System.in);
	
	System.out.print("Digite a primeira abscissa: ");
	rx = s.nextInt();
	
	System.out.print("Digite a segunda abscissa: ");
	sx = s. nextInt();

	System.out.print("Digite o primeiro eixo: ");
	ry = s. nextInt();

	System.out.print("Digite o segundo eixo: ");
	sy = s. nextInt();

	Distancia = Math.sqrt((rx - sx) * (rx - sx) + (ry - sy) * (ry - sy));

	System.out.println("A distância euclidiana é de" + (Distancia));

}
}


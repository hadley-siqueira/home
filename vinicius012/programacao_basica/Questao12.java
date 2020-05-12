import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
    Scanner s;
    s = new Scanner(System.in);

    System.out.println("Digite o numero de camisetas tamanho P ");
    int x = s.nextInt();

    System.out.println("Digite o numero de camisetas tamanho M ");
    int y = s.nextInt();
    
    System.out.println("Digite o numero de camisetas tamanho G ");
    int z = s.nextInt();

    int a = x * 10;
    int b = y * 12;
    int c = z * 15;

    int d = a + b + c;

    System.out.println(" Valor total arrecadado e R$ " + d);

    }
}

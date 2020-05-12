import java.util.Scanner;

public class questao07 {
    public static void main (String[] args) {
        
        Scanner s;
        int x;
        int Polonômio;
        s = new Scanner (System.in);

        System.out.println(">> Polonômio <<");
        System.out.println("Digite o valor de x:");
        x = s.nextInt();

        Polonômio = x * x * x + 3 * 3 * x * x - 2 * x + 7;

        System.out.println("O resultado eh: " + Polonômio);

    }
}

import java.util.Scanner;

public class Questao07 {
    public static void main (String[] args) {
        double x;
        double xt;
        double x1;
        double x2;
        int xt1;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("Animação com Polinômio");

        System.out.println( );
        System.out.println("O polinômio eh x^3+3x^2-2x+7");
    
        System.out.println("Digite o valor de x:");
        x = s.nextDouble();

        x1 = Math.pow(x,3);
        x2 = Math.pow(x,3);
        xt = x1 + 3 * x2 - 2 * x + 7;
        xt1 = (int)xt;

        System.out.println("O resultado eh:" + xt1);
    }
}
    

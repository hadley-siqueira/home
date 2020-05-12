import java.util.Scanner;

public class Questao12 {
    public static void main (String[] args) {
        int c1;
        int c2;
        int c3;
        int r;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Calculadora de Camisetas**");

        System.out.print("Informe a qtd da camiseta p:");
        c1 = s.nextInt();
        System.out.print("Informe a qtd da camiseta m:");
        c2 = s.nextInt();
        System.out.print("Informe a qtd da camiseta g:");
        c3 = s.nextInt();

        r = (c1 * 10 + c2 * 12 + c3 * 15);
        System.out.println( );
        System.out.println("O resultado eh: R$" + r);
    }
}

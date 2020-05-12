import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner S;
        int m;
        int n;
        int total;
        S = new Scanner(System.in);

        System.out.println("**Programa do Cartorio**");

        System.out.print("Qtd de casamentos:");
        n = S.nextInt();
        System.out.print("Qtd de certidoes:");
        m = S.nextInt();
        total = n * 250 + m * 30;
        System.out.println("Total: R$ " + total);
    }
}


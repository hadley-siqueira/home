import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner s;
        int m;
        int n;
        int total;
        s = new Scanner(System.in);

        System.out.println("<<Programa do Cartorio>>");

        System.out.println("Qtd de casamentos");
        n = s.nextInt();
        System.out.println("Qtd de certidoes");
        m = s.nextInt();
        total = n * 250 + m * 30;
        System.out.println("Total: R$ " + total);
    }
}

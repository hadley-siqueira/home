import java.util.Scanner;

public class Questao12 {
    public static void main (String[] args) {
        int p;
        int m;
        int g;
        int pt;
        int mt;
        int gt;
        int total;
        Scanner s;

        System.out.println("**Valor arrecadado em vendas**");

        s = new Scanner(System.in);
        System.out.println("Camisas pequenas vendidas:");
        p = s.nextInt();
        System.out.println("Camisas medias vendidas:");
        m = s.nextInt();
        System.out.println("Camisas grnades vendidas:");
        g = s.nextInt();

        pt = p * 10;
        mt = m * 12;
        gt = g * 15;

        total = pt + mt + gt;

        System.out.println("O valor arrecadado foi de: R$" + total);
    }
}

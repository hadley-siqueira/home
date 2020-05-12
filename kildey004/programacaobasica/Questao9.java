import java.util.Scanner;

public class Questao9 {
    public static void main (String[] args) {
        double x;
        double xs;
        double sa;
        double tsa;
        double txs;
        Scanner s;

        System.out.println("**CALCULADORA DE GASTOS**");

        s =  new Scanner(System.in);
        System.out.println("Digite o quanto voce tem pra gastar em R$:");
        x = s.nextDouble();

        System.out.println("Digite quanto era um salgado:");
        xs = s.nextDouble();

        System.out.println("Digite quanto eh um salgado agora:");
        sa = s.nextDouble();

        tsa = x / sa;
        txs = x / xs;

        System.out.println("Antes voce compraria " + txs + " salgados");
        System.out.println("Agora voce pode comprar " + tsa + " salgados");

    }
}

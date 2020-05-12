import java.util.Scanner;

public class questaao6 {
    public static void main (String [] args) {

        Scanner s;
        double refeicao;
        double comissao;
        double porcentagem;
        double subtotal;
        double total;
        s = new Scanner(System.in);

        System.out.print("Qual o valor da refeição: ");
        refeicao = s.nextDouble();
        System.out.print("Qual a porcentagem da comissao do garçom: ");
        porcentagem = s.nextDouble();

        comissao = ((porcentagem * 0.01) * refeicao);
        subtotal = refeicao;
        total = refeicao + comissao;

        System.out.println("Comissão do garçom: " + comissao + " reais");
        System.out.println("Subtotal: " + total + " reais");
        System.out.println("Total: " + total + " reais");
    }
}

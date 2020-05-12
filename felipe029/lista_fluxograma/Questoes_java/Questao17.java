import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a qtd de moedas de 1 centavo:");
        double u = s.nextInt();

        System.out.print("Informe a qtd de moedas de 1 real: ");
        double ur = s.nextInt();

        System.out.print("Informe a qtd de moedas de 5 centavo: ");
        double c = s.nextInt();

        System.out.print("Informe a qtd de moedas de 10 centavo: ");
        double d = s.nextInt();

        System.out.print("Informe a qtd de moedas de 25 centavo: ");
        double v = s.nextInt();

        System.out.print("Informe a qtd de moedas de 50 centavo: ");
        double ci = s.nextInt();

        double u2 = u * 0.01;
        double c2 = c * 0.05;
        double d2 = d * 0.10;
        double v2 = v * 0.20;
        double ci2 = ci * 0.50;
        double ur2 = ur * 1.00;

        double r = u2 + c2 + d2 + v2 + ci2 + ur2;

        System.out.println("\nO resultado total de dinheiro eh:" + r);
    }
}

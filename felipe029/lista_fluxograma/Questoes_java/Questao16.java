    import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        double f;
        double r;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Calculadora da Granja**");

        System.out.print("Informe a qtd total de frangos:");
        f = s.nextDouble();

        r = 4+ 3.5 * f;

        System.out.println( );
        System.out.println("O custo total será de:R$ " + r);
    }
}

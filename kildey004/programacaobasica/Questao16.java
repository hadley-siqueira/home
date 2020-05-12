import java.util.Scanner;
    
public class Questao16 {
    public static void main (String[] args) {
        int frango;
        double r;
        Scanner s;

        System.out.println("**gastos da granja**");

        s = new Scanner(System.in);
        System.out.println("Quantos frangos tem a granja?");
        frango = s.nextInt();

        r = (4 + 2 * 3.5) * frango;

        System.out.println("O gasto total eh: R$" + r);
    }
}

import java.util.Scanner;
public class Questao2 {
    public static void main(String[]args) {
        double n1;
        double n2;
        double n3;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        n1 = s.nextDouble();
        
        System.out.println("Informe o segundo numero: ");
        n2 = s.nextDouble();

        System.out.println("Informe o terciero numero: ");
        n3 = s.nextDouble();

        System.out.println("O quadrado de " + n1 + " eh: " + n1 * n1);
        System.out.println("O triplo de " + n2 + " eh: " + n2 * n2 * n2);
        System.out.println("O quadruplo de " + n3 + " eh: " + n3 * n3 * n3 * n3);
    }
}


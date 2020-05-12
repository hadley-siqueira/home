import java.util.Scanner;
public class Questão09 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = s.nextInt();

        System.out.printf("Primeiro resultado: %.2f\n", (n1*2) * (n2/2.0));
        System.out.println("Segundo resultado: " + ((n1 * 3) + n3));
        System.out.printf("Terceiro resultado: %.0f\n", Math.pow(n3, 3));
    }
}
  

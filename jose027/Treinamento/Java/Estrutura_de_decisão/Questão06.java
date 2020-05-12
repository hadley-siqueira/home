import java.util.Scanner;
public class Questão06 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = s.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Maior número: " + n1);
            if (n3 > n2) {
                System.out.println("Menor número: " + n2);
            } else {
                System.out.println("Menor número: " + n3);
            }
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("Maior número: " + n2);
            if (n1 > n3) {
                System.out.println("Menor número: " + n3);
            } else {
                System.out.println("Menor número: " + n1);
            }
        } else {
            System.out.println("Maior número: " + n3);
            if (n2 > n1) {
                System.out.println("Menor número: " + n1);
            } else {
                System.out.println("Menor número: " + n2);
            }
        }
    }
}
            


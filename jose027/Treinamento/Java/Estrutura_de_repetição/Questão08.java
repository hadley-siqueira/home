import java.util.Scanner;
public class Questão08 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();

        while (n2 == n1) {
            System.out.println("Os números são iguais, digite o segundo número novamente");
            System.out.print("Digite o segundo número: ");
            n2 = s.nextInt();
        }

        if (n1 < n2) {
            for (int c = n1 + 1; c < n2; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        } else {
            for (int c = n2 + 1; c < n1; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;
public class Questão01 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        } else if (n1 < n2) {
            System.out.println(n2 + " é maior que " + n1);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}


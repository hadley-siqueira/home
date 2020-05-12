import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.println("Informe a palavra: ");
        String p = s.next();

        System.out.println("Informe a quantidade de repeticoes: ");
        int n = s.nextInt();

        System.out.print("Resultado: ");

        for (int i = 0; i < n; ++i) {
            System.out.print(p + " ");
        }

        System.out.println("");
    }
}

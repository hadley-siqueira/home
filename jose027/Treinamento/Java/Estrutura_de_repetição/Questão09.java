import java.util.Scanner;
public class Questão09 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o número desejado: ");
        int n = s.nextInt();

        for (int c = 1; c <= 10; c++) {
            System.out.println(n + " x " + c + " = " + (n * c));
        }
    }
}

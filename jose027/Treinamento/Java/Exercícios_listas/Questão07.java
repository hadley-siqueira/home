import java.util.Scanner;
import static java.lang.Math.*;
public class Questão07 {
    public static void main(String[] args) {
        int v_num[] = new int[10];
        int soma = 0;
        Scanner s;
        s = new Scanner(System.in);

        for (int c = 0; c < 10; c++) {
            System.out.print("Digite o " + (c + 1) + "° número: ");
            int n = s.nextInt();
            v_num[c] = n;
        }

        for (int c = 0; c < 10; c++) {
            soma += pow(v_num[c], 2);
        }
        System.out.println("Soma: " + soma);
    }
}

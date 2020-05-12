import java.util.Scanner;
import java.util.Arrays;
public class Questão05 {
    public static void main(String[] args) {
        int vet_num[] = new int[5];
        Scanner s;
        s = new Scanner(System.in);

        for (int c = 0; c < 5; c++) {
            System.out.print("Digite o número desejado: ");
            int n = s.nextInt();
            vet_num[c] = n;
        }

        Arrays.sort(vet_num);
        System.out.println("Maior número: " + vet_num[4]);
    }
}



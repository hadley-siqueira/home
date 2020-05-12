import java.util.Scanner;
public class Questão01 {
    public static void main(String[] args) {
        int vet[] = new int[5];
        Scanner s;
        s = new Scanner(System.in);

        for (int c = 0; c < 5; c++) {
            System.out.print("Digite o " + (c + 1) + "° número: ");
            int n = s.nextInt();
            vet[c] = n;
        }

        for (int c = 0; c < 5; c++) {
            System.out.print(vet[c] + " ");
        }
        System.out.println();
    }
}

        

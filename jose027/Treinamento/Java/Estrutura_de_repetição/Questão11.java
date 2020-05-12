import java.util.Scanner;
public class Questão11 {
    public static void main(String[] args) {
        int qtd_pares = 0;
        Scanner s;
        s = new Scanner(System.in);

        for (int c = 0; c < 10; c++) {
            System.out.print("Digite o número desejado: ");
            int n = s.nextInt();
            if (n % 2 == 0) {
                qtd_pares += 1;
            }
        }
        System.out.println("Quantidade de números pares: " + qtd_pares);
        System.out.println("Quantidade de números ímpares: " + (10 - qtd_pares));
    }
}
                


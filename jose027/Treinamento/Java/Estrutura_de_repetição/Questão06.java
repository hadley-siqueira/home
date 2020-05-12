import java.util.Scanner;
public class Questão06 {
    public static void main(String[] args) {
        int soma = 0;
        Scanner s;
        s = new Scanner(System.in);

        for (int c = 0; c < 5; c++) {
            System.out.print("Digite o número desejado: ");
            int n = s.nextInt();
            soma += n;
        }
        
        double media = soma / 5.0;
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f\n", media);
    }
}


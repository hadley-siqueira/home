import java.util.Scanner;
public class Questão04 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        double soma = 0;

        for (int c = 0; c < 4; c++) {
            System.out.print("Digite a " + (c + 1) + "° nota: ");
            double n = s.nextDouble();    
            soma += n;
        }

        double media = soma / 4.0;
        System.out.printf("Média: %.3f \n", media);
    }
}

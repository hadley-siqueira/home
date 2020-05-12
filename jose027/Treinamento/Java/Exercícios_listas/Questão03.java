import java.util.Scanner;
public class Questão03 {
    public static void main(String[] args) {
        double vet_notas[] = new double[4];
        double soma = 0;
        Scanner s;
        s = new Scanner(System.in);

        for (int c = 0; c < 4; c++) {
            System.out.print("Digite a " + (c + 1) + "° nota: ");
            double nota = s.nextDouble();
            vet_notas[c] = nota;
        }

        for (int c = 0; c < 4; c++) {
            soma += vet_notas[c];
        }
   
        System.out.printf("Média: %.2f\n", (soma / 4.0));
    }
}

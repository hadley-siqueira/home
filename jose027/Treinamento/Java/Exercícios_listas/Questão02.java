import java.util.Scanner;
public class Questão02 {
    public static void main(String[] args) {
        double vet_numeros[] = new double[10];
        Scanner s;
        s = new Scanner(System.in);

        for (int c = 0; c < 10; c++) {
            System.out.print("Digite o " + (c + 1) + " número: ");
            double n = s.nextDouble();
            vet_numeros[c] = n;
        }

        for (int c = 9; c >= 0; c--) {
            System.out.print(vet_numeros[c] + " ");
        }
        System.out.println();
    }
}

            

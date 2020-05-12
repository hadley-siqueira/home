import java.util.Scanner;
import java.util.Arrays;
public class Questão05 {
    static void insercaoVetor(int n, int v[], int c) {
        v[c] = n;
    }

    static void impressaoVetor(int v[]) {
        for (int c = 0; c < v.length; c++) {
            if (v[c] != 0) {
                System.out.print(v[c] + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int vet_num[] = new int[20];
        int vet_par[] = new int[20];
        int vet_impar[] = new int[20];
        Scanner s;
        s = new Scanner(System.in); 

        for (int c = 0; c < 20; c++) {
            System.out.print("Digite o " + (c + 1) + "° número: ");
            int n = s.nextInt();
            vet_num[c] = n;
        }

        for (int c = 0; c < vet_num.length; c++) {
            if (vet_num[c] % 2 == 0) {
                insercaoVetor(vet_num[c], vet_par, c);
            } else {
                insercaoVetor(vet_num[c], vet_impar, c);
            }
        }
        System.out.println("Vetor de números digitados");
        Arrays.sort(vet_num);
        impressaoVetor(vet_num);
        
        System.out.println("Vetor de números pares");
        Arrays.sort(vet_par);
        impressaoVetor(vet_par);
        
        System.out.println("Vetor de números ímpares");
        Arrays.sort(vet_par);
        impressaoVetor(vet_impar);
    }
}
             

    

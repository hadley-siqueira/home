import java.util.Scanner;
public class Questão08 {
    static void insercaoVetor(int v[]) {
        Scanner s = new Scanner(System.in); 
        for (int c = 0; c < 10; c++) {
            System.out.print("Digite o " + (c + 1) + "° número: ");
            int n = s.nextInt();
            v[c] = n;
        }   
    }
        
    static void impressaoVetor(int v[]) {
        for (int c = 0; c < v.length; c++) {
            System.out.print(v[c] + " ");
        }
        System.out.println();
    }

    static void append(int v[], int n) {
        int c = 0;
        while (v[c] != 0) {
            c++;
        }
        v[c] = n;
    }
 
    public static void main(String[] args) {
        int v1[] = new int[10];
        int v2[] = new int[10];
        int v3[] = new int[20];

        insercaoVetor(v1);
        insercaoVetor(v2);

        for (int c = 0; c < 10; c++) {
            append(v3, v1[c]);           
            append(v3, v2[c]);           
        }
        
        System.out.println("*** Primeiro vetor ***");
        impressaoVetor(v1);
        System.out.println("*** Segundo vetor ***");
        impressaoVetor(v2);
        System.out.println("*** Terceiro vetor ***");
        impressaoVetor(v3);
    }
}

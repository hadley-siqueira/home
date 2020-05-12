import java.util.Scanner;
public class Teste {
    static void imprimirFila(int fila[]) {
        for (int c = 0; c < fila.length; c++) {
            System.out.print(fila[c] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        Fila f1 = new Fila();

        System.out.print("Digite o número desejado: ");
        int n = s.nextInt();
        f1.push(n);

        while (n != 0) {
            System.out.print("Digite o número desejado: ");
            n = s.nextInt();        
            f1.push(n);
    

            if (f1.isFull() == true) {
                imprimirFila(f1.vetor);
            }
        }
    }
}


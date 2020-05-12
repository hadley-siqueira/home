import java.util.Scanner;
import java.util.Arrays;
public class Método_insert {
    public static void main(String[] args) {
        int elemento_inserção;
        int indice;
        int c;
        Scanner s;
        s = new Scanner (System.in);

        int n[] = {1, 2, 3, 4, 5, 6, 7, 8};

        for (c = 0; c < n.length; c ++) {
            System.out.println(n[c]);
    
        System.out.print("Digite o elemento que desejar inserir: ");
        elemento_inserção = s.nextInt();
        
        System.out.print("Digite o índice: ");
        indice = s.nextInt();

        Arrays.insert(n);
        
        for (c = 0; c < n.length; c ++) {
            System.out.println(n[c]);

            }
        }
    }
}


        

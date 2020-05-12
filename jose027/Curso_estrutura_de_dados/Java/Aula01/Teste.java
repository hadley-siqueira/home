import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        Pilha p = new Pilha();
        
        if (p.isEmpty() == true) {
            System.out.println("A pilha está vazia");
        }
        
        System.out.print("Quantos números você deseja digitar: ");
        int qtd_numero = s.nextInt();
        
        while (qtd_numero <= 0 || qtd_numero > 10) {
            System.out.println("Número digitado inválido, digite novamente");
            System.out.print("Quantos números você deseja digitar: ");
            qtd_numero = s.nextInt();
        }

        for (int c = 0; c < qtd_numero; c++) {
            System.out.print("Digite o " + (c + 1) + "° número: ");
            int n = s.nextInt();
            p.push(n);
        }
    
        if (p.isFull() == true) {
            System.out.println("A pilha está cheia");
        }

        System.out.println("Elemento removido: " + p.pop());
        if (p.isFull() == true) {
            System.out.println("A pilha está cheia");
        }
    }
}

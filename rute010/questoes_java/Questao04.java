import java.util.Scanner;

public class Questao04 {
    public static void main (String[] args) {
        int q, cont = 0;
        int p1;
        String p;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Programa Gerador de Paragrafo**");

        System.out.print("Informe a palavra:");
        p = s.nextInt();
        System.out.print("Informe a qtd de repetiçoes:");
        q = s.nextInt();

        System.out.println("Resultado:");
        for (cont = 0; cont < q; cont++) {
            System.out.print(p+" ");
        }
    }
}

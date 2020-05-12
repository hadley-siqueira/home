import java.util.Scanner;

public class questao4 {
    public static void main (String[] args) {
        int q, cont = 0;
        int pl;
        String p;
        Scanner s;

        s = new Scanner (System.in);
        System.out.println("**Programa gerador de paragrafo**");

        System.out.println("Informe a palavra;");
        p = s.nextLine();
        System.out.println("Informe a quantidade de repetiçoes:");
        q = s.nextInt();

        System.out.println("resultado:");
        for (cont = 0; cont < q; cont++) {
                System.out.println(p+" ");
        }
    }
}

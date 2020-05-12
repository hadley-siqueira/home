import java.util.Scanner;

public class Questão04 {
    public static void main (String[] args) {
    int q;
    int cont = 0;    
    int p1;
    String p;
    Scanner s;

    s = new Scanner (System.in);
    System.out.println("**Programa gerador de paragrafo**");

    System.out.print("informe a palavra:");
    p = s.nextLine();
    System.out.print("informe a quantidade de repeticoes:");
    q = s.nextInt();

    System.out.println("resultado:");
    for (cont = 0; cont < q; cont++) {
        System.out.print(p+" ");
    }
  }
}

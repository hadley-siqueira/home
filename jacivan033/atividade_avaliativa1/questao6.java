import java.util.Scanner;

public class questao6 {
    public static void main (String[] args) {
        double a;
        int al;
        int pr;
        int c1;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Pontos de rede do camus**");

        System.out.println("Informe a area(em metros quadrados):");
        a = s.nextDouble();

        al = (int)a;
        pr = al/2*3;
        c1 = pr*300;

        System.out.println( );
        System.out.println("A quantidade de pontos de rede eh:" + pr);
        System.out.println("O custo de implementaçao eh: R$" + c1 + ",00");
    }
}

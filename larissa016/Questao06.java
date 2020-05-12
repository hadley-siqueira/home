import java.util.Scanner;
public class Questao06 {
    public static void main(String[]args) {
        double a;
        int a1;
        int qpr;
        int ci;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Pontos de rede de campus**");

        System.out.print("Informe a area(em metros quadrados):");
        a = s.nextDouble();

        a1 = (int)a;
        qpr = a1/2*3;
        ci = qpr*300;

        System.out.println( );
        System.out.println("A quantidade de pontos de rede eh:" + qpr);
        System.out.println("O curto de implementacao eh: R$" + ci + ",00");

    }
}

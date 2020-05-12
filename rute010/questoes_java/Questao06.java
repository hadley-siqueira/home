import java.util.Scanner;

public class Questao06 {
    public static void main (String[] args) {
        double a;
        int a1;
        int pr;
        int ci;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Pontos de Rede do Campus**");

        System.out.print("Informe a area(em metro quadrados):");
        a = s.nextDouble();

        a1 = (int)a;
        pr = a1/2*3;
        ci = pr*300;

        System;out.println( );
        System.out.println("A quantidade de pontos de rede eh:" + pr);
        System.out.println("o custo de implementação eh: R$" + ci + ",00");
    }
}

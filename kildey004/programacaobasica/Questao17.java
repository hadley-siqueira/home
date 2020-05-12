import java.util.Scanner;

public class Questao17 {
    public static void main (String[] args) {
        double um;
        double cinco;
        double dez;
        double vinteC;
        double cinquenta;
        double real;
        double umT;
        double cincoT;
        double dezT;
        double vinteCT;
        double cinquentaT;
        double realT;
        double total;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("qtd de moedas de 1¢:");
        um =s.nextDouble();
        System.out.println("qtd de moedas de 5¢:");
        cinco = s.nextDouble();
        System.out.println("qtd de moedas de 10¢:");
        dez = s.nextDouble();
        System.out.println("qtd de moedas de 25¢:");
        vinteC = s.nextDouble();
        System.out.println("qtd d moedas de 50¢:");
        cinquenta = s.nextDouble();
        System.out.println("qtd de moedas de R$1:");
        real = s.nextDouble();

        umT = um * 0.01;
        cincoT = cinco * 0.05;
        dezT = dez * 0.10;
        vinteCT = vinteC * 0.25;
        cinquentaT = cinquenta * 0.50;
        realT = real * 1.00;

        total = umT + cincoT + dezT + vinteCT + cinquentaT + realT;

        System.out.println("Dinheiro total: R$" + total);
    }
}

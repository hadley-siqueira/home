import java.util.Scanner;

public class Problema6 {
        public static void main(String[] args) {
        Scanner S;
        double a;
        double b;
        double x;    
        double c;

        S = new Scanner(System.in);
        System.out.println("Qual o valor da conta?");
        a = S.nextDouble();
        System.out.println("Qual a porcentagem da comissão do garçom?");
        b = S.nextDouble();

        x = a * (b  / 100);
        c = x + a;

        System.out.println("A gorjeta do garçom é de R$" + x );
        System.out.println("O subtotal é de R$ " + a);
        System.out.println("O total é de R$ " + c);
        
        }
}

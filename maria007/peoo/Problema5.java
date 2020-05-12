import java.util.Scanner;

public class Problema5 {
        public static void main(String[] args) {
        Scanner S;
        double a;
        double b;
        double c;
        
        S = new Scanner(System.in);
        System.out.println("Qual o valor da conta?");
        a = S.nextDouble();

        b = a * 0.10;
        c = b + a;

         System.out.println("A gorjeta do garçom é de R$ " + b);
         System.out.println("O subtotal é de R$ " + a);
         System.out.println("O total é de R$ " + c);
        
        }
} 

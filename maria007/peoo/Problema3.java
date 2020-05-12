import java.util.Scanner;

public class Problema3 {
        public static void main(String[] args) {
        Scanner S;
        double a;
        double b;
        double c;

        
        S = new Scanner(System.in);
        System.out.print("Qual a sua altura?(em metros) ");
        a = S.nextDouble();
        System.out.print("Qual a sua massa?(em quilos) ");
        b = S.nextDouble();

        c = b / (a * a);

        System.out.print(" Seu Índice de Massa Corporal é "+ c);

        }
}


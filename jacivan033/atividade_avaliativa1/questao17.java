import java.util.Scanner;

public class questao17 {
    public static void main (String[] args) {
        Scanner s;
        double w;
        double u;
        s = new Scanner (System.in);
        System.out.println("Calculo de dinheiro"); 
        u = 0;
        System.out.println("Informe a qtd de moedas de 1 centavo:");
        w = s.nextInt();
        u = u + w * 0.01;

        System.out.println("Informe a qtd de moedas de 5 centavos:");
        w = s.nextInt();
        u = u + w * 0.05;

        System.out.println("Informe a qtd de moedas de 10 centavos:");
        w = s.nextInt();
        u = u + w * 0.10;
        
        System.out.println("Informe a qtd de moedas de 25 centavos:");
        w = s.nextInt();
        u = u + w * 0.25;

        System.out.println("Informe a qtd de moedas de 50 centavos:");
        w = s.nextInt();
        u = u + w * 0.50;

        System.out.println("Informe a qtd de moedas de 1 real:");
        w = s.nextInt();
        u = u + w * 1.00;
        System.out.println("O dinheiro economizado eh: " + u);

    }
}

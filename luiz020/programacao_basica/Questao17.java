import java.util.Scanner;

    public class Questao17 {

        public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        double a, b, c, d, e, f, g;

        System.out.println(" Programa de Moedas ");

        System.out.print("Informe a quantidade de moedas de 1 centavo: "); 
        a = k.nextFloat();
 
        System.out.print("Informe a quantidade de moedas de 5 centavos: ");
        b = k.nextFloat();
    
        System.out.print("Informe a quantidade de moedas de 10 centavos: ");
        c = k.nextFloat();

        System.out.print("Informe a quantidade de moedas de 25 centavos: ");
        d = k.nextFloat();

        System.out.print("Informe a quantidade de moedas de 50 centavos: ");
        e = k.nextFloat();

        System.out.print("Informe a quantidade de moedas de 1 real: ");
        f = k.nextFloat();

        g = a * 0.01 + b * 0.05 + c * 0.10 + d * 0.25 + e * 0.50 + f * 1;

        System.out.print("O valor total economizado: " + g);

        }}

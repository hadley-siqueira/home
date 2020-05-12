import java.util.Scanner;

    public class Questao12 {

        public static void main (String[] args) {

        Scanner k = new Scanner (System.in);
        int a, b, c, d;

        System.out.println(" Programa de Camisetas");

        System.out.print("Informe a quantidade de camisetas pequenas: ");
        a = k.nextInt();

        System.out.print("Informe a quantidade de camisetas médias: ");
        b = k.nextInt();

        System.out.print("Informe a quantidade de camisetas grandes: ");
        c = k.nextInt();

        d = a * 10 + b * 12 + c * 15;

        System.out.print("O custo será de: " + d);

        }}

        

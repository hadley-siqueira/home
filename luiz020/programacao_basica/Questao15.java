import java.util.Scanner;

    public class Questao15 {

        public static void main (String[] args) {

        Scanner k = new Scanner(System.in);

        double a, b;

        System.out.println(" Programa Conversão de Celsius para Fahrenheit ");

        System.out.print("Informe a temperatura em Celsius: ");
        a = k.nextInt();

        b = a * 1.8 + 32;

        System.out.println("A temperatura em Fahrenheit: " + b);

        }}
 

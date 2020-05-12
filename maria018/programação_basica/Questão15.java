import java.util.Scanner;
public class Questão15 {
    public static void main (String[] args) { 
        Scanner s;
        double C;
        double F;
        s = new Scanner(System.in);

        System.out.println(" >> Programa que converte Celsius em Fahrenheit << ");
        System.out.print(" Digite a temperatura em graus Celsius: ");
        C = s.nextDouble();

        F = (C*1.8) + 32;
        System.out.println(" A temperatura em Fahrenheit é " + F + "°F" );

        }
}

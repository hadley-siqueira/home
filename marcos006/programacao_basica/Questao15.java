import java.util.Scanner;

    public class Questao15 {
        public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);

        System.out.println("** Programa que converte a temperatura de graus Celsius para Fahrenheit **");
        System.out.println("Digite a temperatura em Celsius: ");
        int C = s.nextInt();
        double F = C * 1.8 + 32;

        System.out.println("A temperatura em Fahrenheit será de " + F + " F");

    }
}

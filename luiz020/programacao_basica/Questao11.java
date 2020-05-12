import java.util.Scanner;

    public class Questao11 {

        public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        double a, b, c, d, e, f;

        System.out.println(" Programa de Média Ponderada ");

        System.out.print("Informe a primeira nota: ");
        a = k.nextDouble();

        System.out.print("Informe a segunda nota: ");
        b = k.nextDouble();

        System.out.print("Informe a terceira nota: ");
        c = k.nextDouble();

        System.out.print("Informe a quarta nota: ");
        d = k.nextDouble();

        e = a * 1 + b * 2 + c * 3 + d * 4;

        f = e / 10;

        System.out.println("O resultado da média ponderada eh: " + f);

        }}


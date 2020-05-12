import java.util.Scanner;

    public class Questao10 {

        public static void main (String[] args) {

        Scanner k;
        int a, b, c, d;

        k = new Scanner(System.in);
        
        System.out.println(" Programa de Segundos ");

        System.out.print("Informe a hora: ");
        a = k.nextInt();

        System.out.print("Informe o minuto: ");
        b = k.nextInt();

        System.out.print("Informe o segundo: ");
        c = k.nextInt();

        d = a * 60 * 60 + b * 60 + c;

        System.out.println("O valor total em segundos eh: " + d);

        }}




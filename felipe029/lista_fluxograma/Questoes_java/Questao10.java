import java.util.Scanner;

public class Questao10 {
    public static void main (String[] args) {
        int h;
        int m;
        int x;
        int r;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Conversor de Minutos**");

        System.out.print("Informe a qtd de horas:");
        h = s.nextInt();
        System.out.print("Informe a qtd de minutos:");
        m = s.nextInt();
        System.out.print("Informe a qtd de segundos:");
        x = s.nextInt();

        r = h * 60 * 60 + 60 * m + x;

        System.out.println( );
        System.out.println("O resultado eh:" + r);
    }
}

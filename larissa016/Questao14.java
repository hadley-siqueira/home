import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        int d;
        int a;
        int m;
        int r;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Calculadora da Fabrica**");

        System.out.print("Informe a qtd total de dias:");
        d = s.nextInt();

        a = d/360;
        m = (d - a * 360)/30;
        d = d - a * 360 - m * 30;

        r = a + m + d;

        System.out.println("A qtd de anos sem acidentes são:" + a);
        System.out.println("A qtd de meses sem acidentes são:" + m);
        System.out.println("A qtd de dias sem acidentes são:" + d);
    }
}


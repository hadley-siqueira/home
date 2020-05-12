import java.util.Scanner;
public class repetição4 {
    public static void main(String[] args) {
        double inicio;
        double encerramento;
        double cc;
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Início do expediente: ");
        inicio = s.nextDouble();

        System.out.print("Final do expediente: ");
        encerramento = s.nextDouble();

        for (cc = inicio; cc <= encerramento; cc += 1) {
            System.out.println(cc + " horas");
        }
    }
}


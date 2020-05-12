import java.util.Scanner;

public class Problema8 {
        public static void main(String[] args) {
        Scanner S;
        int a;
        double x;
        int z;

        S = new Scanner(System.in);
        System.out.print("Digite o número de horas: ");
        a = S.nextInt();

        z = a / 24;
        x = a % 24;

         System.out.print(z + " DIAS " + x + " HORAS");

        }
    }

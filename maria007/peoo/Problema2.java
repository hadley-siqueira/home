import java.util.Scanner;

public class Problema2 {
        public static void main(String[] args) {
        Scanner S;
        double x;
        double z;


        S = new Scanner(System.in);
        System.out.println("Digite o número de horas: ");
        x = S.nextDouble();

        z = x / 24;

        System.out.println( z + " dias");

        }
    }

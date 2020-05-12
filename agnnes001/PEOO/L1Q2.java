import java.util.Scanner;

public class L1Q2 {
    public static void main(String[] args) {
        Scanner s;
        double h,d;

        s = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas:");
        h = s.nextInt();

        d = h/24;

        System.out.println("São " + d + " dias");
    }
}

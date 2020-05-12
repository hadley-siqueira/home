import java.util.Scanner;

public class q2 {
    public static void main (String[] args) {

        Scanner s;
        int horas;
        double dias;
        s = new Scanner(System.in);

        System.out.print("Digite a hora:");
        horas = s.nextInt();
        dias = (double)horas/24;
        System.out.println(horas + " horas = " + dias + " dias");
    }
}

import java.util.Scanner;

public class L1Q8 {
    public static void main(String[] args) {
        Scanner s;
        int h,d;
        double d1;

        s = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas:");
        h = s.nextInt();

        d = h/24;
        d1 = h%24;

        System.out.println("São " + d + " dias e "+d1+" horas");
    }
}


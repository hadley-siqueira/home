import java.util.Scanner;
public class Questao07 {
    public static void main(String[] args) {
        Scanner s;
        int n;
        int d;
        s = new Scanner (System.in);
        System.out.print("informe o numero ");
        n = s.nextInt ();
        d = n * n * n + 3 * n * n - 2 * n + 7;
        System.out.println(d);
    }
}

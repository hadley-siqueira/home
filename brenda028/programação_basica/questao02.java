import java.util.Scanner;

public class questao02 {
    public static void main (String[] args) {
        Scanner s;
        int n1;
        int n2;
        int n3;
        int t;
        int e;
        int d;
        s = new Scanner(System.in);

        System.out.print("Informe e o número: ");
        n1 = s.nextInt();
        System.out.print("Informe outro número: ");
        n2 = s.nextInt();
        System.out.print("Informe um terceiro número: ");
        n3 = s.nextInt();
        
        t = n1 * n1;
        e = n2 * n2 * n2;
        d = n3 * n3 * n3 * n3;

        System.out.println("O quadrado de " + n1 + " eh " + t);
        System.out.println("O triplo de " + n2 + " eh " + e);
        System.out.println("O quartuplo de " + n3 + " eh " + s);
    }
}

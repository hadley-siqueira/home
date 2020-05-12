andro011@linuxmc: $ ^C
mport java.util.Scanner;

public class Questao02 {
    public static void main (String[] args) {
        Scanner s;
        int n1;
        int n2;
        int n3;
        int t;
        int e;
        int d;
        s = new Scanner(System.in);

        System.out.print("Informe e o numero: ");
        n1 = s.nextInt();
        System.out.print("Informe outro numero: ");
        n2 = s.nextInt();
        System.out.print("Informe um terceiro numero: ");
        n3 = s.nextInt();
        t = n1 * n1;
        e = n2 * n2 * n2;
        d = n3 * n3 * n3 *n3;
        System.out.println("o quadrado de " + n1 +  " eh " + t); 
        System.out.println("o triplo de " + n2 + " eh " + e);
        System.out.println("o quatuplo de " + n3 + " eh " + d); 
    }
}
        

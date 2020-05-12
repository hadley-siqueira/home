import java.util.Scanner;
public class q7 {
    public static void main (String[] args) {

        Scanner s;
        int a1;
        int b1;
        int a2;
        int b2;
        s = new Scanner(System.in);

        System.out.print("DIGITE O VALOR DE 'A': ");
        a1 = s.nextInt();
        System.out.print("DIGITE O VALOR DE 'B': ");
        b1 = s.nextInt();

        a2 = b1;
        b2 = a1;

        System.out.println("**VALORES INICIAIS**");
        System.out.println("'A' = " + a1 + "  //  'B' = " + b1);
        System.out.println("**VALORES FINAIS**");
        System.out.println("'A' = " + b1 + "  //  'B' = " + a1);
    }
}

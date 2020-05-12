import java.util.Scanner;
public class questao5 {
        public static void main (String[] args) {
            int s1;
            int c;
            int st;
            int ct;
            int lt;
            Scanner s;
            
            s = new Scanner(System.in);
            System.out.println("**Seguradora CYZ**");
            System.out.println(">>Sistema de avaliaçao<<");

            System.out.println("Quantidade de contratos simples:");
            s1 = s.nextInt();
            System.out.println("Quantidade de contratos completos:");
            c = s.nextInt();

            st = 2300*s1/10;
            ct = 3500*c/10;
            lt = st + ct;

            System.out.println( );
            System.out.println("O lucro obtido foi de: R$ " + lt + ",00");
    }
}

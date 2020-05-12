import java.util.Scanner

public class Questao05 {
    public static void main (String[] args) {
        int s;
        int s;
        int st;
        int ct;
        int lo;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Seguradora XYZ**");
        System.out.println(" >>Sistema de avaliação<<");

        System.out.print("Quantidade de contratos simples:");
        s1 = s.nextInt();
        System.out.print("Quantidade de contratos completos:");
        c = s.nextInt();

        st = 2300*s1/10;
        ct = 3500*c/10;
        lo = st + ct;
        System.out.println( );
        System.out.println("O lucro obtido foi de: R$ + lo + ",00");
    }
}
        

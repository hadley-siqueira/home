import java.util.Scanner;

public class Problema9 {
        public static void main(String[] args) {
        Scanner S;
        double a;
        double b;
        double c;
        double d;
        double pv;
        double e;
        double pl;
        double x;

        S = new Scanner(System.in);
        System.out.print("Qual o preço de fábrica?");
        a = S.nextDouble();
        System.out.print("Qual o percentual de lucro do distribuidor?");
        b = S.nextDouble();
        System.out.print("Qual o percentual de impostos?");
        c = S.nextDouble();

        d = b / 100;
        pv = (a + a) * d / 100;
        e = c / 100;
        pl = (a + a) * e / 100;
        x = pv + pl + a;

        System.out.println(" O valor do lucro do distribuidor é de R$ " + pv);
        System.out.println(" O consumidor terá de pagar R$ " + pl + " em impostos");
        System.out.println("Logo o valor total a ser pago é de R$ " + x);
        
        }
    }

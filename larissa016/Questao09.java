import java.util.Scanner;

public class Questao09 {
    public static void main (String [] args ) {
        Scanner s;
        double d;
        double ca;
        double cg;
        double ca1;
        double cg1;
        s = new Scanner (System.in);
        System.out.print("Informe o total de dinheiro que possui:");
        d = s.nextDouble ();
        System.out.print("Quanto custava o salgado?");
        ca = s.nextDouble ();
        System.out.print("Quanto custa um salgado?");
        cg = s.nextDouble();
        ca1 = d / ca;
        cg1 = d / cg;

        System.out.println(ca1);
        System.out.println(cg1);







    }
}

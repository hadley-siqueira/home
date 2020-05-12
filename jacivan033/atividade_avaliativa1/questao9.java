import java.util.Scanner;

public class questao9 {
    public static void main (String[] args) {
        double d;
        double ca;
        double cg;
        double ca1;
        double cg1;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Quantdade de salgados**");

        System.out.println("Informe o total de dinheiro que possui:");
        d = s.nextDouble();
        System.out.println("Quanto custava um salgado?:");
        ca = s.nextDouble();
        System.out.println("Quanto custa um salgado?:");
        cg = s.nextDouble();

        ca1 = d/ca;
        cg1 = d/cg;

        System.out.println( );
        System.out.println("Antes com R$" + d + "Voce podia comprar" + ca1 + "salgados");
        System.out.println("Agora com R$" + d + "Voce pode comprar" + cg1 + "Salgados");
    }
}

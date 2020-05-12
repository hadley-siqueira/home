import java.util.Scanner;

public class Questao09 {
    public static void main (String[] args) {
        double d;
        double ca;
        double cg;
        double ca1;
        double cg1;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Quantidade de Salgados**");

        System.out.print("Informe o total de dinheiro que possui:");
        d = s.nextDouble();
        System.out.print("Quanto custava um salgado?");
        ca = s.nextDouble();
        System.out.print("Quanto custa um salgado?");
        cg = s.nextDouble();
        
        ca1 = d/ca;
        cg1 = d/cg;

        System.out.println( );
        System.out.println("Antes com R$" + d + "voce podia comprar" + ca1 + "salgados");
        System.out.println("Agora com R$" + d + "voce pode comprar" + cg1 + "salgados");
    }
}

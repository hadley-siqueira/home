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
        System.out.println("***Quantidade de Salgados***");

        System.out.print("Informe o total de dinheiro que posui:");
        d = s.nextDouble();
        System.out.print("Quanto custava o Salgado?");
        ca = s.nextDouble();
        System.out.print("Quanto custa um Salgado?");
        cg = s.nextDouble();

        ca1 = d/ca;
        cg1 = d/cg;

        System.out.println( );
        System.out.println("Antes com R$"  + d +  "Voce podia comprar"  + ca1 +  "Salgados");
        System.out.println("Agora com R$"  + d +  "Voce pode comprar"  + cg1 +  "Salgados");
    }
}

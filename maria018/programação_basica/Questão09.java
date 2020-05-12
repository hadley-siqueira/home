import java.util.Scanner;

public class Questão09 {
    public static void main (String[] args) {

        Scanner s;
        float D;
        float SAntes;
        float SAgora;
        float S;
        s = new Scanner(System.in); 

        System.out.print(" Quantos reais voce têm: ");
        D = s.nextFloat();
        System.out.print(" Quanto custava um salgado antes:");
        SAntes = s.nextFloat();
        System.out.print(" Quanto um salgado está custando agora:");
        SAgora = s.nextFloat();

        S = D / SAgora;

        System.out.println(" Voce pode comprar" + S  + "salgados");

        }
}

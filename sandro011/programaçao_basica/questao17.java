import java.util.Scanner;

public class questao17 {
    public static void main(String [] args) {
        double um_centavo;
        double cinco_centavos;
        double dez_centavos;
        double vinte_e_cinco_centavos;
        double cinquenta_centavos;
        double um_real;
        double valor_total;
        
        Scanner s;
        s = new Scanner (System.in);

        System.out.print("Digite a quantidade de moedas: ");
        um_centavo = s.nextDouble();

        System.out.print("Digite a quantidade de moedas: ");
        cinco_centavos = s.nextDouble();

        System.out.print("Digite a quantidade de moedas: ");
        dez_centavos = s.nextDouble();

        System.out.print("Digite a quantidade de moedas: ");
        vinte_e_cinco_centavos = s.nextDouble();

        System.out.print("Digite a quantidade de moedas: ");
        cinquenta_centavos = s.nextDouble();

        System.out.print("Digite a quantidade de moedas: ");
        um_real = s.nextDouble();

        valor_total = um_centavo * 0.01 + cinco_centavos * 0.05 + dez_centavos * 0.10 + vinte_e_cinco_centavos * 0.25 + cinquenta_centavos * 0.50 + um_real * 1.00;

        System.out.println("o valor em reais sera: " + valor_total);
    }
}

import java.util.Scanner;

public class Questão05 {
    public static void main(String[] args) {
        Scanner s;
        double contrato_simples;
        double contrato_composto;
        double lucro;
        double QCC;
        double QCS;
        s = new Scanner(System.in);

        System.out.println(" ** Seguradora HDI **");
        System.out.println(" >>> SISTEMA DE AVALIAÇÃO <<<");
        System.out.print("Quantidade de contratos simples: ");
        QCS = s.nextDouble();

        System.out.print("Quantidade de contratos compostos: ");
        QCC = s.nextDouble();

        contrato_simples = 2300.0;
        contrato_composto = 3500.0;

        lucro = ((contrato_simples * QCS) + (contrato_composto * QCC)) * 0.1;
        System.out.println(" O lucro obtido: R$ " + lucro);
    }
}


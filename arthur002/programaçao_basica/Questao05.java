import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner s;
        double contrato_simples;
        double contrato_composto;
        double lucro;
        double qcc;
        double qcs;
        s = new Scanner(System.in);

        System.out.println(" ** seguradora HDI ** ");
        System.out.println(" >>> SISTEMA DE AVALIACAO <<< ");
        System.out.print(" quantidade de contratos simples: ");
        qcs = s.nextDouble();

        System.out.print(" quantidade de contratos compostos: ");
        qcc = s.nextDouble();

        contrato_simples = 2300.0;
        contrato_composto = 3500.0;

        lucro = ((contrato_simples * qcs) + (contrato_composto * qcc)) * 0.1;
        System.out.println(" o lucro obtido: R$ " + lucro);
    }
}

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        int simples;
        int completo;
        int lucro;
        Scanner k;
        k = new Scanner (System.in);

        System.out.println("** Seguradora XYZ **");
        System.out.println("    >> Sistema de avaliação <<");

        System.out.print("Quantidade de contratos simples: ");
        simples = k.nextInt();

        System.out.print("Quantidade de contratos completos: ");
        completo = k.nextInt();

        lucro = simples * 2300 + completo * 3500;

        System.out.println("Lucro obtido: R$ " + (lucro));

        }}

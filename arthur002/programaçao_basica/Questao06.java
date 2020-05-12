import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {

        Scanner s;
        int A;
        int n_de_pontos;
        int custo;
        s = new Scanner(System.in);

        System.out.println(" >>> Programa de redimensionar redes <<< ");
        System.out.print(" informe a area (em metros quadrados): ");
        A = s.nextInt();

        n_de_pontos = A/2 * 3;

        custo = n_de_pontos * 300;

        System.out.println(" A quantidade de pontos de rede eh " + (n_de_pontos));
        System.out.println(" O custo de implementacao eh " + (custo));

        }
}

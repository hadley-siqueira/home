import java.util.Scanner;

public class questao06 {
    public static void main (String[] args) {
        Scanner s;
        int n;
        int n_de_pontos;
        int custo;

        s = new Scanner (System.in);

        System.out.println(" >> Programa de redimensionar redes << ");
        System.out.print("Informe a area (em metros quadrados):");
        n = s.nextInt();

        n_de_pontos = n/2 * 3;
        custo = n_de_pontos * 300;

        System.out.println("A quantidade de pontos de rede eh:" + (n_de_pontos));
        System.out.println("O custo de implementação eh:" + (custo));
    }
}

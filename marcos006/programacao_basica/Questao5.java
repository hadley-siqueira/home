import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        
        System.out.println("Quantidade de contratos simples: ");
        int x = s.nextInt();

        System.out.println("Quantidade de contratos completos: ");
        int y = s.nextInt();

        int w = 2300;
        int z = 3500;

        float lucro = (x * w * 0.1f) + (z * y * 0.1f);

        System.out.println("O lucro é: R$ " + lucro);
    }
}


import java.util.Scanner;
public class Classe_Math {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        System.out.printf("%S", "*** Operações matemáticas ***\n");
        
        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();

        System.out.println("** Resultados **");
        System.out.printf("Raíz quadrada de " + n1 + ": %.0f\n", Math.sqrt(n1));
        System.out.printf(n2 + " elevado ao quadrado: %.0f\n", Math.pow(n2, 2));

    }
}

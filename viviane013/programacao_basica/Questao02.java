import java.util.Scanner;
public class Questao02 {
 public static void main (String[] args) {
        Scanner s;
        int n1;
        int quadrado;
        int n2;
        int triplo;
        int n3;
        int quartuplo;

        s = new Scanner(System.in);

        System.out.println("Calculadora do quadrado, do tiplo e quartuplo");

        System.out.print("informe o numero para quadrado: ");
        n1 = s.nextInt();
        quadrado = n1 * n1;
        System.out.println("o quadrado eh: " + quadrado);


        System.out.println("informe o numero para triplo: ");
        n2 = s.nextInt();
        triplo = n2 * 3;
        System.out.println("o quadrado eh: " + triplo);


        System.out.print("informe o numero para quartuplo: ");
        n3 = s.nextInt();
        quartuplo = n3 * 4;
        System.out.println("o quadrado eh: " + quartuplo);


    }
}

import java.util.Scanner;

public class Questão07 { 
    public static void main (String[] args) {

        Scanner s;
        int X;
        int polinomio;
        s = new Scanner(System.in); 

        System.out.println(" >>> Poliômio <<< ");
        System.out.print(" Digite o valor de X: ");
        X = s.nextInt();

        polinomio = X * X * X  + 3 * X * X - 2 * X + 7;

        System.out.println(" O resultado é: " + polinomio);

    }
}



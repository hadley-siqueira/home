import java.util.Scanner;

public class Questao7 {
    public static void main (String[] args) {
        double x;
        double resp;
        Scanner s;

        System.out.println("Calcular polinomio");
        
        s = new Scanner(System.in);
        System.out.println("Digite  valor de x: ");
        x =  s.nextDouble();

        resp = (x * x * x) + 3 * (x * x) - 2 * x + 7;

        System.out.println("Resultado do polinomio: " + resp);
    }
}

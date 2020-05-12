import java.util.Scanner;

public class Questao13 { 
    public static void main(String[] args) {
        double x1;
        double x2;
        double y1;
        double y2;
        double s1;
        double s2;
        double q1;
        double q2;
        double distancia;
        Scanner s;

        System.out.println("**Distancia euclidiana**");

        s = new Scanner(System.in);
        System.out.println("digite a localizacao de x1:");
        x1 = s.nextDouble();

        System.out.println("digite a localizacao de y1:");
        y1 = s.nextDouble();

        System.out.println("digite a localizacao de x2:");
        x2 = s.nextDouble();

        System.out.println("digite a localizacao de y2:");
        y2 = s.nextDouble();

        s1 = x2 - x1;
        s2 = y2 - y1;

        q1 = s1 * s1;
        q2 = s2 * s2;

        distancia = q1 + q2;

        System.out.println("Distancia euclidiana entre os pontos: " + distancia);
    }
}

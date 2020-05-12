import java.util.Scanner;

public class Questao11 { 
    public static void main (String[] args) {
        double n1;
        double p1;
        double n2;
        double p2;
        double n3;
        double p3;
        double n4;
        double p4;
        double tn;
        double tp;
        double media;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("Primeira nota:");
        n1 = s.nextDouble();
        System.out.println("peso da nota1:");
        p1 = s.nextDouble();
        System.out.println("Segunda nota:");
        n2 = s.nextDouble();
        System.out.println("peso da nota2:");
        p2 = s.nextDouble();
        System.out.println("Terceira nota:");
        n3 = s.nextDouble();
        System.out.println("peso da nota3:");
        p3 = s.nextDouble();
        System.out.println("Quarta nota:");
        n4 = s.nextDouble();
        System.out.println("peso da nota4:");
        p4 = s.nextDouble();

        tn = n1 * p1 + n2 * p2 + n3 * p3 + n4 * p4;
        tp = p1 + p2 + p3 + p4;
        media = tn / tp;

        System.out.println(" A media da sua nota eh: " + media);
    }
}

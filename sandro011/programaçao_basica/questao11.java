import java.util.Scanner;

public class questao11 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double n4;
        double p1;
        double p2;
        double p3;
        double p4;
        double p5;

        System.out.print("informe a nota do primeiro bimestre: ");
        n1 = s.nextDouble();

        System.out.print("informe a nota do segundo bimestre: ");
        n2 = s.nextDouble();

        System.out.print("informe a nota do terceiro bimestre: ");
        n3 = s.nextDouble();

        System.out.print("informe a nota do quarto bimestre: ");
        n4 = s.nextDouble();

        System.out.print("informe o peso da nota do primeiro bimestre: ");
        p1 = s.nextDouble();

        System.out.print("informe o peso da nota do segundo bimestre: ");
        p2 = s.nextDouble();

        System.out.print("informe o peso da nota do terceiro bimestre: ");
        p3 = s.nextDouble();

        System.out.print("informe o peso da nota do quarto bimestre: ");
        p4 = s.nextDouble();
        
        p5 = (n1 * p1 + n2 * p2 + n3 * p3 + n4 * p4) / (p1 + p2 + p3 + p4);
        System.out.println("a media total eh: " + p5 );
    }
}

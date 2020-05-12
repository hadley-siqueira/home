import java.util.Scanner;

public class questao8 {
    public static void main (String[] args) {
        double c;
        double p;
        double p1;
        double p2;
        double co;
        double co1;
        double e;
        double vc;
        double vp;
        double rco;
        double vco;
        double ve;
        double rco1;
        double e1;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Calculando volumes**");
        System.out.println("Informe o lado do cubo:");
        c = s.nextDouble();

        System.out.println("Informe a altura do paralelepipedo:");
        p = s.nextDouble();

        System.out.println("Informe o comprimento do paralelepipedo:");
        p1 = s.nextDouble();

        System.out.println("Informe a profundidade do paralelepipedo:");
        p2 = s.nextDouble();

        System.out.println("Informe a base do cone:");
        co = s.nextDouble();

        System.out.println("Informe a altura do cone:");
        co1 = s.nextDouble();

        System.out.println("Informe o raio da esfera:");
        e = s.nextDouble();

        vc = Math.pow(c,3);
        vp = p * p1 * p2;
        rco = co/2;
        rco1 = Math.pow(rco,2);
        e1 = Math.pow(e,3);
        ve = (4 * 3.14 * e1)/3;

        System.out.println( );
        System.out.println(">>Volumes<<");
        System.out.println("Cubo = " + vc);
        System.out.println("Paralelepipedo = " + vp);
        System.out.println("Cone = " + rco);
        System.out.println("esfera = " + ve);
    }
}







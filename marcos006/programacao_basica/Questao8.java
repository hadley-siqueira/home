import java.util.Scanner;

    public class Questao8 {
        public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);

        System.out.println("Digite o lado do cubo:" );
        double l = s.nextDouble();
        double vc = l * l * l;
        System.out.println("O volume do cubo será de " + vc);

        System.out.println("Digite a altura do paralelepipedo: ");
        double a = s.nextDouble();
        System.out.println("Digite o comprimento de paralelepípedos: ");
        double c = s.nextDouble();
        System.out.println("Digite a base do paralelepípedo: ");
        double b = s.nextDouble();
        double vp = a * c * b;
        System.out.println("O volume do paralelepípedo será de " + vp);

        System.out.println("Digite o raio da esfera: ");
        double r = s.nextDouble();
        double ve = 4 * 3.14 * r * r * r/3;
        System.out.println("O volume da esfera será de " + ve);
    
    }
}

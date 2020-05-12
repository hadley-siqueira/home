import java.util.Scanner;
public class Questao8 {
    public static void main (String[] args) {
        double ldc;
        double pprl;
        double cprl;
        double hprl;
        double bcn;
        double hcn;
        double res; 
        double vcubo;
        double vprl;
        double vcone;
        double vesf;
        Scanner s;

        System.out.println("**Indicador de volumes**");

        s = new Scanner(System.in);
        System.out.println("Digite o lado do cubo:");
        ldc = s.nextDouble();

        System.out.println("Digite a altura do paralelepipedo:");
        hprl = s.nextDouble();

        System.out.println("Digite o comprimento do paralelepipedo");
        cprl = s.nextDouble();

        System.out.println("Digite a profundidade do paralelepipedo:");
        pprl = s.nextDouble();

        System.out.println("Digite a base do cone:");
        bcn = s.nextDouble();

        System.out.println("Digite a altura d cone:");
        hcn = s.nextDouble();

        System.out.println("Digite o raio da esfera:");
        res = s.nextDouble();
                
        vcubo = ldc * ldc * ldc;

        vprl = hprl * pprl * hcn;

        vcone = 3.14 * (bcn * bcn) * hcn / 3;

        vesf = 3.14 * (res * res * res) / 3;

        System.out.println("O volume do cubo eh: " + vcubo);

        System.out.println("o volume do paralelepipedo eh: " + vprl);

        System.out.println("O volume do cone eh: " + vcone);

        System.out.println("O volume da esfera eh: " + vesf);
    }
}

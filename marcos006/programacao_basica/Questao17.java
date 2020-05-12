import java.util.Scanner;

    public class Questao17 {
        public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);
        
        System.out.println("** Programa calculador do quanto foi poupado **");
        System.out.println("Digite a quantidade de moedas de 1 centavo: ");
        double u = s.nextDouble();
    
        System.out.println("Digite a quantidade de moedas de 5 centavos: ");
        double c = s.nextDouble();

        System.out.println("Digite a quantidade de moedas de 10 centavos: ");
        double d = s.nextDouble();
    
        System.out.println("Digite a quantidade de moedas de 25 centavos: ");
        double v = s.nextDouble();

        System.out.println("Digite a quantidade de moedas de 50 centavos: ");
        double cc = s.nextDouble();

        System.out.println("Digite a quantidade de moedas de 1 real: ");
        double r = s.nextDouble();

        double uu = u * 0.01;
        double co = c * 0.05;
        double dd = d * 0.1; 
        double vv = v * 0.25;
        double ccc = cc * 0.50;
        double rr = r * 1.0;

        double to = uu + co + dd + vv + ccc + rr;

        System.out.println("A quantidade total que pedrinho popou foi " + to + " R$");

    }
}

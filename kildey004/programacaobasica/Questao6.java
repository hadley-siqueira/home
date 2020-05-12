import java.util.Scanner; 

public class Questao6 {
    public static void main (String[] args) {
        double a;
        double qtdP;
        double cT;
        Scanner s;

        System.out.println("Custo para redimensionar rede");

        s = new Scanner(System.in);
        System.out.println("Informe a area em m²: ");
        a = s.nextDouble();
    
        qtdP = a * 1.5;
        cT = 300 * qtdP;

        System.out.println("Quantidade de pontos de rede: " + qtdP);
        System.out.println("Custo para implementar pontos: " + cT);
    }
}


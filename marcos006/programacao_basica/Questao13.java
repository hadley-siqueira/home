import java.util.Scanner;

    public class Questao13 {
        public static void main(String[] agrs) {
            Scanner s;
            s = new Scanner(System.in);

            System.out.println("** Programa calculador de distancia euclidiana entre dois pontos **");
            System.out.println("Informe o valor de x0: ");
            double x0 = s.nextDouble();

            System.out.println("Informe o valor de x1: ");
            double x1 = s.nextDouble();

            System.out.println("Informe o valor de y0: ");
            double y0 = s.nextDouble();

            System.out.println("Informe o valor de y1: ");
            double y1 = s.nextDouble();

            double calc = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 -y0));

            System.out.println("A distância euclidiana entre dois pontos é " + calc);

    }
}             

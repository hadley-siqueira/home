import java.util.Scanner;
public class Questao16 {
        public static void main(String[] args) {
            Scanner s;
            double num;
            double anel;
            double com;
            double calc;

        s = new Scanner(System.in);

        System.out.println("Calculador de gastos de uma granja");

        System.out.print("Informe o numero de frangos: ");
        num = s.nextDouble();
        anel = num * 4;
        com = num * 3.50;
        calc = anel + com;

        System.out.println("O gasto total da granja eh: " + calc);
    }
}

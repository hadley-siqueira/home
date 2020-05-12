import java.util.Scanner;
public class Questao15 {
        public static void main(String[] args) {
            Scanner s;
            double c;
            double f;
   
            s = new Scanner(System.in);

            System.out.println("Transformador de graus Celsius em Fahrenheit");

            System.out.print("Diga-me o numero para converter: ");
            c = s.nextDouble();
            f = c * 1.8 + 32;
            System.out.println("O numero informado em Fahrenheit eh: " + f);
    }
}

import static java.lang.Math.*;
import java.util.Scanner;
public class Questão11 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("a: ");
        double a = s.nextDouble();

        System.out.print("b: ");
        double b = s.nextDouble();

        System.out.print("c: ");
        double c = s.nextDouble();

        double delta = pow(b, 2) - (4 * a * c);
        System.out.printf("Delta: %.2f\n", delta);

        if (delta > 0) {
            double x1 = -b + sqrt(delta) / (2 * a);
            double x2 = -b - sqrt(delta) / (2 * a);
            System.out.printf("x1: %.2f\n", x1);
            System.out.printf("x2: %.2f\n", x2);
        } else if (delta == 0) {
            double x1 = -b + sqrt(delta) / (2 * a);
            System.out.printf("x1: %.2f\n", x1);
        } else {
            System.out.println("Não contém raíz");
        }
    }
} 
            

        


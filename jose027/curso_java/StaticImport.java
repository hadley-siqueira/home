import static java.lang.Math.*;
import java.util.Scanner;
public class StaticImport {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = s.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = s.nextDouble();

        System.out.println(ceil(a + b));
        System.out.println(round(a + b));
    }
}
        

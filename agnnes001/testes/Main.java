import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double raio, area;
        
        Scanner leitor = new Scanner(System.in);
        raio = leitor.nextDouble();
        area = 3.14159 * Math.pow(raio, 2);
        
        System.out.printf("A= %.4f", area);

    }
 
}

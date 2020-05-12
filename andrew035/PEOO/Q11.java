import java.util.Scanner;
public class Q11{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe o número: ");
        double n = s.nextDouble();

        while (n != 0 && n <= 15){
            System.out.print("Informe o número: ");
            n = s.nextDouble();
        }
        while (n > 15){
            double nr = Math.sqrt(n);
            System.out.println("A raiz de " + n + " é " + nr);
            System.out.print("Informe o número: ");
            n = s.nextDouble();
        }
    }
} 

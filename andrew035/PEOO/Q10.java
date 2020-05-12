import java.util.Scanner;
public class Q10{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe o número: ");
        double n = s.nextDouble();

        while ( n != 0){
            double nq = Math.pow(n, 2.0);
            System.out.println("O quandrado de " + n + " é " + nq);

            System.out.print("Informe o número: ");
            n = s.nextDouble();
        }
    }
}

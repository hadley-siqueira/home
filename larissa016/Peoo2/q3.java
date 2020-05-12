import java.util.Scanner;
public class q3 {
    public static void main (String[] args) {

        Scanner s;
        double c,vc;
        s = new Scanner(System.in);

        System.out.print("Digite o valor do consumo da agua (metros cubicos):");
        c = s.nextDouble();

        if (c < 20.0) {
            vc = (c * 8.50);
            System.out.println("A conta é: " + vc + " reais");
        }else if (c >= 20) {
            vc = (c * 11.0);
            System.out.println("A conta é: " + vc + " reais");
           
        }
    }
}

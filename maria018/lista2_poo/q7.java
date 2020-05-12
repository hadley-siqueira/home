import java.util.Scanner;
public class q7 {
    public static void main (String[] args) {
    
        Scanner s;
        double v, r;
        s = new Scanner(System.in);

        System.out.print("Digite o valor depositado:");
        v = s.nextDouble();

        if (v <=1000.0) {
            r = (0.04 * v);
            System.out.println("O rendimento eh de: " + r + " reais");
        }
        else if ((v > 1000.0 ) && (v < 5000.0)){
            r = (0.045 * v);
            System.out.println("O rendimento eh de: " + r + " reais");
        }
        else if (v > 5000.0) {
            r = (0.05 * v); 
            System.out.println("O rendimento eh de: " + r + " reais");
        }
    }
}
            

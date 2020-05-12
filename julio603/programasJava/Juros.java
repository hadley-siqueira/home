:import java.util.Scanner;

public class Juros {
    public static void julio(double quantia, double juros) {
        System.out.println("Rendimento de: " + (quantia * juros));
    }
    
    public static void main(String[] args) {
        System.out.print("Digite a quantia: ");
        Scanner ler = new Scanner(System.in);
        double quantia = ler.nextDouble();
        
        if (quantia <= 1000.0) {
            julio(quantia, 1.04);
        } else if (quantia <= 5000.0) {
            julio(quantia, 1.045);
        } else {
            julio(quantia, 1.05);
        }
    }
}

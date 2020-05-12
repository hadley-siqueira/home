import java.util.Scanner;

public class poo {
        public static void main(String[] args) {
            Scanner s;
            double x; 
            double y;
            double z;
        
            s = new Scanner(System.in);

            System.out.print("Digite o valor da conta: ");
            x = s.nextDouble();
    
            y = x * 10 / 100;
        
            z = x + y;

            
            System.out.println("O valor da comissão do garçom e R$" + y);
            System.out.println("O subtotal e de R$" + z);

            
    }
}

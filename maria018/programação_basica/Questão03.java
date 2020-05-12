import java.util.Scanner;

public class Questão03 {
    public static void main(String[] args) {
        Scanner s;
        int n1;
        int n2;
        int valorCA;
        int valorCE;

        s = new Scanner(System.in);
        
        System.out.println("=== TOTAL EM DINHEIRO DE CASAMENTO E CERTIÕES ===");
        
        System.out.print("Quantidade de casamentos: ");
        n1 = s.nextInt();
        System.out.print("Quantidade de certidões: ");
        n2 = s.nextInt();

        valorCA = n1 * 250;

        valorCE = n2 * 30;

        System.out.println(" O total eh " + (valorCA + valorCE));

    }

}

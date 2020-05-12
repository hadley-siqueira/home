import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
      
        System.out.print("Digite o número de x: ");
        int x = s.nextInt();
        
        int res = x * x * x  + 3 * x * x - 2 * x + 7;
      
        System.out.println("Resultado do polinômio " + res);
    }
}
        

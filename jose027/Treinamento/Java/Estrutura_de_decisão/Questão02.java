import java.util.Scanner;
public class Questão02 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o número desejado: ");
        int n = s.nextInt();

        if (n >= 0) {
            System.out.println(n + " é um número positivo");
        } else {
            System.out.println(n + " é um número negativo");
        }
    }
}
        

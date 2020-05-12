import java.util.Scanner;
public class Questão03 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));    
    }
}

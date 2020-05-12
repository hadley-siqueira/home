import java.util.Scanner;
public class q11 {
    public static void main (String[] args) {

        Scanner s;
        int n;
        int ns;
        s = new Scanner(System.in);
        
        System.out.println("--  VOU MOSTRAR O SUCESSOR DO SEU NUMERO --");
        System.out.print("Digite um numero ate 60:");
        n = s.nextInt();
        
        ns = (n + 1)%61;
        
        System.out.println("O sucessor de " + n + " = " + ns);
    }
}

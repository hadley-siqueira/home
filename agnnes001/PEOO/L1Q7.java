import java.util.Scanner;

public class L1Q7 {
    public static void main(String[] args) {
        Scanner s;
        int a,b,a1,b1;

        s = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:");
        a = s.nextInt();
        System.out.print("Digite o segundo numero:");
        b = s.nextInt();

        a1 = b;
        b1 = a;

        System.out.println("Valores iniciais: a = "+a+" e b = "+b);
        System.out.println("Valores finais: a = "+a1+" e b = "+b1);

    }
}    

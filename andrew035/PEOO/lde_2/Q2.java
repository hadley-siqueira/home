import java.util.Scanner;
public class Q2{
    public static void main(String[]args){
        Scanner s;
        s = new Scanner(System.in);
        double soma = 0,num = 0;

        System.out.print("Informe quantas repetições deseja: ");
        int n = s.nextInt();

        for(int contagem = 0 ; contagem < n ; contagem++){
            System.out.print("Informe o número: ");
            num = s.nextDouble();
            
            soma += num;
        }

        double quadrado = Math.sqrt(soma);

        System.out.println("Quadrado dos números: " + quadrado);
    }
}

import java.util.Scanner;
public class Q5{
    public static void main(String[]args){
        Scanner s;
        s = new Scanner(System.in);
        int n,num,m = 0;
        
        System.out.print("Informe o número: ");
        n = s.nextInt();

        if (n < 1 || n > 9){
            System.out.print("Número invalido! Digite novamente: ");
            n = s.nextInt();
        }
        for(int contagem = 0 ; contagem < 9 ; contagem++){
            m ++;
            num = n * m;

            System.out.println(num);
        }
    }
}
            

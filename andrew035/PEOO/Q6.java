import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = s.nextInt();

        while (n > 0 && n < 10000){
            n = n * 3;
            System.out.println("saída: " + n);
        }
    }
}
    

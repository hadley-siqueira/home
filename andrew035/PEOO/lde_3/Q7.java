import java.util.Scanner;
public class Q7{
    public static void main(String [] args){
        Scanner s;
        s = new Scanner(System.in);
        int n = 1, soma = 1;

        while ( soma < 100){
            n = n + soma;
            soma++;
        }
        System.out.println("Somatório: " + n);
    }
}

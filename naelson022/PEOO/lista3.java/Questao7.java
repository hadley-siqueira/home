import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,c= 0;
        System.out.println("digite um numero: ");
        n = s.nextInt();
        while(c < 10000) {
        n = n * 3;
        c = n;
        System.out.println(c);
        }
    }
}

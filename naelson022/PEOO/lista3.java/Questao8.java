import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double A = 7000,B = 20000;
        int n = 0;
        while(A < B ) {
            A = A + (0.035 * A);
            B = B + (0.01 * B);
            n = n + 1;
        }
        System.out.println(n + " anos");
    }
}


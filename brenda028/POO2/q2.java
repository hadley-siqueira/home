import java.util.Scanner;
public class q2 {
    public static void main (String [] args) {
        Scanner s;
        double a;
        s = new Scanner(System.in);
        System.out.print("Digite um numero:");
        a = s.nextDouble();

        if (a%3==0) {
            System.out.println("O numero e divisivel por 3");
        }else {
            System.out.println("O numero não e divisivel por 6");

        }
    }
}

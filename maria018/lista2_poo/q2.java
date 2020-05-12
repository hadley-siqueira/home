import java.util.Scanner;
public class q2 {
    public static void main (String[] args) {
    
        Scanner s;
        double n;
        s = new Scanner(System.in);

        System.out.print("Digite o valor de 'n':");
        n = s.nextInt();

        if (n%3 == 0) {
            System.out.println("O numero eh divisivel por 6");
       }else {
            System.out.println("O numero NAO eh divisivel por 6");
        }
    }
}

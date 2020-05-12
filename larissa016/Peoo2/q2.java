import java.util.Scanner;
public class q2 {
    public static void main (String[] args) {

        Scanner s;
        double num;
        s = new Scanner(System.in);

        System.out.println("Digite 'n':");
        num = s.nextInt();

        if (num % 6 == 0) {
            System.out.println("O numero é divisivel por 6");

        }else {
            System.out.println("O numero ñ é divisivel por 6");
         }
    }
}
        

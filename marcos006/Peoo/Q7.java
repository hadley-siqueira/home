import java.util.Scanner;
public class Q7 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero positivo: ");
        num = s.nextInt();


        while ( num < 10000){
            num = num * 3;
            System.out.println(num);

        }
    }
}

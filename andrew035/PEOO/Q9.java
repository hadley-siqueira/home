import java.util.Scanner;
public class Q9{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int n = s.nextInt();

        while( n != 22){
            System.out.print("Informe o numero: ");
            n = s.nextInt();
        }
    }
}

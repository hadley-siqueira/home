import java.util.Scanner;
public class q6 {
    public static void main (String[] args) {

        Scanner s;
        int n;
        s = new Scanner(System.in);

        System.out.print("Digite um numero:");
        n = s.nextInt();
        
        if ((n%3 == 0) && (n%4 == 0) && ((n%5 == 0))){
            System.out.println("O numero " + n + " eh divisivel por 3, 4 e 5 ao mesmo tempo");
        }
        else {
            System.out.println("O numero não eh divisivel por 3, 4 e 5 ao mesmo tempo");
       } 
    }
}

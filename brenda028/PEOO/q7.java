import java.util.Scanner;
public class q7 {
    public static void main (String[] args){

        Scanner s;
        int p1;
        int q1;
        int p2;
        int q2;
        s = new Scanner(System.in);

        System.out.print("DIGITE O VALOR DE 'p': ");
        p1 = s.nextInt();
        System.out.print("DIGITE O VALOR DE 'q': ");
        q1 = s.nextInt();
    
        p2 = q1;
        q2 = p1;

        System.out.println("VALOR INICIAL");
        System.out.println(" 'p' = " + p1 + " // 'q' + " + q1);
        System.out.println("VALOR FINAL");
        System.out.println(" 'p' = " + q1 + " // 'q' = " + p1);

    }
}

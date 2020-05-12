import java.util.Scanner;

public class L1Q11 {
    public static void main(String[] args) {
        Scanner s;
        int n,s1;
        
        s = new Scanner(System.in);
        System.out.print("Digite um numero:");
        n = s.nextInt();
    
        s1 = (n+1)%61;

        System.out.println("O seu sucessor é:"+s1);

    }
}

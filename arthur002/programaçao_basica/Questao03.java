import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner s;
        int n;
        int c;
        int total;

        s = new Scanner(System.in);
        System.out.println ("**  cartorio do arthur: **");
        
        System.out.print(" quantidade de casamentos: ");
        n = s.nextInt();

        System.out.print(" quantidade de certidoes: ");
        c = s.nextInt();
        total = n * 250 + c * 30;
        System.out.println("total: R$ " + (total));
    }
}

         

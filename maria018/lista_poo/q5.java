import java.util.Scanner;

public class q5 {
    public static void main (String[] args) {

        Scanner s;
        double r;
        double c;
        double st;
        double t;
        s = new Scanner(System.in);

        System.out.print("Qual o preço da refeiçao realizada?");
        r = s.nextFloat();
        c = 0.1 * r;
        st = r;
        t = r + c;
        
        System.out.println("A comissao do garçom: " + c + " reais");
        System.out.println("O subtotal: " + st + " reais");
        System.out.println("O total: " + t + " reais");

    }
}
    

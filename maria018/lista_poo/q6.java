import java.util.Scanner;

public class q6 {
    public static void main (String[] args) {
     
        Scanner s;
        double r;
        double c;
        double p;
        double st;
        double t;
        s = new Scanner(System.in);

        System.out.print("Qual o preço da refeiçao realizada:");
        r = s.nextInt();
        System.out.print("Qual a porcentagem da comissao do garçom:");
        p = s.nextDouble();

        c = ((p * 0.01) *  r);
        st = r;
        t = r + c;

        System.out.println("COMISSAO DO GARÇOM: " + c + " reais");
        
        System.out.println("SUBTOTAL: " + st + " reais");
        System.out.println("TOTAL: " + t + " reais");
    
    }
}

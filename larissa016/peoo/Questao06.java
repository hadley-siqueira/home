import java.util.Scanner; 
public class Questao06 {
    public static void main (String[] args) {

        Scanner s;
        double a;
        double c;
        double p;
        double st;
        double t;
        s = new Scanner(System.in);

        System.out.print("O preco da refeicão realizada:");
        a = s.nextInt();
        System.out.print("A porcentagem da comissão do garçom:");
        p = s.nextDouble();

        c = ((p * 0.01) * a);
        st = a;
        t = a + c;

        System.out.println("Comissãp do garçom: " + c + " reais");
        System.out.println("Subtotal: " + st + " reais");
        System.out.println("Total: " + t + " reais");
        
    }
}

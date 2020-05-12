import java.util.Scaneer
public class q4 {
    public static void main (String [] args) {
        Scanner s;
        double a;
        double b;
        double c;
        s = new Scanner(System.in);
        System.out.print("Digite o valor de a:");
        a = s.nextDouble();
        System.out.print("Digite o valor de b:");
        b = s.nextDouble();
        System.out.print("Digite o valor de c:");
        c = s.nextDouble();
 
        if (((c>a) && (c<b))|| ((c<a) && (c>b))) {
            System.out.println("O numero está entre o intervalo de 'a' e 'b':");
        }
        else {
            System.out.println("O numero está entre o intervalo de 'a' e 'b':");

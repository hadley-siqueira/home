import java.util.Scanner;
public class q1 {
    public static void main (String args []) {
    Scanner s;
    double a;
    s = new Scanner(System.in);
    System.out.println("Digite a:");
    a = s.nextDouble();

    if (a<0);
        a = Math.pow(a,2);

    else {
        a = Math.sqrt(a);
}
    System.out.println("Resposta: " + a);

    }
}
